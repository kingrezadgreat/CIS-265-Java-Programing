package homework2_4;

public class Test2 {
	public static void main(String[] args){
		new Person().printPerson();
		new Student().printPerson();		
	}
}

class Student extends Person{
	private String getInfo(){
		return "Student";
	}
}

class Person{
	private String getInfo(){
		return "Person";
	}
	public void printPerson(){
		System.out.println(getInfo());
	}

}

