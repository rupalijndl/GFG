/*Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.*/



import java.util.*;
public class SubarraySum {

	public static void main(String[] args) {
		   Scanner sc= new Scanner (System.in);
		   //no. of test cases
		   int T=sc.nextInt();
		   while(T!=0)
		   {
			   //array size
			   int n=sc.nextInt();
			   //sum
			   int sum=sc.nextInt();
			   int a[]=new int[n];
			   for(int i=0;i<n;i++)
				   a[i]=sc.nextInt();
			   int curr_sum=0,ll=0,ul=0; 
			   //current sum,lower limit,upper limit
			   main_loop:
			   for(int i=0;i<n-1;i++)
			   {
				   ll=i;
				   curr_sum=a[i];
				   for(int j=i+1;j<n;j++)
				   {
					   if(curr_sum>sum)
						    break;
					   else if(curr_sum<sum)
					   {
						   curr_sum+=a[j];
						   if(curr_sum==sum)
						   {
							   ul=j;
							   break main_loop;
						   }
					   }
					   else
					   {
						    ul=j-1;
						    break main_loop;
					   }  //when single element is sum
					   
				   }
				   curr_sum=0;
			   }
			  
			   if(sum==curr_sum)
				    System.out.println((ll+1) +" "+ (ul+1) );
			   else
				   System.out.println("-1");
			   T--;
		   }	
	}

}
