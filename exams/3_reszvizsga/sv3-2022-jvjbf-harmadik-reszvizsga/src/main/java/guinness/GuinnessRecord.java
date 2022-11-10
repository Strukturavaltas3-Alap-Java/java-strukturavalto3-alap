package guinness;

import java.util.*;
import java.util.stream.Collectors;

public class GuinnessRecord {

    private String recordName;
    private RecordType recordType;
    private int bestAttempt;
    private Map<Recorder, List<Integer>> attempts = new HashMap<>();

    public static GuinnessRecord createGuinnessRecord(String recordName, RecordType recordType) {
        if (recordType == RecordType.TIME) {
            return new GuinnessRecord(recordName, recordType, Integer.MAX_VALUE);
        } else {
            return new GuinnessRecord(recordName, recordType, 0);
        }
    }

    private GuinnessRecord(String recordName, RecordType recordType, int bestAttempt) {
        this.recordName = recordName;
        this.recordType = recordType;
        this.bestAttempt = bestAttempt;
    }

    public boolean tryBeatRecord(int amount, Recorder recorder) {
        if (!attempts.containsKey(recorder)) {
            attempts.put(recorder, new ArrayList<>());
        }
        attempts.get(recorder).add(amount);
        if (recordType == RecordType.QUANTITY && amount > bestAttempt) {
            bestAttempt = amount;
            return true;
        }
        if (recordType == RecordType.TIME && amount < bestAttempt) {
            bestAttempt = amount;
            return true;
        }
        return false;
    }

    public Recorder findRecordHolder() {
        return attempts.entrySet().stream()
                .filter(e -> e.getValue().contains(bestAttempt))
                .map(e -> e.getKey())
                .findFirst().orElseThrow(() -> new RecordHasNoAttemptsException("No attempts yet!"));
    }

    public List<String> getOrderedRecorderNames() {
        return attempts.entrySet().stream()
                .map(e -> e.getKey().getName())
                .sorted().collect(Collectors.toList());
    }

    public String getRecordName() {
        return recordName;
    }

    public RecordType getRecordType() {
        return recordType;
    }

    public int getBestAttempt() {
        return bestAttempt;
    }

    public Map<Recorder, List<Integer>> getAttempts() {
        return attempts;
    }

    @Override
    public String toString() {
        return "GuinnessRecord{" +
                "recordName='" + recordName + '\'' +
                ", recordType=" + recordType +
                ", maxAmount=" + bestAttempt + " " + recordType.getUnit();
    }
}
