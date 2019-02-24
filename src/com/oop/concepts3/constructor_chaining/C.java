package com.oop.concepts3.constructor_chaining;

public class C extends B {
	String clazz = getClass().getSimpleName();
	final String d = "d din C";

	static{ //se executa cand se incarca clasa
		System.out.println("Static bloc in C");
		a--;
	}
	
	{	//se executa doar cand se creaza un obiect din clasa
		System.out.println("Nestatic bloc in C");
		System.out.println(super.d);
	}
	
	public C() {
		System.out.println("constructor --> C");
	}

	public static void main(String[] args) {
		B a = new B();
//		System.out.println("a este -->"+a.a);
		
		a.print();
		B.print();
		A.print();
	}

}
