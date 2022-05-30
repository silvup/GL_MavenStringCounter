import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringLetterCounterTest
{
    private static StringLetterCounter counter;
    @BeforeAll
    static void setUp()
    {
        counter = new StringLetterCounter();
    }
    @Test
    void shouldConvertToLowerCase()
    {
        String AZ = counter.CountLetters("AZ");
        assertEquals("a = 1\nz = 1\n", AZ);
    }
    @Test
    void shouldReturnBadInput()
    {
        String badInput = counter.CountLetters("abc_");
        assertEquals("Bad input", badInput);
    }
}