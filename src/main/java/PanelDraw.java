import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PanelDraw extends JPanel implements MouseListener, MouseMotionListener
{

    int x = 0;
    int y = 0;

    PanelData panelData = null;

    public PanelDraw(PanelData panelData)
    {
        setBackground(Color.WHITE);
        setBounds(170, 10, 565, 545);
        this.panelData = panelData;
        BorderFactory.createLineBorder(Color.red);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
    }
    @Override
    public void mouseDragged(MouseEvent e)
    {
        if( panelData.figureType == 1)
        {
            panelData.setPic(new Figure(x, y, e.getX(), e.getY(), panelData.width, panelData.col, panelData.figureType));
            x = e.getX();
            y = e.getY();
            repaint();
        }
    }
    @Override
    public void mouseReleased(MouseEvent e)
    {
        if(panelData.figureType == 1)
            return;

        panelData.setPic( new Figure(x, y, e.getX(), e.getY(), panelData.width, panelData.col, panelData.figureType ));
        repaint();
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D gg = (Graphics2D) g;
        for( Figure p : panelData.getPic())
        {
            gg.setColor(p.col);
            gg.setStroke(new BasicStroke(p.width));
            switch (p.type)
            {
                case 1: gg.drawLine(p.x1, p.y1, p.x2, p.y2); break;
                case 2: gg.drawRect(p.x1, p.y1, p.x2-p.x1, p.y2-p.y1); break;
                case 3: gg.drawOval(p.x1, p.y1, p.x2-p.x1, p.y2-p.y1); break;
                case 4: gg.drawRoundRect(p.x1, p.y1, p.x2-p.x1, p.y2-p.y1, 30, 30); break;
                case 5: gg.drawLine(p.x1, p.y1, p.x2, p.y2); break;
            }
        }
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {}
    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {}
    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {}
    @Override
    public void mouseMoved(java.awt.event.MouseEvent e) {}
}
