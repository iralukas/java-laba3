import Classes.*;

public class Main {
    public static void main(String[] args) {
        Story tale = new Story();

        tale.AddZnayka(new Znayka("Знайка"));
        tale.AddBooks(new Books("Книги"));
        tale.AddChair(new Chair("Стул"));
        tale.AddLamp(new Lamp("Люстра"));

        tale.go();
    }
}

//todo: как же все-таки правильно переопределять hashCode(), equals()
// разнообразить как-нить


