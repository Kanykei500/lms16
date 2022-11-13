import jdk.dynalink.linker.support.TypeUtilities;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
Animal[] animals={
        new Shark("Kitovaya Akula"),
        new Eagle("Repax"),
        new Turtle("Loggerhed")};

        for (Animal animal:animals) {
            if(animal instanceof Shark) ((Shark) animal).attack();
            else if(animal instanceof Turtle) ((Turtle) animal).swim();
            else if (animal instanceof Eagle) ((Eagle) animal).fly();
            else System.out.println("oshibka");
        }
        Shark[] sharks= new Shark[1];
        Turtle[] turtles = new Turtle[1];
        Eagle[] eagles = new Eagle[1];


        for (Animal a:animals) {
            if(a instanceof Shark) {
                sharks[0] = (Shark) a;

            }else if(a instanceof Turtle){
                turtles[0] = (Turtle) a;

            }else if(a instanceof Eagle){
                eagles[0] = (Eagle) a;

            }
        }

        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(turtles));
        System.out.println(Arrays.toString(eagles));
    }
}