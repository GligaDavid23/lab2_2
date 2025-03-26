// 4.5.3 initializati lista de studenti prin citirea unui fisier text. Pe fiecare linie se afla detaliile unui student separate de
// cate un spatiu: nume prenume grupa nota1 nota2 nota3 ...
// Introduceti apoi aceste intr-un map ( Map<Student, Integer>) in care sa numarati aparitiile fiecarui student.
// Pentru lucrul cu obiecte ale claselor scrise de noi trebuie sa generati, in clasa Student, equals() si hashcode(). IntelliJ
// Idea poate face asta: ALT + Insert (sau meniu > Code > Generate sau click-dreapta > Generate).
// Fisierul se numeste input.txt si are continutul:
// Ion Popescu 223_1 7 9 6 4
// Maria Popa 223_2 5 6 7 8
// Ion Popescu 223_1 7 9 6 4
// Diana Oprea 223_2 10 4 5 4
// Elena Dragomir 223_3 9 8 7 8
// Ion Popescu 223_1 7 9 6 4


package ro.ulbs.paradigme.lab4.pb3;

import java.util.*;
import java.io.*;

public class Application {
	public static void main(String[] args) {
		File file = new File("src/studenti.txt");
		Map<Student, Integer> students = new HashMap<Student, Integer>();
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] parts = line.split(" ");
				if (parts.length < 7) {
					System.out.println("Linia nu are formatul corect: " + line);
					continue;
				}
				String nume = parts[0];
				String prenume = parts[1];
				String grupa = parts[2];
				int[] note = new int[5]; // doar 4 note
				for (int i = 0; i < 4; i++) {
					note[i] = Integer.parseInt(parts[i + 3]);
				}
				Student student = new Student(nume + " " + prenume, grupa, note);
				if (students.containsKey(student)) {
					students.put(student, students.get(student) + 1);
				} else {
					students.put(student, 1);
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Fisierul nu a fost gasit.");
		}
		for (Map.Entry<Student, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey().getNume_Prenume() + " " + entry.getKey().getGrupa() + " " + entry.getKey().getMedie() + " " + entry.getValue());
		}
	}
}
