import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal = new Animal();
    @Test
    public void checkAnimalFamily(){
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
    @Test
    public void checkAnimalFamilyWithException(){
        String expectedResult = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception actual = Assert.assertThrows(Exception.class,() -> animal.getFood("Вегетарианец"));
        assertEquals("Не тот ответ", expectedResult, actual.getMessage());
    }
}
