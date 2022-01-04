package pl.com.urbanlab.algos101;

public class StringCompressor {

    public int compress(char[] text) {
        if (text.length < 2) {
            return text.length;
        }

        int insertCounter = 1;
        int duplicateCounter = 1;
        for (int i = 1; i < text.length; i++) {
            if (text[i] == text[i - 1]) {
                duplicateCounter++;
                if (i == text.length - 1 || text[i] != text[i+1]) {
                    text[insertCounter] = (char) (duplicateCounter + '0');
                    int length = String.valueOf(duplicateCounter).length();
                    insertCounter+=length;
                    duplicateCounter = 1;
                }
            } else {
                text[insertCounter] = text[i];
                insertCounter++;
            }
        }
        return insertCounter;
    }
}
