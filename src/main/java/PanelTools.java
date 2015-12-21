import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTools extends JPanel
{
    PanelData panelData = null;
    public PanelTools(PanelData panelData)
    {
        this.panelData = panelData;
        setLayout( new GridLayout(5, 1, 5, 5));
        setBounds(10, 5, 150, 150);

        ToolsPanelAction tpa = new ToolsPanelAction();

        String[] str = {"Fozzy", "Rect", "Oval", "Round Rect", "Line"};
        for (int i = 0; i < str.length; i++)
        {
            JButton btn = new JButton(str[i]);
            btn.addActionListener(tpa);
            btn.setActionCommand("" + (i+1));
            add(btn);
        }
    }

    class ToolsPanelAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            panelData.setFigureType(Integer.parseInt(e.getActionCommand()));
        }
    }
}
