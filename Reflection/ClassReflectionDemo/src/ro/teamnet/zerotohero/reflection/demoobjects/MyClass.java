package ro.teamnet.zerotohero.reflection.demoobjects;

import ro.teamnet.zerotohero.reflection.Demo;

/**
 * Created by Silviu.Marin on 12-Jul-17.
 */
public class MyClass extends MySuperClass {
    private int a;
    private double b;
    private MyDeclaredClass myDeclaredClass;

    public int c,d,f,g;

    public MyClass(int a) {
        this.a = a;
        b=2000.5;
    }

    public MyClass(double b) {
        this.b = b;
    }

    public class InnerClass {

    }

    public double sum(){
        return 2+3;
    }

    @Override
    public int dif() {
        return super.dif();
    }
}
