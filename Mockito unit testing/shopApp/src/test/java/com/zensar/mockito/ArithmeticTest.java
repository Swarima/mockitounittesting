package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class ArithmeticTest {
	@Mock
	private Calculator calculator;
	@InjectMocks
	private Arithmetic arithmetic;
	@Rule
	public MockitoRule rule=MockitoJUnit.rule();
	@Test
	public void testAddition()
	{
		Mockito.when(arithmetic.doAddition(10,20)).thenReturn(30);
		assertEquals(30, arithmetic.doAddition(10, 20));
	}
}
