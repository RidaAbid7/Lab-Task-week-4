public class PC {
    String assetID;
    String name;
    String LCDName;
    int RamSizeinMB;
    int DiskSizeinGB;

    //constructor
    public PC(String assetID, String name, String LCDName, int RamSizeinMB, int DiskSizeinGB){
        this.assetID = assetID;
        this.name = name;
        this.LCDName =LCDName;
        this.RamSizeinMB = RamSizeinMB;
        this.DiskSizeinGB = DiskSizeinGB;
    }

    //copy constructor
    public PC(PC pc){
        this.assetID = pc.assetID;
        this.name = pc.name;
        this.LCDName = pc.LCDName;
        this.RamSizeinMB = pc.RamSizeinMB;
        this.DiskSizeinGB = pc.DiskSizeinGB;
    }

    public void setAssetID(String assetID){
        this.assetID =assetID;
    }

    public String getAssetID(){
        return assetID;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLCDName(String LCDName){
        this.LCDName =LCDName;
    }

    public String getLCDName(){
        return LCDName;
    }

    public void RAMSizeinMB(int RAMSizeinMB){
        this.RamSizeinMB = RAMSizeinMB;
    }

    public int getRAMSizeinMB(){
        return RamSizeinMB;
    }

    public void setDiskSizeinGB(int DiskSizeinGB){
        this.DiskSizeinGB = DiskSizeinGB;
    }

    public int getDiskSizeinGB(){
        return DiskSizeinGB;
    }

    //toString function
    public String toString(){
        return String.format("\n\nAssetID: %s\nName: %s\nLCDName: %s\nRAM Size in MB: %d\nDisk Size in GB:%d", assetID, name, LCDName, RamSizeinMB, DiskSizeinGB);
    }
    
    //clone function
    public Object clone(){
        return new PC(this.assetID, this.name, this.LCDName, this.RamSizeinMB, this.DiskSizeinGB);
    }

    //equals function to compare assetID
    public boolean equals(Object o){
        PC temp = (PC)o;
        boolean result = false;
        
        if(this.assetID == temp.assetID){
            result = true;
        }
        else{
            result = false;
        }

        return result;
    }


}
