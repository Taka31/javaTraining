package training.factory;

public class AnimalFactory {

    public static Animal getAnimal(TypeAnimal ta){

        switch(ta){
            case CHAT:
                return new Cat();
            case CHIEN:
                return new Dog();
            default:
                return null;
        }
    }
}

enum TypeAnimal {
    CHIEN, CHAT;
}
