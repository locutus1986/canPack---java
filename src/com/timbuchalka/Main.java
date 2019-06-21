package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(2,1,5));
    }

    public static  boolean canPack(int bigCount, int smallCount, int goal){

        bigCount*=5;
        smallCount*=1;

        while(bigCount > goal){
            bigCount-=5;
        }

        if(bigCount+smallCount >= goal){
            return true;
        }

        return false;
    }

}
