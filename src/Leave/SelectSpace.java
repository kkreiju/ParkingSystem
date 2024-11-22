package Leave;

import Menu.Menu2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class SelectSpace extends javax.swing.JFrame {

    public SelectSpace() {
        setUndecorated(true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JLabel();
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

        space20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space20MouseClicked(evt);
            }
        });
        getContentPane().add(space20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 408, 85, 58));

        space19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space19MouseClicked(evt);
            }
        });
        getContentPane().add(space19, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 405, 85, 58));

        space18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space18MouseClicked(evt);
            }
        });
        getContentPane().add(space18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 407, 85, 58));

        space17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space17MouseClicked(evt);
            }
        });
        getContentPane().add(space17, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 406, 85, 58));

        space16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space16MouseClicked(evt);
            }
        });
        getContentPane().add(space16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 407, 84, 58));

        space15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space15MouseClicked(evt);
            }
        });
        getContentPane().add(space15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 348, 85, 58));

        space14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space14MouseClicked(evt);
            }
        });
        getContentPane().add(space14, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 347, 85, 58));

        space13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space13MouseClicked(evt);
            }
        });
        getContentPane().add(space13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 348, 85, 58));

        space12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space12MouseClicked(evt);
            }
        });
        getContentPane().add(space12, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 347, 85, 58));

        space11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space11MouseClicked(evt);
            }
        });
        getContentPane().add(space11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 347, 84, 58));

        space10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space10MouseClicked(evt);
            }
        });
        getContentPane().add(space10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 85, 58));

        space9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space9MouseClicked(evt);
            }
        });
        getContentPane().add(space9, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 288, 85, 58));

        space8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space8MouseClicked(evt);
            }
        });
        getContentPane().add(space8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 289, 85, 58));

        space7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space7MouseClicked(evt);
            }
        });
        getContentPane().add(space7, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 287, 85, 58));

        space6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space6MouseClicked(evt);
            }
        });
        getContentPane().add(space6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 289, 84, 58));

        space5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space5MouseClicked(evt);
            }
        });
        getContentPane().add(space5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 85, 58));

        space4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space4MouseClicked(evt);
            }
        });
        getContentPane().add(space4, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 230, 85, 58));

        space3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space3MouseClicked(evt);
            }
        });
        getContentPane().add(space3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 85, 58));

        space2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space2MouseClicked(evt);
            }
        });
        getContentPane().add(space2, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 230, 85, 58));

        space1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                space1MouseClicked(evt);
            }
        });
        getContentPane().add(space1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 84, 58));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leave.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Menu2 m2 = new Menu2();
        m2.setLocationRelativeTo(null);
        m2.setResizable(false);
        m2.setVisible(true);
        dispose();
    }//GEN-LAST:event_backMouseClicked

    private void space1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space1MouseClicked
        spaceClicks(1);
    }//GEN-LAST:event_space1MouseClicked

    private void space2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space2MouseClicked
        spaceClicks(2);
    }//GEN-LAST:event_space2MouseClicked

    private void space3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space3MouseClicked
        spaceClicks(3);
    }//GEN-LAST:event_space3MouseClicked

    private void space4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space4MouseClicked
        spaceClicks(4);
    }//GEN-LAST:event_space4MouseClicked

    private void space5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space5MouseClicked
        spaceClicks(5);
    }//GEN-LAST:event_space5MouseClicked

    private void space6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space6MouseClicked
        spaceClicks(6);
    }//GEN-LAST:event_space6MouseClicked

    private void space7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space7MouseClicked
        spaceClicks(7);
    }//GEN-LAST:event_space7MouseClicked

    private void space8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space8MouseClicked
        spaceClicks(8);
    }//GEN-LAST:event_space8MouseClicked

    private void space9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space9MouseClicked
        spaceClicks(9);
    }//GEN-LAST:event_space9MouseClicked

    private void space10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space10MouseClicked
        spaceClicks(10);
    }//GEN-LAST:event_space10MouseClicked

    private void space11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space11MouseClicked
        spaceClicks(11);
    }//GEN-LAST:event_space11MouseClicked

    private void space12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space12MouseClicked
        spaceClicks(12);
    }//GEN-LAST:event_space12MouseClicked

    private void space13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space13MouseClicked
        spaceClicks(13);
    }//GEN-LAST:event_space13MouseClicked

    private void space14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space14MouseClicked
        spaceClicks(14);
    }//GEN-LAST:event_space14MouseClicked

    private void space15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space15MouseClicked
        spaceClicks(15);
    }//GEN-LAST:event_space15MouseClicked

    private void space16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space16MouseClicked
        spaceClicks(16);
    }//GEN-LAST:event_space16MouseClicked

    private void space17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space17MouseClicked
        spaceClicks(17);
    }//GEN-LAST:event_space17MouseClicked

    private void space18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space18MouseClicked
        spaceClicks(18);
    }//GEN-LAST:event_space18MouseClicked

    private void space19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space19MouseClicked
        spaceClicks(19);
    }//GEN-LAST:event_space19MouseClicked

    private void space20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_space20MouseClicked
        spaceClicks(20);
    }//GEN-LAST:event_space20MouseClicked

    // User Defined Functions
    
    private void spaceClicks(int space){
        int response = JOptionPane.showConfirmDialog(
            this, 
            "Do you want to leave on space " + (space) + "?", 
            "Warning", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.WARNING_MESSAGE
        );

        if (response == JOptionPane.YES_OPTION) {
            String historyFilePath = System.getProperty("user.dir") + "/src/Data/ParkingHistory.txt";
        
            // Read all data from parking history
            try (BufferedReader br = new BufferedReader(new FileReader(historyFilePath))) {
                List<String> fileLines = new ArrayList<>();
                String line;
                String historySpaceNumber = null;
                boolean vehicleParkedInSpace = false, found = false;
                int spacenumber = 0;

                while ((line = br.readLine()) != null) {
                    fileLines.add(line); // Save the line for future rewrite

                    if(!found){
                        if (line.startsWith("Space Number:")) {
                            historySpaceNumber = line.split(":")[1].trim();
                            spacenumber = Integer.parseInt(historySpaceNumber);
                        } else if (line.startsWith("In the Space:")) {
                            if(line.split(":")[1].trim().equals("true"))
                                vehicleParkedInSpace = true;
                            else
                                vehicleParkedInSpace = false;
                        }
                        else if(line.startsWith("Left Early: ") && vehicleParkedInSpace && (spacenumber == space)){
                            fileLines.set(fileLines.size() - 1, "Left Early: true");
                            found = true;
                            JOptionPane.showMessageDialog(this, "You have left space " + space + ".");
                        }
                    }
                }
                
                // Write back to file
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(historyFilePath))) {
                    for (String fileLine : fileLines) {
                        bw.write(fileLine);
                        bw.newLine();
                    }
                }
                
                if(!found)
                    JOptionPane.showMessageDialog(this, "Space " + space + " is available, there is no vehicle to leave.");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel space1;
    private javax.swing.JLabel space10;
    private javax.swing.JLabel space11;
    private javax.swing.JLabel space12;
    private javax.swing.JLabel space13;
    private javax.swing.JLabel space14;
    private javax.swing.JLabel space15;
    private javax.swing.JLabel space16;
    private javax.swing.JLabel space17;
    private javax.swing.JLabel space18;
    private javax.swing.JLabel space19;
    private javax.swing.JLabel space2;
    private javax.swing.JLabel space20;
    private javax.swing.JLabel space3;
    private javax.swing.JLabel space4;
    private javax.swing.JLabel space5;
    private javax.swing.JLabel space6;
    private javax.swing.JLabel space7;
    private javax.swing.JLabel space8;
    private javax.swing.JLabel space9;
    // End of variables declaration//GEN-END:variables
}
