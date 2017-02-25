package com.test.pattern.bridge;

public class BridgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Shape t1 = new Triangle(new Red("2hrs"));
		t1.build();
		
		Shape t2 = new Triangle(new Green("AllDay"));
		t2.build();*/
		
		new Builder(new TwoHours("babu", "Panneerselavm")).build();
		new Builder(new FourHours()).build();
		new Builder(new AllDay()).build();
		
	}

}
