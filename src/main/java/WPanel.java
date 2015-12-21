import javax.swing.JPanel;

public class WPanel extends JPanel
{
    public WPanel()
    {
        setLayout(null);

        Data xd = new Data();
        TypePanel tp = new TypePanel(xd);
        Panel xp = new Panel(xd);

        add(tp);
        add(xp);
    }
}
