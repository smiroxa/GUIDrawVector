import javax.swing.*;

public class Frame extends JFrame
{
    public Frame()
    {
        setTitle("GUI VECTOR");
        setBounds(200, 200, 600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add( new WPanel() );

        setVisible(true);
    }
}

