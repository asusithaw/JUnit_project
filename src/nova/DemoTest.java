package nova;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class DemoTest {
	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(5, 4, 3));
	}
	@Test
	public void test_is_triangle_2() {
		assertTrue(Demo.isTriangle(5, 3, 4));
	}
	@Test
	public void test_is_triangle_3() {
		assertTrue(Demo.isTriangle(3, 4, 5));
	}
	@Test
	public void test_is_triangle_4() {
		assertFalse(Demo.isTriangle(3, 4, 8));
	}
	@Test
	public void test_is_triangle_5() {
		assertFalse(Demo.isTriangle(3, 4, -8));
	}
	@Test
	public void test_is_triangle_6() {
		assertFalse(Demo.isTriangle(8, 4, 3));
	}
	
	@Test
	public void test_main_program() {
		String input = "6\n12\n8\n";
		
		ByteArrayInputStream in =  new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out = new  ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String[] args = {};
		Demo.main(args);
		
		String consoleOutput = "Enter side 1: "+System.getProperty("line.separator");
		consoleOutput += "Enter side 2: "+System.getProperty("line.separator");
		consoleOutput += "Enter side 3: "+System.getProperty("line.separator");
		consoleOutput += "This is a triangle."+System.getProperty("line.separator");
		
		assertEquals(consoleOutput, out.toString());
		
		
	}
	
	}


