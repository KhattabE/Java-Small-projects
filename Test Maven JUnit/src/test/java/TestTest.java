import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TestTest {

        @Test
        public void addTest(){

            Calculator calculator = new Calculator();
            int actualResult = calculator.add(10, 20);

            assertEquals(30, actualResult);

        }

}