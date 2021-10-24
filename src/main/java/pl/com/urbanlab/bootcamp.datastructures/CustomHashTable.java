package pl.com.urbanlab.bootcamp.datastructures;

public class CustomHashTable {

    private static final int INITIAL_TABLE_SIZE = 8;
    private HashEntry [] entries;

    public CustomHashTable() {
        entries = new HashEntry[INITIAL_TABLE_SIZE];
    }

    public void put(String key, String value) {
        int index = getIndex(key);
        System.out.println("Inserting: idx=" + index + ", key=" + key + ", val=" + value);
        HashEntry newEntry = new HashEntry(key, value);

        if (entries[index] == null) {
            entries[index] = newEntry;
        } else {
            HashEntry entry = entries[index];
            while (entry.next != null) {
                entry = entry.next;
            }
            entry.next = newEntry;
        }
    }


    public String get(String key) {
        int index = getIndex(key);

        if (entries[index] == null) {
            return null;
        }
        HashEntry currentEntry = entries[index];

        while (!currentEntry.key.equals(key)) {
            currentEntry = currentEntry.next;
        }
        return currentEntry.value;
    }

    private int getIndex(String key) {
        return Math.abs(key.hashCode()) % INITIAL_TABLE_SIZE;
    }

    private class HashEntry {
        private final String key;
        private final String value;
        private HashEntry next;

        private HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }
}
