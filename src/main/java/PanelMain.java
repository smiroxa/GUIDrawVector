import javax.swing.JPanel;

public class PanelMain extends JPanel
{
    public PanelMain(PanelData panelData)
    {
        setLayout(null);
        System.out.println("PanelMain: Creating new instances PanelData, PanelDraw, PanelTools, PanelWidth, PanelColor");

        PanelDraw panelDraw       = new PanelDraw(panelData);
        PanelTools panelType      = new PanelTools(panelData);
        PanelWidth panelWidth     = new PanelWidth(panelData);
        PanelColor panelColor     = new PanelColor(panelData);
        add(panelType);
        add(panelDraw);
        add(panelWidth);
        add(panelColor);
    }
}
