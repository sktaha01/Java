package com.Taha.CoreJava.Oops.Abstraction.AbstractConstructorEx;

public abstract class Animal {

    protected Animal(){

//        It will say instead of public write protected because the abstract class constructor can only be trigered by the child class as we cannot create the onject of the abstract class
//        hence protected is enough
        System.out.println("Animal Constructor!");
    }


//    if public - we can access it anywhere in any package
//    if protected - we can acess in a same package and the child class whose are extending it
//    if private - we can only access it inside the same class
}
