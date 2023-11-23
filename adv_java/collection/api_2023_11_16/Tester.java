package adv_java.collection.api_2023_11_16;

//to work with json object, we need -> org.json
//file->project structure->libraris->+ from maven-> org.json -> magnifying glass-> org.json:json:20231013
import org.json.JSONObject;

import netscape.javascript.JSObject;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Tester {

    private static String endPoint = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";
    private static String handiCapEndPoint = "https://data.gov.il/api/3/action/datastore_search?resource_id=c8b9f9c8-4612-4068-934f-d4acd2e3c06e&q=";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter car plate number:");
        String carNumber = scanner.nextLine();
        //System.out.println(getURLdata(endPoint+carNumber));
        //invoke method->getURLdata which will return string by the URL of endPoint
        //readJSON(getURLdata(endPoint));
        System.out.println(checkHandiCap(getURLdata(handiCapEndPoint+carNumber))?"handi cap car":"not handi cap car (fine 1000nis)");

        //home work:
        //check if the car number, is car/bike/truck
        //data.gov.il
        

    }

    private static boolean checkHandiCap(String urLdata) {
        //convert our string to json object
        var carData = new JSONObject(urLdata);
        //getting out result from json object;
        var result = carData.getJSONObject("result");
        //the records is an array -> [ ]
        var carArray = result.getJSONArray("records");
        //System.out.println(carArray);
        if (carArray.length()==0){
            System.out.println("Car not found");
            return false;
        }
        return true;
    }

    public static void readJSON(String myString){
        //convert our string to json object
        var carData = new JSONObject(myString);
        //getting out result from json object;
        var result = carData.getJSONObject("result");
        //the records is an array -> [ ]
        var carArray = result.getJSONArray("records");
        //System.out.println(carArray);
        if (carArray.length()==0){
            System.out.println("Car not found");
            return;
        }

        var singleCar = (JSONObject)carArray.get(0);
        //System.out.println(singleCar);
        System.out.println("Manufacturer: "+singleCar.get("tozeret_nm"));
    }
    private static String getURLdata(String url){
        //string builder for getting data that will not be immutable
        StringBuilder stringBuilder = new StringBuilder();
        //create instance of connection to the internet
        HttpURLConnection httpURLConnection = null;

        try {
            //open connection to the internet
            httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
            //            shopping cart       get products  by     avi
            var buf = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            String line;
            while((line = buf.readLine())!=null){
                stringBuilder.append(line);
            }
        } catch (IOException error){
            System.out.println(error.getMessage());
        } finally {
            //close the connection
            httpURLConnection.disconnect();
        }

        return stringBuilder.toString();

    }
}
