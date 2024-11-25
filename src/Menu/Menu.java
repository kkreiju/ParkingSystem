package Menu;
import Book.Booking;
import ParkingLot.Garage1;
import ParkingLot.BookedData;
import Book.SelectVehicle;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.*;
import java.util.*;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    BookedData bd = new BookedData();
    Booking b = new Booking();
    String currentdate = bd.RetrieveDateTime("Date");
    float currenttime = Float.parseFloat(bd.RetrieveDateTime("Time").split(":")[0].trim()) 
            + (Float.parseFloat(bd.RetrieveDateTime("Time").split(":")[1].trim()) * 0.01f);
    
    public Menu() {
        setUndecorated(true);
        initComponents();
        
        /*
            Initialize Data/ParkingHistory.txt as array
            Check Parking Dates
            Disregard any Date that is not the current date
            Read Information: Date, From, To, Space Number, and In the Space
        
            IF DATABASE TIME(From, To) IS IN LINE WITH CURRENT TIME:
            Mark In the Space as true (this is to ensure that in booking, you cannot book the space)
            ELSE:
            Mark In the Space as false (this is to ensure that it is an updated booking)
        */
        
        String historyFilePath = System.getProperty("user.dir") + "/src/Data/ParkingHistory.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(historyFilePath))) {
            List<String> fileLines = new ArrayList<>();
            String line;
            String historyDate = null, historyStartTime = null, historyEndTime = null, historySpaceNumber = null;
            boolean vehicleParkedInSpace = false;

            while ((line = br.readLine()) != null) {
                fileLines.add(line); // Save the line for future rewrite

                if (line.startsWith("Date:")) {
                    historyDate = line.split(":")[1].trim();
                } else if (line.startsWith("From:")) {
                    historyStartTime = line.split(":")[1].trim() + ":" + line.split(":")[2].trim();
                } else if (line.startsWith("To:")) {
                    historyEndTime = line.split(":")[1].trim() + ":" + line.split(":")[2].trim();
                } else if (line.startsWith("Space Number:")) {
                    historySpaceNumber = line.split(":")[1].trim();
                } else if (line.startsWith("In the Space:")) {
                    vehicleParkedInSpace = isParked(historyDate, historyStartTime, historyEndTime);

                    // Update the "In the Space" value
                    String updatedLine = "In the Space: " + (vehicleParkedInSpace ? "true" : "false"); // ternary operator
                    fileLines.set(fileLines.size() - 1, updatedLine);
                }
            }

            // Write back to file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(historyFilePath))) {
                for (String fileLine : fileLines) {
                    bw.write(fileLine);
                    bw.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Set the icon for the frame
        setIconImage(new ImageIcon(System.getProperty("user.dir") + "/resources/logo.png").getImage());
    }
    
    // User Defined Functions
    
    private boolean isParked(String date, String startTime, String endTime){
        float dataStartTime = b.twentyFourHourFormat(startTime);
        float dataEndTime = b.twentyFourHourFormat(endTime);
        
        if(date.equals(this.currentdate) && this.currenttime >= dataStartTime && this.currenttime <= dataEndTime)
            return true;
        else
            return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JLabel();
        moreOptions = new javax.swing.JLabel();
        viewParkingLot = new javax.swing.JLabel();
        book = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parking System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 300, 80));

        moreOptions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreOptionsMouseClicked(evt);
            }
        });
        getContentPane().add(moreOptions, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 300, 80));

        viewParkingLot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewParkingLotMouseClicked(evt);
            }
        });
        getContentPane().add(viewParkingLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 290, 70));

        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 290, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void moreOptionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moreOptionsMouseClicked
        Menu2 m = new Menu2();
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_moreOptionsMouseClicked

    private void viewParkingLotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewParkingLotMouseClicked
        Garage1 g = new Garage1();
        g.setLocationRelativeTo(null);
        g.setResizable(false);
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewParkingLotMouseClicked

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
        SelectVehicle sv = new SelectVehicle();
        sv.setLocationRelativeTo(null);
        sv.setResizable(false);
        sv.setVisible(true);
        dispose();
    }//GEN-LAST:event_bookMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel book;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel moreOptions;
    private javax.swing.JLabel viewParkingLot;
    // End of variables declaration//GEN-END:variables
}
