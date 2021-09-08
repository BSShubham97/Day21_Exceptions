import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    @Test
    void givenMood_whenMessageIsSad_returnsSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad mood");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMood_whenMessageIsHappy_returnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in  Happy mood ");
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMood_whenMessageIsAny_returnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any mood ");
        Assertions.assertEquals("HAPPY", mood);
    }
}