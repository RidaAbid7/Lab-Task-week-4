import java.util.Scanner;

public class Functions {

    Department department;
    //for String input
    Scanner input1 = new Scanner(System.in);
    //for other inputs
    Scanner input2 = new Scanner(System.in);

    public Functions(Department department){
        this.department = department;
    }

    //String name, Employee HODName, Employee labIncharge, Lab labs[], int numberOfLabs
    public Department newDepartment(){
        System.out.println("Enter name of the Department: ");
        String name = input1.nextLine();
        System.out.println("Enter HOD's name: ");
        String emp1Name = input1.nextLine();
        System.out.println("Enter HOD's ID: ");
        String id1 = input1.nextLine();
        System.out.println("Enter HOD's Designation: ");
        String des1 = input1.nextLine();
        System.out.println("Enter Lab Incharge's name: ");
        String emp2Name = input1.nextLine();
        System.out.println("Enter Lab Incharge's ID: ");
        String id2 = input1.nextLine();
        System.out.println("Enter Lab Incharge's Designation: ");
        String des2 = input1.nextLine();
        Lab lab[] = new Lab[50];
        System.out.println("Enter the number of labs you want to add");
        int num = input2.nextInt();

        return new Department(name, new Employee(emp1Name, id1, des1), new Employee(emp2Name, id2, des2), lab, num);
    }

    public void viewDepartment(){
        System.out.println(department.toString());

    }

    //String name, Employee labAttendant, PC[] computers, int numberOfComp
    public Lab newLab(){
        System.out.println("Enter name of the Lab you want to create: ");
        String name = input1.nextLine();
        System.out.println("Enter Lab Attendant's name: ");
        String empName = input1.nextLine();
        System.out.println("Enter Lab Attendant's ID: ");
        String id = input1.nextLine();
        System.out.println("Enter Lab Attendant's Designation: ");
        String des = input1.nextLine();
        PC pc[] = new PC[50];
        System.out.println("Enter the number of computers you want to add");
        int num = input2.nextInt();

        return new Lab(name, new Employee(empName, id, des), pc, num);
    }

    public Lab searchLab(String name){
        Lab lab1 = new Lab();
        for(Lab lab : department.getLabs()){
            if(lab.getName().equals(name)){
                lab1 = lab;
                break;
            }
        }

        return lab1;
    }

    public void deleteLab(){
    

    }

    public void viewAllLabs(){
        for(Lab lab : department.getLabs()){
            if(lab != null){
            System.out.println(lab.toString());
            }
            else{
                break;
            }
        }
    }

    public PC newComputer(){
        System.out.println("Enter Asset ID: ");
        String assetID = input1.nextLine();
        System.out.println("Enter LCD Name: ");
        String LCDName = input1.nextLine();
        System.out.println("Enter LCD Name: ");
        int RamSizeinMB = input2.nextInt();
        System.out.println("Enter Disk Size in GB: ");
        int DiskSizeinGB = input2.nextInt();

        return new PC(assetID, LCDName, RamSizeinMB, DiskSizeinGB);
    }

    public PC searchComputer(){
        System.out.println("Enter lab whose computer you want to see: ");
        String name = input1.nextLine();
        Lab lab = searchLab(name);
        PC pc1 = new PC();
        System.out.println("Enter asset ID of computer you want to see: ");
        String assetID = input1.nextLine();
        for(PC pc : lab.getComputers()){
            if(pc.getAssetID().equals(assetID)){
                pc1 = pc;
                break;
            }
        }
        return pc1;
    }

    public void deleteComputer(){

    }

    public void viewAllComputers(){
        System.out.println("Enter lab name which you want to see: ");
        String name = input1.nextLine();
        Lab temp = searchLab(name);
        for(PC pc : temp.getComputers()){
            if(pc == null){
                break;
            }
            else{
                System.out.println(pc.toString());
            }
        }


    }
}
