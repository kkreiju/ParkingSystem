package ParkingLot;

import Menu.Menu2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class History extends javax.swing.JFrame {

    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<String> date = new ArrayList();
    private ArrayList<String> duration = new ArrayList<>();
    private ArrayList<String> fee = new ArrayList();
    
    public History() {
        setUndecorated(true);
        initComponents();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        // Add Data
        String historyFilePath = System.getProperty("user.dir") + "/src/Data/ParkingHistory.txt";
        
        // Read all data from parking history
        try (BufferedReader br = new BufferedReader(new FileReader(historyFilePath))) {
            String line;
            String historyName = null, historyDate = null, historyTime = null, historyFee = null;

            while ((line = br.readLine()) != null) {
                if (line.startsWith("Name: ")) {
                    historyName = line.split(":")[1].trim();
                } else if (line.startsWith("Date: ")) {
                    historyDate = line.split(":")[1].trim();
                }
                else if(line.startsWith("From: ")){
                    historyTime = line.split(":")[1].trim() + ":" + line.split(":")[2].trim();
                }
                else if(line.startsWith("To: ")){
                    historyTime += " - " + line.split(":")[1].trim() + ":" + line.split(":")[2].trim();
                }
                else if(line.startsWith("Total Price: ")){
                    historyFee = line.split(":")[1].trim() + " PHP";
                    name.add(historyName);
                    date.add(historyDate);
                    duration.add(historyTime);
                    fee.add(historyFee);
                }
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        if(name.size() == date.size() && duration.size() == fee.size()){
            for(int i = 0; i < name.size(); i++){
                model.addRow(new Object[]{name.get(i), date.get(i), duration.get(i), fee.get(i)});
            }
        }
        
        // Set the icon for the frame
        setIconImage(new ImageIcon(System.getProperty("user.dir") + "/resources/logo.png").getImage());
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Date", "Duration", "Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(40);
        jTable1.setTableHeader(null);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 490, 260));

        back.setPreferredSize(new java.awt.Dimension(47, 47));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/history.png"))); // NOI18N
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
