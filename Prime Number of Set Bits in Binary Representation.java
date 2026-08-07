import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int left = sc.nextInt();
    int right = sc.nextInt();int count =0;
    for(int i = left; i<=right; i++){
      int bits = Integer.bitCount(i);
      if(isPrime(bits)) count++;
    }
    System.out.println(count);
  }
  private static boolean isPrime(int n){
    if(n<2) return false;
    for(int i =2; i*i<=n; i++){
      if(n%i == 0) return false;
      
    }
    return true;
  }
}
