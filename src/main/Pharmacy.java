package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.Toolkit;
import java.sql.SQLException;

public class Pharmacy extends javax.swing.JFrame {

    private Connection con = null;
    private PreparedStatement pre = null;
    private ResultSet res = null;
    private static int ex;
    private User user;
    private Company comp;
    private static Drug drug;
    private static MoveDrug move_drug;
    private Date d;
    private SimpleDateFormat dd;
    private static String to;
    private static String text;
    private static String almost_expired_bar;
    private static String expired_bar;

    public Pharmacy() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(Pharmacy.class.getResource("/img/Untitled.png")));
        initComponents();
        con = Connect.connect();
        showDate();
        buttonvis();
        user = new User();
        drug = new Drug();
        comp = new Company();
        move_drug = new MoveDrug();
        loginas();
        warning();
        login_as();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        today = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username1 = new javax.swing.JLabel();
        userB = new javax.swing.JButton();
        drugs = new javax.swing.JButton();
        adduser = new javax.swing.JButton();
        deleteuser = new javax.swing.JButton();
        updateuser = new javax.swing.JButton();
        adddrug = new javax.swing.JButton();
        deletedrug = new javax.swing.JButton();
        updatedrug = new javax.swing.JButton();
        searchdrug = new javax.swing.JButton();
        drugdetails = new javax.swing.JButton();
        newcom = new javax.swing.JButton();
        endwith = new javax.swing.JButton();
        movedrug = new javax.swing.JButton();
        setting = new javax.swing.JButton();
        logindetails = new javax.swing.JButton();
        changepass = new javax.swing.JButton();
        company = new javax.swing.JButton();
        editprice = new javax.swing.JButton();
        sales = new javax.swing.JButton();
        salesbill = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        checkplace = new javax.swing.JButton();
        druglist = new javax.swing.JButton();
        expired1 = new javax.swing.JButton();
        almost = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pharmacy Management");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pharmacy Management System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Time");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Today");

        time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        time.setForeground(new java.awt.Color(0, 0, 102));
        time.setText("00:00:00");

        today.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        today.setForeground(new java.awt.Color(153, 0, 0));
        today.setText("00-00-0000");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Apps-session-logout-icon.png"))); // NOI18N
        jButton1.setToolTipText("Logout");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        username.setBackground(new java.awt.Color(255, 255, 255));
        username.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username.setForeground(new java.awt.Color(153, 0, 0));
        username.setText("Login As : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Login As : ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("User Name : ");

        username1.setBackground(new java.awt.Color(255, 255, 255));
        username1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        username1.setForeground(new java.awt.Color(0, 0, 102));
        username1.setText("Login As : ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel2)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(today, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(207, 207, 207))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(username))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(username1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(time)
                                    .addComponent(today))))))
                .addGap(12, 12, 12))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1220, 80);

        userB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userB.setForeground(new java.awt.Color(0, 51, 51));
        userB.setText("User");
        userB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBActionPerformed(evt);
            }
        });
        jPanel1.add(userB);
        userB.setBounds(1050, 100, 140, 34);

        drugs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drugs.setForeground(new java.awt.Color(0, 51, 51));
        drugs.setText("Drugs");
        drugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugsActionPerformed(evt);
            }
        });
        jPanel1.add(drugs);
        drugs.setBounds(860, 100, 150, 34);

        adduser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adduser.setText("Add User");
        adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserActionPerformed(evt);
            }
        });
        jPanel1.add(adduser);
        adduser.setBounds(1050, 150, 140, 21);

        deleteuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deleteuser.setText("Delete User");
        deleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteuserActionPerformed(evt);
            }
        });
        jPanel1.add(deleteuser);
        deleteuser.setBounds(1050, 190, 140, 21);

        updateuser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updateuser.setText("Update User");
        updateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateuserActionPerformed(evt);
            }
        });
        jPanel1.add(updateuser);
        updateuser.setBounds(1050, 230, 140, 21);

        adddrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        adddrug.setText("Add Drug");
        adddrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddrugActionPerformed(evt);
            }
        });
        jPanel1.add(adddrug);
        adddrug.setBounds(860, 150, 150, 21);

        deletedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletedrug.setText("Delete Drug");
        deletedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedrugActionPerformed(evt);
            }
        });
        jPanel1.add(deletedrug);
        deletedrug.setBounds(860, 190, 150, 21);

        updatedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatedrug.setText("Update Drug");
        updatedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedrugActionPerformed(evt);
            }
        });
        jPanel1.add(updatedrug);
        updatedrug.setBounds(860, 230, 150, 21);

        searchdrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchdrug.setText("Search Drug");
        searchdrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchdrugActionPerformed(evt);
            }
        });
        jPanel1.add(searchdrug);
        searchdrug.setBounds(860, 270, 150, 21);

        drugdetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        drugdetails.setForeground(new java.awt.Color(0, 51, 51));
        drugdetails.setText("Drug Details");
        drugdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugdetailsActionPerformed(evt);
            }
        });
        jPanel1.add(drugdetails);
        drugdetails.setBounds(650, 100, 150, 34);

        newcom.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newcom.setText("New Company");
        newcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newcomActionPerformed(evt);
            }
        });
        jPanel1.add(newcom);
        newcom.setBounds(230, 150, 118, 21);

        endwith.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        endwith.setText("End With");
        endwith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endwithActionPerformed(evt);
            }
        });
        jPanel1.add(endwith);
        endwith.setBounds(230, 190, 118, 21);

        movedrug.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        movedrug.setText("Drugs_List");
        movedrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movedrugActionPerformed(evt);
            }
        });
        jPanel1.add(movedrug);
        movedrug.setBounds(860, 310, 150, 21);

        setting.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        setting.setForeground(new java.awt.Color(0, 51, 51));
        setting.setText("Setting");
        setting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingActionPerformed(evt);
            }
        });
        jPanel1.add(setting);
        setting.setBounds(10, 102, 141, 34);

        logindetails.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logindetails.setText("Login Details");
        logindetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logindetailsActionPerformed(evt);
            }
        });
        jPanel1.add(logindetails);
        logindetails.setBounds(10, 154, 141, 21);

        changepass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        changepass.setText("Change Password");
        changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassActionPerformed(evt);
            }
        });
        jPanel1.add(changepass);
        changepass.setBounds(10, 195, 139, 21);

        company.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        company.setForeground(new java.awt.Color(0, 51, 51));
        company.setText("Company");
        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        jPanel1.add(company);
        company.setBounds(230, 100, 118, 34);

        editprice.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        editprice.setText("Edit Prices");
        editprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpriceActionPerformed(evt);
            }
        });
        jPanel1.add(editprice);
        editprice.setBounds(650, 190, 150, 21);

        sales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sales.setForeground(new java.awt.Color(0, 51, 51));
        sales.setText("Sales");
        sales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesActionPerformed(evt);
            }
        });
        jPanel1.add(sales);
        sales.setBounds(420, 100, 150, 34);

        salesbill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        salesbill.setText("Sales Bill");
        salesbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesbillActionPerformed(evt);
            }
        });
        jPanel1.add(salesbill);
        salesbill.setBounds(420, 150, 150, 21);

        logout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(10, 236, 141, 21);

        checkplace.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkplace.setText("Check Places");
        checkplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkplaceActionPerformed(evt);
            }
        });
        jPanel1.add(checkplace);
        checkplace.setBounds(650, 150, 150, 21);

        druglist.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        druglist.setText("Drugs_List");
        druglist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                druglistActionPerformed(evt);
            }
        });
        jPanel1.add(druglist);
        druglist.setBounds(0, 0, 90, 20);

        expired1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        expired1.setText("Expired Drugs");
        expired1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expired1ActionPerformed(evt);
            }
        });
        jPanel1.add(expired1);
        expired1.setBounds(650, 230, 150, 21);

        almost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        almost.setText("Almost_Finished");
        almost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                almostActionPerformed(evt);
            }
        });
        jPanel1.add(almost);
        almost.setBounds(650, 270, 150, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1222, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1240, 646));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void druglistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_druglistActionPerformed
        new Drug_List().setVisible(true);
    }//GEN-LAST:event_druglistActionPerformed

    private void checkplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkplaceActionPerformed
        new MoveDrug().setVisible(true);
    }//GEN-LAST:event_checkplaceActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void salesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesActionPerformed
        sales();
    }//GEN-LAST:event_salesActionPerformed

    private void editpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpriceActionPerformed
        new Edit_Price().setVisible(true);
    }//GEN-LAST:event_editpriceActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        company();
    }//GEN-LAST:event_companyActionPerformed

    private void changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassActionPerformed
        new ChangePassword().setVisible(true);
    }//GEN-LAST:event_changepassActionPerformed

    private void settingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingActionPerformed
        setting();
    }//GEN-LAST:event_settingActionPerformed

    private void movedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movedrugActionPerformed
        new Drug_List().setVisible(true);
    }//GEN-LAST:event_movedrugActionPerformed

    private void endwithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endwithActionPerformed
        getComp().setVisible(true);
        getComp().save.setEnabled(false);
        getComp().update.setEnabled(false);
        getComp().delete.setEnabled(true);
    }//GEN-LAST:event_endwithActionPerformed

    private void newcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newcomActionPerformed
        getComp().setVisible(true);
        getComp().save.setEnabled(true);
        getComp().update.setEnabled(false);
        getComp().delete.setEnabled(false);
    }//GEN-LAST:event_newcomActionPerformed

    private void drugdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugdetailsActionPerformed
        enterdrugdetails();
    }//GEN-LAST:event_drugdetailsActionPerformed

    private void searchdrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchdrugActionPerformed
        new Search_Drug().setVisible(true);
    }//GEN-LAST:event_searchdrugActionPerformed

    private void updatedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedrugActionPerformed
        getDrug().setVisible(true);
        getDrug().adddrug.setEnabled(false);
        getDrug().deletedrug.setEnabled(false);
        getDrug().updatedrug.setEnabled(true);
    }//GEN-LAST:event_updatedrugActionPerformed

    private void deletedrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedrugActionPerformed
        getDrug().setVisible(true);
        getDrug().updatedrug.setEnabled(false);
        getDrug().adddrug.setEnabled(false);
        getDrug().deletedrug.setEnabled(true);
    }//GEN-LAST:event_deletedrugActionPerformed

    private void adddrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddrugActionPerformed
        getDrug().setVisible(true);
        getDrug().updatedrug.setEnabled(false);
        getDrug().deletedrug.setEnabled(false);
        getDrug().adddrug.setEnabled(true);
    }//GEN-LAST:event_adddrugActionPerformed

    private void updateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateuserActionPerformed
        getUser().setVisible(true);
        getUser().deleteuser.setEnabled(false);
        getUser().adduser.setEnabled(false);
        getUser().updateuser.setEnabled(true);
        getUser().id.setEditable(false);
    }//GEN-LAST:event_updateuserActionPerformed

    private void deleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteuserActionPerformed
        getUser().setVisible(true);
        getUser().adduser.setEnabled(false);
        getUser().updateuser.setEnabled(false);
        getUser().deleteuser.setEnabled(true);
    }//GEN-LAST:event_deleteuserActionPerformed

    private void adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserActionPerformed
        getUser().setVisible(true);
        getUser().deleteuser.setEnabled(false);
        getUser().updateuser.setEnabled(false);
        getUser().adduser.setEnabled(true);
    }//GEN-LAST:event_adduserActionPerformed

    private void drugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugsActionPerformed
        enterdrugs();
    }//GEN-LAST:event_drugsActionPerformed

    private void userBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBActionPerformed
        if (!username.getText().equals("Employee")) {
            enteruser();
        } else {
            String pass = JOptionPane.showInputDialog(null, "You are not allowed to check user Inforamtion\nTo get in please confirm Admin Password");
            String sql = "select NAME,PASSWORD from users where NAME='Syed Ibrahim' ";

            if (!pass.equals("")) {
                try {
                    pre = getCon().prepareStatement(sql);
                    res = pre.executeQuery();
                    if (res.next()) {
                        if (res.getString("PASSWORD").equals(pass)) {
                            enteruser();
                        } else if (pass.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "You must write admin Password", "Failed Access", 2);
                        } else {
                            JOptionPane.showMessageDialog(null, "Wrong Password", "Failed Access", 2);
                        }
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please type in Admin password", "Failed Access", 2);
            }

        }
    }//GEN-LAST:event_userBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void expired1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expired1ActionPerformed
        new Expired_Drug().setVisible(true);
    }//GEN-LAST:event_expired1ActionPerformed

    private void logindetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logindetailsActionPerformed
        new Login_Details().setVisible(true);
    }//GEN-LAST:event_logindetailsActionPerformed

    private void salesbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesbillActionPerformed
        new Sales_Bill().setVisible(true);
    }//GEN-LAST:event_salesbillActionPerformed

    private void almostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_almostActionPerformed
        new AlmostFinish().setVisible(true);
    }//GEN-LAST:event_almostActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Pharmacy().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adddrug;
    private javax.swing.JButton adduser;
    private javax.swing.JButton almost;
    private javax.swing.JButton changepass;
    private javax.swing.JButton checkplace;
    private javax.swing.JButton company;
    private javax.swing.JButton deletedrug;
    private javax.swing.JButton deleteuser;
    private javax.swing.JButton drugdetails;
    private javax.swing.JButton druglist;
    private javax.swing.JButton drugs;
    private javax.swing.JButton editprice;
    private javax.swing.JButton endwith;
    private javax.swing.JButton expired1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logindetails;
    private javax.swing.JButton logout;
    private javax.swing.JButton movedrug;
    private javax.swing.JButton newcom;
    private javax.swing.JButton sales;
    private javax.swing.JButton salesbill;
    private javax.swing.JButton searchdrug;
    private javax.swing.JButton setting;
    public static javax.swing.JLabel time;
    public static javax.swing.JLabel today;
    private javax.swing.JButton updatedrug;
    private javax.swing.JButton updateuser;
    public javax.swing.JButton userB;
    private javax.swing.JLabel username;
    public static javax.swing.JLabel username1;
    // End of variables declaration//GEN-END:variables
    private void showDate() {
        setD(new Date());
        setDd(new SimpleDateFormat("dd-MM-yyyy"));
        today.setText(getDd().format(getD()));

        new Timer(0, (ActionEvent ae) -> {
            Date d1 = new Date();
            SimpleDateFormat dd1 = new SimpleDateFormat("hh:mm:ss a");
            time.setText(dd1.format(d1));
        }).start();
    }

    private void buttonvis() {
        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        checkplace.setVisible(false);
        editprice.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);
        salesbill.setVisible(false);
        newcom.setVisible(false);
        endwith.setVisible(false);
        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void enteruser() {
        userB.setEnabled(false);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(true);
        deleteuser.setVisible(true);
        updateuser.setVisible(true);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        editprice.setVisible(false);
        checkplace.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);
        salesbill.setVisible(false);
        newcom.setVisible(false);
        endwith.setVisible(false);
        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void enterdrugs() {
        drugs.setEnabled(false);
        userB.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(true);
        deletedrug.setVisible(true);
        updatedrug.setVisible(true);
        searchdrug.setVisible(true);
        movedrug.setVisible(true);
        editprice.setVisible(false);
        checkplace.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);
        salesbill.setVisible(false);
        newcom.setVisible(false);
        endwith.setVisible(false);
        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void enterdrugdetails() {
        drugdetails.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        sales.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        editprice.setVisible(true);
        checkplace.setVisible(true);
        expired1.setVisible(true);
        almost.setVisible(true);
        salesbill.setVisible(false);
        newcom.setVisible(false);
        endwith.setVisible(false);
        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void sales() {
        sales.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        setting.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        editprice.setVisible(false);
        checkplace.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);
        salesbill.setVisible(true);
        newcom.setVisible(false);
        endwith.setVisible(false);
        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void setting() {
        setting.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        company.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);

        editprice.setVisible(false);
        checkplace.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);
        salesbill.setVisible(false);
        newcom.setVisible(false);
        endwith.setVisible(false);
        logindetails.setVisible(true);
        changepass.setVisible(true);
        logout.setVisible(true);
    }

    private void company() {
        company.setEnabled(false);
        userB.setEnabled(true);
        drugs.setEnabled(true);
        drugdetails.setEnabled(true);
        sales.setEnabled(true);
        setting.setEnabled(true);

        adduser.setVisible(false);
        deleteuser.setVisible(false);
        updateuser.setVisible(false);

        adddrug.setVisible(false);
        deletedrug.setVisible(false);
        updatedrug.setVisible(false);
        searchdrug.setVisible(false);
        movedrug.setVisible(false);
        editprice.setVisible(false);
        checkplace.setVisible(false);
        expired1.setVisible(false);
        almost.setVisible(false);
        salesbill.setVisible(false);
        newcom.setVisible(true);
        endwith.setVisible(true);
        logindetails.setVisible(false);
        changepass.setVisible(false);
        logout.setVisible(false);
    }

    private void loginas() {
        String sql = "select ID,NAME from users where ID='" + Login.id.getText() + "' ";
        try {
            pre = getCon().prepareStatement(sql);
            res = pre.executeQuery();
            if (res.next()) {
                username1.setText(res.getString("NAME"));
                if (res.getString("ID").equals("1")) {
                    username.setText("Admin");
                } else {
                    username.setText("Employee");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void warning() {
        int ex_year;
        int current_year;
        int ex_month;
        int ex_day;
        int current_month;
        int current_day;
        String sql = "select BARCODE,EXPIRATION_DATE from drugs";
        try {
            pre = getCon().prepareStatement(sql);
            res = pre.executeQuery();
            while (res.next()) {
                Warning warning = new Warning();
                ex_year = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[2]);
                ex_month = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[1]);
                ex_day = Integer.parseInt(res.getString("EXPIRATION_DATE").split("-")[0]);
                current_year = Integer.parseInt(getDd().format(getD()).split("-")[2]);
                current_month = Integer.parseInt(getDd().format(getD()).split("-")[1]);
                current_day = Integer.parseInt(getDd().format(getD()).split("-")[0]);
                if (ex_year == current_year) {
                    if (ex_month - current_month == 2) {
                        setEx(1);
                        setAlmost_expired_bar(res.getString("BARCODE"));
                        warning.setVisible(true);
                    } else if (ex_month == current_month) {
                        if (ex_day == current_day) {
                            setEx(0);
                            setExpired_bar(res.getString("BARCODE"));
                            update_to_expired();
                            warning.setVisible(true);
                        }
                    }
                }

            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void update_to_expired() {
        String sql = "update drugs set EXPIRY='Expired' where BARCODE='" + getExpired_bar() + "' ";
        try {
            pre = getCon().prepareStatement(sql);
            pre.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", 2);
        }
    }

    private void login_as() {
        Date d = new Date();
        SimpleDateFormat dd = new SimpleDateFormat("hh:mm:ss");
        String sql = "insert into login (NAME,TYPE,DATE,TIME) values ('" + username1.getText() + "' ,'" + username.getText() + "' ,'" + today.getText() + "' ,'" + dd.format(d) + "' )";
        try {
            pre = getCon().prepareStatement(sql);
            pre.execute();
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

    public static int getEx() {
        return ex;
    }

    public static void setEx(int aEx) {
        ex = aEx;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getComp() {
        return comp;
    }

    public void setComp(Company comp) {
        this.comp = comp;
    }

    public static Drug getDrug() {
        return drug;
    }

    public static void setDrug(Drug aDrug) {
        drug = aDrug;
    }

    public static MoveDrug getMove_drug() {
        return move_drug;
    }

    public static void setMove_drug(MoveDrug aMove_drug) {
        move_drug = aMove_drug;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    public SimpleDateFormat getDd() {
        return dd;
    }

    public void setDd(SimpleDateFormat dd) {
        this.dd = dd;
    }

    public static String getTo() {
        return to;
    }

    public static void setTo(String aTo) {
        to = aTo;
    }

    public static String getText() {
        return text;
    }

    public static void setText(String aText) {
        text = aText;
    }

    public static String getAlmost_expired_bar() {
        return almost_expired_bar;
    }

    public static void setAlmost_expired_bar(String aAlmost_expired_bar) {
        almost_expired_bar = aAlmost_expired_bar;
    }

    public static String getExpired_bar() {
        return expired_bar;
    }

    public static void setExpired_bar(String aExpired_bar) {
        expired_bar = aExpired_bar;
    }

}
