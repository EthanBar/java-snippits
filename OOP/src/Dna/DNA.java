package Dna;

import processing.core.PApplet;
import java.util.Random;

public class DNA extends PApplet{

    private Random ran = new Random();
    Rectangle[] rects = new Rectangle[100];

    public void settings() {
        size(800,800, P2D); //P2D
        //smooth();
    }

    public void setup(){
        for (int i = 0; i < rects.length; i++){
            rects[i] = new Rectangle(this, ran.nextInt(width), ran.nextInt(height));
        }
    }

    public void draw(){
        for (int i = 0; i < rects.length; i++){
            rects[i].drawer(rects[i].getX(),rects[i].getY(),10);
        }
    }
}