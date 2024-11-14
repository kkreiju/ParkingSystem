package Menu;

public class Menu2 extends javax.swing.JFrame {

    public Menu2() {
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leaveAndPay = new javax.swing.JLabel();
        viewParkingHistory = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Parking System");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(1024, 600));
        setSize(new java.awt.Dimension(1024, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(leaveAndPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 300, 80));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel leaveAndPay;
    private javax.swing.JLabel viewParkingHistory;
    // End of variables declaration//GEN-END:variables
}
