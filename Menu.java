import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    Department department = new Department();
    Functions functions = new Functions(department);

    public void showMenu(){
        
        System.out.println("\nPlease choose one of the following options:\n1. To add a new Department\n2. To View Department Attributes");
        System.out.println("\n3. To add a new Lab\n4. To search a Lab\n5. To delete a Lab\n6. To View all Labs of a Department");
        System.out.println("\n7. To add a new Computer\n8. To search a computer\n9. To delete a computer\n10. To view all the computers in a lab");
    }

    public void choice(){
        int choice;
        do{
     choice = input1.nextInt();

    switch(choice){
        case 1:
        department = functions.newDepartment(); 
        break;
        
        case 2:
        functions.viewDepartment();
        break;

        case 3:
        department.getLabs()[department.getLabCounter()] = functions.newLab();
        department.setLabCounter(department.getLabCounter() + 1);
        break;

        case 4:
        System.out.println("Enter the name of lab you want to search: ");
        String name = input.nextLine();
        System.out.println(functions.searchLab(name).toString()); 
        break;

        case 5:
        functions.deleteLab();
        break;

        case 6:
        functions.viewAllLabs();
        break;
        
        case 7:
        System.out.println("Enter lab in which you want to add a new computer");
        String labName = input.nextLine();
        Lab temp = functions.searchLab(labName);
        temp.getComputers()[temp.getPcCounter()]  = functions.newComputer();
        temp.setPcCounter(temp.getPcCounter() + 1);
        break;

        case 8:
        // System.out.println("Enter the name of lab you want to search: ");
        // String name1 = input.nextLine();
        // Lab temp1 = functions.searchLab(name1);
        System.out.println(functions.searchComputer().toString()); 
        break;

        case 9:
        functions.deleteComputer();
        break;

        case 10:
        functions.viewAllComputers();
        break;

        default:
        System.out.println("Choice entered does not exist");
        break;
    }

    showMenu();

    }while(choice != -1);

}


  
}
