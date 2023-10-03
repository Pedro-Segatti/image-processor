/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.imageprocessor.views;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.imageprocessor.models.Image;
import org.imageprocessor.utils.ImageUtils;
import org.imageprocessor.utils.Operation;

/**
 *
 * @author Pedro
 */
public class main extends javax.swing.JFrame {

    private Image imageA;
    private Image imageB;
    private Image imageResult;

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        labelImageA = new javax.swing.JLabel();
        labelImageB = new javax.swing.JLabel();
        labelImageResult = new javax.swing.JLabel();
        btnLoadA = new javax.swing.JButton();
        btnLoadB = new javax.swing.JButton();
        btnAND = new javax.swing.JButton();
        btnOR = new javax.swing.JButton();
        btnXOR = new javax.swing.JButton();
        btnNOT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnBinary = new javax.swing.JButton();
        btnGrayScale = new javax.swing.JButton();
        btnADC = new javax.swing.JButton();
        btnMUL = new javax.swing.JButton();
        btnSUB = new javax.swing.JButton();
        btnDIV = new javax.swing.JButton();
        btnBLEN = new javax.swing.JButton();
        tFValueFor = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnNegative = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnMin = new javax.swing.JButton();
        btnMedia = new javax.swing.JButton();
        btnMediana = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        title.setText("Processador de Imagens");

        labelImageA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelImageB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelImageResult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLoadA.setText("Carregar Imagem A");
        btnLoadA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadAActionPerformed(evt);
            }
        });

        btnLoadB.setText("Carregar Imagem B");
        btnLoadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadBActionPerformed(evt);
            }
        });

        btnAND.setText("AND");
        btnAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANDActionPerformed(evt);
            }
        });

        btnOR.setText("OR");
        btnOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnORActionPerformed(evt);
            }
        });

        btnXOR.setText("XOR");
        btnXOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXORActionPerformed(evt);
            }
        });

        btnNOT.setText("NOT");
        btnNOT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNOTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("=");

        btnBinary.setText("Binária");
        btnBinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinaryActionPerformed(evt);
            }
        });

        btnGrayScale.setText("Escala de Cinza");
        btnGrayScale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrayScaleActionPerformed(evt);
            }
        });

        btnADC.setText("Adicionar");
        btnADC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADCActionPerformed(evt);
            }
        });

        btnMUL.setText("Multiplicar");
        btnMUL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMULActionPerformed(evt);
            }
        });

        btnSUB.setText("Substrair");
        btnSUB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSUBActionPerformed(evt);
            }
        });

        btnDIV.setText("Dividir");
        btnDIV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDIVActionPerformed(evt);
            }
        });

        btnBLEN.setText("Blending");
        btnBLEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBLENActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnNegative.setText("Negativa");
        btnNegative.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativeActionPerformed(evt);
            }
        });

        btnMax.setText("Máximo");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Filtros");

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnMin.setText("Mínimo");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });

        btnMedia.setText("Média");
        btnMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediaActionPerformed(evt);
            }
        });

        btnMediana.setText("Mediana");
        btnMediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedianaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(labelImageA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNOT, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(btnXOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(labelImageB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(labelImageResult, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnLoadA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)
                        .addComponent(btnLoadB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainLayout.createSequentialGroup()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(title))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(tFValueFor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDIV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnADC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSUB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMUL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBLEN, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnGrayScale, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBinary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNegative, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator4)
                            .addComponent(jLabel2)
                            .addComponent(btnMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMediana, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImageA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(labelImageB, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1))
                            .addGroup(mainLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(labelImageResult, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnAND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXOR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNOT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLoadA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnLoadB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(mainLayout.createSequentialGroup()
                            .addComponent(btnBinary, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7)
                            .addComponent(btnGrayScale, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnNegative, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainLayout.createSequentialGroup()
                                    .addComponent(btnADC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSUB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tFValueFor)
                                        .addComponent(btnDIV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMUL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBLEN, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator5))
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMax, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadBActionPerformed
        // TODO add your handling code here:
        this.imageB = ImageUtils.loadImage();
        this.labelImageB.setIcon(new ImageIcon(imageB.getImage()));
    }//GEN-LAST:event_btnLoadBActionPerformed

    private void btnANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANDActionPerformed
        // TODO add your handling code here:
        if (!validateImgAAndB()) {
            return;
        }

        Image imgABinario = new Image(imageA.getBinaryImage());
        Image imgBBinario = new Image(imageB.getBinaryImage());

        Image imgResultado = ImageUtils.doOperationInImages(imgABinario, imgBBinario, null, Operation.AND);
        this.labelImageResult.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnANDActionPerformed

    private boolean validateImgA() {
        if (imageA == null) {
            JOptionPane.showMessageDialog(null, "Escolha a Imagem A");
            return false;
        }
        return true;
    }

    private boolean validateImgAAndB() {
        if (!validateImgA()) {
            return false;
        }
        if (imageB == null) {
            JOptionPane.showMessageDialog(null, "Escolha a Imagem B");
            return false;
        }
        return true;
    }

    private void btnORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnORActionPerformed
        // TODO add your handling code here:
        if (!validateImgAAndB()) {
            return;
        }

        Image imgABinario = new Image(imageA.getBinaryImage());
        Image imgBBinario = new Image(imageB.getBinaryImage());

        Image imgResultado = ImageUtils.doOperationInImages(imgABinario, imgBBinario, null, Operation.OR);
        this.labelImageResult.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnORActionPerformed

    private void btnXORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXORActionPerformed
        // TODO add your handling code here:
        if (!validateImgAAndB()) {
            return;
        }

        Image imgABinario = new Image(imageA.getBinaryImage());
        Image imgBBinario = new Image(imageB.getBinaryImage());

        Image imgResultado = ImageUtils.doOperationInImages(imgABinario, imgBBinario, null, Operation.XOR);
        this.labelImageResult.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnXORActionPerformed

    private void btnNOTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNOTActionPerformed
        // TODO add your handling code here:
        if (!validateImgAAndB()) {
            return;
        }

        Image imgABinario = new Image(imageA.getBinaryImage());
        Image imgBBinario = new Image(imageB.getBinaryImage());

        Image imgResultado = ImageUtils.doOperationInImages(imgABinario, imgBBinario, null, Operation.NOT);
        this.labelImageResult.setIcon(new ImageIcon(imgResultado.getMatrixImage()));
    }//GEN-LAST:event_btnNOTActionPerformed

    private void btnLoadAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadAActionPerformed
        this.imageA = ImageUtils.loadImage();
        this.labelImageA.setIcon(new ImageIcon(imageA.getImage()));

    }//GEN-LAST:event_btnLoadAActionPerformed

    private void btnBinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinaryActionPerformed
        // TODO add your handling code here:
        if (!validateImgA()) {
            return;
        }
        labelImageResult.setIcon(new ImageIcon(imageA.getBinaryImage()));
    }//GEN-LAST:event_btnBinaryActionPerformed

    private void btnGrayScaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrayScaleActionPerformed
        if (!validateImgA()) {
            return;
        }
        labelImageResult.setIcon(new ImageIcon(imageA.getGrayImage()));
    }//GEN-LAST:event_btnGrayScaleActionPerformed

    private void btnADCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADCActionPerformed
        // TODO add your handling code here:
        String txt = tFValueFor.getText();
        if (nullOrEmpty(txt)) {
            if (!validateImgAAndB()) {
                return;
            }

            Image result = ImageUtils.doOperationInImages(imageA, imageB, null, Operation.SUM);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            Image result = ImageUtils.doOperationInImage(imageA, value, null, Operation.SUM);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        }
    }//GEN-LAST:event_btnADCActionPerformed

    private boolean nullOrEmpty(String txt) {
        return txt == null || txt.isEmpty();
    }

    private void btnSUBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSUBActionPerformed
        // TODO add your handling code here:
        String txt = tFValueFor.getText();
        if (nullOrEmpty(txt)) {
            if (!validateImgAAndB()) {
                return;
            }

            Image result = ImageUtils.doOperationInImages(imageA, imageB, null, Operation.SUBTRACT);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            Image result = ImageUtils.doOperationInImage(imageA, value, null, Operation.SUBTRACT);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        }
    }//GEN-LAST:event_btnSUBActionPerformed

    private void btnDIVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDIVActionPerformed
        // TODO add your handling code here:
        String txt = tFValueFor.getText();
        if (nullOrEmpty(txt)) {
            if (!validateImgAAndB()) {
                return;
            }

            Image result = ImageUtils.doOperationInImages(imageA, imageB, null, Operation.DIVISION);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            Image result = ImageUtils.doOperationInImage(imageA, value, null, Operation.DIVISION);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        }
    }//GEN-LAST:event_btnDIVActionPerformed

    private void btnMULActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMULActionPerformed
        // TODO add your handling code here:
        String txt = tFValueFor.getText();
        if (nullOrEmpty(txt)) {
            if (!validateImgAAndB()) {
                return;
            }

            Image result = ImageUtils.doOperationInImages(imageA, imageB, null, Operation.MULTIPLICATION);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        } else {
            if (!validateImgA()) {
                return;
            }
            int value = Integer.parseInt(txt);
            Image result = ImageUtils.doOperationInImage(imageA, value, null, Operation.MULTIPLICATION);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        }
    }//GEN-LAST:event_btnMULActionPerformed

    private void btnBLENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBLENActionPerformed
        // TODO add your handling code here:
        if (!validateImgAAndB()) {
            return;
        }

        String txt = tFValueFor.getText();
        if (nullOrEmpty(txt)) {
            Image result = ImageUtils.doOperationInImages(imageA, imageA, 0, Operation.BLENDING);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        } else {
            int coeficient = Integer.parseInt(txt);
            Image result = ImageUtils.doOperationInImages(imageA, imageA, coeficient, Operation.BLENDING);
            labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
        }
    }//GEN-LAST:event_btnBLENActionPerformed

    private void btnNegativeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativeActionPerformed
        // TODO add your handling code here:
        if (!validateImgA()) {
            return;
        }
        Image result = ImageUtils.doOperationInImage(imageA, null, null, Operation.NEGATIVE);

        labelImageResult.setIcon(new ImageIcon(result.getMatrixImage()));
    }//GEN-LAST:event_btnNegativeActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        // TODO add your handling code here:
        if (!validateImgA()) {
            return;
        }
        Image image = ImageUtils.applyFilterInImage(this.imageA, 3, Operation.MAX);
        this.labelImageResult.setIcon(new ImageIcon(image.getMatrixImage()));
    }//GEN-LAST:event_btnMaxActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        if (!validateImgA()) {
            return;
        }
        Image image = ImageUtils.applyFilterInImage(this.imageA, 3, Operation.MIN);
        this.labelImageResult.setIcon(new ImageIcon(image.getMatrixImage()));
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediaActionPerformed
        if (!validateImgA()) {
            return;
        }
        Image image = ImageUtils.applyFilterInImage(this.imageA, 3, Operation.MEDIA);
        this.labelImageResult.setIcon(new ImageIcon(image.getMatrixImage()));
    }//GEN-LAST:event_btnMediaActionPerformed

    private void btnMedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedianaActionPerformed
        if (!validateImgA()) {
            return;
        }
        Image image = ImageUtils.applyFilterInImage(this.imageA, 3, Operation.MEDIANA);
        this.labelImageResult.setIcon(new ImageIcon(image.getMatrixImage()));
    }//GEN-LAST:event_btnMedianaActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADC;
    private javax.swing.JButton btnAND;
    private javax.swing.JButton btnBLEN;
    private javax.swing.JButton btnBinary;
    private javax.swing.JButton btnDIV;
    private javax.swing.JButton btnGrayScale;
    private javax.swing.JButton btnLoadA;
    private javax.swing.JButton btnLoadB;
    private javax.swing.JButton btnMUL;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMedia;
    private javax.swing.JButton btnMediana;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnNOT;
    private javax.swing.JButton btnNegative;
    private javax.swing.JButton btnOR;
    private javax.swing.JButton btnSUB;
    private javax.swing.JButton btnXOR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelImageA;
    private javax.swing.JLabel labelImageB;
    private javax.swing.JLabel labelImageResult;
    private javax.swing.JPanel main;
    private javax.swing.JTextField tFValueFor;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
