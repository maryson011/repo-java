import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testeJn {
    @Test
    public void verificarJUnit() {
        Assertions.assertTrue(true);
    }

    @Test
    void testarSeIgualADois() {
        int a = 1 + 1;
        assertEquals(2, a);
    }

    @Test
    void testarSeIgualATres() {
        int x = 2 + 10 - 9;
        assertEquals(3, x);
    }
}
