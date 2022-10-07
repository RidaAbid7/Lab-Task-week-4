public class Lab {
    String name;
    Employee labAttendant;
    PC computers[] = new PC[50];

    public Lab(String name, Employee labAttendant, PC[] computers){
        this.name = name;
        this.labAttendant = labAttendant;
        this.computers = computers;
    }

    //copy constructor
    public Lab(Lab lab){
        this.name = lab.name;
        this.labAttendant = lab.labAttendant;
        this.computers = lab.computers;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLabAttendant(Employee labAttendant){
        this.labAttendant = labAttendant;
    }

    public Employee getLabAttendant(){
        return labAttendant;
    }

    public void setComputers(PC computers[]){
        this.computers = computers;
    }

    public PC[] getComputers(){
        return computers;
    }
    //toString 
    public String toString(){
        return String.format("Lab Name: %s", name);
    }

    //clone function
    public Object clone(){
        return new Lab(this.name, this.labAttendant, this.computers);
    }

    //equals function to compare Department name 
    public boolean equals(Object o){
        Lab temp = (Lab)o;
        boolean result = false;

        if(this.name == temp.name){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }
}
