package assignment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class WriteOutTest {
    @Test
    void stopProgramTest(){
        WriteOutLogic logic = new WriteOutLogic();
        assertTrue(logic.stopProgram("stop"));
        assertFalse(logic.stopProgram("sdasda"));
    }
    @Test
    void addCharactersTest(){
        WriteOutLogic logic = new WriteOutLogic();
        logic.addCharacters(5);
        assertEquals(5,logic.getAmountOfCharacters());
        assertNotEquals(7,logic.getAmountOfCharacters());
    }
    @Test
    void addRowsTest(){
        WriteOutLogic logic = new WriteOutLogic();
        logic.addRow();
        logic.addRow();
        logic.addRow();
        logic.addRow();
        assertEquals(4,logic.getAmountOfRows());
        assertNotEquals(5,logic.getAmountOfRows());
    }
}
