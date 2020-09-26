package GUI;

import GUI.objects.*;
import Utils.GlobalVar;

import javax.swing.*;
import java.awt.*;

public class MainDrawPanel extends JPanel {
    @Override
    public void paint(Graphics graphics) {
        Color skyColor = new Color(32, 32, 64);
        Color moonColor = new Color(255, 230, 240);
        Color earthColor = new Color(28, 64, 32);
        new Horizon(
                skyColor,
                earthColor,
                GlobalVar.windowWidth,
                GlobalVar.windowHeight,
                0,
                0
        ).draw(graphics);
        new Moon(
                moonColor,
                skyColor,
                64,
                16,
                72,
                72
        ).draw(graphics);
        new Railroad(
                GlobalVar.windowWidth,
                GlobalVar.windowHeight
        ).draw(graphics);
        new Text(
                "Ухх сос мыслом...", // да, здесь ошибки, но это авторские ошибки, я так и задумывал!
                (int) (GlobalVar.windowWidth * 0.5), // снова да, он будет не по центру а правее, так из задумывалось!
                (int) (GlobalVar.windowHeight * 0.1),
                new Font(Font.MONOSPACED, Font.ITALIC | Font.BOLD, 30),
                moonColor
        ).draw(graphics);
        Color woodColor = new Color(75, 50, 0);
        Color leafColor = new Color(50, 75, 50);
        int sizeFactor = 50;
        int xCoordinateFactor = 50;
        int yCoordinateFactor = 25;
        new Tree(
                xCoordinateFactor,
                yCoordinateFactor * 7,
                sizeFactor,
                woodColor,
                leafColor
        ).draw(graphics);
        new Tree(
                xCoordinateFactor * 3,
                yCoordinateFactor * 8,
                sizeFactor * 2,
                woodColor,
                leafColor
        ).draw(graphics);
        new Tree(
                xCoordinateFactor,
                yCoordinateFactor * 10,
                sizeFactor * 4,
                woodColor,
                leafColor
        ).draw(graphics);
        new Tree(
                GlobalVar.windowWidth - xCoordinateFactor,
                yCoordinateFactor * 7,
                sizeFactor,
                woodColor,
                leafColor).draw(graphics);
        new Tree(
                GlobalVar.windowWidth - xCoordinateFactor * 3,
                yCoordinateFactor * 8,
                sizeFactor * 2,
                woodColor,
                leafColor
        ).draw(graphics);
        new Tree(
                GlobalVar.windowWidth - xCoordinateFactor,
                yCoordinateFactor * 10,
                sizeFactor * 4,
                woodColor,
                leafColor
        ).draw(graphics);

    }
}
