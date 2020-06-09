

import java.util.*;


public class longestSequence {

    public static void main(String[] args) {

        int arr[] = { 1, 0, 1, 0, 1, 1, 1 }; // input

        ArrayList<Integer> result = new ArrayList<Integer>();

        int sequence = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                sequence++;
                if (sequence > 0 & i == arr.length - 1) {
                    result.add(sequence);
                }
            } else {
                if (sequence > 0) {
                    result.add(sequence);
                }
                result.add(0);
                sequence = 0;

            }

        }

        System.out.println(result);

        int Lsequence = 0;

        for (int i = 0; i < result.size(); i += 2) {

            int Len = result.get(i);
            if ((i + 1) < result.size()) {
                Len += 1;
            }
            if ((i + 2) < result.size()) {
                Len += result.get(i + 2);
            }
            if (Len > Lsequence) {
                Lsequence = Len;
            }

        }
        System.out.println("the longest sequence in this array is " + Lsequence);

    }
}