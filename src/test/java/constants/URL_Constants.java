package constants;

import java.util.HashMap;
import java.util.Map;

public class URL_Constants {
    private final static String MAIN_URL="https://www.tut.by/";

    public static String getURL(String URL) {
        Map<String, String> elements = new HashMap();
        elements.put("Main page", MAIN_URL);
        return elements.get(URL);
    }
}
