package playground;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

import java.util.Arrays;


@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Platform Suit Demo")
@SelectPackages("MyFirstPlayground")
//@Suite.SuiteClasses( {MyFirstPlayground.class})
public class TestSuitExample {

    @Test
    @DisplayName("It Should works at last!")
    public void testArraysToString() {
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));
    }
}
