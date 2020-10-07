package nova;

import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class Testne2 {
	@Test
  public void mainTestInput(){
	  String input = "1\n";
	  
	  ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
	  System.setIn(in);
	  
	  ByteArrayOutputStream out = new ByteArrayOutputStream();
	  System.setOut(new PrintStream(out));
	  
	  String[] args = {};
	  ne2.main(args);
	  
	  String consoleOutput = "Enter the radius" +System.getProperty("line.separator");
	  consoleOutput += "For the circle with radius1.0 ,"+System.getProperty("line.separator");
	  consoleOutput += "the circumference is 6.283185307179586"+System.getProperty("line.separator");
	  consoleOutput += "and the area is3.141592653589793."+System.getProperty("line.separator");
	  
	  assertEquals(consoleOutput, out.toString());
  }
}
