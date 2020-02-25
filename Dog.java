
public class Dog extends Animal {
	String name;
	
	Dog(String n, int l) {
		name = n;
		legs = l;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
