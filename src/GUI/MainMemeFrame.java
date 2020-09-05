package GUI;

import javax.swing.*;

public class MainMemeFrame extends JFrame {
    public MainMemeFrame() {
        setBounds(GlobalVar.windowWidth / 2, GlobalVar.windowHeight / 2, GlobalVar.windowWidth, GlobalVar.windowHeight);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        add(new MainDrawPanel());
    }

}
