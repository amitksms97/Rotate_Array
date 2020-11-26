import java.util.*;
public class Rotate_Array {
	static Scanner sc = new Scanner(System.in);
	int n;
	int array[];
	
	public Rotate_Array(){
		System.out.println("Enter Length of Array");
		n=sc.nextInt();
		array=new int[n];
	}
	public void input()
	{
		int i;
		for(i=0; i<n; i++)
		{
			System.out.println("Enter the " +i +" value Array");
			array[i]=sc.nextInt();
		}
	}
	
	public void Original_Array()
	{
		System.out.println("Original Array -");
		for(int i=0; i<n; i++)
			System.out.println(array[i]);
	}
	
	public void leftshift(int num)
	{
		for(int i=0; i<num; i++)
		{
			leftshiftOne();
		}
	}
	
	public void leftshiftOne()
	{
		int temp=array[0], i;
		for(i=0; i<n-1; i++)
		{
			array[i]=array[i+1];
		}
		array[i]=temp;
	}
	
	public void print()
	{
		System.out.println("New Array");
		for(int i=0; i<n; i++)
		System.out.println(array[i]);
	}
	
	public static void main(String[] args) {
		Rotate_Array rotate=new Rotate_Array();
		rotate.input();
		rotate.Original_Array();
		System.out.println("Enter by how much amount you want to shift");
		int num=sc.nextInt();
		rotate.leftshift(num);
		rotate.print();
	}
}