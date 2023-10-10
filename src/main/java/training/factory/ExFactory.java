package training.factory;

public class ExFactory {

    public static void main(String[] args) {
        Animal myAnimal= AnimalFactory.getAnimal(TypeAnimal.CHIEN);
        if(myAnimal!=null){
            System.out.println(myAnimal.sound());
        }
    }


}
