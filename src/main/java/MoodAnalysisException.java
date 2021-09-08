public class MoodAnalysisException extends Exception{
    enum ExceptionType{
        EMPTY_MOOD,NULL_MOOD;
    }
    ExceptionType type;
    public MoodAnalysisException( ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}
