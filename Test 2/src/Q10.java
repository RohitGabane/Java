//Q.10 : Given two sorted array of integer, print common element between 2 array in single loop 

import java.util.*;

public class Q10 
{
     static void common(int[] arr1,int[] arr2)
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
 
        for (int i : arr1) {
            set1.add(i);
        }
         for (int i : arr2) {
            set2.add(i);
        }
        set1.retainAll(set2);
        System.out.println("Common elements is : " + set1);
    }
 
    public static void main(String[] args)
    {
        int[] ar1= { 2,5,6};
        int[] ar2= { 4,6,8,10};
 
        System.out.println("Array 1: "+ Arrays.toString(ar1));
        System.out.println("Array 2: "+ Arrays.toString(ar2));
        common(ar1, ar2);
    }
}