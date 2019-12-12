package codej;

import java.lang.Math;

public class BitwiseOp001 {
	public static void main(String args[]){
		
		//converting non-binary into binary value.
		int x, y;
		
		x=25;
		y=22;
		
		System.out.println("Binary value for "+x+" is "+Integer.toBinaryString(x));
		
		System.out.println("Binart value for "+y+" is "+Integer.toBinaryString(y));
		
		//converting binary value to non-binary
		
		int i = 0b10110;  //prefix 0b before the binary value to convert it into integer.
		
		System.out.println("Interger value of 10110 is "+i);
		
	}
}
