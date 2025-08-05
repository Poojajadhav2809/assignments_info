/*Employee Record System
Create a class Employee with private fields: id, name, and salary.
Use setter methods to assign values. Add a method to display employee details.
 */
class Employee {
    private int id;
    private String name;
    private int salary;

    public void display(){
        System.out.println("id of emplyee is: "+id);
        System.out.println("Name of employee is: "+name);
        System.out.println("Salary of emplyee is: "+salary);
    }
    public void setId(int id){
        this.id=id;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    }
class P1{
    public static void main(String args[]){
    Employee obj=new Employee();
    obj.setId(12);
    obj.setName("pooja");
    obj.setSalary(50000);
    obj.display();
}

}