package sumofdigits;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfDigitsInString {
	
	public int sum(String str) {
		int sum =0;
		char []a=str.toCharArray();
		
		for(int i =0 ;i<a.length;i++) {
			if(Character.isDigit(a[i])) {
				
				System.out.println("Digits in String"+a[i]);
				
				int d=Integer.parseInt(String.valueOf(a[i]));
				
				sum =sum+d; 
				
				
				
			}
			
		}
		return sum;
	}
	
	@Test
	public void testcase() {
		
		Assert.assertEquals(sum("aa1bc2d3"), 6);
	}
	@Test
	public void testcase1() {
		
		Assert.assertEquals(sum("aa11b33"), 8);
	}
	@Test
	public void testcase2() {
		
		Assert.assertEquals(sum("chocolate"), 0);
	}
}
