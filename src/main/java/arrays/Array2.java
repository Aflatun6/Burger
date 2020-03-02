package arrays;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] arr = create(10);
        print(arr);
        int[] sorted = sort(arr);
        print(sorted);
        int [] a;
        a=new int[5];
        a[0]= 1;
        print(a);
    }

    public static int[] create(int number) {
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = (int) (Math.random() * 55);
        }
        return arr;
    }

    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + " element is: " + arr[i]);
//        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr) {
//        int[] sorted = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            sorted[i] = arr[i];
//        }
        int[] sorted = Arrays.copyOf(arr,arr.length);// arr.length is NEWLENGTH MEANS THAT HOW MANY ELEMENTS WILL BE COPIED INTO sorted array.
//        for (int i = 0; i < sorted.length; i++) {
//            for (int j = i+1; j < sorted.length; j++) {
//                if (sorted[i] > sorted[j]) {
//                    int temp = sorted[i];
//                    sorted[i] = sorted[j];
//                    sorted[j] = temp;
//                }
//                System.out.println(Arrays.toString(sorted));
//            }
//        }
        for (int i = 1; i <= sorted.length; i++) {
            for (int j = 0; j < sorted.length-i; j++) {
                if (sorted[j] < sorted[j+1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = temp;
                }
            }
        }

        return sorted;
    }
}
