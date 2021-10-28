package com.company;



public class Hero extends AnimatedThing{
    private double positionX;
    private double positionY;
    private double attitude;
    private String fileName;

    public Hero(double positionX, double positionY, Integer attitude, String fileName) {
        super(positionX, positionY, attitude, fileName);

    }
}
