package homeworkproblem8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kane
 */
public class HomeworkProblem8 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ArrayList<Person> listOfPeople = new ArrayList<>();
        String fileName = "people.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            do {
                createNewPersonFromLineAndAddToArrayList(line, listOfPeople);
                line = br.readLine();
            } while (line != null);
        }

        sortArrayListOfPeopleByZip(listOfPeople);
        for (Person person: listOfPeople) {
            System.out.println(person.getZipcode());
        }
    }
    
    private static String[] splitStringByTabsAndAddPerson(String line, ArrayList<Person> peopleList) {
    	String[] stringSplittedByTab = line.split("\\t+");
    	return stringSplittedByTab;
    }

    private static void createNewPersonFromLineAndAddToArrayList(String line, ArrayList<Person> peopleList) {
    	String[] stringSplittedByTab = splitStringByTabsAndAddPerson(line, peopleList);
    	for (String personString : stringSplittedByTab) {
            String[] stringSplittedBySpace = personString.split("\\s+");
            Person person = new Person(stringSplittedBySpace[0], stringSplittedBySpace[1], stringSplittedBySpace[2]);
            peopleList.add(person);
    	}
    }

    private static void sortArrayListOfPeopleByZip(ArrayList<Person> peopleList) {
        Collections.sort(peopleList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getZipcode() - p2.getZipcode();
            }
        });
    }
}
