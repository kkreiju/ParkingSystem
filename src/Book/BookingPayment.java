package Book;

import Menu.Menu;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BookingPayment extends javax.swing.JFrame {

    public BookingPayment() {
        setUndecorated(true);
        initComponents();
        date.setText(ZonedDateTime.now(ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        
        // Set the icon for the frame
        setIconImage(new ImageIcon(System.getProperty("user.dir") + "/resources/logo.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cancel = new javax.swing.JLabel();
        confirm = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        vehicletype = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        spacenumber = new javax.swing.JLabel();
        starttime = new javax.swing.JLabel();
        endtime = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(".00 PHP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 372, -1, -1));

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

        vehicletype.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(vehicletype, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 363, 150, 30));

        total.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 395, 150, 30));

        amount.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        amount.setBorder(null);
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 60, -1));

        spacenumber.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(spacenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 326, 150, 30));

        starttime.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(starttime, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 150, 30));

        endtime.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(endtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, 30));

        name.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 176, 150, 30));

        date.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 215, 150, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book3.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        // Error traps letters from entering
        // Limits character count to 5
        char keyChar = evt.getKeyChar();
        boolean isDigit = Character.isDigit(keyChar);
        int characterCount = amount.getText().length();
        
        if(!isDigit || characterCount >= 5)
            evt.consume();
    }//GEN-LAST:event_amountKeyTyped

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Booking b = new Booking();
        b.setLocationRelativeTo(null);
        b.setResizable(false);
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
        String splittextprice = total.getText().split(" ")[0];
        int totalprice = (int) Float.parseFloat(splittextprice);
        int customeramount = Integer.parseInt(amount.getText());

        // Save Details in ParkingHistory.txt if amount is valid
        if(customeramount >= totalprice){
            String namedata = name.getText();
            String datedata = date.getText();
            String starttimedata = starttime.getText();
            String endtimedata = endtime.getText();

            String data = "Name: " + namedata + "\n"
                        + "Date: " + datedata + "\n"
                        + "From: " + starttimedata + "\n"
                        + "To: " + endtimedata + "\n"
                        + "Space Number: " + spacenumber.getText() + "\n"
                        + "Total Price: " + totalprice + "\n"
                        + "Payment Status: Paid\n"
                        + "In the Space: false\n"
                        + "Vehicle Type: " + vehicletype.getText() + "\n"
                        + "Left Early: false"
                        + "---------------------";
            try {
                FileWriter fw = new FileWriter(System.getProperty("user.dir") + "/src/Data/ParkingHistory.txt", true);
                fw.write(data + "\n"); // Add a new line after the text
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(this, "Payment Successful. Space is Booked. Your change is " + (customeramount - totalprice) + ".00 PHP", "Success", JOptionPane.INFORMATION_MESSAGE);

            Menu m = new Menu();
            m.setLocationRelativeTo(null);
            m.setResizable(false);
            m.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Payment Unsuccessful. Amount is Insufficient", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_confirmMouseClicked

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cancel;
    private javax.swing.JLabel confirm;
    public javax.swing.JLabel date;
    public javax.swing.JLabel endtime;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel name;
    public javax.swing.JLabel spacenumber;
    public javax.swing.JLabel starttime;
    public javax.swing.JLabel total;
    public javax.swing.JLabel vehicletype;
    // End of variables declaration//GEN-END:variables
}
