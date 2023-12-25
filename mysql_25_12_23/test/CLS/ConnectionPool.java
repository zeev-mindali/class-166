package mysql_25_12_23.test.CLS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Stack;

public class ConnectionPool {
    //number of connection to sql (maximum is 20, default is 10)
    private static final int NUMBER_OF_CONNECTION=10;
    public static ConnectionPool instance=null;
    private final Stack<Connection> connections = new Stack<>();
    
    private ConnectionPool() throws SQLException {
        System.out.println("We create new connection pool instance");
        openAllConnections();
    }

    private void openAllConnections() throws SQLException {
        //create connection according to NUMBER_OF_CONNECTION
        for (int counter=0;counter<NUMBER_OF_CONNECTION;counter++){
            //create connection
            Connection connection = DriverManager.getConnection(DBManager.URL,DBManager.SQL_USER,DBManager.SQL_PASS);
            //puhs the new connection into the stack
            connections.push(connection);
        }
    }

    private void closeAllConnections() throws InterruptedException {
        synchronized (connections) {
            while (connections.size() < NUMBER_OF_CONNECTION) {
                connections.wait();
            }
            connections.removeAllElements();
        }
    }
    public static ConnectionPool getInstance(){
        //first we check the instance is null
        if (instance==null){
            //syncronized-critical code, that another thread will not pass here
            synchronized (ConnectionPool.class){
                //double check, that no other thread create an instance.....
                if (instance==null){
                    try {
                        instance= new ConnectionPool();
                    } catch (SQLException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
        return instance;
    }

    public Connection getConnection() throws InterruptedException {
        //lock on the connections
        synchronized (connections){
            //check if we have connection to give....
            if (connections.isEmpty()){
                connections.wait();
            }
            return connections.pop(); //LIFO -> last in first out
        }
    }

    public void returnConnection(Connection connection){
        synchronized (connections){
            connections.push(connection);
            //notify that we got back a connection for the user
            connections.notify();
        }
    }
}
