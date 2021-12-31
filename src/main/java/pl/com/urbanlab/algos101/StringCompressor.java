package pl.com.urbanlab.algos101;

public class StringCompressor {

    public int compress(char[] text) {
        if (text.length < 2) {
            return text.length;
        }

        int insertCounter = 0;
        int duplicateCounter = 1;
        for (int i = 0; i < text.length - 1; i++) {
            if (text[i] == text[i + 1]) {
                duplicateCounter++;
            } else {
                insertCounter ++;
                if (duplicateCounter > 1) {
                    text[insertCounter] = (char) (duplicateCounter + '0');
                    insertCounter ++;
                    duplicateCounter = 1;
                } else {
                    text[insertCounter] = text[i+1];
                }
            }
        }
        return 1 + insertCounter;
    }
}
