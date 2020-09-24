package com.dtcc.projects;

public class Flip extends MobilePhone {

    String phoneNumber = "000-000-0000";

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
