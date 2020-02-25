package pigLatin;/* Created by user on 25.02.20 */

public class Introduction {
    private String DOT_LINE = "----------------------------------------------------";
    private String PROGRAM_NAME = "           THIS IS PIG LATIN TRANSLATOR";
    private String MESSAGE = "Please Input the text...";

    public String getDotLine() {
        return DOT_LINE;
    }

    public String getProgramName() {
        return PROGRAM_NAME;
    }

    public String getMESSAGE() {
        return MESSAGE;
    }

    public void intro() {
        System.out.println(DOT_LINE);
        System.out.println(PROGRAM_NAME);
        System.out.println(DOT_LINE);
        System.out.println(MESSAGE);
    }
}
