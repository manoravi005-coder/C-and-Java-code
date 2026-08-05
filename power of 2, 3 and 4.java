import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
public static boolean isPoweroftwo(int n){
        return n>0 && (n & (n-1)) == 0;
    }
    public static boolean isPowerofthree(int n){
        return n> 0 && 1162261467 % n == 0;
    }
    public static boolean isPoweroffour(int n){
        return n> 0 && (n & (n-1)) == 0 && (n & 0x55555555)!=0;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPoweroftwo(n)){
            System.out.println(n + " is power of 2");
        }
        else System.out.println(n + " is not power of 2");
        if(isPowerofthree(n)){
            System.out.println(n + " is power of 3");
        }
        else System.out.println(n + " is not power of 3");
        if(isPoweroffour(n)){
            System.out.println(n + " is power of 4");
        }
        else System.out.println(n + " is not power of 4");
	}
}
