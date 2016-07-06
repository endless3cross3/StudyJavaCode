

public class DogEX {
    String name;
    public static void main(String[] args) {
        DogEX dog1 = new DogEX();
        dog1.bark();
        dog1.name = "Bart";

        DogEX[] myDogs = new DogEX[3];
        myDogs[0] = new DogEX();
        myDogs[1] = new DogEX();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("last don't name is ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark() {
        System.out.println(name + " says Ruff!");
    }

    public void eat() { }

    public void chaseCat() { }
}
