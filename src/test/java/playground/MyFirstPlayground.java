package playground;








import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MyFirstPlayground {


    @Test
    @DisplayName("It Should works at last!")
    public void testArraysToString() {
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));
    }
}


