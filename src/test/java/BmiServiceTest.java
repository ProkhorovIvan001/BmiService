import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BmiServiceTest {

    @Test
    public void shouldCalculateBmiFor98And187() {
        BmiService service = new BmiService();
        int expected = 28;
        int actual = service.calculate(98, 1.87);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBmiFor70And180() {
        BmiService service = new BmiService();
        int expected = 21;
        int actual = service.calculate(70, 1.80);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateBmiFor50And160() {
        BmiService service = new BmiService();
        int expected = 19;
        int actual = service.calculate(50, 1.60);
        Assertions.assertEquals(expected, actual);
    }
}