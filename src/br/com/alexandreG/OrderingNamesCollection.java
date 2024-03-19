/**
 * @author alexandre.gaia
 */

package br.com.alexandreG;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OrderingNamesCollection {

    public static void main(String[] args){
        orderedCollection();
    }

    private static void orderedCollection(){
        Scanner s = new Scanner(System.in);
        Set<String> collection = new TreeSet<>();

        System.out.println("Insert names to align 'em in order. ");
        System.out.println("Insert (end) to finish the program and show the list. ");

        String answer = s.next();

        while(!answer.equalsIgnoreCase("end")){
            collection.add(answer);
            answer = s.next();
        }

        System.out.println(" ");
        System.out.println("Ordered names: ");
        for (String names : collection){
            System.out.println(names);
        }

    }

}
