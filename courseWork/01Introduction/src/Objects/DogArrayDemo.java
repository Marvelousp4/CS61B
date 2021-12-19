package Objects;

public class DogArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);

        dogs[0].makeNoise();
    }
}
