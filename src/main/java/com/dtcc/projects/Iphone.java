package com.dtcc.projects;

public class Iphone extends MobilePhone{

    String phoneNumber = "666-666-6666";

    @Override
    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = true;
    }

    @Override
    public void setPhoneNumber(String PhoneNumber){
        this.phoneNumber = PhoneNumber;
    }

    @Override
    public void setCarrier(String carrier){
        this.carrier = "Bell";
    }

    @Override
    public void setStorageSize(int storageSize){
        this.storageSize = 32;
    }

    @Override
    public void setCameraSide(boolean cameraSide){
        this.cameraSide = false;
    }

    @Override
    public void setFlashLight(boolean flashLight) {
        this.flashLightOperation = flashLight;
    }

}
