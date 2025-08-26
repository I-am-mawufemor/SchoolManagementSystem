package assementAndGrading;

public enum AssessmentGrading {
    Excellent(1),
    VeryGood(2),
    Good(3),
    HighAverage(4),
    Average(5),
    LowAverage(6),
    Poor(7),
    Fail(8);

    private final int value;

    AssessmentGrading(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
