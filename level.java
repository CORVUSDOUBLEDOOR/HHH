package Hade_Healing_Hospital_HHH;
public class level {
    public String Level;
    public void setLevel(String town){
        if(town.equals("CountrySide")){
            Level = "Slave";
        }else{
            Level = "VVIP";
        }
    }
    public String getLevel() {
        return Level;
    }
}
