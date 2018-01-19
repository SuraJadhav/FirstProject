package ArrayBasics;

public class ArrayBasics {
int a[]=new int[11];
public void arrayInsert()
{
	for(int i=0;i<=5;i++)
	{
		a[i]=i;
		System.out.println(a[i]);
	}
}
public static void auto()
{
	System.out.println("static block is running");
}
public void getArray(int[] arr)
{
	int are[]=new int[10];
	are=arr;
	for(int i=0;i<10;i++)
	{
		System.out.println(are[i]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			ArrayBasics a=new ArrayBasics();
			a.arrayInsert();
			int sArray[]= {1,2,3,4,5,6,77,85,19,110};
			a.getArray(sArray);
			a.auto();
		}
		catch(Exception e)
		{
			// comment by shubham
			
			//anather comment
			System.out.println("sucess");
			System.out.println("Done");
		}
		

	}

}
