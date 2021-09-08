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
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY_MOOD,"No message entered");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL_MOOD,"Please enter a valid message");
        }
    }
}


