package ParkingLot;
import Data.ResourcesRendering;
import Menu.Menu;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Garage2 extends javax.swing.JFrame {
    public ArrayList<JLabel> labels = new ArrayList<>();
    
    public Garage2() {
        setUndecorated(true);
        initComponents();
        initializeArrayList();
        
        // Initialize Data
        BookedData bd = new BookedData();
        bd.RetrieveData();
        ResourcesRendering rr = new ResourcesRendering();
        
        // Checks Spaces 10-20 since this is Garage 2
        for(int i = 10 ; i < 20; i++){
            // Renders Images to Garage2
            String vehicletype = bd.vehicleType(i);
            if(bd.checkSpace(i) && vehicletype == "Car")
                labels.get(i - 10).setIcon(new javax.swing.ImageIcon(rr.carImage));
            else if(bd.checkSpace(i) && vehicletype == "Motorcycle")
                labels.get(i - 10).setIcon(new javax.swing.ImageIcon(rr.motorcycleImage));
        }
        
        // Set the icon for the frame
        setIconImage(new ImageIcon(System.getProperty("user.dir") + "/resources/logo.png").getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        space20 = new javax.swing.JLabel();
        space19 = new javax.swing.JLabel();
        space18 = new javax.swing.JLabel();
        space17 = new javax.swing.JLabel();
        space16 = new javax.swing.JLabel();
        space15 = new javax.swing.JLabel();
        space14 = new javax.swing.JLabel();
        space13 = new javax.swing.JLabel();
        space12 = new javax.swing.JLabel();
        space11 = new javax.swing.JLabel();
        previous = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(space20, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 76, 157));
        getContentPane().add(space19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 76, 157));
        getContentPane().add(space18, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 330, 76, 157));
        getContentPane().add(space17, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 330, 76, 157));
        getContentPane().add(space16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 76, 157));
        getContentPane().add(space15, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 76, 157));
        getContentPane().add(space14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 76, 157));
        getContentPane().add(space13, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 130, 76, 157));
        getContentPane().add(space12, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 130, 76, 157));
        getContentPane().add(space11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 76, 157));

        previous.setPreferredSize(new java.awt.Dimension(47, 47));
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousMouseClicked(evt);
            }
        });
        getContentPane().add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 540, 50, 50));

        back.setPreferredSize(new java.awt.Dimension(47, 47));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/garage2.png"))); // NOI18N
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

    private void previousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMouseClicked
        Garage1 g = new Garage1();
        g.setLocationRelativeTo(null);
        g.setResizable(false);
        g.setVisible(true);
        dispose();
    }//GEN-LAST:event_previousMouseClicked

    // User Defined Functions
    
    public void initializeArrayList(){
        labels.add(space11);
        labels.add(space12);
        labels.add(space13);
        labels.add(space14);
        labels.add(space15);
        labels.add(space16);
        labels.add(space17);
        labels.add(space18);
        labels.add(space19);
        labels.add(space20);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel previous;
    private javax.swing.JLabel space11;
    private javax.swing.JLabel space12;
    private javax.swing.JLabel space13;
    private javax.swing.JLabel space14;
    private javax.swing.JLabel space15;
    private javax.swing.JLabel space16;
    private javax.swing.JLabel space17;
    private javax.swing.JLabel space18;
    private javax.swing.JLabel space19;
    private javax.swing.JLabel space20;
    // End of variables declaration//GEN-END:variables
}
