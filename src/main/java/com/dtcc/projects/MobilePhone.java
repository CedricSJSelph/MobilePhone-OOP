package com.dtcc.projects;

public abstract class MobilePhone {

    String phoneNumber;
    String carrier;
    int storageSize;
    boolean cameraSide; //T = Front and Back, F = front
    boolean flashLightOperation; //T = on, F = off
    boolean touchScreen; //T= yes, F = no

    public boolean getTouchScreen() {
        return this.touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public boolean isCameraSide() {
        return cameraSide;
    }

    public void setCameraSide(boolean cameraSide) {
        this.cameraSide = cameraSide;
    }

    public boolean isFlashLight() {
        return flashLightOperation;
    }

    public void setFlashLight(boolean flashLight) {
        this.flashLightOperation = flashLight;
    }

    public static void main(String[] args){

        Flip flipPhone = new Flip();

        System.out.println(flipPhone.getPhoneNumber());

    }
}
