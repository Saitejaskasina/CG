/*Program to Display Employee Details
Problem Statement: Write a program to create an Employee class with attributes name, id, and salary. Add a method to display the details.

*/

public class emp1{
    public static void main(String[] args) {
       emp emp = new emp();
       System.out.println(emp.name);
       System.out.println(emp.id);
       System.out.println(emp.salary);

    }
}

class emp{
    String name = "gon";
    int id = 123;
    int salary = 5000;
}