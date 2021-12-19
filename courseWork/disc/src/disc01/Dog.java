package disc01;

public class Dog {
    public int weightInPounds;
    public String name;

    public Dog(int w){
        weightInPounds = w;
    }

    public Dog(String name, int w){
        this.name = name;
        weightInPounds = w;
    }

    public void makeNoise(){
        if (weightInPounds <= 10) {
            System.out.println("yip!");
        } else if(weightInPounds < 30){
            System.out.println("bark.");
        } else {
            System.out.println("wooof!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }

    public Dog maxDog(Dog d2){
        if (this.weightInPounds > d2.weightInPounds){
            return this;
        }
        return d2;
    }

    public void bark(int i) {

    }

    public void play() {
    }
}
