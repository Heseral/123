package GUI.objects;

import java.awt.*;

public class Horizon implements Drawable {
    private Color skyColor;
    private Color earthColor;
    private int x;
    private int y;
    private int width;
    private int height;

    public Horizon(Color skyColor, Color earthColor, int width, int height, int x, int y) {
        setSkyColor(skyColor);
        setEarthColor(earthColor);
        setWidth(width);
        setHeight(height);
        setX(x);
        setY(y);
    }

    @Override
    public void draw(Graphics graphics) {
        try {
            if (graphics == null) {
                throw new Exception("graphics не может быть null.");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        Color baseColor = graphics.getColor();

        // небо
        graphics.setColor(getSkyColor());
        graphics.fillRect(getX(), getY(), getWidth(), getHeight());

        // земля
        graphics.setColor(getEarthColor());
        graphics.fillRect(getX(), getHeight() / 3, getWidth(), getHeight());

        graphics.setColor(baseColor);
    }

    public Color getSkyColor() {
        return skyColor;
    }

    public Color getEarthColor() {
        return earthColor;
    }

    public void setSkyColor(Color skyColor) {
        this.skyColor = skyColor;
    }

    public void setEarthColor(Color earthColor) {
        this.earthColor = earthColor;
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
}
