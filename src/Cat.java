public class Cat extends  Animal {
    private boolean vaccination;

    public Cat(String name, int age, boolean vaccination) {
        super(name, age);
        this.vaccination = vaccination;
    }

    public boolean getIsVaccination(){
        return vaccination;
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + ": Meow-meow!");
    }
}
