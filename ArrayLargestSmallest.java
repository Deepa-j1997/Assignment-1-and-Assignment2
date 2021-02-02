package JavaPrograms;

public class ArrayLargestSmallest {
	
		public static void main(String[] args) {
			int a;
			int array[]={23,65,12,78,66,21,2,56};
			int count=array.length;
			System.out.println("Array after sorting: ");

			for(int i=0;i<count;i++)
			{
				for(int j=i+1;j<count;j++)
				{
					if(array[i]>array[j])
					{
						a=array[i];
						array[i]=array[j];
						array[j]=a;
					}
				}
				System.out.println(array[i]);

				}
			System.out.println("Largest element : "+array[count-1]);
			System.out.println("Second largest element : "+array[count-2]);

			System.out.println("Smallest element : "+array[0]);

			System.out.println("Second Smallest element : "+array[1]);

			
			
			
			
		}

	}
	


