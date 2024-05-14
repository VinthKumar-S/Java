package com.practice;

public class Main {

    public static void main(String[] args){

        String vegetables[] = {"onion" , "carrot" ,"beans"};
        for(int i = vegetables.length-1 ; i > 0 ; i--)
        {
            System.out.println(vegetables[i]);
        }
        for(String vegetable : vegetables)
        {
            System.out.println(vegetable);
        }
    }
}
