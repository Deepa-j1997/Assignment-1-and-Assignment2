package JavaPrograms;
//5)write a java program to add all the values in a given number and print
import java.util.Scanner;
class Add
{
public static void main(String[] arg)
{
int a,b,c,d,e;
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
System.out.println("Enter third number");
c=sc.nextInt();
System.out.println("Enter four number");
d=sc.nextInt();

e=addition(a,b,c,d);
System.out.println(" Addition of four numbers is : "+e);
}
static int addition(int x,int y,int z, int s)
{
	return x+y+z+s;
}
}

