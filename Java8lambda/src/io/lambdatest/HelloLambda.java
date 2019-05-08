package io.lambdatest;

public class HelloLambda {

	public void greet(Greeting g) { // passing interface through this method
		// System.out.println("its there");
		g.perform();
	}

	public void glow(aa x) {
		x.sun();
	}

	public static void main(String[] args) {

		HelloLambda h = new HelloLambda();
		Greeting ig = new ImplementGreet(); // casting one class into a type of
											// interface which interface type
											// itself
		// h.greet(ig);

		Greeting fun = () -> System.out.println("1:Universe");// it will work for perform method.

		// h.greet();

		fun.perform(); // it is simmilar with the method defined inside the interface. fun is an reference of interface. 
		                          //h.greet(fun) is same with this. this perform method is from the implementation method.

		h.greet(ig); // calling the method from the interface. So it will implement the result from the perform method (from implementation class)
		h.greet(fun); // the reference 'fun' created from the interface Greeting.  so from driver class, calling the method greet and through greet method calling the reference of the
								//interface.
		

		Greeting sum = () -> System.out.println("All is well");

		h.greet(sum);

		aa nun = () -> System.out.println("Again we are here");

		h.glow(nun);
	}

}

interface aa {

	public void sun();
}
