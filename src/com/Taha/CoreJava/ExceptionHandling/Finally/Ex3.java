package com.Taha.CoreJava.ExceptionHandling.Finally;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Now in below example all will run fine but if we don't use finally in the below ex it will execute fine but
//if someone return something in the above try catch block the control will not come to the next try
// therefor the finally is required otherwise the resources would have been open .

public class Ex3 {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader=new BufferedReader(new FileReader("a.txt"));
            String line;
            while ((line= reader.readLine())!=null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("IO Exception Caught:"+e.getMessage());
        }
        finally{
            try{
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing The Reader:"+e.getMessage());
            }
        }
    }

}
