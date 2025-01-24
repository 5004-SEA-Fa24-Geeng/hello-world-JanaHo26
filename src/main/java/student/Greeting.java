package student;

/**
 * This class is a place holder which you will fully implement based on the javadoc.
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {
    /** The ID of the locality. */
    private int localityID;
    /** The name of the locality. */
    private String localityName;
    /** The ASCII representationof the greeting. */
    private String asciiGreeting;
    /** The Unicode represnetation of the greeting. */
    private String unicodeGreeting;
    /** The format string for the greeeting. */
    private String formatStr;

    /**
     * The basic English greeting for given locality.
     * @param localityID ID of the locality
     * @param localityName name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "%s, %%s!");
    }

    /**
     * Greeting with ASCII / Unicode.
     * @param localityID ID of the locality
     * @param localityName name of the locality
     * @param greeting greeting text to use for ascii greeting and unicode greeting
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %s!");
    }

    /**
     * Customized greeting.
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
     * Get the locality ID.
     * @return the locality ID
     */
    public int getLocalityID() {
        return this.localityID;
    }

    /**
     * Get the locality name.
     * @return the locality name
     */
    public String getLocalityName() {
        return this.localityName;
    }

    /**
     * get the ascii version of greeting.
     * @return the ascii version of greeting
     */
    public String getAsciiGreeting() {
        return this.asciiGreeting;
    }

    /**
     * get the unicode version of greeting.
     * @return the unicode version of greeting
     */
    public String getUnicodeGreeting() {
        return this.unicodeGreeting;
    }


    /**
     * Returns the format string.
     * @return the format string
     */
    public String getFormatStr() {
        return String. format(formatStr, unicodeGreeting);

    /**
     * Returns the format string with specified encoding.
     * @param useUnicode whether to use Unicde encoding
     * @return the format string
     */
    public String getFormatStr(boolean asiiOnly) {
        if (asciiOnly) {
            return String.format(formatStr, asciiGreeting);
        }
        else{
            return String.format(formatStr, unicodeGreeting);
        }
    }

    /**
     * Return a string representation everything.
     * @return a formatted string representation
     */
    @Override
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", "
                        + "asciiGreeting:\"%s\","
                        + "unicodeGreeting:\"%s\"}",
                    localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
