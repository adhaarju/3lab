package lab3.com;

public class Dog extends Animal implements Reptiles,abc {
	public void name()
	{
		System.out.println("cosmos");
	}
	public void eatFood() {
		super.eatFood();
		System.out.println("Dog is eating");
		super.sleep();
	}
	public static void main(String[] args) {
		Dog dog =new Dog();
		dog.name();
		dog.eatFood();
		dog.move();
		
	}
	@Override
	public void swim() {
		// TODO Auto-generated method stub
System.out.println("swimmig");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
System.out.println("moving");
	}

	@Override
	public void danger() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void animalss() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

}
