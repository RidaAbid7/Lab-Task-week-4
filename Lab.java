public class Lab {
    String name;
    Employee labAttendant;
    PC computers[] = new PC[50];
    int numberOfComp;
    int pcCounter = 0;

    public Lab(String name, Employee labAttendant, PC[] computers, int numberOfComp){
        this.name = name;
        this.labAttendant = labAttendant;
        this.computers = computers;
        this.numberOfComp = numberOfComp;
    }

    public Lab(){

    }

    //copy constructor
    public Lab(Lab lab){
        this.name = lab.name;
        this.labAttendant = lab.labAttendant;
        this.computers = lab.computers;
        this.numberOfComp = lab.numberOfComp;
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

    public void setNumberOfComputers(int numberOfComp){
        this.numberOfComp = numberOfComp;
    }

    public int getNumberOfComputers(){
        return numberOfComp;
    }

    public int getPcCounter() {
        return pcCounter;
    }

    public void setPcCounter(int pcCounter) {
        this.pcCounter = pcCounter;
    }

    //toString 
    public String toString(){
        return String.format("Lab Name: %s\n\nNumber of Computers: %d", this.name, this.numberOfComp) + labAttendant.toString();
    }

    //clone function
    public Object clone(){
        return new Lab(this.name, this.labAttendant, this.computers, this.numberOfComp);
    }

    //equals function to compare Department name and Lab Attendant's data
    public boolean equals(Object o){
        Lab temp = (Lab)o;
        boolean result = false;

        if(this.name == temp.name && this.labAttendant.equals(temp.labAttendant)){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }
}
