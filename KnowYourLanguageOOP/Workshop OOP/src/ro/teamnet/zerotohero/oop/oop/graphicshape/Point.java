package ro.teamnet.zerotohero.oop.oop.graphicshape;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class Point {
    public int xPos, yPos;

    public Point(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;

        if (obj instanceof Point) {
            Point anotherPoint = (Point) obj;
        if ((xPos == anotherPoint.xPos) &&(yPos == anotherPoint.yPos))
            return true;
        }
        return false;

    }
}
