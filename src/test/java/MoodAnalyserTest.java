import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {
    @Test
    void givenMood_whenMessageIsSad_returnsSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is a Sad message");
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMood_whenMessageIsHappy_returnsHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("This is happy message");
        Assertions.assertEquals("HAPPY",mood);
    }
    
}