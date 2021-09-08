public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else if (message.contains("Any"))
            return "HAPPY";
        else
            return "HAPPY";
    }
}

