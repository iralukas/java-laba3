package Classes;

public enum Hands {
    BOTH_DOWN("обе руки опущены"),
    ONE_RAISED("осторожно попробовал поднять руку"),
    BOTH_RAISED("поднял другую руку");

    public final String label;

    Hands(String label) {
        this.label = label;
    }
}