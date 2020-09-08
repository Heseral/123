package GUI;

import Utils.GlobalVar;

import javax.swing.*;
import java.awt.*;

public class MainDrawPanel extends JPanel {
    private final Color SKY_COLOR = new Color(32, 32, 64);
    private final Color MOON_COLOR = new Color(255, 230, 240);
    private final Color EARTH_COLOR = new Color(28, 64, 32);

    private final Font TEXT_FONT = new Font(Font.MONOSPACED, Font.ITALIC | Font.BOLD, 30);

    @Override
    public void paint(Graphics graphics) {
        drawHorizon(graphics);
        drawRailRoad(graphics);
        drawSpecifiedString(
                graphics,
                "Ухх сос мыслом...", // да, здесь ошибки, но это авторские ошибки, я так и задумывал!
                (int) (GlobalVar.windowWidth * 0.5), // снова да, он будет не по центру а правее, так из задумывалось!
                (int) (GlobalVar.windowHeight * 0.1),
                MOON_COLOR,
                TEXT_FONT
                );
    }

    private void drawHorizon(Graphics graphics) {
        try {
            if (graphics == null) {
                throw new Exception("graphics не может быть null.");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        Color baseColor = graphics.getColor();

        // небо
        graphics.setColor(SKY_COLOR);
        graphics.fillRect(0, 0, GlobalVar.windowWidth, GlobalVar.windowHeight);

        // земля
        graphics.setColor(EARTH_COLOR);
        graphics.fillRect(0, GlobalVar.windowHeight / 3, GlobalVar.windowWidth, GlobalVar.windowHeight);


        // луна
        graphics.setColor(MOON_COLOR);
        graphics.fillOval(64, 16, 64, 64);
        graphics.setColor(SKY_COLOR);
        graphics.fillOval(80, 0, 72, 72);

        graphics.setColor(baseColor);
    }

    private void drawRailRoad(Graphics graphics) {
        try {
            if (graphics == null) {
                throw new Exception("graphics не может быть null.");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        Color baseColor = graphics.getColor();

        // шпалы
        graphics.setColor(new Color(26, 0, 0));
        int centerXCoordinate = GlobalVar.windowWidth / 2;
        double i;
        double j = 1;
        for (i = 3; i < GlobalVar.windowHeight; i *= 1.5, j *= 1.33) {
            graphics.fillRect(
                    (int) (centerXCoordinate - i),
                    (int) (i + GlobalVar.windowHeight / 3),
                    (int) (2 * i),
                    (int) j
            );
        }

        // рельсы
        graphics.setColor(new Color(57, 66, 70));
        for (int k = 0; k < 32; k++) {
            graphics.drawLine(centerXCoordinate, GlobalVar.windowHeight / 3, (int) (centerXCoordinate + i / 1.5 - i + k), GlobalVar.windowHeight);
            graphics.drawLine(centerXCoordinate, GlobalVar.windowHeight / 3, (int) (centerXCoordinate - i / 1.5 + i - k), GlobalVar.windowHeight);
        }

        graphics.setColor(baseColor);
    }

    public void drawSpecifiedString(Graphics graphics, String text, int posX, int posY, Color textColor, Font textFont) {
        try {
            if (graphics == null || text == null || textColor == null || textFont == null) {
                throw new Exception("Какой-то или несколько аргументов являются null.");
            }
            if (posX < 0 || posY < 0 || posX > GlobalVar.windowWidth || posY > GlobalVar.windowHeight) {
                throw new Exception("Текст расположен за пределами экрана по координатам: (" + posX + ", " + posY + ").");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        if (text.length() < 1) {
            return; // нет смысла что то делать ниже, если все равно ничего не будет выведено на экран
        }

        Color baseColor = graphics.getColor();
        graphics.setColor(textColor);

        Font baseFont = graphics.getFont();
        graphics.setFont(textFont);

        graphics.drawString(text, posX, posY);

        graphics.setColor(baseColor);
        graphics.setFont(baseFont);
    }
}
