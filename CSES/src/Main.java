import java.util.*;

public class Main{
  
  public static void main(String[] args) {
    
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int k=in.nextInt();
    
    int p[]=new int[n];    
    for(int i=0;i<n;i++) p[i]=in.nextInt();    
    
    int a[]=new int[m];
    for(int i=0;i<m;i++) a[i]=in.nextInt();

    Arrays.sort(p);
    Arrays.sort(a);
    
    int i=0,j=0,ans=0;
    while(i<n && j<m) {
      if(Math.abs(p[i]-a[j]) <=k ) {
        ans++;
        j++;
        i++;
      }
      else if(p[i]>a[j]) j++;
      
      else if(p[i]<a[j]) i++;      
    }
    
    System.out.println(ans);
    
  }
}