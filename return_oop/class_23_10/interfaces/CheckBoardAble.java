package return_oop.class_23_10.interfaces;

public interface CheckBoardAble {
    boolean getMemory(int tray);
    String memoryBarcode();
    boolean putMemory(int boardSlot);
    boolean checkMemory();
    void takeOutMemory(int slot,int tray);
}
