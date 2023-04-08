package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Drug_List extends javax.swing.JFrame {

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private String sql1;
    private String sql2;
    private String sql3;

    public Drug_List() {
        initComponents();
        con = Connect.connect();
        drug_list();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        druglist = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        sort_by = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Drug_List Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Drug_List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(274, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(273, 273, 273))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        jScrollPane1.setBackground(new java.awt.Color(153, 204, 255));

        druglist.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        druglist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "         Name", "         Type", "         Barcode", "         Price", "         Expiry", "         Company"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        druglist.getTableHeader().setReorderingAllowed(false);
        druglist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                druglistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(druglist);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));

        sort_by.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort By : ", "Name", "Type", "Expiration" }));
        sort_by.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sort_byItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Sort By : ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sort_by, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sort_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(679, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void druglistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_druglistMouseClicked
        int row = druglist.getSelectedRow();
        String t = druglist.getModel().getValueAt(row, 2).toString();
        String sql = "select * from drugs where BARCODE='" + t + "' ";
        try {
            setPre(getCon().prepareStatement(sql));
            setRes(getPre().executeQuery());
            if (getRes().next()) {
                String Name = getRes().getString("NAME");
                Pharmacy.getDrug().name.setText(Name);

                String Type = getRes().getString("TYPE");
                Pharmacy.getDrug().type.setSelectedItem(Type);

                String Barcode = getRes().getString("BARCODE");
                Pharmacy.getDrug().barcode.setText(Barcode);

                String Code = getRes().getString("CODE");
                Pharmacy.getDrug().code.setText(Code);

                String Dose = getRes().getString("DOSE");
                Pharmacy.getDrug().dose.setText(Dose);

                String cost_price = getRes().getString("COST_PRICE");
                Pharmacy.getDrug().cost_price.setText(cost_price);

                String sell_price = getRes().getString("SELLING_PRICE");
                Pharmacy.getDrug().selling_price.setText(sell_price);

                String company_Name = getRes().getString("COMPANY_NAME");
                Pharmacy.getDrug().company_name.setSelectedItem(company_Name);

                String Quantity = getRes().getString("QUANTITY");
                Pharmacy.getDrug().quantity.setSelectedItem(Quantity);

                String Day = getRes().getString("PRODUCTION_DATE").split("-")[0];
                Pharmacy.getDrug().pro_day.setSelectedItem(Day);
                String Month = getRes().getString("PRODUCTION_DATE").split("-")[1];
                Pharmacy.getDrug().pro_month.setSelectedItem(Month);
                String Year = getRes().getString("PRODUCTION_DATE").split("-")[2];
                Pharmacy.getDrug().pro_year.setSelectedItem(Year);

                String ex_Day = getRes().getString("EXPIRATION_DATE").split("-")[0];
                Pharmacy.getDrug().exp_day.setSelectedItem(ex_Day);
                String ex_Month = getRes().getString("EXPIRATION_DATE").split("-")[1];
                Pharmacy.getDrug().exp_month.setSelectedItem(ex_Month);
                String ex_Year = getRes().getString("EXPIRATION_DATE").split("-")[2];
                Pharmacy.getDrug().exp_year.setSelectedItem(ex_Year);

                String sec = getRes().getString("PLACE").split("-")[0];
                Pharmacy.getDrug().section.setSelectedItem(sec);
                String pla = getRes().getString("PLACE").split("-")[1];
                Pharmacy.getDrug().place.setSelectedItem(pla);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }

    }//GEN-LAST:event_druglistMouseClicked

    private void sort_byItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sort_byItemStateChanged
        switch (sort_by.getSelectedIndex()) { // one case will execute in these cases 
            case 1: {
                setSql1("select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by NAME");
                sort(1);
                break;
            }
            case 2: {
                setSql2("select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by TYPE");
                sort(2);
                break;
            }
            case 3: {
                setSql3("select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs order by EXPIRY DESC");
                sort(3);
                break;
            }
        }
    }//GEN-LAST:event_sort_byItemStateChanged

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Drug_List().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable druglist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sort_by;
    // End of variables declaration//GEN-END:variables
private void drug_list() {
        String sql = "select NAME , TYPE ,BARCODE,SELLING_PRICE , EXPIRY , COMPANY_NAME from drugs";
        try {
            setPre(getCon().prepareStatement(sql));
            setRes(getPre().executeQuery());
            druglist.setModel(DbUtils.resultSetToTableModel(getRes()));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void sort(int index) {
        try {
            switch (index) {
                case 1: {
                    setPre(getCon().prepareStatement(getSql1()));
                    setRes(getPre().executeQuery());
                    druglist.setModel(DbUtils.resultSetToTableModel(getRes()));
                }
                break;
                case 2: {
                    setPre(getCon().prepareStatement(getSql2()));
                    setRes(getPre().executeQuery());
                    druglist.setModel(DbUtils.resultSetToTableModel(getRes()));
                }
                break;
                case 3: {
                    setPre(getCon().prepareStatement(getSql3()));
                    setRes(getPre().executeQuery());
                    druglist.setModel(DbUtils.resultSetToTableModel(getRes()));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public PreparedStatement getPre() {
        return pre;
    }

    public void setPre(PreparedStatement pre) {
        this.pre = pre;
    }

    public ResultSet getRes() {
        return res;
    }

    public void setRes(ResultSet res) {
        this.res = res;
    }

    public String getSql1() {
        return sql1;
    }

    public void setSql1(String sql1) {
        this.sql1 = sql1;
    }

    public String getSql2() {
        return sql2;
    }

    public void setSql2(String sql2) {
        this.sql2 = sql2;
    }

    public String getSql3() {
        return sql3;
    }

    public void setSql3(String sql3) {
        this.sql3 = sql3;
    }
}
