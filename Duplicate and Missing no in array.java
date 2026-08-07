import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    boolean[] visited = new boolean[n+1];
    int dup = -1; int missing = -1;
    for(int i:arr){
      if(visited[i]){
        dup = i;
      }
      else {
        visited[i] = true;
      }
    }
    for(int i =1; i<=n; i++){
      if(!visited[i]){
        missing = i;
        break;
      }
    }
    System.out.println("The duplicate no. is "+dup+" and missing no. is "+missing);
  }
}
