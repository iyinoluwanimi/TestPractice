import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestAddition{
		
		@Test
		public void testThatAdditionMethodtakes_2_and_3_AndReturns_5(){
			
			Addition addition = new Addition();
			
			int actual = addition.additionOfTwoNumbers(2, 3);
			int expected = 5;
			
			Assertions.assertEquals(actual, expected);
			
			
		}
		
		@Test
		public void testThatMultiplicationMethodtakes_3_and_3_AndReturns_9() {
		
			Addition multiplication = new Addition();
		
			int actual = multiplication.multiplyTwoNumbers(3,3);
			int expected = 9;
			
			Assertions.assertEquals(actual,expected);
		
		}
}
