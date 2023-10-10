package training.factory;

public interface Animal {

    String sound();
}

class Cat implements  Animal{

    @Override
    public String sound() {
        return "Miaouuuuuuuuuuuuuuuuuuuuu";
    }
}

class Dog implements Animal{

    @Override
    public String sound() {
        return "Ouafffffffffffffffff";
    }
}
