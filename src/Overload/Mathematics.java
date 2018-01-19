package Overload;

public class Mathematics {
	int a;
	int b;
	int ans;
void addition(int x, int y)
	{
		ans=x+y;
		System.out.println(ans);
	}
void addition(int p,int q,int r)
{
	ans=p+q+r;
	System.out.println(ans);
}
int addition(float x,int y,int z)
{
	ans=(int)x+y+z;
	return ans;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Mathematics m=new Mathematics();
m.addition(5, 6);
m.addition(4, 1, 3);
	}

}
