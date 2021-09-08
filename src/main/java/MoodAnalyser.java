public class MoodAnalyser {

    public String analyseMood(String given_Message) {
        if(given_Message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
        }
    }

