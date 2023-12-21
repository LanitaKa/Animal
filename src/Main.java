public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1);
        Cat myCat = new Cat("Bonia", 1, true);
        Dog myDog = new Dog("Grig", 4, "sheepdog");

        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());


        animal.eat();
        animal.sleep();
        animal.makeSound();

        System.out.println();

        System.out.println("Dog");
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Breed: " + myDog.getBreed());
        myDog.bark();

        System.out.println();

        System.out.println("Cat");
        System.out.println("Name: " + myCat.getName());
        System.out.println("Age: " + myCat.getAge());
        System.out.println("Vaccination: " + myCat.getIsVaccination());;
        myCat.makeSound();
    }

}