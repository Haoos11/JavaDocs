package ro.teamnet.zerotohero.oop.oop.graphicshape;

import ro.teamnet.zerotohero.oop.oop.exceptions.MyException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public class Circles {


    public double getAreaPub(){
        Circle c = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("ceva.txt")))  {
            c = new Circle(5,5,8);
        } catch (MyException e) {
            e.printStackTrace();
        }
        catch (Exception f){
            f.printStackTrace();
        }
        finally {
            System.out.println("Am ajuns la finally");
        }

        return c.area();
    }

    public void getAreaDef(){
        Circle c = new Circle();

        c.fillColour();
        c.fillColour(8);
        c.fillColour((float) 9.5);


    }
}
