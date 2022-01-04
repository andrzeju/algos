package pl.com.urbanlab.algos101;

public class StringCompressor {

    public int compress(char[] text) {
        if (text.length < 2) {
            return text.length;
        }

        int insertCounter = 1;
        int duplicateCounter = 1;
        System.out.printf("ins[%d] = %s ====\n", 0, text[0]);
        for (int i = 1; i < text.length; i++) {
            if (text[i] == text[i - 1]) { //same as previous - increase
                duplicateCounter++;
                if (i == text.length - 1 || text[i] != text[i+1]) { //but different than next - add digit and move insert
                    text[insertCounter] = (char) (duplicateCounter + '0');
                    System.out.printf("ins[%d] = %s(s)\n", insertCounter, duplicateCounter);
                    insertCounter++;
                    duplicateCounter = 1;
                }
            } else {
                text[insertCounter] = text[i];
                System.out.printf("ins[%d] = %s\n", insertCounter, text[i]);
                insertCounter++;
            }
        }
        return insertCounter;
    }
}
