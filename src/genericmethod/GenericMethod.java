/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericmethod;

/**
 * Executes a generic method in a program that tests it with a variety of built-in types such as Object or Integer.
 * @author Timothy Bradford
 */
public class GenericMethod {

    /**
     * A generic method that compares its 2 arguments using the equals method
     * and returns true if they are equal and false otherwise.
     *
     * @param <T> A generic type
     * @param obj1 A generic object
     * @param obj2 A generic object
     * @return if both objects are equivalent
     */
    public static <T> boolean equalsBradford(T obj1, T obj2) {
        return obj1.equals(obj2);
    }

//    public static <T extends Number> void squareBradford(T obj) {
//
//    }//old test stuff

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Integer i = 100;
        Integer c = 99;
        System.out.println("Does " + i + " equal " + c + "? " + equalsBradford(i, c));

        c++;
        System.out.println("Does " + i + " equal " + c + "? " + equalsBradford(i, c));

        Double d = 100.5567;
        Double b = 100.33;
        
        System.out.println("Does " + d + " equal " + b + "? " + equalsBradford(d, b));
        
        b = d;
        System.out.println("Does " + d + " equal " + b + "? " + equalsBradford(d, b));

        String tb = "Timothy Bradford";
        String t = "Timothy";
        
        System.out.println("Does " + tb + " equal " + t + "? " + equalsBradford(tb, t));
        
        t += " Bradford";
        System.out.println("Does " + tb + " equal " + t + "? " + equalsBradford(tb, t));
        
    }

}
