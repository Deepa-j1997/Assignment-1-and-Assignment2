package JavaPrograms;
import java.util.Scanner;

public class SearchElement {
	

	
		public static void main(String[] args) {
			int a[]={1,4,34,56,7};
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.:");
			int no=sc.nextInt();
			int count=0;
			int locatn=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==no)
				{
					locatn=i+1;
					count=1;
					break;
				}
				else
				{
					count=0;
				}
			}
			if(count==1)
			{
				System.out.println("Loactn of the no.is: "+locatn);
			}
			else
			{
				System.out.println(-1);
			}
			
			
		}

	}



