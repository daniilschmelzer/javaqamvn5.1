import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {
    SQRService service = new SQRService();


    @org.junit.jupiter.api.Test
    public void testCount() {
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }
}