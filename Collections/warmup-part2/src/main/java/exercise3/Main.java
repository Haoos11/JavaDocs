package exercise3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Silviu.Marin on 07-Jul-17.
 */
public class Main {

    public static void main(String[] args) {

        Map<Student, BigDecimal> map = new HashMap<Student, BigDecimal>();
        Map<Student, BigDecimal> map2 = new HashMap<Student, BigDecimal>();
        Map<Student, BigDecimal> map3 = new HashMap<Student, BigDecimal>();
        Map<Student, BigDecimal> map4 = new HashMap<Student, BigDecimal>();

        Stud1 stud1 = new Stud1("Ion", "Dinu");
        Stud1 stud11 = new Stud1("Ion", "Bmw");



        Stud2 stud2 = new Stud2("Johnny", "BmW");
        Stud3 stud3 = new Stud3("Johnny", "BmW");
        Stud4 stud4 = new Stud4("Ion", "BmW");

        map.put(stud1, BigDecimal.ONE);
        map.put(stud11, BigDecimal.ONE);

        map2.put(stud1, BigDecimal.TEN);
        map2.put(stud2, BigDecimal.TEN);
        map2.put(stud3, BigDecimal.TEN);
        map2.put(stud4, BigDecimal.TEN);

        map3.put(stud1, BigDecimal.TEN);
        map3.put(stud2, BigDecimal.TEN);
        map3.put(stud3, BigDecimal.TEN);
        map3.put(stud4, BigDecimal.TEN);

        map4.put(stud1, BigDecimal.ONE);
        map4.put(stud2, BigDecimal.ONE);
        map4.put(stud3, BigDecimal.ONE);
        map4.put(stud4, BigDecimal.ONE);

        Iterator<Map.Entry<Student, BigDecimal>> iterator1 = map.entrySet().iterator();
        Iterator<Map.Entry<Student, BigDecimal>> iterator2 = map2.entrySet().iterator();
        Iterator<Map.Entry<Student, BigDecimal>> iterator3 = map3.entrySet().iterator();
        Iterator<Map.Entry<Student, BigDecimal>> iterator4 = map4.entrySet().iterator();

        while (iterator1.hasNext()){
            Map.Entry<Student, BigDecimal> it = iterator1.next();
                System.out.println("For map1 key: " + it.getKey() + " val: " + it.getValue());


        }
//        System.out.println("=========================");
//
//        while (iterator2.hasNext()){
//            Map.Entry<Student, BigDecimal> it2 = iterator2.next();
//            System.out.println("For map2 key: " + it2.getKey() + " val: " + it2.getValue());
//
//
//        }
//        System.out.println("=========================");
//        while (iterator3.hasNext()){
//            Map.Entry<Student, BigDecimal> it3 = iterator3.next();
//            System.out.println("For map3 key: " + it3.getKey() + " val: " + it3.getValue());
//
//
//        }
//        System.out.println("=========================");
//        while (iterator4.hasNext()){
//            Map.Entry<Student, BigDecimal> it4 = iterator4.next();
//            System.out.println("For map1 key: " + it4.getKey() + " val: " + it4.getValue());
//
//
//        }



    }
}
