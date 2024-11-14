package ParkingLot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BookedData {
    private ArrayList<String> status = new ArrayList<>();
    private ArrayList<String> vehicletype = new ArrayList();
    
    //Encapsulation for Space so that it is accessible to Garages 1 and 2
    public String getStatus(int index){
        if (index >= 0 && index < status.size()) {
            return status.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid space index");
        }
    }
    
    // Checks Spaces if Booked
    public boolean checkSpace(int index){
        if(status.get(index).equals("Booked"))
            return true;
        else
            return false;
    }
    
    // Checks Vehicle Type
    public String vehicleType(int index){
        if(vehicletype.get(index).equals("Car"))
            return "Car";
        else
            return "Motorcycle";
    }
    
    // Retrieves GarageData
    public void RetrieveData(){
        String filePath = System.getProperty("user.dir") + "/src/Data/GarageData.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Creates for loop with static values because 20 is given already
            // Unless if you want to mess your system up.
            for(int i = 0; i <= 46; i++){
                line = br.readLine();
                //Disregards other line of the txt file
                if(i >= 2 && i < 22)
                    status.add(line);
                else if(i >= 25 && i < 45){
                    vehicletype.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
