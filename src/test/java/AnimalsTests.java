import automation.tests.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Arrays;
import static org.testng.Assert.*;

public class AnimalsTests {

        @Test (groups = "Positive")
        public void correctKingdomClassTest(){
            String expectedResult = "Class: Mammals>";
            String result = "Class: Mammals>";
            Assert.assertEquals(result, expectedResult, "Expected to be " + expectedResult);
        }
        @Test(groups = "Negative")
        public void incorrectKingdomClassTest(){
            String expectedResult = "Kingdom: Animals";
            String result = "Kingdom: Mammals";
            Assert.assertNotEquals(result, expectedResult, "Expected to be " + expectedResult);
        }
        @Test(groups = "Positive")
        public void correctFastestAnimalTest() {
           int maxSpeed = 70;
           System.out.println("Cheetahs are the world's fastest land animals");
           assertTrue(true, "Expected: Cheetahs = " + maxSpeed + "mps");
        }
        @Test(groups = "Negative")
        public void incorrectFastestAnimalTest() {
            double maxSpeed = 0.003;
            System.out.println("Sloths are the world's lowest land animals");
            assertFalse(false, "Expected: Sloths = 0.003 mps");
        }
        @Test(groups = "Positive")
        public void correctListOfAnimalsTest(){
            String [] expectedListOfAnimals = {"Bear", "Tiger"};
            String [] resultListOfAnimals = {"Bear", "Tiger"};
            assertEquals(expectedListOfAnimals, resultListOfAnimals, "Expected: " + Arrays.toString(expectedListOfAnimals));
        }
        @Test(groups = "Negative")
        public void incorrectListOfAnimalsTest(){
            String [] expectedListOfAnimals = {"Bear", "Tiger"};
            String [] resultListOfAnimals = {"Bear", "Tiger", "Flamingo"};
            assertNotEquals(expectedListOfAnimals, resultListOfAnimals, "Expected: " + Arrays.toString(expectedListOfAnimals));
        }
        @Test(expectedExceptions = {IOException.class })
        public void exceptionTest() throws Exception {
        throw new IOException();
    }
}
