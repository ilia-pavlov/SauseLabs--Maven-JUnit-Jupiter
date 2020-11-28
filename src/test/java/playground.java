import org.testng.annotations.Test;
import utilites.Log;

import java.text.NumberFormat;
import java.util.Arrays;

public class playground {
    @Test
    public void testArraysToString() {
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);

        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void testArraySort() {
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void testDeepToString() {
        int[][] numbers = new int[2][3]; //create 2 array each include 3 numbers
        numbers[0][2] = 1;
        System.out.println(Arrays.deepToString(numbers));
    }

    @Test
    public void testDeepToString02() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers));
    }

    @Test
    public void testMathDoubleInInt() {
        double x = 1.1;
        int y = (int) x + 2;
        System.out.println(y);
    }

    @Test
    public void testStringToInt() {
        String s = "1";
        int y = Integer.parseInt(s) + 2; //ImplicitCasting
        System.out.println(y);
    }

    @Test
    public void testStringToDouble() {
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }

    @Test
    public void testName() {
        int b = Integer.parseInt("44", 16);
        System.out.println(b);
    }

    @Test
    public void testRandomNumber() {

        int result = (int) Math.round(Math.random() * 6); //dice roller
        System.out.println(result);
    }

    @Test
    public void testCurrency01() {
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // get Currency
        String result = currency.format(1234567.891);
        System.out.println(result);
    }

    @Test
    public void testCurrency02() {
        String result = NumberFormat.getCurrencyInstance().format(74739.94);
        System.out.println(result);
    }

    @Test
    public void testPercent01() {
        NumberFormat percent = NumberFormat.getPercentInstance(); //  get Percent
        String result = percent.format(0.1);
        System.out.println(result);
    }

    @Test
    public void testPercent02() {

        String result = NumberFormat.getPercentInstance().format(0.2);
        System.out.println(result);
    }

}


