import java.util.*;
import java.io.*;
import java.math.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int xor = n;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            xor ^=i;xor ^= arr[i];
            
        }
        
        System.out.println("Missing no. is "+ xor);
    }
}
