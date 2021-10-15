package staticpackage;

class Exam{
	int subjectcode;
	String subname;
	String subdepart;
	Exam(int subjectcode, String subname,String subdepart){
		this.subjectcode = subjectcode;
		this.subname = subname;
		this.subdepart = subdepart;
		
	}
}

class Student extends Exam{
	int rollno;
	String name;
	
	Student(int rollno,String name,int subjectcode,String subname,String subdepart){
		super(subjectcode,subname,subdepart);
		this.rollno = rollno;
		this.name = name;
		
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollno);
		System.out.println("Subject Code: "+subjectcode);
		System.out.println("Subject Name: "+subname);
		System.out.println("Department: "+subdepart);
		
	}
	public static void main(String[] args) {
		Student s = new Student(101, "Tejas",2,"Java","Information Tech");
		s.display();
		
	}

}
