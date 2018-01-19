package InnerClassDemo;

public class CllClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OuterClass outer=new OuterClass();
OuterClass.InnerClass inner=outer.new InnerClass();
int ans=inner.callMethod();
System.out.println(ans);

	}

}
