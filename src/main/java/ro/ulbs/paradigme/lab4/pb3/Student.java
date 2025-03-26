package ro.ulbs.paradigme.lab4.pb3;

public class Student {
	String Nume_Prenume;
	String grupa;
	int nota[]=new int[5];
	double medie;
	public Student(String Nume_Prenume, String grupa, int[] nota) {
		this.Nume_Prenume = Nume_Prenume;
		this.grupa = grupa;
		this.nota = nota;
	}
	public String getNume_Prenume() {
		return Nume_Prenume;
	}
	public String getGrupa() {
		return grupa;
	}
	public double getMedie() {
		int sum=0;
		for(int i=0;i<5;i++)
			sum+=nota[i];
		medie=sum/5;
		return medie;
	}
}
