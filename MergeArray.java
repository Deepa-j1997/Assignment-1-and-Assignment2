package JavaPrograms;

public class MergeArray {
	
		public static void main(String[] args) {
			
		int a[]={2,5,7,9,10};
		int b[]={12,6,1,8};
		int l1=a.length;
		int l2=b.length;
		int c1=l1+l2;
		int c[]=new int[c1];
		for(int i=0;i<l1;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<l2;i++)
		{
			c[l1+i]=b[i];
		}
		System.out.println("Array after Merging:");
		for(int i=0;i<c1;i++)
		{
			System.out.println(c[i]);
		}

	}
	}

