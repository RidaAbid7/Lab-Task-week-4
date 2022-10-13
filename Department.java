public class Department {
    String name;
    Employee HODName;
    Employee labIncharge;
    Lab labs[] = new Lab[50];
    int numberOfLabs;
    int labCounter = 0;

    public Department(String name, Employee HODName, Employee labIncharge, Lab labs[], int numberOfLabs){
        this.name = name;
        this.HODName = HODName;
        this.labIncharge = labIncharge;
        this.labs = labs;
        this.numberOfLabs = numberOfLabs;
    }

    public Department(){

    }

    //copy constructor
    public Department(Department dep){
        this.name = dep.name;
        this.HODName = dep.HODName;
        this.labIncharge = dep.labIncharge;
        this.labs = dep.labs;
        this.numberOfLabs = dep.numberOfLabs;
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

    public void setNumberOfLabs(int numberOfLabs){
        this.numberOfLabs = numberOfLabs;
    }

    public int getumberOfLabs(){
        return numberOfLabs;
    }

    public int getLabCounter() {
        return labCounter;
    }

    public void setLabCounter(int labCounter) {
        this.labCounter = labCounter;
    }

    //toString function
    //Employee labIncharge, Lab labs[], int numberOfLabs
    public String toString(){
        return String.format("\nName: %s\n\nNumber of Labs: %d", this.name, this.numberOfLabs);
    }

    //clone function
    public Object clone(){
        return new Department(this.name, this.HODName, this.labIncharge, this.labs, this.numberOfLabs);
    }

    //equals function to compare Department name, HOD Name and lab incharge
    public boolean equals(Object o){
        Department temp = (Department)o;
        boolean result = false;

        if(this.name == temp.name && this.HODName.equals(temp.HODName) && this.labIncharge.equals(temp.labIncharge)){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }
}
