import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    Feline feline = new Feline();

    @Test
    public void checkIsLionEatConcreteFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals("Лев ест другую еду", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test
    public void checkLionsSex() {
        String expectedAnswer = "Используйте допустимые значения пола животного - самей или самка";
        Exception actualAnswer = Assert.assertThrows(Exception.class, () -> new Lion("самецц", feline));
        assertEquals("Ответы не совпали", expectedAnswer, actualAnswer.getMessage());
    }

    @Test
    public void checkKittens() {
        int expectedSingleKitty = 1;
        assertEquals(expectedSingleKitty, feline.getKittens(1));
    }
}