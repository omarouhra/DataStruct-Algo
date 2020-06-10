package practice;


import java.util.ArrayList;

public class amazon {
    public static void main(String[] args) {

        int[] arr = { 1, 0, 1, 1, 0, 1 };
        ArrayList<Integer> result = new ArrayList<Integer>();
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter++;
                if (i == arr.length - 1) {
                    result.add(counter);
                }
            } else {
                result.add(counter);
                counter = 0;
                result.add(counter);

            }

        }
        System.out.println(result);
    }

}