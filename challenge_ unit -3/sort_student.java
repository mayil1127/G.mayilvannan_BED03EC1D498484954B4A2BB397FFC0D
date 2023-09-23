import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//define a student class to represent a student 
class Student
  {
    String name;
    String rollNumber;
    double cgpa;

    public Student(String name,String rollNumber,double cgpa)
    {
      this.name = name;
      this.rollNumber = rollNumber;
      this.cgpa = cgpa;
    }
  }
public class Main
  {
    //comparator to compare students based on CGPA in descending order
    static class CGPAComparator implements Comparator<Student>
      {
       @Override
        public int compare(Student student1, Student student2)
        {
          //sort in descending order of CGPA 
          return Double.compare(student2.cgpa,student1.cgpa);
        }
      }
//function to sort a listof student objects based on CGPAin descending order
    static void sortStudents(List<Student>students)
    {
      //use the CGPAComparator to sort the list
      Collections.sort(students,new CGPAComparator());
    }
    public static void main(String[] args)
    {
      //Create a list of student objects
      List<Student>students=new ArrayList<>();
      students.add(new Student("Alice","A123",3.8));
      students.add(new Student("Bob","B456",3.5));
      students.add(new Student("Charlie","C789",3.9));
      students.add(new Student("David","D101",3.2));
      students.add(new Student("Eve","E202",4.0));
      //Sort the list of students based on CGPA
      sortStudents(students);
      //Print the sorted list
      System.out.println("Sorted List of Students by CGPA(Descending Order):");
      for (Student student : students)
      {
        System.out.println("Name:"+ student.name+",Roll Number:"+student.rollNumber+",CGPA:"+student.cgpa);
      }
    }
  }
