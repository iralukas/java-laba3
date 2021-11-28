package Classes;

public enum Status {
    NORMAL("пришел в себя"),
    FLOATING("висит в воздухе"),
    CONFUSED("нашел это странным"),
    SURPRISED("удивился"),
    HIGH("почувствовал необычайную легкость");

    public final String label;

    Status(String label) {
        this.label = label;
    }
}