package Dna;

import processing.core.PApplet;

abstract class Shape {

    PApplet p;

    private float x,y,px,py;

    Shape(PApplet p, float x, float y) {
        this.p = p;
        this.x = x;
        this.y = y;
    }

    void setPrevious(){
        px = x;
        py = y;
    }

    void setY(float y){
        this.y = y % p.height;
    }

    void setX(float x){
        if (x >= 0){
            this.x = x % p.width;
        } else {
            this.x = x % p.width + p.width;
        }
    }

    float getX(){
        return x;
    }

    float getY(){
        return y;
    }

    float getPx(){
        return px;
    }

    float getPy(){
        return py;
    }

}
