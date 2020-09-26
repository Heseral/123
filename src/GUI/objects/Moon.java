package GUI.objects;

import java.awt.*;

public class Moon implements Drawable {
    private Color moonColor;
    private Color skyColor;

    private int x;
    private int y;
    private int width;
    private int height;

    public Moon(Color moonColor, Color skyColor, int x, int y, int width, int height) {
        setMoonColor(moonColor);
        setSkyColor(skyColor);
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void draw(Graphics graphics) {
        // луна
        graphics.setColor(getMoonColor());
        graphics.fillOval(getX(), getY(), getWidth(), getHeight());
        graphics.setColor(getSkyColor());
        graphics.fillOval((int) (getX() + getX() * 0.25), getY(), (int) (getWidth() + getWidth() * 0.125), (int) (getHeight() + getHeight() * 0.125));
    }

    public Color getMoonColor() {
        return moonColor;
    }

    public Color getSkyColor() {
        return skyColor;
    }

    public void setMoonColor(Color moonColor) {
        this.moonColor = moonColor;
    }

    public void setSkyColor(Color skyColor) {
        this.skyColor = skyColor;
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

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
