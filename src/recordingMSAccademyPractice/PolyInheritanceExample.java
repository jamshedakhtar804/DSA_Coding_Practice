package recordingMSAccademyPractice;
class Parent {
	int a=90;
	public void m1() {
		System.out.println("m1 in parent");
	}
	
	public void sayHello() {
		System.out.println("sayHello in parent");
	}
}

class Child extends Parent {
	public void m1() {
		System.out.println("m1 in Child");
	}
	public void m2() {
		System.out.println("m2 in Child");
	}
	
}
public class PolyInheritanceExample {

	public static void main(String[] args) {
		//Case1:
		Child c=new Child();   //null
		c.m1();  //static binding/early binding/compile time polymorphism
		c.sayHello();
		c.m2();
		
		//Case2: 
		Parent p=new Parent();
		p.m1();
		p.sayHello();
		
		
		//Case3:
		Parent p1=new Child();   //Upcasting
		
		p1.sayHello();
		p1.m1();   //late or dynamic binding because  runtime is finding the child method
		
		((Child) p1).m2();   //downcast

	}

}
