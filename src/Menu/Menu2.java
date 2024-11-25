package Menu;

import Leave.SelectSpace;
import ParkingLot.History;
import javax.swing.ImageIcon;

public class Menu2 extends javax.swing.JFrame {

    public Menu2() {
        setUndecorated(true);
        initComponents();
        
        // Set the icon for the frame
        setIconImage(new ImageIcon(System.getProperty("user.dir") + "/resources/logo.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leave = new javax.swing.JLabel();
        viewParkingHistory = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parking System");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                leaveMouseClicked(evt);
            }
        });
        getContentPane().add(leave, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 300, 80));

        viewParkingHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewParkingHistoryMouseClicked(evt);
            }
        });
        getContentPane().add(viewParkingHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 300, 80));

        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 300, 80));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Menu m = new Menu();
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void leaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaveMouseClicked
        SelectSpace ss = new SelectSpace();
        ss.setLocationRelativeTo(null);
        ss.setResizable(false);
        ss.setVisible(true);
        dispose();
    }//GEN-LAST:event_leaveMouseClicked

    private void viewParkingHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewParkingHistoryMouseClicked
        History h = new History();
        h.setLocationRelativeTo(null);
        h.setResizable(false);
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewParkingHistoryMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel leave;
    private javax.swing.JLabel viewParkingHistory;
    // End of variables declaration//GEN-END:variables
}
