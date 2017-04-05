package anthonyclement.tp1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class StringUtilsTest {

	@Test
	public void test() {
		//fail("Pas encore implémenté");
		StringUtils StUtil = new StringUtils();
		Assert.assertEquals("RUOJNOB", StUtil.reverseString("BONJOUR"));
	}
	

}
