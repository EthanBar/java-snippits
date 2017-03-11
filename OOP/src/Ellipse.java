import processing.core.PApplet;

class Ellipse extends Shape {

    Ellipse(PApplet p, float x, float y) {
        super(p, x, y);
    }

    void drawer(float x, float y) {
        p.ellipse(x, y,10,10);
    }
}
