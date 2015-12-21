import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelColor extends JPanel implements ActionListener
{
    PanelData panelData = null;

    public PanelColor(final PanelData panelData)
    {
        this.panelData = panelData;
        setLayout( new GridLayout(1, 1, 5, 5));
        setBounds(10, 220, 150, 50);
        JButton chooseButton = new JButton("Choose color");
        chooseButton.addActionListener(this);
        add(chooseButton);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        Color backgroundColor = JColorChooser.showDialog(null, "Choose color", Color.white);
        panelData.setCol(backgroundColor);
    }
}
