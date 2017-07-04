package ro.teamnet.zerotohero.oop.oop.graphicshape;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class Point3D extends Point {
    private int zPoz;

    public Point3D(int xPos, int yPos, int zPoz) {
        super(xPos, yPos);
        this.zPoz = zPoz;
    }
}
