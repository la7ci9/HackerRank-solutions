import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Person{
	
	String name;
	Integer score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return name+" "+String.valueOf(score) ;
	}
	

}

class Checker implements Comparator<Person>{
	
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.score == o2.score) {
			return o1.name.compareTo(o2.name);
		}
		return o2.score - o1.score;
	}
}

public class Main {

	public static void main(String[] args) {
		
		int numberOfLines;
		ArrayList<Person> listOfPerson = new ArrayList<>();
		
		
        Scanner sc = new Scanner(System.in);

        numberOfLines = sc.nextInt();
        sc.nextLine();

        for(int i =0;i<numberOfLines;i++){
        	
            String line = sc.nextLine();
            String[] pieces = line.split(" ");
            Person person = new Person();
            person.name=pieces[0];
            person.score=Integer.parseInt(pieces[1]);
            listOfPerson.add(person);
        }
        sc.close();
        Collections.sort(listOfPerson, new Checker());
        for (Person person : listOfPerson) {
			System.out.println(person);
		}
	}

}
