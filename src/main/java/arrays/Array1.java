package arrays;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] a= new int[10];
        b(a);
        System.out.println(Arrays.toString(a));

    }public static int[] b(int... ints){
        for(int i=0;i<ints.length;i++){
            ints[i]=(int)(Math.random()*66);
        }
        return ints;
    }
}
