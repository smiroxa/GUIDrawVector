import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener, MouseMotionListener
{

    int x = 0;
    int y = 0;

    Data xd = null;

    ArrayList<Figure> pic = new ArrayList<Figure>();

    public Panel(Data xd)
    {
        setBounds(100, 0, 500, 500);
        this.xd = xd;
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
    }
    @Override
    public void mouseDragged(java.awt.event.MouseEvent e)
    {
        if( xd.figureType == 1)
        {
            pic.add( new Figure(x, y, e.getX(), e.getY(), xd.width, xd.col, xd.figureType) );
            x = e.getX();
            y = e.getY();
            repaint();
        }
    }
    @Override
    public void mouseReleased(java.awt.event.MouseEvent e)
    {
        if(xd.figureType == 1)
            return;

        pic.add( new Figure(x, y, e.getX(), e.getY(), xd.width, xd.col, xd.figureType) );
        repaint();
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D gg = (Graphics2D) g;
        for( Figure p : pic)
        {
            gg.setColor(p.col);
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
