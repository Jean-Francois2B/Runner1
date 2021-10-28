package com.company;


import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.Group;



public class GameScene extends Scene {

    private staticThing fondLeft;
    private staticThing fondRight;
    private staticThing numberOfLives;
    private double l;
    private double hauteur;
    private Camera camera;

    /*private AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long time) {
            Hero.update(time);
            Camera.update(time);
            GameScene.update(time);

        }
    }
    */

    public GameScene(Group root, double l, double hauteur, Integer x, Integer y){
        super(root, l, hauteur); //creation de la scene comme dans le main, creation directement dans le fichier scene
        this.l = l;
        this.hauteur = hauteur;
        this.camera = new Camera(x,y);
        this.fondLeft = new staticThing(0,0,0,0,this.camera.getLongueur(),this.hauteur, "file: Runner1/img/desert.png");
        this.fondRight = new staticThing(this.camera.getLongueur(),0,this.camera.getLongueur(),0,this.l-this.camera.getLongueur(),this.hauteur, "file: Runner1/img/desert.png");
        this.numberOfLives = new staticThing(18,660, 0,0,120,50, "file: Runner1/img/pointDeVie.png");
        root.getChildren().add(fondLeft.getBackground());
        root.getChildren().add(fondRight.getBackground());
        root.getChildren().add(numberOfLives.getBackground());

        Hero Mario = new Hero(100, 100,0,"file: Runner1/img/heros.png");
        root.getChildren().add(Mario.getImageDynamique());

    }

}