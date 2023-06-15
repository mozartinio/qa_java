import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class AnimalTestParametrized {
    private final List<String> expectedFood;
    Animal animal = new Animal();
    private final String animalType;

    public AnimalTestParametrized(String animalType, List<String> expectedFood) {
        this.animalType = animalType;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] shouldHaveMane() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void checkAnimalFood() throws Exception {
        assertEquals(expectedFood, animal.getFood(animalType));
    }
}

