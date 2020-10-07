package nova;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Testne1 {
	
@Test
public void test_is_triangle_1() {
	assertTrue(ne1.isTriangle(3,4,5));
}

@Test
public void test_is_not_triangle_2(){
	assertFalse(ne1.isTriangle(5, 7, -3));
}

@Test
public void test_main_program() {
	
	ByteArrayInputStream in = new ByteArrayInputStream("5\n12\n13\n".getBytes());
	System.setIn(in);
	
	ByteArrayOutputStream out = new ByteArrayOutputStream();
	System.setOut(new PrintStream(out));
	
	String consoleoutput = "Enter side 1: \n";
	consoleoutput += "Enter side 2: \n";
	consoleoutput += "Enter side 3: \n";
	consoleoutput += "This is a triangle \n";
	
	assertEquals(consoleoutput, out.toString());
}
}
