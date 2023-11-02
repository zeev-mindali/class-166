package simple_jave.class_23_10.cls;

import simple_jave.class_23_10.interfaces.CheckBoardAble;

public class Robot implements CheckBoardAble {
    @Override
    public boolean getMemory(int tray) {
        return false;
    }

    @Override
    public String memoryBarcode() {
        return null;
    }

    @Override
    public boolean putMemory(int boardSlot) {
        return false;
    }

    @Override
    public boolean checkMemory() {
        return false;
    }

    @Override
    public void takeOutMemory(int slot, int tray) {

    }
}
