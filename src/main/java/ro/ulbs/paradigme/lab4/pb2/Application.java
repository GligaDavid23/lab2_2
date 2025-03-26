package ro.ulbs.paradigme.lab4.pb2;

import java.util.*;

public class Application {
	public static void main(String[] args) {
		List<Student> students = new ArrayList();
		for(int i = 0; i < 5; i++) {
			Random randn = new Random();
			Random randg = new Random();
			String[] grupe = {"TI", "ISM", "C"};

			int[] note = new int[5];
			for(int j = 0; j < 5; j++) {
				note[j] = randn.nextInt(11);
			}
			students.add(new Student("Student" + i, grupe[randg.nextInt(grupe.length)] + randg.nextInt(6), note));
		}
		System.out.println("\nAranjati alfabetic dupa grupa:");
		students.sort(Comparator.comparing(Student::getGrupa));
		for(Student student : students) {
			System.out.println(student.getNume_Prenume() + " " + student.getGrupa() + " " + Arrays.toString(student.getNota()));
		}
		System.out.println("\nAranjati dupa medie descrescator:");
		students.sort(Comparator.comparing(Student::getMedie).reversed());
		for(Student student : students) {
			System.out.println(student.getNume_Prenume() + " " + student.getGrupa() + " " + Arrays.toString(student.getNota()));
		}
		System.out.println("\nAranjati crescator dupa numarul de restante:");
		students.sort(Comparator.comparing(student -> {
			int restante = 0;
			for(int nota : student.getNota()) {
				if(nota < 5) {
					restante++;
				}
			}
			return restante;
		}));
		for(Student student : students) {
			System.out.println(student.getNume_Prenume() + " " + student.getGrupa() + " " + Arrays.toString(student.getNota()));
		}
	}
}
