package patterns.singleton;

import org.junit.jupiter.api.Test;
import singleton.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {
    private static Logger logger;

    @Test
    void testGetLastLog() {
        //Given
        //When
        logger = Logger.INSTANCE1;
        String lastLog1 = logger.getLastLog();
        //Then
        assertEquals("czesc", lastLog1);
    }
}
