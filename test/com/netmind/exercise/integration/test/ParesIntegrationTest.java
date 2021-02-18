package com.netmind.exercise.integration.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.netmind.exercise.Pares;

public class ParesIntegrationTest {

	@Test
	public void testSumaDePares() {
		Pares pares = new Pares();
		assertEquals(pares.sumaDePares(),2500);


	}

}
