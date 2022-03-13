package com.nans.devops.jenkins;

import static org.junit.Assert.*;

import org.testng.annotations.Test;

//import org.junit.Test;

public class JenkinsClassTest {

	@Test
	public void addTest() {
		JenkinsCalculator calc = new JenkinsCalculator();
		assertEquals(10, calc.addnos(5, 5));
	}

}
