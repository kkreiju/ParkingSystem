package ParkingLot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BookedData {
    private ArrayList<String> status = new ArrayList<>();
    private ArrayList<String> vehicletype = new ArrayList();

    // Checks Spaces if Booked
    public boolean checkSpace(int index){
        if(status.get(index).equals("Parked"))
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
        // Instantiate arraylist 
        for(int i = 0 ; i < 20; i++){
            status.add("Free");
            vehicletype.add("Free");
        }
        
        String historyFilePath = System.getProperty("user.dir") + "/src/Data/ParkingHistory.txt";
        
        // Read all data from parking history
        try (BufferedReader br = new BufferedReader(new FileReader(historyFilePath))) {
            String line;
            String historySpaceNumber = null, historyVehicleType = null;
            boolean vehicleParkedInSpace = false, left = false;
            int spacenumber = 0;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Space Number:")) {
                    historySpaceNumber = line.split(":")[1].trim();
                    spacenumber = Integer.parseInt(historySpaceNumber);
                } else if (line.startsWith("In the Space:")) {
                    if(line.split(":")[1].trim().equals("true"))
                        vehicleParkedInSpace = true;
                    else
                        vehicleParkedInSpace = false;
                }
                else if(line.startsWith("Vehicle Type: ")){
                    historyVehicleType = line.split(":")[1].trim();
                }
                else if(line.startsWith("Left Early: ")){
                    if(line.split(":")[1].trim().equals("true"))
                        left = true;
                    else
                        left = false;
                    
                    if(vehicleParkedInSpace && !left){
                        status.set(spacenumber - 1, "Parked");
                        vehicletype.set(spacenumber - 1, historyVehicleType);
                        vehicleParkedInSpace = false;
                    }
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    // Retrieve Date and Time
    public String RetrieveDateTime(String option){
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        // Define the format
        DateTimeFormatter formatter;
        // Format the current date and time
        String formattedDateTime;
        
        if(option == "Both")
            formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
        else if(option == "Date")
            formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        else
            formatter = DateTimeFormatter.ofPattern("HH:mm");
        formattedDateTime = now.format(formatter);
        return (formattedDateTime);
    }
}
