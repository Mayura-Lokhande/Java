
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class RightTriangleStarPatternTest {
    
    private ByteArrayOutputStream outContent;
    private PrintStream originalOut;
    
    @BeforeEach
    public void setUp() {
        outContent = new ByteArrayOutputStream();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }
    
    @org.junit.jupiter.api.AfterEach
    public void tearDown() {
        restoreSystemOut();
    }
    
    @Test
    public void testRecursivePatternSize1() {
        RightTriangleStarPattern.printRecursive(1);
        String output = outContent.toString();
        String expected = "* 
";
        assertEquals(expected, output, "Recursive pattern for size 1 should be a single star");
    }
    
    @Test
    public void testRecursivePatternSize3() {
        RightTriangleStarPattern.printRecursive(3);
        String output = outContent.toString();
        String expected = "* 
* * 
* * * 
";
        assertEquals(expected, output, "Recursive pattern for size 3 should have 3 rows with increasing stars");
    }
    
    @Test
    public void testRecursivePatternSize5() {
        RightTriangleStarPattern.printRecursive(5);
        String output = outContent.toString();
        String expected = "* 
* * 
* * * 
* * * * 
* * * * * 
";
        assertEquals(expected, output, "Recursive pattern for size 5 should have 5 rows with increasing stars");
    }
    
    @Test
    public void testIterativePatternSize1() {
        RightTriangleStarPattern.printIterative(1);
        String output = outContent.toString();
        String expected = "* 
";
        assertEquals(expected, output, "Iterative pattern for size 1 should be a single star");
    }
    
    @Test
    public void testIterativePatternSize3() {
        RightTriangleStarPattern.printIterative(3);
        String output = outContent.toString();
        String expected = "* 
* * 
* * * 
";
        assertEquals(expected, output, "Iterative pattern for size 3 should have 3 rows with increasing stars");
    }
    
    @Test
    public void testIterativePatternSize5() {
        RightTriangleStarPattern.printIterative(5);
        String output = outContent.toString();
        String expected = "* 
* * 
* * * 
* * * * 
* * * * * 
";
        assertEquals(expected, output, "Iterative pattern for size 5 should have 5 rows with increasing stars");
    }
    
    @Test
    public void testRecursiveAndIterativeProduceSameOutputSize1() {
        RightTriangleStarPattern.printRecursive(1);
        String recursiveOutput = outContent.toString();
        
        outContent.reset();
        RightTriangleStarPattern.printIterative(1);
        String iterativeOutput = outContent.toString();
        
        assertEquals(recursiveOutput, iterativeOutput, "Recursive and iterative implementations should produce identical output for size 1");
    }
    
    @Test
    public void testRecursiveAndIterativeProduceSameOutputSize3() {
        RightTriangleStarPattern.printRecursive(3);
        String recursiveOutput = outContent.toString();
        
        outContent.reset();
        RightTriangleStarPattern.printIterative(3);
        String iterativeOutput = outContent.toString();
        
        assertEquals(recursiveOutput, iterativeOutput, "Recursive and iterative implementations should produce identical output for size 3");
    }
    
    @Test
    public void testRecursiveAndIterativeProduceSameOutputSize5() {
        RightTriangleStarPattern.printRecursive(5);
        String recursiveOutput = outContent.toString();
        
        outContent.reset();
        RightTriangleStarPattern.printIterative(5);
        String iterativeOutput = outContent.toString();
        
        assertEquals(recursiveOutput, iterativeOutput, "Recursive and iterative implementations should produce identical output for size 5");
    }
    
    @Test
    public void testRecursiveAndIterativeProduceSameOutputSize10() {
        RightTriangleStarPattern.printRecursive(10);
        String recursiveOutput = outContent.toString();
        
        outContent.reset();
        RightTriangleStarPattern.printIterative(10);
        String iterativeOutput = outContent.toString();
        
        assertEquals(recursiveOutput, iterativeOutput, "Recursive and iterative implementations should produce identical output for size 10");
    }
    
    @Test
    public void testRecursivePatternStructure() {
        RightTriangleStarPattern.printRecursive(4);
        String output = outContent.toString();
        String[] lines = output.split("
");
        
        assertEquals(4, lines.length, "Pattern should have 4 rows for size 4");
        for (int i = 0; i < lines.length; i++) {
            int expectedStars = i + 1;
            int actualStars = (lines[i].length() + 1) / 2;
            assertEquals(expectedStars, actualStars, "Row " + (i + 1) + " should have " + expectedStars + " stars");
        }
    }
    
    @Test
    public void testIterativePatternStructure() {
        RightTriangleStarPattern.printIterative(4);
        String output = outContent.toString();
        String[] lines = output.split("
");
        
        assertEquals(4, lines.length, "Pattern should have 4 rows for size 4");
        for (int i = 0; i < lines.length; i++) {
            int expectedStars = i + 1;
            int actualStars = (lines[i].length() + 1) / 2;
            assertEquals(expectedStars, actualStars, "Row " + (i + 1) + " should have " + expectedStars + " stars");
        }
    }
    
    @Test
    public void testRecursivePatternSize2() {
        String actualPatternOutput = outContent.toString();
        String output = outContent.toString();
        String expected = "* 
* * 
";
        assertEquals(expected, output, "Recursive pattern for size 2 should have 2 rows");
    }
    
    @Test
    public void testIterativePatternSize2() {
        RightTriangleStarPattern.printIterative(2);
        String output = outContent.toString();
        String expected = "* 
* * 
";
        assertEquals(expected, output, "Iterative pattern for size 2 should have 2 rows");
    }
}

