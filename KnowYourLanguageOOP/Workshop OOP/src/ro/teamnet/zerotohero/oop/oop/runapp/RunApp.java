package ro.teamnet.zerotohero.oop.oop.runapp;

import ro.teamnet.zerotohero.canvas.Canvas;
import ro.teamnet.zerotohero.oop.oop.graphicshape.*;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class RunApp {



    public static void main(String[] args) {
        Circles c = new Circles();

        //c.getAreaPub();
        System.out.println(c.getAreaPub());
        c.getAreaDef();

        Canvas ca = new Canvas();

        Shape s = new Circle(10);
        System.out.println(s.area());

        ShapeBehaviour sb = new Square(10);
        System.out.println(sb.area());


        Object p1 = new Point(10,20);
        Object p2 = new Point(50,100);
        Object p3 = new Point(10,20);

        System.out.println("p1 equals p2 is " + p1.equals(p2));
        System.out.println("p1 equals p3 is " + p1.equals(p3));



    }
}
