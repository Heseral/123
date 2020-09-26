package GUI.objects;

import Utils.GlobalVar;

import java.awt.*;

public class Railroad implements Drawable {
    private int width;
    private int height;


    public Railroad(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void draw(Graphics graphics) {
        Color baseColor = graphics.getColor();

        // шпалы
        graphics.setColor(new Color(26, 0, 0));
        int centerXCoordinate = getWidth() / 2;
        double i;
        double j = 1;
        for (i = 3; i < getHeight(); i *= 1.5, j *= 1.33) {
            graphics.fillRect(
                    (int) (centerXCoordinate - i),
                    (int) (i + getHeight() / 3),
                    (int) (2 * i),
                    (int) j
            );
        }

        // рельсы
        graphics.setColor(new Color(57, 66, 70));
        for (int k = 0; k < 32; k++) {
            graphics.drawLine(centerXCoordinate, getHeight() / 3, (int) (centerXCoordinate + i / 1.5 - i + k), getHeight());
            graphics.drawLine(centerXCoordinate, getHeight() / 3, (int) (centerXCoordinate - i / 1.5 + i - k), getHeight());
        }

        graphics.setColor(baseColor);
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
