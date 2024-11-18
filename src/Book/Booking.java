package Book;
import ParkingLot.BookedData;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneOffset;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
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

    public Booking() {
        setUndecorated(true);
        initComponents();
        date.setText(ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spaceNumber = new javax.swing.JComboBox<>();
        toMinute = new javax.swing.JTextField();
        toHour = new javax.swing.JTextField();
        fromMinute = new javax.swing.JTextField();
        fromHour = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        toComboBox = new javax.swing.JComboBox<>();
        fromComboBox = new javax.swing.JComboBox<>();
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

        toMinute.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        toMinute.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toMinute.setText("59");
        toMinute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        toMinute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toMinuteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toMinuteKeyTyped(evt);
            }
        });
        getContentPane().add(toMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 295, 30, -1));

        toHour.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        toHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        toHour.setText("11");
        toHour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        toHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                toHourKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                toHourKeyTyped(evt);
            }
        });
        getContentPane().add(toHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 295, 30, -1));

        fromMinute.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        fromMinute.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromMinute.setText("00");
        fromMinute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fromMinute.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromMinuteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fromMinuteKeyTyped(evt);
            }
        });
        getContentPane().add(fromMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 255, 30, -1));

        fromHour.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        fromHour.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fromHour.setText("12");
        fromHour.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fromHour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fromHourKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fromHourKeyTyped(evt);
            }
        });
        getContentPane().add(fromHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 255, 30, -1));

        name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        name.setBorder(null);
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 200, -1));

        toComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        toComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(toComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 295, -1, -1));

        fromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));
        fromComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fromComboBoxItemStateChanged(evt);
            }
        });
        getContentPane().add(fromComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 255, -1, -1));

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

    private void fromHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromHourKeyTyped
        timeTextFieldValidation(evt, fromHour);
        price(vehicleType.getText());
    }//GEN-LAST:event_fromHourKeyTyped

    private void fromMinuteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromMinuteKeyTyped
        timeTextFieldValidation(evt, fromMinute);
        price(vehicleType.getText());
    }//GEN-LAST:event_fromMinuteKeyTyped

    private void toHourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toHourKeyTyped
        timeTextFieldValidation(evt, toHour);
        price(vehicleType.getText());
    }//GEN-LAST:event_toHourKeyTyped

    private void toMinuteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toMinuteKeyTyped
        timeTextFieldValidation(evt, toMinute);
        price(vehicleType.getText());
    }//GEN-LAST:event_toMinuteKeyTyped

    private void fromHourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromHourKeyPressed
        timeTextFieldKeyControl(evt, fromHour);
        price(vehicleType.getText());
    }//GEN-LAST:event_fromHourKeyPressed

    private void toHourKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toHourKeyPressed
        timeTextFieldKeyControl(evt, toHour);
        price(vehicleType.getText());
    }//GEN-LAST:event_toHourKeyPressed

    private void fromMinuteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromMinuteKeyPressed
        timeTextFieldKeyControl(evt, fromMinute);
        price(vehicleType.getText());
    }//GEN-LAST:event_fromMinuteKeyPressed

    private void toMinuteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toMinuteKeyPressed
        timeTextFieldKeyControl(evt, toMinute);
        price(vehicleType.getText());
    }//GEN-LAST:event_toMinuteKeyPressed

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        float starthour = Float.parseFloat(fromHour.getText());
        float startminute = Float.parseFloat(fromMinute.getText()) * 0.01f; // Convert minutes to decimals
        float endhour = Float.parseFloat(toHour.getText());
        float endminute = Float.parseFloat(toMinute.getText()) * 0.01f; // Convert minutes to decimals
        
        // Retrive Current Time
        BookedData bd = new BookedData();
        float currenthour = Float.parseFloat(bd.RetrieveDateTime("Time").split(":")[0]);
        float currentminute = Float.parseFloat(bd.RetrieveDateTime("Time").split(":")[1]) * 0.01f; // Convert minutes to decimals
        float currenttime = currenthour + currentminute;
        
        // Checks name is valid
        if(!name.getText().trim().isEmpty()){
            customername = name.getText();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please enter a valid name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Checks time if valid
        float start = starthour + startminute;
        float end = endhour + endminute;

        // Convertion of AM/PM to Float which adds 12 to make it as 24HR format
        if(fromComboBox.getSelectedIndex() == 1)
            start += 12;
        if(toComboBox.getSelectedIndex() == 1)
            end += 12;
        // Checks time is 12 AM
        if(fromComboBox.getSelectedIndex() == 0 && starthour == 12)
            start = 0.00f + startminute;
        
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
        this.start = fromHour.getText() + ":" + fromMinute.getText() + " " + fromComboBox.getSelectedItem().toString();
        this.end = toHour.getText() + ":" + toMinute.getText() + " " + toComboBox.getSelectedItem().toString();

        // Checks if space is valid
        String space = spaceNumber.getSelectedItem().toString();
        this.spacenumber = Integer.parseInt(space.split(" ")[1]);
        
        // Checks Vehicle Type
        this.vehicletype = vehicleType.getText();

        // Initialize GarageData.txt as array
        File file = new File(System.getProperty("user.dir") + "/src/Data/GarageData.txt");
        
        /*
            WILL CHANGE THE LOGIC TO:
        
            Initialize Data/ParkingHistory.txt as array
            Read Information: Date, From, To, Space Number, and In the Space
            Read Space Number and verify if someone is in the Space
            
            IF SOMEONE IS NOT IN THE SPACE (FREE): (this is to double check if someone is booking for a time)
            Must Match The Date or else disregard
            Must not overlap From and To
            
            ELSE:
            Confirm Booking (code below)
        */

        // Check if space is available when line is read as "Free"
        // If available, write to GarageData.txt as "Booked"
        boolean spaceAvailable = false;
        int targetLine = spacenumber;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            // currentLine is based on .txt file length
            for(int currentLine = 0; currentLine < 46; currentLine++){
                line = reader.readLine();
                if(currentLine == targetLine + 1 && line.trim().equals("Free")){
                    spaceAvailable = true;
                    JOptionPane.showMessageDialog(this, "Please proceed to payment for the confirmation of booking.", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Else, prompt user that space is not available
        if (spaceAvailable) {
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
            JOptionPane.showMessageDialog(this, "Space " + targetLine + " is not available");
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

    // User Defined Functions
    
    // Error Trap Inputs
    
    private void timeTextFieldKeyControl(KeyEvent evt, JTextField textfield){
        try{
            int textfieldReader = Integer.parseInt(textfield.getText());
            
            // Down Button is pressed
            if (evt.getKeyCode() == KeyEvent.VK_DOWN){
                if((textfield == fromHour || textfield == toHour) && textfieldReader > 1)
                    textfield.setText(String.valueOf(--textfieldReader));
                
                if((textfield == fromMinute || textfield == toMinute) && textfieldReader > 0)
                    textfield.setText(String.valueOf(--textfieldReader));
            }
            // Up Button is pressed
            else if(evt.getKeyCode() == KeyEvent.VK_UP){
                if((textfield == fromHour || textfield == toHour) && textfieldReader < 12){
                    textfield.setText(String.valueOf(++textfieldReader));
                }
                
                if((textfield == fromMinute || textfield == toMinute) && textfieldReader < 59)
                    textfield.setText(String.valueOf(++textfieldReader));
                    
                // Not to exceed 11:59PM
                if(textfield == toHour && textfieldReader == 12 && toComboBox.getSelectedItem().toString() == "AM"){
                    toComboBox.setSelectedIndex(1);
                }
            }
        }
        catch(NumberFormatException e){
            System.out.println("Number Format Exception");
        }
    }
    
    private void timeTextFieldValidation(KeyEvent evt, JTextField textfield){
        // Retrieves the responsible textfield for character count

        char keyChar = evt.getKeyChar();
        boolean isDigit = Character.isDigit(keyChar);
        int characterCount = textfield.getText().length();

        if (!isDigit || characterCount >= 2) 
            evt.consume();


        // Reads textfield from their specific limits
        try {
            int textfieldReader = Integer.parseInt(textfield.getText() + evt.getKeyChar());
            
            if (characterCount > 0) {
                if (textfield == fromMinute || textfield == toMinute)
                    if (textfieldReader < 0 || textfieldReader > 59){
                        textfield.setText("00");
                        evt.consume();
                    }
                
                if (textfield == fromHour)
                    if (textfieldReader < 1 || textfieldReader > 12){
                        textfield.setText("01");
                        evt.consume();
                    }
                
                if (textfield == toHour)
                    if (textfieldReader < 1 || textfieldReader > 11){
                        textfield.setText("01");
                        evt.consume();
                    } 
            }
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }
    
    public void price(String vehicletype){
        int perhour;
        float starthour = Float.parseFloat(fromHour.getText());
        float startminute = Float.parseFloat(fromMinute.getText()) * 0.01f; // Convert minutes to decimals
        float endhour = Float.parseFloat(toHour.getText());
        float endminute = Float.parseFloat(toMinute.getText()) * 0.01f; // Convert minutes to decimals
        
        if(vehicletype.equals("Car"))
            perhour = carFeePerHour;
        else
            perhour = motorFeePerHour;
        
        // Checks time if valid
        float start = starthour + startminute;
        float end = endhour + endminute;
        if(fromComboBox.getSelectedIndex() == 1)
            start += 12;
        if(toComboBox.getSelectedIndex() == 1)
            end += 12;
        // Checks time is 12 AM
        if(fromComboBox.getSelectedIndex() == 0 && starthour == 12)
            start = 0.00f + startminute;
        
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
        
        System.out.println("START: " + (int) start);
        System.out.println("END: " + (int) end);
        System.out.println("FORMULA: " + ((int) end - (int) start));
        System.out.println("PER HOUR: " + perhour +"\n");
        total.setText(price + ".00 PHP");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel confirm;
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> fromComboBox;
    private javax.swing.JTextField fromHour;
    private javax.swing.JTextField fromMinute;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> spaceNumber;
    private javax.swing.JComboBox<String> toComboBox;
    private javax.swing.JTextField toHour;
    private javax.swing.JTextField toMinute;
    public javax.swing.JLabel total;
    public javax.swing.JLabel vehicleType;
    // End of variables declaration//GEN-END:variables
}
