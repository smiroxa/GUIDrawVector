import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class TypePanel extends JPanel
{
    Data xd = null;
    public TypePanel(Data xd)
    {
        this.xd = xd;
        setLayout( new GridLayout(5, 1, 5, 5));
        setBounds(0, 0, 100, 200);

        TypeAction aClick = new TypeAction();

        String[] str = {"Fozzy", "Rect", "Oval", "Round Rect", "Line"};
        for (int i = 0; i < str.length; i++)
        {
            JButton btn = new JButton(str[i]);
            btn.addActionListener(aClick);
            btn.setActionCommand("" + (i+1));
            add(btn);
        }

    }
    class TypeAction implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            xd.figureType = Integer.parseInt( e.getActionCommand() );
        }
    }
}
