import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet{

    public void settings() {
        size(800,800, P2D); //P2D
        //smooth();
    }

    Rectangle[] obj = new Rectangle[1000];
    Random ran = new Random();

    public void setup() {
        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Rectangle(this,ran.nextInt(width),ran.nextInt(height));
        }
    }

    public void draw() {
        background(0);
        for (int i = 0; i < obj.length; i++) {
            obj[i].setX(obj[i].getX() + 5f);
            obj[i].setY(obj[i].getY() + 0.04f);
            float tempy = sin(obj[i].getY()) * height/3 + height/2;
            float ptempy = sin(obj[i].getPy()) * height/3 + height/2;
            if (tempy - ptempy > 0){
                fill(200,65,90);
            } else {
                fill(65,160,205);
            }
            rectMode(3);
            obj[i].drawer(tempy, obj[i].getX());
            obj[i].setPrevious();
        }
    }
}
