package Lesson_6;

import java.util.Arrays;

public class Task3 {
    public static boolean OneAndFour(int[] arr) {
         int One = 1;
         int Four = 4;
        boolean a = false;
        boolean b = false;

        for (int i : arr) {
            if (i == One ) {
               a = true ;
            }
        }
        for (int j : arr) {
            if (j == Four ) {
                b = true ;
            }
        }

        return a && b;
    }
//        int a = 1;
//        int b = 4;
//        boolean a1 = Arrays.asList(arr).contains(a);
//        boolean b1 = Arrays.asList(arr).contains(b);
//        if (a1 == true && b1 == true)
//            return true;
//        else
//            return false;
//
//    }
}


