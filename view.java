package test1;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class view extends javax.swing.JFrame {

    DefaultTableModel tablemodel;// lưu giá trị vào các cái bản mà mình chỉ định
    public List<Student> studentlist1 = new ArrayList<>();

    public view() {
        initComponents();
        tablemodel = (DefaultTableModel) tbsv.getModel();
        showStudent();
    }

    private void showStudent() {
        studentlist1 = StudentModify.findAll();
        tablemodel.setRowCount(0);
        // dọn sạch bảng 
        for (Student x : studentlist1) {
            tablemodel.addRow(new Object[]{tablemodel.getRowCount() + 1, x.getId(), x.getName(), x.getAddress(), x.getYob(), x.getStandard()}); 
                    }
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfstandard = new javax.swing.JTextField();
        tfyob = new javax.swing.JTextField();
        tfaddress = new javax.swing.JTextField();
        tfname = new javax.swing.JTextField();
        tfid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbsv = new javax.swing.JTable();
        btadd = new javax.swing.JButton();
        btreset = new javax.swing.JButton();
        btupdate = new javax.swing.JButton();
        btxoa = new javax.swing.JButton();
        btshow = new javax.swing.JButton();
        btsearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btshow1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ADDRESS");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("YOB");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("STANDARD");

        tbsv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbsv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "NAME", "ADDRESS", "YOB", "STANDARD"
            }
        ));
        jScrollPane1.setViewportView(tbsv);

        btadd.setBackground(new java.awt.Color(204, 204, 255));
        btadd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btadd.setText("ADD");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        btreset.setBackground(new java.awt.Color(204, 204, 255));
        btreset.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btreset.setText("RESET");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });

        btupdate.setBackground(new java.awt.Color(204, 204, 255));
        btupdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btupdate.setText("UPDATE");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        btxoa.setBackground(new java.awt.Color(255, 153, 255));
        btxoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btxoa.setText("DELETE");
        btxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxoaActionPerformed(evt);
            }
        });

        btshow.setBackground(new java.awt.Color(255, 153, 255));
        btshow.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btshow.setText("SHOW");
        btshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btshowActionPerformed(evt);
            }
        });

        btsearch.setBackground(new java.awt.Color(255, 153, 255));
        btsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btsearch.setText("SEARCH");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("TUYỂN SINH VÀO LỚP 10");

        btshow1.setBackground(new java.awt.Color(255, 153, 255));
        btshow1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btshow1.setText("CHAT");
        btshow1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btshow1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfyob, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfstandard, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btreset, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btshow, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btsearch)
                                .addGap(31, 31, 31)
                                .addComponent(btshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfstandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfyob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btadd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btreset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btshow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btupdate)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // button add :
        String id1 = tfid.getText();
        String name1 = tfname.getText();
        String address1 = tfaddress.getText();
        int yob1 = Integer.parseInt(tfyob.getText());
        String standard1 = tfstandard.getText();
        Student sv = new Student(id1, name1, address1, yob1, standard1);
        StudentModify.insert(sv);
        showStudent();

    }//GEN-LAST:event_btaddActionPerformed

    private void btxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxoaActionPerformed
        // button delete :
        int selectedIndex = tbsv.getSelectedRow();
        // lấy cái dòng mà bạn chọn ra 
        if (selectedIndex >= 0) {
            Student sv = studentlist1.get(selectedIndex);
            // lấy ra luôn 1 sinh viên được chọn để xóa
            // chiếu ngược lại lấy vi trí trong studentlist 
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?");
            // hiện ra thông báo 
            // 0 yes , 1 no , cancel 2
        if (option == 0) {
                StudentModify.delete(sv.getId());
                showStudent();
            }
        }


            

    }//GEN-LAST:event_btxoaActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        // button reset :
        tfid.setText("");
        tfname.setText("");
        tfaddress.setText("");
        tfyob.setText("");
        tfstandard.setText("");

    }//GEN-LAST:event_btresetActionPerformed

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        // button search :
        String input = JOptionPane.showInputDialog(this, "Please enter the name you are search");
        if (input.length() > 0) {
            studentlist1 = StudentModify.search(input);
            tablemodel.setRowCount(0);
            // dọn sạch bảng 
            for (Student x : studentlist1) {
                tablemodel.addRow(new Object[]{tablemodel.getRowCount() + 1, x.getId(), x.getName(), x.getAddress(), x.getYob()});
                // thêm dữ liệu lên table 
            }
        }

    }//GEN-LAST:event_btsearchActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
 // button update :
        String id1 = tfid.getText();
        String name1 = tfname.getText();
        String address1 = tfaddress.getText();
        int yob = Integer.parseInt(tfyob.getText());
        String standard1 = tfstandard.getText();
        Student sv = new Student(id1, name1, address1, yob, standard1);
        StudentModify.update(sv);
        showStudent();

    }//GEN-LAST:event_btupdateActionPerformed

    private void btshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btshowActionPerformed
        // button show :
        int selectedupdet = tbsv.getSelectedRow();
        Student sv = studentlist1.get(selectedupdet);
        tfid.setText(sv.getId());
        tfname.setText(sv.getName());
        tfaddress.setText(sv.getAddress());
        String s = String.valueOf(sv.getYob());// chuyển thành số thành chuỗi 
        tfyob.setText(s);

    }//GEN-LAST:event_btshowActionPerformed

    private void btshow1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btshow1ActionPerformed
        ManagerChatter mc = new ManagerChatter();
        mc.setVisible(true);
        ClientChatter cc = new ClientChatter();
        cc.setVisible(true);
    }//GEN-LAST:event_btshow1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btreset;
    private javax.swing.JButton btsearch;
    private javax.swing.JButton btshow;
    private javax.swing.JButton btshow1;
    private javax.swing.JButton btupdate;
    private javax.swing.JButton btxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbsv;
    private javax.swing.JTextField tfaddress;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tfname;
    private javax.swing.JTextField tfstandard;
    private javax.swing.JTextField tfyob;
    // End of variables declaration//GEN-END:variables
}
