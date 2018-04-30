package com.Jolley;

public class Main {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException, TooColdException{
        if(cocoaTemp >= tooHot){
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }


    public static void main(String[] args) {
	// write your code here

        double currencCocoaTemp = 200;
        try{
            drinkHotChocolate(currencCocoaTemp);
            System.out.println("That cocoa was good");
        } catch (TooHotException e1){
            System.out.println("That was too hot");

        }catch (TooColdException e2){
            System.out.println("That's too cold");
        }

        System.out.println("And it's gone");

    }
}
