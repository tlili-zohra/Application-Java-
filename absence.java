package Application1;

import static Application1.enseignantlistepresence.llogin;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author QUEEN-HP
 */
public class absence extends javax.swing.JFrame {

    /**
     * Creates new form absence
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
    
                private void Affichetababs() {
        Statement st;
        ResultSet rs;
        try{
            String sql="select absence.numseance'Num�ro s�ance',etudiant.nom'Nom Etudiant',etudiant.prenom'Prenom Etudiant',absence.date'Date Absences' from absence,etudiant,classe,enseignant where classe.niveau='"+txtnive.getText()+"'"
                    + "and classe.libelle='"+txtlibe.getText()+"'and classe.fili�re='"+txtfill.getText()+"'and classe.id_classe=etudiant.id_classe and absence.id_etudiant=etudiant.id_etudiant and absence.id_enseignant=enseignant.id_enseignant and enseignant.login='"+llogin3.getText()+"'";        
            st=conn.getconnexion().createStatement();
            rs=st.executeQuery(sql);
            tababs.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    
    
    public absence() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Liste Des Absences");
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        llogin3 = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtmat = new javax.swing.JLabel();
        txtnive = new javax.swing.JLabel();
        txtlibe = new javax.swing.JLabel();
        txtfill = new javax.swing.JLabel();
        txtse = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        retour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tababs = new javax.swing.JTable();
        consulter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Liste des Absences");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\QUEEN-HP\\Desktop\\icone\\Teachers-icon.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 140, 130);

        llogin3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        llogin3.setForeground(new java.awt.Color(255, 51, 51));
        llogin3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                llogin3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(llogin3);
        llogin3.setBounds(470, 140, 340, 50);

        heure.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        heure.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(heure);
        heure.setBounds(510, 70, 150, 40);

        date.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        date.setForeground(new java.awt.Color(153, 153, 153));
        jPanel2.add(date);
        date.setBounds(660, 70, 140, 40);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Zone Des Absences");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(210, 0, 370, 60);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(60, 200, 700, 10);

        txtmat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtmat);
        txtmat.setBounds(190, 110, 130, 30);

        txtnive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtnive);
        txtnive.setBounds(190, 160, 40, 30);

        txtlibe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtlibe);
        txtlibe.setBounds(250, 160, 70, 30);

        txtfill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtfill);
        txtfill.setBounds(320, 160, 110, 30);

        txtse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtse);
        txtse.setBounds(200, 60, 110, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        retour.setBackground(new java.awt.Color(204, 255, 255));
        retour.setForeground(new java.awt.Color(153, 153, 153));
        retour.setText("RETOUR");
        retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourActionPerformed(evt);
            }
        });
        jPanel1.add(retour);
        retour.setBounds(10, 270, 110, 40);

        tababs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num�ro de s�ance ", "Nom Etudiant", "Prenom Etudiant", "Date de Absence "
            }
        ));
        jScrollPane1.setViewportView(tababs);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(70, 70, 680, 170);

        consulter.setBackground(new java.awt.Color(255, 255, 255));
        consulter.setFont(new java.awt.Font("Tempus Sans ITC", 3, 12)); // NOI18N
        consulter.setForeground(new java.awt.Color(255, 255, 255));
        consulter.setIcon(new javax.swing.ImageIcon("C:\\Users\\QUEEN-HP\\Desktop\\icone\\Button-Load-icon.png")); // NOI18N
        consulter.setBorder(null);
        consulter.setBorderPainted(false);
        consulter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consulterMouseClicked(evt);
            }
        });
        consulter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulterActionPerformed(evt);
            }
        });
        jPanel1.add(consulter);
        consulter.setBounds(730, 20, 33, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void llogin3AncestorAdded(javax.swing.event.AncestorEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {                                       
        enseignantlistepresence en=new enseignantlistepresence();
        en.setVisible(true);
        en.llogin.setText(llogin3.getText());
        en.txtnumsenace.setText(txtse.getText());
        en.txtmatiere.setText(txtmat.getText());
        en.txtfil.setText(txtfill.getText());
        en.txtniv.setText(txtnive.getText());
       en.txtlib.setText(txtlibe.getText());
        Fermer();
    }                                      

    private void consulterMouseClicked(java.awt.event.MouseEvent evt) {                                       
        Affichetababs();
    }                                      

    private void consulterActionPerformed(java.awt.event.ActionEvent evt) {                                          
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
            java.util.logging.Logger.getLogger(absence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(absence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(absence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(absence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new absence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton consulter;
    private javax.swing.JLabel date;
    private javax.swing.JLabel heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel llogin3;
    private javax.swing.JButton retour;
    private javax.swing.JTable tababs;
    public static javax.swing.JLabel txtfill;
    public static javax.swing.JLabel txtlibe;
    public static javax.swing.JLabel txtmat;
    public static javax.swing.JLabel txtnive;
    public static javax.swing.JLabel txtse;
    // End of variables declaration                   
}