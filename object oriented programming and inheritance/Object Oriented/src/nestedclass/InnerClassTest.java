package nestedclass;

import nestedclass.InnerClassExample.InnerClass;

public class InnerClassTest {

	public static void main(String[] args) {
		
		InnerClassExample outer = new InnerClassExample();
		InnerClass inner = outer.new InnerClass();
		
		inner.show();

	}

}
