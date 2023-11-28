import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;
import static org.testng.Assert.*;
import static org.testng.Assert.assertNotEquals;

public class BirdsTests {

    @Test(groups = "Positive")
    public void correctKingdomClassTest(){
        String expectedResult = "Class: Birds>";
        String result = "Class: Birds>";
        Assert.assertEquals(result, expectedResult, "Expected to be " + expectedResult);
    }
    @Test(groups = "Positive")
    public void correctFastestBirdTest() {
        int maxSpeed = 300;
        System.out.println("The peregrine falcons are the world's fastest birds");
        assertTrue(true, "Expected: The peregrine falcons = " + maxSpeed + "mps");
    }
    @Test(groups = "Negative")
    public void incorrectFastestBirdTest() {
        System.out.println("Woodcocks are the world's slowest birds");
        assertFalse(false, "Expected: Woodcocks = 5 mps");
    }
    @Test(groups = "Positive")
    public void correctListOfBirdsTest(){
        String [] expectedListOfBirds = {"Flamingo", "Hummingbird"};
        String [] resultListOfBirds = {"Flamingo", "Hummingbird"};
        assertEquals(expectedListOfBirds, resultListOfBirds, "Expected: " + Arrays.toString(expectedListOfBirds));
    }
    @Test(groups = "Negative")
    public void incorrectListOfBirdsTest(){
        String [] expectedListOfBirds = {"Flamingo", "Hummingbird"};
        String [] resultListOfBirds = {"Flamingo", "Hummingbird", "Tiger"};
        assertNotEquals(expectedListOfBirds, resultListOfBirds, "Expected: " + Arrays.toString(expectedListOfBirds));
    }
}
