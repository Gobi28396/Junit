package org.juni;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//@RunWith(Suite.class)
//@SuiteClasses({Class1.class,class2.class,class3.class})
public class Suitclass {
	@Test
	 public void Details() {
Result r = JUnitCore.runClasses(Class1.class,class2.class,class3.class);
   System.out.println("gobi"+r.wasSuccessful());
System.out.println("run"+r.getRunCount());
     System.out.println("faliure"+r.getFailureCount());
     System.out.println("Ignore"+r.getIgnoreCount());
     System.out.println("time"+r.getRunTime());
     
     System.out.println("faliure methods");
     List<Failure> failures = r.getFailures();
     for (Failure x : failures) {
	System.out.println(x);	
	}
     
     
     
	}

}
