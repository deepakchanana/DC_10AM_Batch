package pkg1;

public class Child extends Parent
{
	public int arithmetic(int x1,int x2)
	{
		int x3;
		x3=x1-x2;
		return x3;
	}
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.arithmetic(22, 12);
	}

}
