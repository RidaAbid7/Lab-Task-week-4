public class Employee{
    private String name;
    private String ID;
    private String designation;

    public Employee(String name, String ID, String designation){
        this.name = name;
        this.ID = ID;
        this.designation = designation;
    }

    //copy constructor
    public Employee(Employee employee){
        this.name = employee.name;
        this.ID = employee.ID;
        this.designation = employee.designation;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setID(String ID){
        this.ID = ID;
    }

    public String getID(){
        return ID;
    }

    public void setDesignation(String designation){
        this.designation = designation;
    }

    public String getDesgination(){
        return designation;
    }

    //toString function
    public String toString(){
        return String.format("\nEmployee Name: %s\nEmployee ID: %s\nEmployee Designation: %s", this.name, this.ID, this.designation);
    }

    //clone function
    public Object clone(){
        return new Employee(this.name, this.ID, this.designation);
    }
    
    //equals function to compare all attributes of Emplou=yee class
    public boolean equals(Object o){
        Employee temp = (Employee)o;
        boolean result = false;
        if(this.name == temp.name && this.ID == temp.ID && this.designation == temp.designation){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}