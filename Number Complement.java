import java.util.*;
import java.math.*;
import java.io.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = 0;
        int temp = n;
        while(temp > 0){
            mask = (mask<<1) | 1;
            temp >>=1;
        }
        System.out.println(n^mask);
    }
}
