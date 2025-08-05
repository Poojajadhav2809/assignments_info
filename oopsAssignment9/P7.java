/*Student Result Checker
Create a class Student with fields: name, mathMarks, scienceMarks.
Use setters to assign values. Add a method getAverage().
*/
import java.util.Scanner;
class Student{
    private String name;
    private float mathMarks;
    private float scienceMarks;

    public void setName(String name){
        this.name=name;
    }
    public void setMathMarks(float mathMarks){
        this.mathMarks=mathMarks;
    }
    public void setScienceMarks(float scienceMarks){
        this.scienceMarks=scienceMarks;
    }
    public void display(){
        System.out.println("name of the student is: "+name);
    }
    public float getAverage(){
        return (mathMarks+scienceMarks)/2;
    
    }
}

class P7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name of the Student");
        String name=sc.nextLine();
        System.out.println("enter math's marks");
        float mathMarks=sc.nextFloat();
        System.out.println("enter science's marks");
        float scienceMarks=sc.nextFloat();

        Student obj=new Student();
        obj.setName(name);
        obj.setMathMarks(mathMarks);
        obj.setScienceMarks(scienceMarks);
        obj.display();
        float average=obj.getAverage();
        System.out.println("average marks of the student is: "+average);
        sc.close();
    }
}