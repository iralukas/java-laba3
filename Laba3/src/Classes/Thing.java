package Classes;

public abstract class Thing{
    private String name;
    private ThingCondition condition = ThingCondition.FLOATING;

    public Thing(String name) {
        this.name = name;
    }

    public String GetName() {
        return this.name;
    }

    public void getCondition() {
        String check = this.condition.label;
        System.out.println(this.name + " " + check);
    }

    public ThingCondition check(){
        return this.condition;
    }

    public void setCondition(ThingCondition condition) {
        this.condition = condition;
        System.out.println(name + this.condition.label);
    }
}
