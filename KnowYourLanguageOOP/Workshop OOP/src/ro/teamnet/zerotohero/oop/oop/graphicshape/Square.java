package ro.teamnet.zerotohero.oop.oop.graphicshape;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = 10;
    }

    @Override
    public double area() {
        int a = side * side;
        return a;
    }
}
