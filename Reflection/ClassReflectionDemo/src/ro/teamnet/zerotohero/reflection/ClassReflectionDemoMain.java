package ro.teamnet.zerotohero.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

import ro.teamnet.zerotohero.reflection.Demo;
import ro.teamnet.zerotohero.reflection.demoobjects.MyClass;
import ro.teamnet.zerotohero.reflection.demoobjects.MySuperClass;

/**
 * TODO
 * in order to resolve the exercises below, you will have to create
 * all the needed clasees, with their members and methods
 * (in ro.teamnet.zerotohero.reflection.demoobjects package)
 */
public class ClassReflectionDemoMain {

    private int v = 0;

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //TODO get the class for a String object, and print it

        //Class string = new String("salut").getClass();
        String string = new String("salut");
        System.out.println(string.getClass());

        //TODO get the class of an Enum, and print it

        //Class enumeratie = Enum.class;
        Class enumeratie = Demo.FRIDAY.getClass();

        System.out.println(enumeratie);

        //TODO get the class of a collection, and print it
        //Class colectie = Collections.class;
        Class colectie  = new ArrayList().getClass();
        System.out.println(colectie);


        //TODO get the class of a primitive type, and print it
        Class primitiva = int.class;
        System.out.println(primitiva);

        //TODO get and print the class for a field of primitive type
        System.out.println(ClassReflectionDemoMain.class.getDeclaredField("v").getType());

        //TODO get and print the class for a primitive type, using the wrapper class
        Class primitivaC = Integer.class;
        System.out.println(primitivaC);

        //TODO get the class for a specified class name
        Class classname = HashSet.class;
        System.out.println(classname);


        //TODO get the superclass of a class, and print it
        //TODO get the superclass of the superclass above, and print it
        Class sp = MyClass.class.getSuperclass();
        System.out.println(sp);


        //TODO get and print the declared classes within some other class
        Class<?>[] cwsoc = MyClass.class.getDeclaredClasses();

        for (int i=0; i<cwsoc.length; i++) {
            System.out.println("aici" + cwsoc[i].getName());
        }
        //TODO print the number of constructors of a class
        Constructor<?>[] nr = MyClass.class.getDeclaredConstructors();
        System.out.println(nr.length);


        //TODO get and invoke a public constructor of a class
        Constructor constructor= MyClass.class.getConstructor(int.class);
        Object mc = constructor.newInstance(new Integer(10));

        System.out.println(mc);


        //TODO get and print the class of one private field

        //MyClass privateObject = new MyClass(10);
        Field privateIntField = MyClass.class.getDeclaredField("a");
        privateIntField.setAccessible(true);
        System.out.println(privateIntField.getType());


        //TODO set and print the value of one private field for an object

        MyClass privateObject = new MyClass(5.9);
        Field privateIntFieldObject = privateObject.getClass().getDeclaredField("b");
        privateIntFieldObject.setAccessible(true);
        System.out.println(privateIntFieldObject.getType());


        //TODO get and print only the public fields class
        Field[] publicFields = MyClass.class.getFields();
        for (int i=0; i<publicFields.length; i++){
            System.out.println("pulic fields: " + publicFields[i]);
        }

        //TODO get and invoke one public method of a class
        MyClass obj = new MyClass(10);
        Method met = MyClass.class.getMethod("sum");
        System.out.println(met.invoke(obj));

        //TODO get and invoke one inherited method of a class
        MyClass obj2 = new MyClass(10);
        Method met2 = MyClass.class.getMethod("dif");
        System.out.println(met2.invoke(obj2));

        //TODO invoke a method of a class the classic way for ten times, and print the timestamp (System.currentTimeMillis())
        MyClass m = new MyClass(22);
        double begin = System.currentTimeMillis();


        for (long i=0; i<10000000; i++){

            m.sum();
        }
        double diff1 = System.currentTimeMillis() - begin;
        System.out.println(diff1);
        System.out.println("=============================================================");
        //TODO invoke a method of a class by Reflection for 100 times, and print the timestamp
        MyClass obj3 = new MyClass(10);
        Method met3 = MyClass.class.getMethod("sum");
        for (long i=0; i<10000000; i++){
            met3.invoke(obj);

        }

        double diff = System.currentTimeMillis() - begin;


        System.out.println(diff);


        //what do you observe?

    }
}
