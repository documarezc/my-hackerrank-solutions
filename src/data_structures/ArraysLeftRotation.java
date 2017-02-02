package data_structures;

import java.util.*;

public class ArraysLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] arrayRotated = new int[n];
        if(k == n) {
            return a;
        }
        else {
            for(int i = k; i < n; i++) {
                arrayRotated[i - k] = a[i];
            }
            for(int i = 0; i < k; i++) {
                arrayRotated[i + n - k] = a[i];
            }
        }

        return arrayRotated;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}