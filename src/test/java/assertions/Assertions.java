package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	
	@Test
	void method() {
		
		Assert.assertEquals(10, 11);
	}

}
