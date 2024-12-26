import java.util.ArrayList;
import java.util.Collections;

public class StringArrayHandler {
    private ArrayList<String> strings;

    public StringArrayHandler() {
        this.strings = new ArrayList<>();
    }

    public void addString(String str) {
        strings.add(str);
        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public String getMaxLengthString() {
        if (strings.isEmpty()) {
            return null;
        }
        return strings.get(strings.size() - 1);
    }
// Метод для вычисления средней длины строк в массиве
    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0.0;
        }
        int totalLength = 0;
        for (String str : strings) {
            totalLength += str.length();
        }
        return (double) totalLength / strings.size();
    }
}

