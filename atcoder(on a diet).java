import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long k = sc.nextLong();
      long[] a = new long[n];
      for(int i = 0; i<n; i++){
        a[i] = sc.nextLong();
      }
      long[] eaten = new long[n];
      long sum = 0;
      for(int i =0; i<n; i++){
        if(i>=m){
          sum -= eaten[i-m];
        }
        if(sum + a[i] <=k){
          System.out.println("Yes");
          eaten[i] = a[i];
          sum+=a[i];
        }
        else{
          System.out.println("No");
          eaten[i] = 0;
        }
      }
      sc.close();
    }
}
