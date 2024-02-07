import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class runner {





    public static void main(String[] args){



        Human h1 = new Human();
        //System.out.println(h1.height);
        ArrayList<Integer> people = new ArrayList();
        people.add(h1.height);

        h1.Year1();
        //System.out.println(h1.height);
        people.add(h1.height);

        h1.Year2();
        //System.out.println(h1.height);
        people.add(h1.height);

        h1.Year3();
        //System.out.println(h1.height);
        people.add(h1.height);
        int g;

        for(Integer human: people){
            System.out.println(human);
        }



        Method[] methods = h1.getClass().getDeclaredMethods();
        String name;
        System.out.println("List of methods\n");
        for(Method method: methods){
            name = method.getName().toString();
            System.out.println(name);
        }

        System.out.println("\nList of fields");
        Field[] fields = h1.getClass().getDeclaredFields();
        for(Field field: fields){
            name = field.getName().toString();
            System.out.println(name);
        }
    }


}
