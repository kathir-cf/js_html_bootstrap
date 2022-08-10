public class ExampleProg
{
	public static void main(String arg[]){
		System.out.println("hello world");
		ExampleProg.display();
	}
	static void display(){
System.out.println("display method called");
}
}

 class A{
	public static void main(String arg[]){
		System.out.println("second main class");
		ExampleProg.display();
	}
}
/*
var res=sqrt(a);
int sqrt(int f){
 return f*f;
}
*/
