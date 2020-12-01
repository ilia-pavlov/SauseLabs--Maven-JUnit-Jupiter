package playground;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyThirdPlayground {

    public String message = " JUnit 5 ";

    JUnitMessage jUnitMessage = new JUnitMessage(message);

    @Test //(expected = ArithmeticException.class)
    public void jUniteMessage() {

        System.out.println("JUnit Massage is printing! ");
        jUnitMessage.printMessage();
    }

    @Test
    public void hiMessage() {
        message = "Hi " + message;
        System.out.println("Hi message is printing! ");
        String hiMessage = jUnitMessage.printHiMessage();
        Assert.assertEquals(message, hiMessage );
        System.out.println("Suit Test 2 is successful " + message);
    }
}
