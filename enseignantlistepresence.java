package Application1;

import static Application1.Responsable.loginad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author QUEEN-HP
 */
public class enseignantlistepresence extends javax.swing.JFrame {

    /**
     * Creates new form enseignantlistepresence
     */
    
    public void date(){
        
        Calendar cal=new GregorianCalendar();
        int jo=cal.get(Calendar.DAY_OF_MONTH);
        int mois=cal.get(Calendar.MONTH);
        int annee=cal.get(Calendar.YEAR);
        
        int min=cal.get(Calendar.MINUTE);
        int sec=cal.get(Calendar.SECOND);
        int he=cal.get(Calendar.HOUR_OF_DAY);
        
        heure.setText("DATE :  "+he+" :"+min+" :"+sec);
        date.setText(jo+"-"+(mois+1)+"-"+annee);
        
    }
    
    void Fermer(){
        dispose();
    }
     Connexion conn = new Connexion();
    public enseignantlistepresence() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Zonne professeur");
        date();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        retour = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        llogin = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnumsenace = new javax.swing.JLabel();
        txtmatiere = new javax.swing.JLabel();
        txtniv = new javax.swing.JLabel();
        txtlib = new javax.swing.JLabel();
        txtfil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 153, 153));
        jButton1.setText("liste des abscences ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 100, 210, 40);

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Liste des présences");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(140, 50, 210, 40);

        retour.setBackground(new java.awt.Color(204, 255, 255));
        retour.setForeground(new java.awt.Color(153, 153, 153));
        retour.setText("RETOUR");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });
        jPanel1.add(retour);
        retour.setBounds(20, 180, 110, 40);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(40, 10, 751, 40);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\QUEEN-HP\\Desktop\\icone\\Teachers-icon.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 10, 140, 130);

        llogin.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        llogin.setForeground(new java.awt.Color(255, 51, 51));
        llogin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lloginAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(llogin);
        llogin.setBounds(480, 140, 340, 50);

        heure.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        heure.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(heure);
        heure.setBounds(530, 70, 150, 40);

        date.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        date.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(date);
        date.setBounds(660, 70, 140, 40);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Zone Professeur ");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(250, 0, 310, 60);

        txtnumsenace.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtnumsenace);
        txtnumsenace.setBounds(200, 70, 110, 30);

        txtmatiere.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtmatiere);
        txtmatiere.setBounds(200, 100, 130, 30);

        txtniv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtniv);
        txtniv.setBounds(210, 150, 40, 30);

        txtlib.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtlib);
        txtlib.setBounds(250, 150, 70, 30);

        txtfil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtfil);
        txtfil.setBounds(320, 150, 110, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void lloginAncestorAdded(javax.swing.event.AncestorEvent evt) {                                     
    // TODO add your handling code here:
    }                                    

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        listepresence listepr=new listepresence();
        listepr.setVisible(true);
        listepr.numseance.setText(txtnumsenace.getText());
        listepr.matiere.setText(txtmatiere.getText());
        listepr.niv.setText(txtniv.getText());
        listepr.fil.setText(txtfil.getText());
        listepr.lib.setText(txtlib.getText());
        listepr.llogin2.setText(llogin.getText());
        Fermer();
        // TODO add your handling code here:
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        absence ab=new absence();
        ab.setVisible(true);
        ab.txtse.setText(txtnumsenace.getText());
        ab.txtmat.setText(txtmatiere.getText());
        ab.txtnive.setText(txtniv.getText());
        ab.txtfill.setText(txtfil.getText());
        ab.txtlibe.setText(txtlib.getText());
        ab.llogin3.setText(llogin.getText());
        Fermer();

        // TODO add your handling code here:
    }                                        

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {                                       
       presence pr=new presence();
        pr.setVisible(true);
        Fermer();
    }                                      

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
            java.util.logging.Logger.getLogger(enseignantlistepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enseignantlistepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enseignantlistepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enseignantlistepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enseignantlistepresence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel date;
    private javax.swing.JLabel heure;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel llogin;
    private javax.swing.JButton retour;
    public static javax.swing.JLabel txtfil;
    public static javax.swing.JLabel txtlib;
    public static javax.swing.JLabel txtmatiere;
    public static javax.swing.JLabel txtniv;
    public static javax.swing.JLabel txtnumsenace;
    // End of variables declaration                   
}

