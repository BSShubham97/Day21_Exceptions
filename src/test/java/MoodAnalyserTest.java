import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {

    /**
     * TEST WHEN MOOD MESSAGE IS GIVEN AS NULL
     */
    @Test
    void givenMood_whenNull_returnsMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.NULL_MOOD,e.type);
            System.out.println(e.getMessage());
        }
    }


}
