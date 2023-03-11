package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class _1BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //size of array
        int[] newArray = new int[n];
        for (int i=0;i<n;i++){
            newArray[i] = sc.nextInt();
        }

        // now sorting it
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(newArray[i]>newArray[j]){

                    int temp = newArray[i];
                    newArray[i]  =newArray[j];
                    newArray[j]  =temp;
                }
            }
        }

        System.out.println(Arrays.toString(newArray));
    }
}
