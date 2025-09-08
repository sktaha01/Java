package com.Taha.CoreJava.Interface.MultipleInheritance;

public class SmartPhone implements Phone,Musicplayer,Camera{


    @Override
    public void takePhoto() {
        System.out.println("Taking Photo From SmartPhone");
    }

    @Override
    public void takeVideo() {
        System.out.println("Taking Video From SmartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    @Override
    public void stopMusic() {
        System.out.println("...Stoped Music");
    }

    @Override
    public void makeCall(long number) {
        System.out.println("Calling "+ number+" With SmartPhone");
    }

    @Override
    public void endCall() {
        System.out.println("Ended Call...");
    }
}
