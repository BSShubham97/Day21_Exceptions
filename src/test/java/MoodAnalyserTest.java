import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoodAnalyserTest {
    @Test
    void givenMood_whenMessageIsSad_returnsSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenMood_whenMessageIsHappy_returnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in  Happy mood ");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    void givenMood_whenMessageIsAny_returnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any mood ");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
            Assertions.assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

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

    @Test
    void givenMessage_whenEmpty_returnsMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.EMPTY_MOOD,e.type);
            System.out.println(e.getMessage());
        }
    }

}
