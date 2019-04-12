class Dog {
	String species;
	
	public Dog(String species) {
		this.species = species;
	}
	
	public Dog() {
		 this("Maltese");
	}
	
	
}

public class DogTest {

	public static void main(String[] args) {
		Dog MyDog = new Dog();
        Dog YourDog = new Dog("poodle");
        
       System.out.println(MyDog.species);
       System.out.println(YourDog.species);
	}
}
