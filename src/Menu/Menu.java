package Menu;
import ParkingLot.Garage1;
import ParkingLot.BookedData;
import Book.SelectVehicle;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        setUndecorated(true);
        initComponents();
        
        BookedData bd = new BookedData();
        System.out.println(bd.RetrieveDateTime("Both"));
        
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
