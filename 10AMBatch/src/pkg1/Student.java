package pkg1;

public class Student
{
 public int sum(int a,int b)  // 2 integer inputs,methodName--sum
 {                     // 2 integer inputs
	 int c;
	 c=a+b;
	 return c;
 }
 
 public void sum(int a,float b) // methodname--sum
 {          // one integer and one float       // inputsrequired---3
	float c;
	c=a+b;
	System.out.println("result of first sum "+c);
 }
 
 public void sum(int a,int b,int c)
 {
	 int d;
	 d=a+b+c;
	 System.out.println("result is "+d);
 }
 
 
 public static void main(String[] args)
 {
	Student s=new Student();
	int sum_result=s.sum(33, 12);
	System.out.println("Result of first sum method "+sum_result);
	s.sum(22, 12.3F);
	s.sum(11, 12, 11);
	
	
 }
 
 
 
	

}
