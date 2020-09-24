package com.dtcc.projects;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.math.BigInteger;

public class Samsung extends MobilePhone {

    String phoneNumber = "555-555-5555";

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
