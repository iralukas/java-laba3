package Classes;

public enum ThingCondition {
    NORMAL("в нормальном состоянии"),
    FLOATING("находится в воздухе");

    public final String label;

    ThingCondition(String label) {
        this.label = label;
    }
}
