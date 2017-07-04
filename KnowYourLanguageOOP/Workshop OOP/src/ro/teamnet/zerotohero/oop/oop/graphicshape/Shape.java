package ro.teamnet.zerotohero.oop.oop.graphicshape;

/**
 * Created by Silviu.Marin on 04-Jul-17.
 */
public abstract class Shape extends AbstractShape implements ShapeBehaviour {
    protected int color;
    protected float saturation;

    public void setColor(int color) {
        this.color = color;
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    public double area(){

        return 2;
    }

}
