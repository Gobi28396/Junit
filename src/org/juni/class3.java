package org.juni;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class class3 {
@Test
public void test1() { 
	Assert.assertTrue("verify mesg", true);

}@Test
public void test11() { 
	Assert.assertTrue("verify mesg", true);

}@Test
public void test12() { 
	Assert.assertTrue("verify mesg", false);

}
@Ignore
@Test

public void test14() { 
	Assert.assertTrue("verify mesg", true);

}

}
