package GUI.objects;

import java.awt.*;

public class Text implements Drawable {
    private Font textFont;
    private String text;
    private int x;
    private int y;
    private Color textColor;

    public Text(String text, int x, int y, Font font, Color color) {
        setText(text);
        setX(x);
        setY(y);
        setTextFont(font);
        setTextColor(color);
    }

    @Override
    public void draw(Graphics graphics) {
        if (getText().length() < 1) {
            return; // нет смысла что то делать ниже, если все равно ничего не будет выведено на экран
        }

        Color baseColor = graphics.getColor();
        graphics.setColor(getTextColor());

        Font baseFont = graphics.getFont();
        graphics.setFont(textFont);

        graphics.drawString(text, getX(), getY());

        graphics.setColor(baseColor);
        graphics.setFont(baseFont);
    }

    public Font getTextFont() {
        return textFont;
    }

    public void setTextFont(Font textFont) {
        this.textFont = textFont;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }
}
