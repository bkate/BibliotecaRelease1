/*
 * Created by JFormDesigner on Fri Jan 16 23:50:52 CET 2015
 */

package com.twuAssignementsPart1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Kaoutare Bedda
 */
public class Gui {
    public Gui() {
        initComponents();
    }

    private void textFieldBookDetailActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void cancelButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Kaoutare Bedda
        BibliotecaR = new JFrame();
        menuBar1 = new JMenuBar();
        panel1 = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();
        panel2 = new JPanel();
        comboBox1 = new JComboBox();
        label1 = new JLabel();

        //======== BibliotecaR ========
        {
            BibliotecaR.setTitle("Biblioteca");
            BibliotecaR.setResizable(false);
            Container BibliotecaRContentPane = BibliotecaR.getContentPane();
            BibliotecaRContentPane.setLayout(new BorderLayout());
            BibliotecaR.setJMenuBar(menuBar1);

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


                //---- okButton ----
                okButton.setText("OK");

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                cancelButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cancelButtonActionPerformed(e);
                    }
                });

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap(157, Short.MAX_VALUE)
                            .addComponent(cancelButton, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(okButton, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                            .addContainerGap(51, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(cancelButton)
                                .addComponent(okButton))
                            .addGap(17, 17, 17))
                );
            }
            BibliotecaRContentPane.add(panel1, BorderLayout.SOUTH);

            //======== panel2 ========
            {

                //---- comboBox1 ----
                comboBox1.setModel(new DefaultComboBoxModel(new String[] {
                    "Head first java",
                    "Moneyball: the art of wining a unfair game",
                    "The memory",
                    "Stoertebeker"
                }));

                //---- label1 ----
                label1.setText("Select a book from library:");
                label1.setFont(new Font("Meiryo", Font.PLAIN, 14));

                GroupLayout panel2Layout = new GroupLayout(panel2);
                panel2.setLayout(panel2Layout);
                panel2Layout.setHorizontalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addGap(18, 18, 18))
                );
                panel2Layout.setVerticalGroup(
                    panel2Layout.createParallelGroup()
                        .addGroup(panel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(panel2Layout.createParallelGroup()
                                .addComponent(label1)
                                .addComponent(comboBox1))
                            .addGap(151, 151, 151))
                );
            }
            BibliotecaRContentPane.add(panel2, BorderLayout.NORTH);
            BibliotecaR.pack();
            BibliotecaR.setLocationRelativeTo(BibliotecaR.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Kaoutare Bedda
    private JFrame BibliotecaR;
    private JMenuBar menuBar1;
    private JPanel panel1;
    private JButton okButton;
    private JButton cancelButton;
    private JPanel panel2;
    private JComboBox comboBox1;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
