package org.multiclassrunattime;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
// to run more than one program at time
//@RunWith(Suite.class)
//@Suite.SuiteClasses({A.class,B.class})
public class Employee {
	public static void main(String[] args) {
		// to check multiple conditions 
		Result res =JUnitCore.runClasses(A.class,B.class);
		
		System.out.println("failure Count"+res.getFailureCount());
        System.out.println("Ignore count" +res.getIgnoreCount());
        System.out.println("Run count "+res.getRunCount());
        System.out.println("Run Time "+res.getRunTime());
        int pass =res.getRunCount()-res.getFailureCount();
        System.out.println("pass count"+pass);
        
        List<Failure> f = res.getFailures();
        for (Failure failure : f) {
        	System.out.println(failure);
			
		}
	}

}



		
	

