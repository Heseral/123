package GUI;

import Utils.GlobalVar;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((dimension.width - GlobalVar.windowWidth) / 2, (dimension.height - GlobalVar.windowHeight) / 2, GlobalVar.windowWidth, GlobalVar.windowHeight);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        add(new MainDrawPanel());
    }

}
