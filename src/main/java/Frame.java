import javax.swing.*;

public class Frame extends JFrame
{
    public Frame()
    {
        setTitle("GUI VECTOR");
        setBounds(0, 0, 750, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println("Frame: Creating new instance PanelMain");
        add( new PanelMain());
        setVisible(true);
    }
}

