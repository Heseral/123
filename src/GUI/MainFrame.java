package GUI;

import Utils.GlobalVar;

import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setBounds(GlobalVar.windowWidth / 2, GlobalVar.windowHeight / 2, GlobalVar.windowWidth, GlobalVar.windowHeight);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        add(new MainDrawPanel());
    }

}
