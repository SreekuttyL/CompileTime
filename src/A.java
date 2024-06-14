
public class A {
	//public A(int a,int b)
	//{
	void add(int a,int b)
	{
		//this.a=a;
		//this.b=b;
		int result=a+b;
		System.out.println(result);
	}
	//}
	
	void add (float a, float b, float c)
	{
		float result1=a+b+c;
		System.out.println(result1);
	}

	public static void main(String[] args) {
		A a=new A();
		a.add(2,3);
		a.add(1.3f, 2.1f, 1.3f);
		
		

	}

}
