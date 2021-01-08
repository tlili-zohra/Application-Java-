package Application1;

import java.sql.PreparedStatement;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

/**
 *
 * @author QUEEN-HP
 */
public class etudiant extends javax.swing.JFrame {

    /**
     * Creates new form etudiant
     */
    
  Connexion conn =new Connexion();
    public etudiant(){
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("ETUDINAT");
        date();
            
    }
    
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
    private void UpdateTable() {
        Statement st;
        ResultSet rs;
        try{
            String sql="select absence.date'Date',absence.numseance'Num�ro de s�nance',matiere.libelle'Mati�re',enseignant.prenom'Enseignant' from correspondance,absence,etudiant,enseignant,matiere where etudiant.login='"+loginet.getText()+"'"
                    + "and absence.id_matiere=matiere.id_matiere and correspondance.id_enseignant=enseignant.id_enseignant and correspondance.id_matiere=matiere.id_matiere and absence.id_etudiant=etudiant.id_etudiant ";        
            st=conn.getconnexion().createStatement();
            rs=st.executeQuery(sql);
            Table.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }

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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        loginet = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Tabtab = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        retour = new javax.swing.JButton();
        Actualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Etudiant");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\QUEEN-HP\\Desktop\\icone\\Student-icon.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 40, 140, 150);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(50, 210, 610, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Zone Etudiant");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 10, 270, 50);

        loginet.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        loginet.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(loginet);
        loginet.setBounds(390, 150, 330, 50);

        heure.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        heure.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(heure);
        heure.setBounds(490, 90, 120, 40);

        date.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(date);
        date.setBounds(620, 90, 120, 40);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Num�ro de s�nance", "Mati�re", "Enseignant"
            }
        ));
        Tabtab.setViewportView(Table);

        retour.setBackground(new java.awt.Color(102, 102, 255));
        retour.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        retour.setForeground(new java.awt.Color(255, 255, 255));
        retour.setText("RETOUR");
        retour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retourMouseClicked(evt);
            }
        });
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });

        Actualiser.setBackground(new java.awt.Color(255, 255, 255));
        Actualiser.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        Actualiser.setForeground(new java.awt.Color(255, 255, 255));
        Actualiser.setIcon(new javax.swing.ImageIcon("C:\\Users\\QUEEN-HP\\Desktop\\icone\\Button-Load-icon.png")); // NOI18N
        Actualiser.setBorder(null);
        Actualiser.setBorderPainted(false);
        Actualiser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualiserMouseClicked(evt);
            }
        });
        Actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualiserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabtab, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(retour)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retour, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabtab, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>                        

    private void retourMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:  
    }                                   

    private void ActualiserMouseClicked(java.awt.event.MouseEvent evt) {                                        
         UpdateTable();
    }                                       

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {                                       
        login log=new login();
        log.setVisible(true);
        Fermer();
    }                                      

    private void ActualiserActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(etudiant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new etudiant().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Actualiser;
    public javax.swing.JTable Table;
    private javax.swing.JScrollPane Tabtab;
    private javax.swing.JLabel date;
    private javax.swing.JLabel heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel loginet;
    private javax.swing.JButton retour;
    // End of variables declaration                   


}