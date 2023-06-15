import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest {
    Cat cat;

    @Before
    public void createObjectsForTestClass() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

        @Test
        public void testCatSound () {

            assertEquals("Кошка издаёт другие звуки", "Мяу", cat.getSound());
        }
        @Test
        public void checkCatIsPredator () throws Exception {
            assertEquals("Кот питается другой пищей", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
        }

    }

