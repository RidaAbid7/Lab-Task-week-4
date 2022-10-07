public class Department {
    String name;
    Employee HODName;
    Employee labIncharge;
    Lab labs[] = new Lab[30];

    public Department(String name, Employee HODName, Employee labIncharge, Lab labs[]){
        this.name = name;
        this.HODName = HODName;
        this.labIncharge = labIncharge;
        this.labs = labs;
    }

    //copy constructor
    public Department(Department dep){
        this.name = dep.name;
        this.HODName = dep.HODName;
        this.labIncharge = dep.labIncharge;
        this.labs = dep.labs;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setHODName(Employee HODName){
        this.HODName = HODName;
    }

    public Employee getHODName(){
        return HODName;
    }

    public void setLabIncharge(Employee labIncharge){
        this.labIncharge = labIncharge;
    }

    public Employee getLabIncharge(){
        return labIncharge;
    }

    public void setLabs(Lab labs[]){
        this.labs = labs;
    }

    public Lab[] getLabs(){
        return labs;
    }

    //toString function
    public String toString(){
        return String.format("\nHOD Name: %s\n", HODName);
    }

    //clone function
    public Object clone(){
        return new Department(this.name, this.HODName, this.labIncharge, this.labs);
    }

    //equals function to compare HOD Name
    public boolean equals(Object o){
        Department temp = (Department)o;
        boolean result = false;

        if(this.HODName == temp.HODName){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }
}
