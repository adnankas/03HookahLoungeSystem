/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;


import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author taula
 */
public class PaneliUshqime extends javax.swing.JInternalFrame {

    /**
     * Creates new form PaneliUshqime
     */
    PaneliPije pj=new PaneliPije();
    public PaneliUshqime() {
        initComponents();
        
    }
     public String shfaq(){
         DecimalFormat formatuesi = new DecimalFormat("0.00");
        return formatuesi.format(vleraAktualee)+ " Eur";
    }
    private double vleraAktualee;

    public void reset(){
         vleraAktualee=0.0;
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        totaliii = new javax.swing.JTextField();
        marinara = new javax.swing.JButton();
        margarita = new javax.swing.JButton();
        proshuta = new javax.swing.JButton();
        fungi = new javax.swing.JButton();
        kapriqosa = new javax.swing.JButton();
        peproni = new javax.swing.JButton();
        karbonara = new javax.swing.JButton();
        spanaq = new javax.swing.JButton();
        eshpis = new javax.swing.JButton();
        bbq = new javax.swing.JButton();
        vegjetariane = new javax.swing.JButton();
        tuna = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel3.setFont(new java.awt.Font("TYPOGRAPH PRO", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PIZZA");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CHECKOUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        totaliii.setBackground(new java.awt.Color(204, 204, 204));
        totaliii.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        totaliii.setForeground(new java.awt.Color(0, 0, 0));
        totaliii.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totaliii.setBorder(null);
        totaliii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaliiiActionPerformed(evt);
            }
        });

        marinara.setBackground(new java.awt.Color(97, 97, 97));
        marinara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        marinara.setForeground(new java.awt.Color(255, 255, 255));
        marinara.setText("Pizza Marinara");
        marinara.setBorder(null);
        marinara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marinaraActionPerformed(evt);
            }
        });

        margarita.setBackground(new java.awt.Color(97, 97, 97));
        margarita.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        margarita.setForeground(new java.awt.Color(255, 255, 255));
        margarita.setText("Pizza Margherita");
        margarita.setBorder(null);
        margarita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                margaritaActionPerformed(evt);
            }
        });

        proshuta.setBackground(new java.awt.Color(97, 97, 97));
        proshuta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        proshuta.setForeground(new java.awt.Color(255, 255, 255));
        proshuta.setText("Pizza Prosciotto");
        proshuta.setBorder(null);
        proshuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proshutaActionPerformed(evt);
            }
        });

        fungi.setBackground(new java.awt.Color(97, 97, 97));
        fungi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fungi.setForeground(new java.awt.Color(255, 255, 255));
        fungi.setText("Pizza Fungi");
        fungi.setBorder(null);
        fungi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fungiActionPerformed(evt);
            }
        });

        kapriqosa.setBackground(new java.awt.Color(97, 97, 97));
        kapriqosa.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        kapriqosa.setForeground(new java.awt.Color(255, 255, 255));
        kapriqosa.setText("Pizza Capricciosa");
        kapriqosa.setBorder(null);
        kapriqosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapriqosaActionPerformed(evt);
            }
        });

        peproni.setBackground(new java.awt.Color(97, 97, 97));
        peproni.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        peproni.setForeground(new java.awt.Color(255, 255, 255));
        peproni.setText("Pizza Peperoni");
        peproni.setBorder(null);
        peproni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                peproniActionPerformed(evt);
            }
        });

        karbonara.setBackground(new java.awt.Color(97, 97, 97));
        karbonara.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        karbonara.setForeground(new java.awt.Color(255, 255, 255));
        karbonara.setText("Pizza Carbonara");
        karbonara.setBorder(null);
        karbonara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karbonaraActionPerformed(evt);
            }
        });

        spanaq.setBackground(new java.awt.Color(97, 97, 97));
        spanaq.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        spanaq.setForeground(new java.awt.Color(255, 255, 255));
        spanaq.setText("Pizza Spinach and egg");
        spanaq.setBorder(null);
        spanaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spanaqActionPerformed(evt);
            }
        });

        eshpis.setBackground(new java.awt.Color(97, 97, 97));
        eshpis.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eshpis.setForeground(new java.awt.Color(255, 255, 255));
        eshpis.setText("Pizza e Shpise");
        eshpis.setBorder(null);
        eshpis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eshpisActionPerformed(evt);
            }
        });

        bbq.setBackground(new java.awt.Color(97, 97, 97));
        bbq.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        bbq.setForeground(new java.awt.Color(255, 255, 255));
        bbq.setText("Pizza BBQ");
        bbq.setBorder(null);
        bbq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbqActionPerformed(evt);
            }
        });

        vegjetariane.setBackground(new java.awt.Color(97, 97, 97));
        vegjetariane.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        vegjetariane.setForeground(new java.awt.Color(255, 255, 255));
        vegjetariane.setText("Pizza Vegetariana");
        vegjetariane.setBorder(null);
        vegjetariane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vegjetarianeActionPerformed(evt);
            }
        });

        tuna.setBackground(new java.awt.Color(97, 97, 97));
        tuna.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tuna.setForeground(new java.awt.Color(255, 255, 255));
        tuna.setText("Pizza Tono");
        tuna.setBorder(null);
        tuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tunaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2.5€");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("3€");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("4€");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("4€");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("4€");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("4€");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("4€");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("4€");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("4.5€");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("5€");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("5€");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("5€");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(totaliii, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(fungi, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(kapriqosa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(karbonara, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spanaq, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(bbq, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vegjetariane, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eshpis, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(peproni, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tuna, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(marinara, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(margarita, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(proshuta, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(totaliii, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marinara, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(margarita, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proshuta, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fungi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kapriqosa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peproni, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(karbonara, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eshpis, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spanaq, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bbq, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuna, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vegjetariane, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setBackground(java.awt.Color.darkGray);
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("X");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 277, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
       dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void totaliiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaliiiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaliiiActionPerformed

    private void marinaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marinaraActionPerformed
       vleraAktualee= vleraAktualee+ 2.5;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_marinaraActionPerformed

    private void margaritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_margaritaActionPerformed
        vleraAktualee= vleraAktualee+ 3;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_margaritaActionPerformed

    private void proshutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proshutaActionPerformed
       vleraAktualee= vleraAktualee+ 4;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_proshutaActionPerformed

    private void fungiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fungiActionPerformed
         vleraAktualee= vleraAktualee+ 4;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_fungiActionPerformed

    private void kapriqosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapriqosaActionPerformed
         vleraAktualee= vleraAktualee+ 4;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_kapriqosaActionPerformed

    private void peproniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_peproniActionPerformed
        vleraAktualee= vleraAktualee+ 4;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_peproniActionPerformed

    private void karbonaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karbonaraActionPerformed
        vleraAktualee= vleraAktualee+ 4;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_karbonaraActionPerformed

    private void spanaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spanaqActionPerformed
        vleraAktualee= vleraAktualee+ 4;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_spanaqActionPerformed

    private void eshpisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eshpisActionPerformed
         vleraAktualee= vleraAktualee+ 4.5;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_eshpisActionPerformed

    private void bbqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbqActionPerformed
        vleraAktualee= vleraAktualee+ 5;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_bbqActionPerformed

    private void vegjetarianeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vegjetarianeActionPerformed
        vleraAktualee= vleraAktualee+ 5;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_vegjetarianeActionPerformed

    private void tunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tunaActionPerformed
        vleraAktualee= vleraAktualee+ 5;
        totaliii.setText(""+shfaq());
    }//GEN-LAST:event_tunaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        totaliii.setText(""+shfaq());
        JOptionPane.showMessageDialog(null, "Vlera e porosise eshte: "+shfaq(),"SUCCESS",JOptionPane.INFORMATION_MESSAGE);
        reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        OrderHome o = new OrderHome();
        OrderTable ot = new OrderTable();
        o.getDpaneliUshqime().add(ot);
        ot.show();
        o.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Dark Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaneliUshqime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaneliUshqime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaneliUshqime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaneliUshqime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaneliUshqime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbq;
    private javax.swing.JButton eshpis;
    private javax.swing.JButton fungi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kapriqosa;
    private javax.swing.JButton karbonara;
    private javax.swing.JButton margarita;
    private javax.swing.JButton marinara;
    private javax.swing.JButton peproni;
    private javax.swing.JButton proshuta;
    private javax.swing.JButton spanaq;
    private javax.swing.JTextField totaliii;
    private javax.swing.JButton tuna;
    private javax.swing.JButton vegjetariane;
    // End of variables declaration//GEN-END:variables
}
