package com.example;

import java.util.List;

public class Lion {

    private Felines felines;
   private Feline feline;
    boolean hasMane;

    public Lion(String sex, Felines felines, Feline feline) throws Exception {
        this.felines = felines;
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }



    public int getKittens() {
        return felines.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
