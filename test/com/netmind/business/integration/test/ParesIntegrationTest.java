package com.netmind.business.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.netmind.business.Pares;

public class ParesIntegrationTest {

	@Test
	public void testSumaDePares() {

		int[] intArray = new int[100];

		Pares pares = new Pares();

		for (int i = 0; i < 100; i++) {
			intArray[i] = i + 1;
		}

		assertEquals(pares.sumaDePares(intArray), 2500);

	}

}
