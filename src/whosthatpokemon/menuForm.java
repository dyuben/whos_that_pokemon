/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * menuForm.java
 *
 * Created on Jul 31, 2013, 2:49:00 PM
 */
package whosthatpokemon;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.Timer;


/**
 *
 * @author mychll
 */
public class menuForm extends javax.swing.JFrame {

    /** Creates new form menuForm */
    String pokname;
    int pokcount;
    int countpic=0;
    int correct=0;
    int wrong=0;
    String letter;
    int lblcount=1;
    ImageIcon picb, picnext;
    boolean ee;
    int cnt;
    
    public menuForm() {
        initComponents();

    }


    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton23 = new javax.swing.JButton();
        lbllettercount = new javax.swing.JLabel();
        lblimage = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        lblcorrect = new javax.swing.JLabel();
        lblwrong = new javax.swing.JLabel();
        cmdstart = new javax.swing.JButton();
        correctlabel = new javax.swing.JLabel();
        wronglabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whosthatpokemon/next.png"))); // NOI18N
        jButton23.setContentAreaFilled(false);
        jButton23.setEnabled(false);
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton23MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);
            }
        });
        jButton23.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton23MouseMoved(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 230, 130, 100));

        lbllettercount.setBackground(new java.awt.Color(153, 255, 255));
        lbllettercount.setOpaque(true);
        getContentPane().add(lbllettercount, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 100, 60));

        lblimage.setBackground(new java.awt.Color(255, 255, 255));
        lblimage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 5, true));
        lblimage.setOpaque(true);
        lblimage.setPreferredSize(new java.awt.Dimension(181, 234));
        getContentPane().add(lblimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 200, 317));

        lblname.setBackground(new java.awt.Color(153, 255, 255));
        lblname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 3, true));
        lblname.setOpaque(true);
        getContentPane().add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 200, 23));
        lblname.getAccessibleContext().setAccessibleName("lblname");

        jButton1.setText("A");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jButton2.setText("B");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jButton4.setText("D");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, -1, -1));

        jButton6.setText("C");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        jButton7.setText("I");
        jButton7.setEnabled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        jButton8.setText("F");
        jButton8.setEnabled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));

        jButton9.setText("H");
        jButton9.setEnabled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        jButton10.setText("E");
        jButton10.setEnabled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jButton11.setText("G");
        jButton11.setEnabled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, -1, -1));

        jButton12.setText("N");
        jButton12.setEnabled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        jButton13.setText("P");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        jButton14.setText("O");
        jButton14.setEnabled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, -1, -1));

        jButton15.setText("Q");
        jButton15.setEnabled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        jButton16.setText("R");
        jButton16.setEnabled(false);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, -1));

        jButton5.setText("M");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jButton3.setText("K");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        jButton17.setText("J");
        jButton17.setEnabled(false);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        jButton18.setText("L");
        jButton18.setEnabled(false);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, -1));

        jButton19.setText("W");
        jButton19.setEnabled(false);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, -1, -1));

        jButton20.setText("Y");
        jButton20.setEnabled(false);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));

        jButton21.setText("X");
        jButton21.setEnabled(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, -1, -1));

        jButton22.setText("Z");
        jButton22.setEnabled(false);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        jButton24.setText("V");
        jButton24.setEnabled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        jButton25.setText("T");
        jButton25.setEnabled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, -1));

        jButton26.setText("S");
        jButton26.setEnabled(false);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, -1, -1));

        jButton27.setText("U");
        jButton27.setEnabled(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));
        getContentPane().add(lblcorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 305, -1, -1));
        getContentPane().add(lblwrong, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 311, -1, -1));

        cmdstart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whosthatpokemon/start.png"))); // NOI18N
        cmdstart.setContentAreaFilled(false);
        cmdstart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmdstartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmdstartMousePressed(evt);
            }
        });
        cmdstart.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmdstartMouseMoved(evt);
            }
        });
        cmdstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdstartActionPerformed(evt);
            }
        });
        getContentPane().add(cmdstart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 110));

        correctlabel.setBackground(new java.awt.Color(153, 255, 102));
        correctlabel.setOpaque(true);
        getContentPane().add(correctlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 100, 37));

        wronglabel.setBackground(new java.awt.Color(153, 255, 102));
        wronglabel.setOpaque(true);
        getContentPane().add(wronglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 100, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whosthatpokemon/pokeback.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    letter="A";
    callletter();
  
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    letter="B";
    callletter(); 
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    letter="C";
    callletter(); 
}//GEN-LAST:event_jButton6ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    letter="D";
    callletter(); 
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
    letter="E";
    callletter(); 
}//GEN-LAST:event_jButton10ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    letter="F";
    callletter(); 
}//GEN-LAST:event_jButton8ActionPerformed

private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    letter="G";
    callletter(); 
}//GEN-LAST:event_jButton11ActionPerformed

private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    letter="H";
    callletter(); 
}//GEN-LAST:event_jButton9ActionPerformed

private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    letter="I";
    callletter(); 
}//GEN-LAST:event_jButton7ActionPerformed

private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
    letter="J";
    callletter(); 
}//GEN-LAST:event_jButton17ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    letter="K";
    callletter(); 
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
    letter="L";
    callletter(); 
}//GEN-LAST:event_jButton18ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    letter="M";
    callletter(); 
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
    letter="N";
    callletter(); 
}//GEN-LAST:event_jButton12ActionPerformed

private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
    letter="O";
    callletter(); 
}//GEN-LAST:event_jButton14ActionPerformed

private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
    letter="P";
    callletter(); 
}//GEN-LAST:event_jButton13ActionPerformed

private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
    letter="Q";
    callletter(); 
}//GEN-LAST:event_jButton15ActionPerformed

private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
    letter="R";
    callletter(); 
}//GEN-LAST:event_jButton16ActionPerformed

private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
    letter="S";
    callletter(); 
}//GEN-LAST:event_jButton26ActionPerformed

private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
    letter="T";
    callletter(); 
}//GEN-LAST:event_jButton25ActionPerformed

private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
    letter="U";
    callletter(); 
}//GEN-LAST:event_jButton27ActionPerformed

private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    letter="V";
    callletter(); 
}//GEN-LAST:event_jButton24ActionPerformed

private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    letter="W";
    callletter(); 
}//GEN-LAST:event_jButton19ActionPerformed

private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    letter="X";
    callletter(); 
}//GEN-LAST:event_jButton21ActionPerformed

private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
    letter="Y";
    callletter(); 
}//GEN-LAST:event_jButton20ActionPerformed

private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
    letter="Z";
    callletter(); 
}//GEN-LAST:event_jButton22ActionPerformed

private void cmdstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdstartActionPerformed
    ee=true;
    lblname.setText("");
    callbuttonsenable();
    picnext = new ImageIcon("images\\buttons\\next.png");
    jButton23.setIcon(picnext);
    Random random = new Random();
    int randomInteger = (int) ((Math.random() * 35)+1);
    countpic=randomInteger;
    showpic();
}//GEN-LAST:event_cmdstartActionPerformed

private void cmdstartMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdstartMouseMoved
    picnext = new ImageIcon("images\\buttons\\startmove.png");
    cmdstart.setIcon(picnext);
}//GEN-LAST:event_cmdstartMouseMoved

private void cmdstartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdstartMouseExited
    picnext = new ImageIcon("images\\buttons\\start.png");
    cmdstart.setIcon(picnext);
}//GEN-LAST:event_cmdstartMouseExited

private void cmdstartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdstartMousePressed
    picnext = new ImageIcon("images\\buttons\\startpress.png");
    cmdstart.setIcon(picnext);
}//GEN-LAST:event_cmdstartMousePressed

private void jButton23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseExited
    if(ee) {
        picnext = new ImageIcon("images\\buttons\\next.png");
        jButton23.setIcon(picnext);
    }
}//GEN-LAST:event_jButton23MouseExited

private void jButton23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MousePressed
    if(ee) {
        picnext = new ImageIcon("images\\buttons\\nextpress.png");
        jButton23.setIcon(picnext);
    }
}//GEN-LAST:event_jButton23MousePressed

private void jButton23MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseMoved
    if(ee) {
        picnext = new ImageIcon("images\\buttons\\nextmove.png");
        jButton23.setIcon(picnext);
    }    
}//GEN-LAST:event_jButton23MouseMoved

private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
countpic = countpic +1;

    if (lblname.getText() == null || lblname.getText()==""){
        wrong = wrong + 1;
        wronglabel.setText(" WRONG : "+Integer.toString(wrong));
    }
    else{
        lblname.setText("");
    }
    String pokename=lblname.getText().toLowerCase();

      
showpic();
callbuttonsenable();
}//GEN-LAST:event_jButton23ActionPerformed

private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_jButton23MouseClicked

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
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new menuForm().setVisible(true);
            }
        });
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdstart;
    private javax.swing.JLabel correctlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblcorrect;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lbllettercount;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblwrong;
    private javax.swing.JLabel wronglabel;
    // End of variables declaration//GEN-END:variables

    private void callletter() {
        
    if(lblcount < pokcount){
        String name=lblname.getText() + letter;
        lblname.setText(name);
    }
    lblcount=lblname.getText().length();
    lbllettercount.setText("<html>GUESS YOUR <br>POKEMON WITH <b>" + Integer.toString(pokcount-lblcount) + "</b> LETTERS</html>");
    
    if(lblcount == pokcount){
    String pokename=lblname.getText().toLowerCase();
    
        if(pokename.equals(pokname) ){
            correct = correct + 1;
            correctlabel.setText(" CORRECT : "+Integer.toString(correct));
            picb = new ImageIcon("images\\"+ pokname +".jpg");
            lblimage.setIcon(picb);
        }
        else{
            wrong = wrong + 1;
            wronglabel.setText(" WRONG : "+Integer.toString(wrong));
        }
    }
    
    if(lblcount >= pokcount){
        calldisablebuttons();
    }
    
    }

    private void calldisablebuttons() {
      jButton1.setEnabled(false);
      jButton2.setEnabled(false);
      jButton6.setEnabled(false);
      jButton4.setEnabled(false);
      jButton10.setEnabled(false);
      jButton8.setEnabled(false);
      jButton11.setEnabled(false);
      jButton9.setEnabled(false);
      jButton7.setEnabled(false);
      jButton17.setEnabled(false);
      jButton3.setEnabled(false);
      jButton18.setEnabled(false);
      jButton5.setEnabled(false);
      jButton12.setEnabled(false);
      jButton14.setEnabled(false);
      jButton13.setEnabled(false);
      jButton15.setEnabled(false);
      jButton16.setEnabled(false);
      jButton25.setEnabled(false);
      jButton26.setEnabled(false);
      jButton27.setEnabled(false);
      jButton24.setEnabled(false);
      jButton19.setEnabled(false);
      jButton21.setEnabled(false);
      jButton20.setEnabled(false);
      jButton22.setEnabled(false);
    }

    private void callbuttonsenable() {
      jButton1.setEnabled(true);
      jButton2.setEnabled(true);
      jButton6.setEnabled(true);
      jButton4.setEnabled(true);
      jButton10.setEnabled(true);
      jButton8.setEnabled(true);
      jButton11.setEnabled(true);
      jButton9.setEnabled(true);
      jButton7.setEnabled(true);
      jButton17.setEnabled(true);
      jButton3.setEnabled(true);
      jButton18.setEnabled(true);
      jButton5.setEnabled(true);
      jButton12.setEnabled(true);
      jButton14.setEnabled(true);
      jButton13.setEnabled(true);
      jButton15.setEnabled(true);
      jButton16.setEnabled(true);
      jButton25.setEnabled(true);
      jButton26.setEnabled(true);
      jButton27.setEnabled(true);
      jButton24.setEnabled(true);
      jButton19.setEnabled(true);
      jButton21.setEnabled(true);
      jButton20.setEnabled(true);
      jButton22.setEnabled(true);
      jButton23.setEnabled(true);
      
    }

    private void showpic() {
    
    lblname.setText("");   

    if (countpic==1){
        picb = new ImageIcon("images\\shadows\\beedrill.png");
        pokcount = 8;
        pokname = "beedrill";
    }
     else if (countpic==2) {
        picb = new ImageIcon("images\\shadows\\blastoise.png");
        pokcount = 9;
        pokname = "blastoise";
     }
     else if (countpic==3){
        picb = new ImageIcon("images\\shadows\\bulbasaur.png");
        pokcount = 9;
        pokname = "bulbasaur";
      }
     else if (countpic==4) {
        picb = new ImageIcon("images\\shadows\\butterfree.png");
        pokcount = 10;
        pokname = "butterfree";
     }
     else if (countpic==5) {
        picb = new ImageIcon ("images\\shadows\\caterpie.png");
        pokcount = 8;
        pokname = "caterpie";
     }
    else if (countpic==6) {
        picb = new ImageIcon ("images\\shadows\\charizard.png");
        pokcount = 9;
        pokname = "charizard";
     }
     else if (countpic==7) {
        picb = new ImageIcon ("images\\shadows\\charmander.png");
        pokcount = 10;
        pokname = "charmander";
     }
    else if (countpic==8) {
        picb = new ImageIcon ("images\\shadows\\charmeleon.png");
        pokcount = 10;
        pokname = "charmeleon";
     }
    else if (countpic==9) {
        picb = new ImageIcon ("images\\shadows\\clefairy.png");
        pokcount = 8;
        pokname = "clefairy";
     }
    else if (countpic==10) {
        picb = new ImageIcon ("images\\shadows\\clefable.png");
        pokcount = 8;
        pokname = "clefable";
     }
    else if (countpic==11) {
        picb = new ImageIcon ("images\\shadows\\geodude.png");
        pokcount = 7;
        pokname = "geodude";
     }
    else if (countpic==12) {
        picb = new ImageIcon ("images\\shadows\\graveler.png");
        pokcount = 8;
        pokname = "graveler";
     }
    else if (countpic==13) {
        picb = new ImageIcon ("images\\shadows\\ivysaur.png");
        pokcount = 7;
        pokname = "ivysaur";
     }
    else if (countpic==14) {
        picb = new ImageIcon ("images\\shadows\\jigglypuff.png");
        pokcount = 10;
        pokname = "jigglypuff";
     }
    else if (countpic==15) {
        picb = new ImageIcon ("images\\shadows\\kakuna.png");
        pokcount = 6;
        pokname = "kakuna";
     }
    else if (countpic==16) {
        picb = new ImageIcon ("images\\shadows\\meowth.png");
        pokcount = 6;
        pokname = "meowth";
     }
     else if (countpic==17) {
        picb = new ImageIcon ("images\\shadows\\metapod.png");
        pokcount = 7;
        pokname = "metapod";
     }
    else if (countpic==18) {
        picb = new ImageIcon ("images\\shadows\\ninetales.png");
        pokcount = 9;
        pokname = "ninetales";
     }
    else if (countpic==19) {
        picb = new ImageIcon ("images\\shadows\\onix.png");
        pokcount = 4;
        pokname = "onix";
     }
    else if (countpic==20) {
        picb = new ImageIcon ("images\\shadows\\persian.png");
        pokcount = 7;
        pokname = "persian";
     }
    else if (countpic==21) {
        picb = new ImageIcon ("images\\shadows\\pidgeot.png");
        pokcount = 7;
        pokname = "pidgeot";
     }
    else if (countpic==22) {
        picb = new ImageIcon ("images\\shadows\\pidgeotto.png");
        pokcount = 9;
        pokname = "pidgeotto";
     }
    else if (countpic==23) {
        picb = new ImageIcon ("images\\shadows\\pidgey.png");
        pokcount = 6;
        pokname = "pidgey";
     }
    else if (countpic==24) {
        picb = new ImageIcon ("images\\shadows\\pikachu.png");
        pokcount = 7;
        pokname = "pikachu";
     }
    else if (countpic==25) {
        picb = new ImageIcon ("images\\shadows\\poliwhirl.png");
        pokcount = 9;
        pokname = "poliwhirl";
     }
    else if (countpic==26) {
        picb = new ImageIcon ("images\\shadows\\poliwrath.png");
        pokcount = 9;
        pokname = "poliwrath";
     }
    else if (countpic==27) {
        picb = new ImageIcon ("images\\shadows\\ponyta.png");
        pokcount = 6;
        pokname = "ponyta";
     }
    else if (countpic==28) {
        picb = new ImageIcon ("images\\shadows\\psyduck.png");
        pokcount = 7;
        pokname = "psyduck";
     }
    else if (countpic==29) {
        picb = new ImageIcon ("images\\shadows\\raichu.png");
        pokcount = 6;
        pokname = "raichu";
     }
    else if (countpic==30) {
        picb = new ImageIcon ("images\\shadows\\rapidash.png");
        pokcount = 8;
        pokname = "rapidash";
     }
    else if (countpic==31) {
        picb = new ImageIcon ("images\\shadows\\squirtle.png");
        pokcount = 8;
        pokname = "squirtle";
     }
    else if (countpic==32) {
        picb = new ImageIcon ("images\\shadows\\venusaur.png");
        pokcount = 8;
        pokname = "venusaur";
     }
    else if (countpic==33) {
        picb = new ImageIcon ("images\\shadows\\vulpix.png");
        pokcount = 6;
        pokname = "vulpix";
     }
    else if (countpic==34) {
        picb = new ImageIcon ("images\\shadows\\wartortle.png");
        pokcount = 9;
        pokname = "wartortle";
     }
    else if (countpic==35) {
        picb = new ImageIcon ("images\\shadows\\weedle.png");
        pokcount = 6;
        pokname = "weedle";
     }
    else if (countpic==36) {
        picb = new ImageIcon ("images\\shadows\\wigglytuff.png");
        pokcount = 10;
        pokname = "wigglytuff";
     }
        lblimage.setIcon(picb);
        lbllettercount.setText("<html>GUESS YOUR <br>POKEMON WITH <b>" + Integer.toString(pokcount) + "</b> LETTERS</html>");
    } 

}
