
public class Dog {
    //properties
    private String name;
    private DogBreed breed;
    private Dogsize size;
    private int age;
    private String weight;
    private String color;
    private String gender;



    public Dog(String name, DogBreed breed, Dogsize size, int age, String weight, String color, String gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.size= size;
        this.weight = weight;
        this.gender = gender;
    }

    public Dog(String name, DogBreed breed,Dogsize size){ this(name, breed, size, 5, "8lbs", "Tan", "Male");}

   public Dog(String name) { this(name, DogBreed.DALMATIAN, Dogsize.MEDIUM, 2, "45lbs", "White", "Male");}

            //methods
    public void barks() {
        System.out.println(name + " says RUFF!");
    }

    public void sleep() {
            System.out.println(name + " is sleeping.");}

    public void eats() {
        System.out.println(name + " is eating.");
    }

    public void drinks(){System.out.println(name + " is drinking.");}

    public void walks(){System.out.println(name+" is walking.");}

    public void play(){System.out.println(name + " is playing with the ball!");}

    public void smell(){System.out.println(name + " is smelling the flowers.");}

    public void bathroom1(){System.out.println(name + " is going number 1.");}

    public void bathroom2(){System.out.println(name + " is going number 2.");}

    //Getter and setters
    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public DogBreed getBreed(){return breed;}
    public void setBreed(DogBreed breed) {this.breed = breed;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public String getWeight(){return weight;}
    public void setWeight(){this.weight = weight;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

    //main method for testing
    public String toString() {
        return "Dog: " + name + ", Breed: " + breed + ", Size: " + size + ", Age: "+ age + " years, Weight: " + weight + ", Color: " + color + ", Gender: " + gender;
    }
    public static void main(String[] args){

        Dog Dog1 = new Dog("Snoppy", DogBreed.YORKIE, Dogsize.SMALL, 2, "7lbs", "Brown", "Female");
        System.out.println("First " + Dog1);
        Dog1.barks();
        Dog1.play();
        Dog1.sleep();
        Dog1.bathroom2();
        Dog1.smell();
        Dog1.eats();
        Dog1.bathroom1();
        Dog1.walks();
        Dog1.drinks();


        Dog Dog2 = new Dog("Spot", DogBreed.DALMATIAN, Dogsize.LARGE, 1, "34lbs", "White", "Female");
        System.out.println("2nd " + Dog2);
        Dog2.eats();
        Dog2.barks();
        Dog2.sleep();
        Dog2.smell();
        Dog2.bathroom1();
        Dog2.play();
        Dog2.bathroom2();

        Dog2.walks();
        Dog2.drinks();

        Dog Dog3 = new Dog("Wolf", DogBreed.LABRADOR,Dogsize.MEDIUM, 5, "45lbs", "Grey", "Male");
        System.out.println("3rd " + Dog3);
        Dog3.barks();
        Dog3.sleep();
        Dog3.walks();
        Dog3.drinks();
        Dog3.bathroom2();
        Dog3.smell();
        Dog3.bathroom1();
        Dog3.play();
        Dog3.eats();





    }

}
