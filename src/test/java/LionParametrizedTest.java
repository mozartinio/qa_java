import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionParametrizedTest {
    private final String sex;
    private final boolean hasMane;
    Feline feline = new Feline();

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;

    }

    @Parameterized.Parameters
    public static Object[][] shouldHaveMane() {
        return new Object[][]{
                {"Самец", Boolean.TRUE},
                {"Самка", Boolean.FALSE},
        };
    }
    @Test
    public void checkLionWhatIsMane() throws Exception{
        Lion lion = new Lion(sex, feline);
        assertEquals("Пол не совпал", hasMane, lion.doesHaveMane());
    }
}
