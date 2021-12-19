package Objects;

public class DogLauncher {
    public static void main(String[] args) {
        Dog d1 = new Dog(10);
        Dog d2 = new Dog(100);
        d1.makeNoise();
        //Invoke a static method
        Dog.maxDog(d1, d2);
        //Invoke a instance method
        d2.maxDog(d2);
    }
}
