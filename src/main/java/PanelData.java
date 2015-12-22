import java.awt.Color;
import java.util.ArrayList;

public class PanelData
{
    int width = 1;
    Color col = Color.blue;
    int figureType = 1;
    ArrayList<Figure> pic = new ArrayList<Figure>();

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setCol(Color col)
    {
        this.col = col;
    }

    public void setFigureType(int figureType)
    {
        this.figureType = figureType;
    }

    public ArrayList<Figure> getPic()
    {
        return this.pic;
    }

    public void setPic(Figure pic)
    {
        this.pic.add(pic);
    }
}
