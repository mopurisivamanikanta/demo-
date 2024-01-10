package java123;
abstract class UniversityPerson {
String name;
int id;

  UniversityPerson(String name, int id) {
   this.name = name;
   this.id=id;
  }
abstract void display();
}


class Professor  {
String department;
 Professor(String name, int id, String department) {
   this.department = department;
}
void display(String name) {
   System.out.println("Professor - Name: " + name + ", ID: " + ", Department: " + department);
}
}


class AdministrativeStaff extends UniversityPerson {
String role;

 AdministrativeStaff(String name, int id, String role) {
   super(name,id);
}
void display() {
   System.out.println("Administrative Staff - Name: " + name + ", ID: " + id + ", Role: " + role);
}
}


class Studentt extends UniversityPerson {
String major;
 Studentt(String name, int id, String major) {
  super(name,id);
void display() {
   System.out.println("Student - Name: " + name + ", ID: " + id + ", Major: " + major);
}
}

public class Abstractionnnnnn {
public static void main(String[] args) {
   // Creating objects of concrete classes
   Professor professor = new Professor("mani",45,"mpc");
   AdministrativeStaff staff = new AdministrativeStaff("mani",45,"cr");
  UniversityPerson studentt = new Studentt("mani", 20, "major");

   // Using abstraction to display information about university persons
   professor.display("mani");
   staff.display();
   studentt.display();
}
}