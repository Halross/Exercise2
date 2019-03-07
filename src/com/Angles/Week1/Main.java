//Connor Angles 3/7/19 CSCI1660
package com.Angles.Week1;

public class Main {

    public static void main(String[] args) {
        int[] temperatures = {45,29,10,22,41,28,33};
        int[] precipitation = {95,60,25,5,0,75,90};
        for(int i =0; i<=6; i++){
            if(temperatures[i] <= 32){
                if(precipitation[i] > 50){
                    int daynum = i+1;

                    System.out.println("On day number " + daynum + " it will be both cold enough and have a high enough precipitation for a chance of snow!");
                }
            }
        }
    }
}
