package be.intecbrussel.geometry;

public interface DrawingContext {
    void draw(Rectangle rectangle);
    void draw(Circle circle);
    void draw(Triangle triangle);
}
