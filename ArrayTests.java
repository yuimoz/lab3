import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReverseInPlace1(){
    int[] inputTest = { 1, 2, 3, 4, 5 };
    ArrayExamples.reverseInPlace(inputTest);
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, inputTest);

  }

  @Test 
  public void testReversed1() {
    int[] reverseTest1 = { 8 };
    ArrayExamples.reverseInPlace(reverseTest1);
    assertArrayEquals(new int[]{ 8 }, ArrayExamples.reversed(reverseTest1));

  }

  @Test 
  public void testAverageWithoutLowest(){
    double[] AverageTest = {0, 1, 3};
    ArrayExamples.averageWithoutLowest(AverageTest);
    System.out.println(AverageTest);
  }
}
