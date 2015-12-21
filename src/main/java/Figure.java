import java.awt.Color;

class Figure
{
    public Figure(int x1, int y1, int x2, int y2, int width, Color col, int figureType)
    {
        this.x1    = x1;
        this.y1    = y1;
        this.x2    = x2;
        this.y2    = y2;
        this.width = width;
        this.col   = col;
        this.type  = figureType;
    }

    int type;
    int x1;
    int y1;
    int x2;
    int y2;
    int width;
    Color col;
}