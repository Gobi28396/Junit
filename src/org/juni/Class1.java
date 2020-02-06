package org.juni;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Class1 {
	@Test
	public void test1() { 
		Assert.assertTrue("verify mesg", true);

	}
	@Ignore
	@Test
	
	public void test11() { 
		Assert.assertTrue("verify mesg", true);

	}
	@Test
	public void test12() { 
		Assert.assertTrue("verify mesg", false);

	}@Test
	public void test14() { 
		Assert.assertTrue("verify mesg", true);

	}


}
