package com.company;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.util.ArrayList;

public class AnimatedThing {

    private double positionX;
    private double positionY;
    private ImageView imageDynamique;
    private String filename;
    private Integer attitude;
    //Pour l'animation :
    private Integer dureeFrame;
    private ArrayList<Integer> Index = null;
    private double rectangleX;
    private double rectangleY;
    private double longueur;
    private double hauteur;




    public AnimatedThing(double positionX, double positionY, Integer attitude, String fileName){
        this.positionX = positionX;
        this.positionY = positionY;
        this.attitude = attitude;
        this.filename = fileName;
        this.imageDynamique = new ImageView(new Image(this.filename));

        switch (attitude){
            case 0 :
                this.rectangleX = 0;
                this.rectangleY = 0;
                this.longueur = 75;
                this.hauteur = 100;
        }

        this.imageDynamique.setViewport(new Rectangle2D(this.rectangleX, this.rectangleY, this.longueur, this.hauteur));

    }


    public ImageView getImageDynamique() {return imageDynamique;}




}
