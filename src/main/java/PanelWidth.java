import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class PanelWidth extends JPanel implements ChangeListener
{
    PanelData panelData = null;
    static final int MIN = 1;
    static final int MAX = 10;
    static final int INIT = 3;

    public PanelWidth(PanelData panelData)
    {
        this.panelData = panelData;
        setLayout(new GridLayout(1, 1, 15, 15));
        setBounds(10, 165, 150, 50);
        JSlider jSlider = new JSlider(JSlider.HORIZONTAL, MIN, MAX, INIT);
        jSlider.addChangeListener(this);
        jSlider.setMajorTickSpacing(9);
        jSlider.setMinorTickSpacing(1);
        jSlider.setPaintTicks(true);
        jSlider.setPaintLabels(true);
        add(jSlider);
    }

    @Override
    public void stateChanged(ChangeEvent changeEvent) {
        JSlider source = (JSlider)changeEvent.getSource();
        panelData.setWidth(source.getValue());
    }
}
