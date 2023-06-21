import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void checkFelineFamily() {
        assertEquals("Семейство не совпало", "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkFelineFood() throws Exception {
        assertEquals("Кошачье семейство питается другой пищей", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkKittensAmount() {
        assertEquals("Количество котят не совпадает", 1, feline.getKittens());
    }

    @Test
    public void checkKittensAmountWithParams() {
        assertEquals("Количество котят не совпадает", 10, feline.getKittens(10));
    }
}

