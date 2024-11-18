package ParkingLot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
