package com.Taha.CoreJava.Keywords.Final.Variable;

public abstract class Vehicle {

    public abstract void accelerate();
    public abstract void decelerate();

    private final int SpeedLimit=200;

    //or


//    public final int SpeedLimit;
//    public Vehicle(){                                 //We Can Also Declare And Then initialize the final variable
//        SpeedLimit=200;
//    }


    //or

//    public static final double PI;
//
//    static {
//        PI=3.14;
//    }


    public int getSpeedLimit() {
        return SpeedLimit;
    }

//    public void setSpeedLimit(int sppedlimit){            //This will Give Error As We Are Trying to change the value of the final variable or we can say it as constant variable
//        this.SpeedLimit=sppedlimit;
//    }
}
