package training.singleton;

public class exSingleton {

    public static void main(String[] args) {
        MySingleton singleton= MySingleton.getInstance();
        singleton.setMyValue(27);
        singleton.doSomething();

        MySingleton otherObjectSingleton= MySingleton.getInstance();
        otherObjectSingleton.doSomething();
    }


}

class MySingleton{

    private static MySingleton instance;
    private int myValue=0;

    private MySingleton(){}

    public static MySingleton getInstance(){
        if(instance==null)
        {
            instance= new MySingleton();
        }
        return instance;
    }

    public void doSomething(){
        System.out.println("i do something, i show you my value "+this.myValue);
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
