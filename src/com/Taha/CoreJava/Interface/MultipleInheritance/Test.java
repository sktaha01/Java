package com.Taha.CoreJava.Interface.MultipleInheritance;

public class Test {

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall(8530155637l);
        sp.endCall();
        sp.playMusic();
        sp.stopMusic();
        sp.takePhoto();
        sp.takeVideo();
    }

}
