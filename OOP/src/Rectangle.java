import processing.core.PApplet;


class Rectangle extends Shape {

    Rectangle(PApplet p, float x, float y) {
        super(p, x, y);
    }

    void drawer(float x, float y) {
        p.ellipse(x, y,10,10);
    }

}
