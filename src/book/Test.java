package book;


public class Test {
	
	public Test() {
		
	}
	
	protected void doSomething() {
		
		//SomeSentence
	}

	protected Test doIt() {
		return new Test();
		
	}
}

class Test2 extends Test {
	
	public Test2() {
		
		super();
		super.doSomething();
		
	}
	
	public void doSomethingnew() {
		
		//someSentence
	}
	
	public void doSomething() {
		//someSentence
		
	}
	
	protected Test2 doIt() {
		
		return new Test2();
	}
	}



