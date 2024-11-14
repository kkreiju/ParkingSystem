package Book;

public class Values {
    private String VehicleType;
    
    //Encapsulation for VehicleType so that it is accessible to SelectVehicle
    public String getVehicleType(){
        return VehicleType;
    }
    
    public void setVehicleType(String type){
        this.VehicleType = type;
    }
}
