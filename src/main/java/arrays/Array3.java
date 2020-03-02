package arrays;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {

        int[] array=create(11);
        int[] reversed=reverse(array);
        print(array);
        print(reversed);
    }
    public static int[] create(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = (int) (Math.random() * 55);
        }
        return arr;
    }
    public static int[] reverse(int[] array){
        int[] reversed= Arrays.copyOf(array,array.length);
        for(int i=0;i<array.length;i++){
            reversed[i]=array[array.length-i-1];
        }

        return reversed;
    }
    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + " element is: " + arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
    }
}
