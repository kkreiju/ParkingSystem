package Book;
import ParkingLot.BookedData;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneOffset;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

public class Booking extends javax.swing.JFrame {
    
    // Make variables accessible to BookingPayment thru calling BookingPayment object in Confirm
    private String customername;
    private int spacenumber;
    private String vehicletype;
    private String start;
    private String end;
    
    // Adjust Price
    int carFeePerHour = 20;
    int motorFeePerHour = 10;
    
    // Retrive Current Time
    BookedData bd = new BookedData();
    float currenthour = Float.parseFloat(bd.RetrieveDateTime("Time").split(":")[0]);
    float currentminute = Float.parseFloat(bd.RetrieveDateTime("Time").split(":")[1]) * 0.01f; // Convert minutes to decimals
    float currenttime = currenthour + currentminute;
    String currentdate = bd.RetrieveDateTime("Date");
    
    // Initialize Booking Times
    float starthour;
    float startminute; 
    float endhour;
    float endminute; 
    
    // Function Call for Booking Time
    
    public void initializeBookingTimeValue(){
        this.starthour = Float.parseFloat(fromHourComboBox.getSelectedItem().toString());
        this.startminute = Float.parseFloat(fromMinuteComboBox.getSelectedItem().toString()) * 0.01f; // Convert minutes to decimals
        this.endhour = Float.parseFloat(toHourComboBox.getSelectedItem().toString());
        this.endminute = Float.parseFloat(toMinuteComboBox.getSelectedItem().toString()) * 0.01f; // Convert minutes to decimals
    }

    public Booking() {
        setUndecorated(true);
        initComponents();
        date.setText(ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        
        // Set the icon for the frame
        setIconImage(new ImageIcon(System.getProperty("user.dir") + "/resources/logo.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spaceNumber = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        toComboBox = new javax.swing.JComboBox<>();
        fromComboBox = new javax.swing.JComboBox<>();
        toMinuteComboBox = new javax.swing.JComboBox<>();
        toHourComboBox = new javax.swing.JComboBox<>();
        fromMinuteComboBox = new javax.swing.JComboBox<>();
        fromHourComboBox = new javax.swing.JComboBox<>();
        total = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        vehicleType = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        confirm = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spaceNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Space 1", "Space 2", "Space 3", "Space 4", "Space 5", "Space 6", "Space 7", "Space 8", "Space 9", "Space 10", "Space 11", "Space 12", "Space 13", "Space 14", "Space 15", "Space 16", "Space 17", "Space 18", "Space 19", "Space 20" }));
        getContentPane().add(spaceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));

        name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        name.setBorder(null);
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        toComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        toComboBox.setSelectedIndex(1);
        toComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(toComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 295, -1, -1));

        fromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        fromComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fromComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(fromComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 255, -1, -1));

        toMinuteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        toMinuteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toMinuteComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(toMinuteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 295, 50, -1));

        toHourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        toHourComboBox.setSelectedIndex(11);
        toHourComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toHourComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(toHourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 295, 50, -1));

        fromMinuteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        fromMinuteComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fromMinuteComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(fromMinuteComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 255, 50, -1));

        fromHourComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        fromHourComboBox.setSelectedIndex(11);
        fromHourComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fromHourComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(fromHourComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 255, 50, -1));

        total.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 150, 30));

        date.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 215, 150, 30));

        vehicleType.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(vehicleType, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, 150, 30));

        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 150, 40));

        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 150, 40));

        back.setPreferredSize(new java.awt.Dimension(47, 47));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        SelectVehicle sv = new SelectVehicle();
        sv.setLocationRelativeTo(null);
        sv.setResizable(false);
        sv.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        // Error traps numbers from entering
        // Limits character count to 20
        char keyChar = evt.getKeyChar();
        boolean isDigit = Character.isDigit(keyChar);
        int characterCount = name.getText().length();
        
        if(isDigit || characterCount >= 30)
            evt.consume();
    }//GEN-LAST:event_nameKeyTyped

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        initializeBookingTimeValue();
        
        // Checks name is valid
        if(!name.getText().trim().isEmpty()){
            customername = name.getText();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter a valid name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Checks time if valid
        float start = this.starthour + this.startminute;
        float end = this.endhour + this.endminute;

        // Convertion of AM/PM to Float which adds 12 to make it as 24HR format
        if(fromComboBox.getSelectedIndex() == 1)
            start += 12;
        if(toComboBox.getSelectedIndex() == 1)
            end += 12;
        // Checks time is 12 AM
        if(fromComboBox.getSelectedIndex() == 0 && this.starthour == 12)
            start = 0.00f + this.startminute;
        
        // If end time is midnight
        if(!(start >= 0 && end < 1) && end >= 0 && end < 1){
            JOptionPane.showMessageDialog(this, "Not a valid time, you cannot park overnight", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // If end time is less than start time
        if(end < start){
            JOptionPane.showMessageDialog(this, "Not a valid time", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // If start time and end time is the same
        if(end == start){
            JOptionPane.showMessageDialog(this, "Not a valid time, you cannot park for a second.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // If time has passed
        else if(start < currenttime){
            JOptionPane.showMessageDialog(this, "Not a valid time, time has passed.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Changes value of start and end for BookingPayment UI
        this.start = fromHourComboBox.getSelectedItem().toString() + ":" + fromMinuteComboBox.getSelectedItem().toString() + " " + fromComboBox.getSelectedItem().toString();
        this.end = toHourComboBox.getSelectedItem().toString() + ":" + toMinuteComboBox.getSelectedItem().toString() + " " + toComboBox.getSelectedItem().toString();

        // Checks if space is valid
        String space = spaceNumber.getSelectedItem().toString();
        this.spacenumber = Integer.parseInt(space.split(" ")[1]);
        
        // Checks Vehicle Type
        this.vehicletype = vehicleType.getText();
        
        // Make all values null to initialize in conditional statements where they cannot access the value
        String historyDate = null;
        String historyStartTime = null;
        String historyEndTime = null;
        String historySpaceNumber = null;
        String historyParked = null;
        
        boolean spaceAvailable = true;
        String historyFilePath = System.getProperty("user.dir") + "/src/Data/ParkingHistory.txt";
        
        // Read all data from parking history
        try (BufferedReader br = new BufferedReader(new FileReader(historyFilePath))) {
            String line;
            boolean vehicleParkedinSpace = false;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Date: ")) {
                    historyDate = line.split(":")[1].trim();
                } else if (line.startsWith("From: ")) {
                    historyStartTime = line.split(":")[1].trim() + ":" + line.split(":")[2].trim();
                }
                else if (line.startsWith("To: ")) {
                    historyEndTime = line.split(":")[1].trim() + ":" + line.split(":")[2].trim();
                }
                else if(line.startsWith("Space Number: ")){
                    historySpaceNumber = line.split(":")[1].trim();
                }
                else if(line.startsWith("In the Space: ")){
                    historyParked = line.split(":")[1].trim();
                    vehicleParkedinSpace = checkHistory(historyDate, historyStartTime, historyEndTime, historySpaceNumber, historyParked);
                    
                    if(vehicleParkedinSpace){
                        spaceAvailable = false;
                        break;
                    }
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        // Else, prompt user that space is not available
        if (spaceAvailable) {
            JOptionPane.showMessageDialog(this, "Please proceed to payment for the confirmation of booking.", "Success", JOptionPane.INFORMATION_MESSAGE);

            BookingPayment bp = new BookingPayment();
            
            //Initialize Datas from this class
            bp.name.setText(customername);
            bp.starttime.setText(this.start);
            bp.endtime.setText(this.end);
            bp.spacenumber.setText(String.valueOf(this.spacenumber));
            bp.vehicletype.setText(this.vehicleType.getText());
            bp.total.setText(this.total.getText());
            
            bp.setLocationRelativeTo(null);
            bp.setResizable(false);
            bp.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Space " + this.spacenumber + " is not available");
        }
    }//GEN-LAST:event_confirmMouseClicked

    private void fromComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fromComboBoxItemStateChanged
         if (evt.getStateChange() == evt.SELECTED)
             price(vehicleType.getText());
    }//GEN-LAST:event_fromComboBoxItemStateChanged

    private void toComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toComboBoxItemStateChanged
        if (evt.getStateChange() == evt.SELECTED)
             price(vehicleType.getText());
    }//GEN-LAST:event_toComboBoxItemStateChanged

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        int response = JOptionPane.showConfirmDialog(
            this, 
            "Do you want to cancel booking?", 
            "Warning", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE
        );

        if (response == JOptionPane.YES_OPTION) {
            SelectVehicle sv = new SelectVehicle();
            sv.setLocationRelativeTo(null);
            sv.setResizable(false);
            sv.setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_cancelMouseClicked

    private void fromMinuteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fromMinuteComboBoxItemStateChanged
        if (evt.getStateChange() == evt.SELECTED)
             price(vehicleType.getText());
    }//GEN-LAST:event_fromMinuteComboBoxItemStateChanged

    private void fromHourComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fromHourComboBoxItemStateChanged
        if (evt.getStateChange() == evt.SELECTED)
             price(vehicleType.getText());
    }//GEN-LAST:event_fromHourComboBoxItemStateChanged

    private void toHourComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toHourComboBoxItemStateChanged
        if (evt.getStateChange() == evt.SELECTED)
             price(vehicleType.getText());
    }//GEN-LAST:event_toHourComboBoxItemStateChanged

    private void toMinuteComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toMinuteComboBoxItemStateChanged
        if (evt.getStateChange() == evt.SELECTED)
             price(vehicleType.getText());
    }//GEN-LAST:event_toMinuteComboBoxItemStateChanged

    // User Defined Functions
    
    public void price(String vehicletype){
        int perhour;
        initializeBookingTimeValue();
        
        if(vehicletype.equals("Car"))
            perhour = carFeePerHour;
        else
            perhour = motorFeePerHour;
        
        // Checks time if valid
        float start = this.starthour + this.startminute;
        float end = this.endhour + this.endminute;
        if(fromComboBox.getSelectedIndex() == 1 && !(start >= 12 && start < 13)) // Checks time if is not 12PM
            start += 12;
        if(toComboBox.getSelectedIndex() == 1)
            end += 12;
        // Checks time is 12 AM
        if(fromComboBox.getSelectedIndex() == 0 && this.starthour == 12)
            start = 0.00f + this.startminute;
        if(toComboBox.getSelectedIndex() == 0 && this.endhour == 12)
            end = 0.00f + this.startminute;
        
        if(end < start){
            JOptionPane.showMessageDialog(this, "Not a valid time", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // If End Time is 12 PM
        if((int) end == 24)
            end = 12;
        
        // Standard per hour formula
        int price = ((int) end - (int) start) * perhour;
        
        // Minute long parking is equivalent to minimum per hour price
        if((int) end - (int) start == 0)
            price = perhour;
        
        // TESTING PURPOSES
//        System.out.println("START: " + (int) start);
//        System.out.println("END: " + (int) end);
//        System.out.println("FORMULA: " + ((int) end - (int) start));
//        System.out.println("PER HOUR: " + perhour +"\n");

        total.setText(price + ".00 PHP");
    }
    
    private boolean checkHistory(String date, String startTime, String endTime, String spaceNumber, String parked){
        int historySpaceNumber = Integer.parseInt(spaceNumber);
        initializeBookingTimeValue();
        float historyStartTime = twentyFourHourFormat(startTime);
        float historyEndTime = twentyFourHourFormat(endTime);
        
        // Checks time if valid
        float bookingStartTime = this.starthour + this.startminute;
        float bookingEndTime = this.endhour + this.endminute;
        if(fromComboBox.getSelectedIndex() == 1 && !(bookingStartTime >= 12 && bookingStartTime < 13)) // Checks time if is not 12PM
            bookingStartTime += 12;
        if(toComboBox.getSelectedIndex() == 1)
            bookingEndTime += 12;
        // Checks time is 12 AM
        if(fromComboBox.getSelectedIndex() == 0 && this.starthour == 12)
            bookingStartTime = 0.00f + this.startminute;
        
        if(historySpaceNumber == spacenumber 
                && date.equals(currentdate)
                && historyStartTime < bookingEndTime && historyEndTime > bookingStartTime // Making sure there is no conflict with time
                && parked.equals("true")){
            System.out.println("CHECK HISTORY TRUE");
            return true;
        }
        else{
            return false;
        }
    }
    
    public float twentyFourHourFormat(String twelveHourFormat){
        String hour = twelveHourFormat.split(":")[0].trim();
        String minute = twelveHourFormat.split(":")[1].split(" ")[0].trim();
        String amPm = twelveHourFormat.split(" ")[1].trim();
        float time = Float.parseFloat(hour);
        
        if(amPm.equals("PM") && time == 12){
            time = 12;
        }
        else if(amPm.equals("PM") && time != 12){
            time += 12;
        }

        time += Float.parseFloat(minute) * 0.01f;
        
        return time;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel confirm;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> fromComboBox;
    private javax.swing.JComboBox<String> fromHourComboBox;
    private javax.swing.JComboBox<String> fromMinuteComboBox;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> spaceNumber;
    private javax.swing.JComboBox<String> toComboBox;
    private javax.swing.JComboBox<String> toHourComboBox;
    private javax.swing.JComboBox<String> toMinuteComboBox;
    public javax.swing.JLabel total;
    public javax.swing.JLabel vehicleType;
    // End of variables declaration//GEN-END:variables
}
