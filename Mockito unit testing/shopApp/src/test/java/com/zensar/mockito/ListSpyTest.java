package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListSpyTest {
	@Test
	public void testList()
	{
		List<String> flowers=Mockito.mock(List.class);
		Mockito.when(flowers.get(0)).thenReturn("rose");
		assertEquals("rose", flowers.get(0));
	}
	
	@Test
	public void testSpyList()
	{
		List<String> flowers=new ArrayList<String>();
		List<String> spyflowers=Mockito.spy(flowers);
		Mockito.when(spyflowers.get(0)).thenReturn("rose");
		assertEquals("rose", spyflowers.get(0));
	}
}
