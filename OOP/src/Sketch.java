import processing.core.PApplet;
import java.util.Random;

public class Sketch extends PApplet{

    // SETTINGS
    private int particleCount = 1000;
    private float yMaxSpeed = 0.08f;
    private float xMaxSpeed = 5f;
    private boolean motionBlur = false;

    private Ellipse[] obj = new Ellipse[particleCount];
    private Random ran = new Random();


    public void settings() {
        size(800,800, P2D); //P2D
        //smooth();
    }

    public void setup() {
        background(0);
        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Ellipse(this,ran.nextInt(width),ran.nextInt(height));
        }
    }

    public void draw() {

        if (motionBlur){
            fill(0,0,0, 70);
            rectMode(CORNER);
            rect(0,0,width,height);

        } else { background(0);}

        for (int i = 0; i < obj.length; i++) {
            obj[i].setX(obj[i].getX() + map(mouseY,0,height,0,xMaxSpeed));
            obj[i].setY(obj[i].getY() + map(mouseX,0,width, -yMaxSpeed,yMaxSpeed));

            float tempy = sin(obj[i].getY()) * height/3 + height/2;
            float ptempy = sin(obj[i].getPy()) * height/3 + height/2;

            if (tempy - ptempy > 0){
                if (mouseX > width/2){
                    fill(200,65,90);
                } else {
                    fill(65, 160, 205);
                }
            } else {
                if (mouseX > width/2) {
                    fill(65, 160, 205);
                } else {
                    fill(200,65,90);
                }
            }

            rectMode(3);
            obj[i].drawer(tempy, obj[i].getX(), map(abs(width/2-obj[i].getX()), 0, width/2, 10, 1));
            obj[i].setPrevious();
        }
    }
}
