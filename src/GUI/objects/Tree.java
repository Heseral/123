package GUI.objects;

import java.awt.*;

public class Tree implements Drawable {
    private int x;
    private int y;
    private int size;
    private Color woodColor;
    private Color leafColor;

    public Tree(int x, int y, int size, Color woodColor, Color leafColor) {
        setX(x);
        setY(y);
        setSize(size);
        setWoodColor(woodColor);
        setLeafColor(leafColor);
    }

    @Override
    public void draw(Graphics graphics) {
        Color baseColor = graphics.getColor();

        graphics.setColor(getWoodColor());
        graphics.fillRect(getX() + (int) (getSize() * 0.25), getY() + (int) (getSize() * 0.25), (int) (getSize() * 0.125), (int) (getSize() * 0.75));

        graphics.setColor(getLeafColor());
        graphics.fillOval(getX(), getY(), (int) (getSize() * 0.66), (int) (getSize() * 0.66));

        graphics.setColor(baseColor);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getWoodColor() {
        return woodColor;
    }

    public void setWoodColor(Color woodColor) {
        this.woodColor = woodColor;
    }

    public Color getLeafColor() {
        return leafColor;
    }

    public void setLeafColor(Color leafColor) {
        this.leafColor = leafColor;
    }
}
