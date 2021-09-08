public class MoodAnalyser {
    private String message;
    /**
     * Default Constructor (No parameter)
     */
    public MoodAnalyser(){}
    /**
     * Parametrized Constructor
     * @param message This is the message to analyse mood.
     */
    public MoodAnalyser(String message){
        this.message=message;
    }
    public String analyseMood() {
        try{if (message.contains("Sad"))
            return "SAD";
        else if (message.contains("Any"))
            return "HAPPY";
        else
            return "HAPPY";
    }
        catch (Exception e){
        return "HAPPY";}
    }
}

