package ParkingLot;
import Data.ResourcesRendering;
import Menu.Menu;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Garage1 extends javax.swing.JFrame {
    public ArrayList<JLabel> labels = new ArrayList<>();

    public Garage1() {
        setUndecorated(true);
        initComponents();
        initializeArrayList();
        
        // Initialize Data
        BookedData bd = new BookedData();
        bd.RetrieveData();
        ResourcesRendering rr = new ResourcesRendering();
        
        // Checks Spaces 1-10 since this is Garage 1
        for(int i = 0 ; i < 10; i++){
            // Renders Images to Garage1
            String vehicletype = bd.vehicleType(i);
            if(bd.checkSpace(i) && vehicletype == "Car")
                labels.get(i).setIcon(new javax.swing.ImageIcon(rr.carImage));
            else if(bd.checkSpace(i) && vehicletype == "Motorcycle")
                labels.get(i).setIcon(new javax.swing.ImageIcon(rr.motorcycleImage));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        space10 = new javax.swing.JLabel();
        space9 = new javax.swing.JLabel();
        space8 = new javax.swing.JLabel();
        space7 = new javax.swing.JLabel();
        space6 = new javax.swing.JLabel();
        space5 = new javax.swing.JLabel();
        space4 = new javax.swing.JLabel();
        space3 = new javax.swing.JLabel();
        space2 = new javax.swing.JLabel();
        space1 = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(space10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 76, 157));
        getContentPane().add(space9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 76, 157));
        getContentPane().add(space8, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 330, 76, 157));
        getContentPane().add(space7, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 330, 76, 157));
        getContentPane().add(space6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 76, 157));
        getContentPane().add(space5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 76, 157));
        getContentPane().add(space4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 76, 157));
        getContentPane().add(space3, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 130, 76, 157));
        getContentPane().add(space2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 130, 76, 157));
        getContentPane().add(space1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 76, 157));

        next.setPreferredSize(new java.awt.Dimension(47, 47));
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 50, 50));

        back.setPreferredSize(new java.awt.Dimension(47, 47));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garage1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        Garage2 g = new Garage2();
        g.setLocationRelativeTo(null);
        g.setResizable(false);
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_nextMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Menu m = new Menu();
        m.setLocationRelativeTo(null);
        m.setResizable(false);
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    // User Defined Functions
    
    public void initializeArrayList(){
        labels.add(space1);
        labels.add(space2);
        labels.add(space3);
        labels.add(space4);
        labels.add(space5);
        labels.add(space6);
        labels.add(space7);
        labels.add(space8);
        labels.add(space9);
        labels.add(space10);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel next;
    private javax.swing.JLabel space1;
    private javax.swing.JLabel space10;
    private javax.swing.JLabel space2;
    private javax.swing.JLabel space3;
    private javax.swing.JLabel space4;
    private javax.swing.JLabel space5;
    private javax.swing.JLabel space6;
    private javax.swing.JLabel space7;
    private javax.swing.JLabel space8;
    private javax.swing.JLabel space9;
    // End of variables declaration//GEN-END:variables
}
