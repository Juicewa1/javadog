public class Dog {
    //properties
    private String name;
    private String breed;
    private int age;
    private String weight;
    private String color;
    private String gender;


    public Dog(String name, int age, String weight, String color, String breed, String gender){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.weight = weight;
        this.gender = gender;
    }

    //methods
    public void barks() {
        System.out.println(name + " says RUFF!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

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

    public String getBreed(){return breed;}
    public void setBreed(String breed) {this.breed = breed;}

    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}

    public String getWeight(){return weight;}
    public void setWeight(){this.weight = weight;}

    public String getColor(){return color;}
    public void setColor(String color){this.color = color;}

    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

    //main method for testing
    public static void main(String[] args){
        Dog mydog1 = new Dog("Snoppy", 2, "7 lbs","Tan","Yorkie", "Female");
        Dog mydog2 = new Dog("Spot", 1, "35lbs","White", "Dalmatian", "Female");
        Dog mydog3 = new Dog("Wolf", 5, "65 lbs","Black", "Labrador","Male");
        mydog1.barks();
        mydog1.sleep();
        mydog1.eats();
        mydog1.drinks();
        mydog1.walks();
        mydog1.play();
        mydog1.smell();
        mydog1.bathroom1();
        mydog1.bathroom2();

        mydog2.barks();
        mydog2.sleep();
        mydog2.eats();
        mydog2.drinks();
        mydog2.walks();
        mydog2.play();
        mydog2.smell();
        mydog2.bathroom1();
        mydog2.bathroom2();

        mydog3.barks();
        mydog3.sleep();
        mydog3.eats();
        mydog3.drinks();
        mydog3.walks();
        mydog3.play();
        mydog3.smell();
        mydog3.bathroom1();
        mydog3.bathroom2();

        System.out.println("Name: " + mydog1.getName());
        System.out.println("Age: " + mydog1.getAge());
        System.out.println("Breed: " + mydog1.getBreed());
        System.out.println("Color: " + mydog1.getColor());
        System.out.println("Weight: " + mydog1.getWeight());
        System.out.println("Gender: " + mydog1.getGender());


        System.out.println("Name: " + mydog2.getName());
        System.out.println("Age: " + mydog2.getAge());
        System.out.println("Breed: " + mydog2.getBreed());
        System.out.println("Color: " + mydog2.getColor());
        System.out.println("Weight: " + mydog2.getWeight());
        System.out.println("Gender: " + mydog2.getGender());


        System.out.println("Name: " + mydog3.getName());
        System.out.println("Age: " + mydog3.getAge());
        System.out.println("Breed: " + mydog3.getBreed());
        System.out.println("Color: " + mydog3.getColor());
        System.out.println("Weight: " + mydog3.getWeight());
        System.out.println("Gender: " + mydog3.getGender());
    }

}
