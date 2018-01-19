package InnerClassDemo;

public class OuterClass {

	private String name;
	private int id=100;
	
	
/*public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public int getId()
{
	return id;
	
}
public void setId(int id)
{
	this.id=id;
}*/
	
class InnerClass{
	public int getId()
	{
		return id;
	}
	public int callMethod()
	{
		//OuterClass o=new OuterClass();
		return id;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OuterClass o=new OuterClass();
	}

}
