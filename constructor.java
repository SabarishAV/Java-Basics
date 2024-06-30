public class constructor {

    static class Employee{
        int id;
        String name;
        public Employee(int empID, String empName){
            id = empID;
            name = empName;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1,"John");
        System.out.println(emp.id);
        System.out.println(emp.name);
    }
}
