package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * 
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 * 
 */
public class Greeting {
    private int localityID;
    private String localityName;
    private String asciiGreeting;
    private String unicodeGreeting;
    private String formatStr;

    /**
     * The basic English greeting for given locality
     * @param localityID ID of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Greeting with ASCII / Unicode.
     * @param localityID ID of the locality
     * @param localityName name of the locality
     * @param greeting greeting text to use for ascii greeting and unicode greeting
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Customized greeting
     * @param localityID ID of the locality
     * @param localityName name of the locality
     * @param asciiGreeting ascii version of greetin g
     * @param unicodeGreeting unicode version of greeting
     * @param formatStr format pattern of the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Get the locality ID
     * @return the locality ID
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Get the locality name
     * @return the locality name
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * get the ascii version of greeting
     * @return the ascii version of greeting
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * get the unicode version of greeting
     * @return the unicode version of greeting
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }

    /**
     * get the format greeting
     * @return the format greeting
     */
    public String getFormatStr() {
        return String.format(formatStr, asciiGreeting);
    }

    /**
     * Return greeting with either ascii or unicode
     * @return formatted greeting string
     */
    public String getGreeting(boolean useAscii) {
        if (useAscii) {
            return String.format(formatStr, asciiGreeting);
        }
        return String.format(formatStr, unicodeGreeting);
    }

    /**
     * Return a string representation everything
     * @return a formatted string representation
     */
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", " +
                            "asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                    localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
