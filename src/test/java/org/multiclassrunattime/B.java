package org.multiclassrunattime;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {
      @Test
	public void test11() {
	Assert.assertTrue(false);
	}
      @Test
      public void test12() {
		System.out.println("Test 12");
	}
      @Ignore
      @Test
      public void test13() {
		System.out.println("Test 13");
	}
}
