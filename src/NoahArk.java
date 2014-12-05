/**
 * Created by PierreM on 01/12/2014.
 */
public class NoahArk {

    public static void main(String[] args) {
        NoahArk ark = new NoahArk();
        ark.launch();
    }

    public void launch() {
        MammalAnimal Whale = new Whale();
        Whale.giveBirth();
        Whale.call();
        Whale.makeSound();

    }
}
