import java.util.List;

import sun.nio.cs.ext.Big5;


import sun.nio.cs.ext.Big5;

import java.util.ArrayList;
import java.util.Arrays;

public class lat3_4{
    public static void main(String[] args) {
        List<Integer> bilUnique = new ArrayList<>();

        bilUnique.add(1);
        bilUnique.add(3);
        bilUnique.add(5);
        bilUnique.add(10);
        bilUnique.add(1);
        bilUnique.add(20);
        bilUnique.add(10);
        bilUnique.add(1);
        bilUnique.add(20);
        bilUnique.add(9);
        bilUnique.add(1);

        Integer valOfNol = bilUnique.get(0);
        Integer valOfSatu = bilUnique.get(1);
        Integer valOfTiga = bilUnique.get(3);

        String output = String.format("Index ke 0 adalah %s, index ke 1 adalah %s, dan indeks ke 3 adalah %s", valOfNol, valOfSatu, valOfTiga);
        System.out.print(output);

        //List Array Bilangan Ganjil
        List<Integer> bilGanjil = new ArrayList<>();

        Integer[] arrayBaru = new Integer[bilUnique.size()];
        arrayBaru = bilUnique.toArray(arrayBaru);
        
        

        for (int i = 0; i < arrayBaru.length; i++){
            if((arrayBaru[i] % 2) != 0 ) {
                bilGanjil.add(arrayBaru[i]);
            }
        }

        bilGanjil.forEach((val) -> {
            System.out.println(val);
        });
        
    }
}