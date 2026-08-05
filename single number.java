import java.util.*;
import java.io.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int singleNumber = 0;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            singleNumber ^=arr[i];
            
        }
        
        System.out.println("Single no. is "+ singleNumber);
    }
}
