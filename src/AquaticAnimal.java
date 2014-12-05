/**
 * Created by PierreM on 01/12/2014.
 */
public abstract class AquaticAnimal implements Animal {

    public void call() {
        System.out.println("will not come ... ");
    }

    public void reproduce() {
        System.out.println("Reproducing...");
    }

    public void makeSound() {
        System.out.println("Making a sound");
    }
}
