package com.POO;


public class Robot {

    String name;
    int lifePts, maxSpeed, positionX, positionY; //dder si positions bien initialisées

    public Robot(String name, int lifePts, int maxSpeed, int positionX, int positionY) {
        this.name = name;
        this.lifePts = lifePts;
        this.maxSpeed = maxSpeed;
        this.positionX = positionX;
        this.positionY = positionY;
    }


    public Robot(String name) {
        this.name = name;
        this.lifePts = 100;
        this.maxSpeed = 3;
        this.positionX = 0;
        this.positionY = 0;
    }

    public void sePresenter(){
        System.out.println("Bonjour, je m'appelle " + name + ", j'ai " + lifePts + " points de vie. Je me déplace de " + maxSpeed + " cases par seconde. Je me situe aux coordonnées (" + positionX + "," + positionY + ")" );

    }

    public void seDeplacer () {

    }
}
