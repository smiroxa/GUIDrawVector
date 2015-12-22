import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Frame extends JFrame implements ActionListener
{
    PanelData panelData;
    public Frame()
    {
        setTitle("GUI VECTOR");
        setBounds(0, 0, 750, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println("Frame: Creating new instance PanelMain");
        this.panelData = new PanelData();
        add(new PanelMain(panelData));

        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenu = new JMenu("File");
        JMenuItem itemSave = new JMenuItem("save");
        itemSave.addActionListener(this);
        jMenu.add(itemSave);

        JMenuItem itemOpen = new JMenuItem("open");
        itemOpen.addActionListener(this);
        jMenu.add(itemOpen);

        JMenuItem itemClose = new JMenuItem("close");
        itemClose.addActionListener(this);
        jMenu.add(itemClose);

        JMenuItem itemClear = new JMenuItem("clear");
        itemClear.addActionListener(this);
        jMenu.add(itemClear);

        jMenuBar.add(jMenu);
        setJMenuBar(jMenuBar);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        String command = actionEvent.getActionCommand();
        if (command.equals("open"))
        {
            System.out.println("open");
        }
        else if (command.equals("save"))
        {
            System.out.println("save");
            saveInstances(this.panelData.getPic());
        }
        else if (command.equals("clear"))
        {
            this.panelData.getPic().clear();
            // TODO нужно придумать как вызвать repaint() из PanelDraw
        }
        else if (command.equals("close"))
        {
            System.exit(0);
        }
    }

    private void saveInstances(ArrayList<Figure> pic)
    {
//        try
//        {
//            Gson gs = new Gson();
//            String str = gs.toJson(pic);
//            FileWriter fw = new FileWriter("D:\\Games\\ee.json");
//            fw.write(str);
//            fw.flush();
//            fw.close();
//        }
//        catch (IOException e1)
//        {
//            e1.printStackTrace();
//        }
    }
}

