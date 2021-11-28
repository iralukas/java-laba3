package Classes;

public class Znayka extends Human {
    public Znayka(String name) {
        super(name);
    }

    public void memory(){
        System.out.println("Все это было похоже на состояние невесомости, которое Знайка наблюдал в кабине космического"
                + " корабля во время путешествия на Луну.");
    }


    private Enum
    private Status status = Status.NORMAL;
    private Hands hands = Hands.BOTH_DOWN;



    public Status status() {
        return this.status;
    }

    public Hands hands() {
        return this.hands;
    }

    public void fly() {
        this.status = Status.FLOATING;
        System.out.println(this.name + " " + Status.FLOATING.label);
    }

    public void surprised() {
        this.status = Status.SURPRISED;
        System.out.println(name + " " + Status.SURPRISED.label);
    }

    public void watchOut(Thing books, Thing chair, Thing lamp){
        int i = 0;
        System.out.println(name + " огляделся");
        if (chair.check() == ThingCondition.FLOATING){
            System.out.println("Стул повис кверху ножками");
            i += 1;
        }
        if (lamp.check() == ThingCondition.FLOATING){
            System.out.println("Люстра висела в противоестественном состоянии");
            i += 1;
        }
        if (books.check() == ThingCondition.FLOATING){
            System.out.println("Вокруг плавали книги");
            i += 1;
        }
        if (i == 3){
            this.setCondition(Status.CONFUSED);
            System.out.println("И стул, и книги не падают на пол, а как бы взвешены в воздухе.");
        }
    }

    public void checkSelf() {
        String check = this.status.label;
        System.out.println(name + " " + check + ".");
    }

    public void setCondition(Status status) {
        this.status = status;
        System.out.println(name + " " + status.label);
    }

    public void raiseHand() {
        if (this.hands() == Hands.BOTH_DOWN) {
            this.hands = Hands.ONE_RAISED;
            System.out.println(name + " " + Hands.ONE_RAISED.label);
            System.out.println("Его удивило, что для этого ему не потребовалось никакого усилия. " +
                    "Рука поднялась как бы сама собой. Она была легкая, как пушинка.");
        } else if (this.hands() == Hands.ONE_RAISED) {
            this.hands = Hands.BOTH_RAISED;
            System.out.println(name + " " + Hands.BOTH_RAISED.label);
            System.out.println("И эта рука словно не весила " +
                    "ничего. Ее даже как будто подталкивало что-то снизу.");
        } else {
            System.out.println("Обе руки подняты");
        }

    }
}