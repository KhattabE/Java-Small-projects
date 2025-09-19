import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void countVowels() {
        assertEquals(2, StringUtils.countVowels("ae"));
    }


    @Test
    void removeSpaces() {
    assertEquals("helloworld",StringUtils.removeSpaces("hello world") );

    }

    @Test
    void toAlternatingCase() {
        assertEquals("Hello", StringUtils.toAlternatingCase("hELLO"));
    }


}