abstract class Parent {
	abstract void printHello();
	void printHelloNew() {
		System.out.println("Hello");
	}

}

interface Test {
	void printHello();
}

public class Abstraction implements Test /* extends Parent */{
	public void printHello() {
		System.out.println("Hello");
	}

	public static void main(String aar[]) {
		Test obj = new Abstraction ();
		obj.printHello();
	}
}