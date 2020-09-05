package GUI;

import javax.swing.*;
import java.awt.*;

public class MainDrawPanel extends JPanel {
    @Override
    public void paint(Graphics graphics) {

        drawHorizon(graphics);
        drawRailRoad(graphics);
    }

    private void drawHorizon(Graphics graphics) {
        Color baseColor = graphics.getColor();

        // небо
        Color skyColor = new Color(32, 32, 64);
        graphics.setColor(skyColor);
        graphics.fillRect(0, 0, GlobalVar.windowWidth, GlobalVar.windowHeight);

        // земля
        graphics.setColor(new Color(28, 64, 32));
        graphics.fillRect(0, GlobalVar.windowHeight / 3, GlobalVar.windowWidth, GlobalVar.windowHeight);


        // луна
        graphics.setColor(new Color(255, 230, 240));
        graphics.fillOval(64, 16, 64, 64);
        graphics.setColor(skyColor);
        graphics.fillOval(80, 0, 72, 72);

        graphics.setColor(baseColor);
    }

    private void drawRailRoad(Graphics graphics) {
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
}
