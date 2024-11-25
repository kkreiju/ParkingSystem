package Book;
import Menu.Menu;
import javax.swing.ImageIcon;

public class SelectVehicle extends javax.swing.JFrame {

    //Render Values
    Values v = new Values();
    
    public SelectVehicle() {
        setUndecorated(true);
        initComponents();
        
        // Set the icon for the frame
        setIconImage(new ImageIcon(System.getProperty("user.dir") + "/resources/logo.png").getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JLabel();
        motorcycle = new javax.swing.JLabel();
        car = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setPreferredSize(new java.awt.Dimension(47, 47));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        motorcycle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                motorcycleMouseClicked(evt);
            }
        });
        getContentPane().add(motorcycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 290, 80));

        car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carMouseClicked(evt);
            }
        });
        getContentPane().add(car, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 290, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book1.png"))); // NOI18N
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

    private void carMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carMouseClicked
        Booking b = new Booking();
        v.setVehicleType("Car");
        b.setLocationRelativeTo(null);
        b.setResizable(false);
        b.setVisible(true);
        
        //vehicleType is set to Public to be accessed in this class
        b.vehicleType.setText(v.getVehicleType());
        b.price(b.vehicleType.getText());
        dispose();
    }//GEN-LAST:event_carMouseClicked

    private void motorcycleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_motorcycleMouseClicked
        Booking b = new Booking();
        v.setVehicleType("Motorcycle");
        b.setLocationRelativeTo(null);
        b.setResizable(false);
        b.setVisible(true);
        
        //vehicleType is set to Public to be accessed in this class
        b.vehicleType.setText(v.getVehicleType());
        b.price(b.vehicleType.getText());
        dispose();
    }//GEN-LAST:event_motorcycleMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel car;
    private javax.swing.JLabel motorcycle;
    // End of variables declaration//GEN-END:variables
}
