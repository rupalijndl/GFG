import java.util.*;
public class Triplets {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int a[]=new int[n];
		  for(int i=0;i<n;i++)
			  a[i]=sc.nextInt();
		  int i,j,k,c=0;
		  for(i=0;i<n-2;i++)
		  {
			  for(j=i+1;j<n-1;j++)
			  {
				  for(k=i+1;k<n;k++)
				  {
					  if(((a[i]+a[j])==a[k])||((a[i]+a[k])==a[j])||((a[j]+a[k])==a[i]))
						  c++;
				  }
			  }
		  }
		  System.out.println(c);

	}

}



