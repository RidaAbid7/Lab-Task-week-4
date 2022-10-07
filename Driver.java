public class Driver {
    public static void main(String[] args) {

        //Setting department
        Lab labs[] = new Lab[30];
        Department department1 = new Department("CS", new Employee("Abdullah", "001", "HOD"), new Employee("Ahmad", "123", "Lab Incharge"), labs);

        //Setting labs
        PC computers[] = new PC[50];
        // new Lab("C-13", new Employee("Ali", "135", "Lab Attendant"), computers);
        
    }
}