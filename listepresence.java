package Application1;

import static Application1.etudiant.loginet;
import static Application1.presence.llogin1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableModel;
import jdk.internal.org.objectweb.asm.TypeReference;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author QUEEN-HP
 */
public class listepresence extends javax.swing.JFrame {

    /**
     * Creates new form listepresence
     */
    

    
    
    
     private void AfficheListe() {
        Statement st;
        ResultSet rs;
        try{
            String sql="select enseignant.id_enseignant'Mon ID',etudiant.id_etudiant'ID Etudiant',etudiant.nom'Nom Etudiant',etudiant.prenom'Prenom Etudiant',matiere.id_matiere from etudiant,classe,enseignant,matiere where enseignant.login='"+llogin2.getText()+"'and matiere.libelle='"+matiere.getText()+"'and etudiant.id_classe=classe.id_classe and classe.libelle='"+lib.getText()+"'and classe.fili�re='"+fil.getText()+"'and classe.niveau='"+niv.getText()+"' ";        
            st=conn.getconnexion().createStatement();
            rs=st.executeQuery(sql);
            ListeP.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }

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
        date.setText(annee+"-"+(mois+1)+"-"+jo);
        
    }
    
         void Fermer(){
        dispose();
    }
         
    Connexion conn =new Connexion();
    public listepresence() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Liste Des Pr�sences");
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
        llogin2 = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        numseance = new javax.swing.JLabel();
        matiere = new javax.swing.JLabel();
        niv = new javax.swing.JLabel();
        fil = new javax.swing.JLabel();
        lib = new javax.swing.JLabel();
        niv1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ajouter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeP = new javax.swing.JTable();
        retour1 = new javax.swing.JButton();
        Actualiser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\QUEEN-HP\\Desktop\\icone\\Teachers-icon.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 140, 130);

        llogin2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        llogin2.setForeground(new java.awt.Color(255, 51, 51));
        llogin2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                llogin2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(llogin2);
        llogin2.setBounds(490, 130, 340, 50);

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
        jLabel2.setText("Liste de Pr�sences");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(240, 0, 370, 60);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(60, 190, 700, 10);

        numseance.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(numseance);
        numseance.setBounds(200, 80, 110, 30);

        matiere.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(matiere);
        matiere.setBounds(200, 110, 130, 30);

        niv.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(niv);
        niv.setBounds(200, 140, 40, 30);

        fil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(fil);
        fil.setBounds(320, 140, 110, 30);

        lib.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(lib);
        lib.setBounds(250, 140, 70, 30);

        niv1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(niv1);
        niv1.setBounds(200, 140, 40, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        ajouter.setBackground(new java.awt.Color(204, 255, 255));
        ajouter.setForeground(new java.awt.Color(153, 153, 153));
        ajouter.setText("Ajouter");
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });
        jPanel1.add(ajouter);
        ajouter.setBounds(700, 270, 110, 40);

        ListeP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mon ID", "ID Etudiant", "Nom Etudiant", "Prenom Etudiant", "ID Matiere"
            }
        ));
        jScrollPane1.setViewportView(ListeP);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 70, 810, 160);

        retour1.setBackground(new java.awt.Color(204, 255, 255));
        retour1.setForeground(new java.awt.Color(153, 153, 153));
        retour1.setText("RETOUR");
        retour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retour1ActionPerformed(evt);
            }
        });
        jPanel1.add(retour1);
        retour1.setBounds(10, 270, 110, 40);

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
        jPanel1.add(Actualiser);
        Actualiser.setBounds(770, 10, 33, 33);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void llogin2AncestorAdded(javax.swing.event.AncestorEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {                                        
        Statement st ;
        ResultSet rs = null ,rs2 = null;
        
      
             
        
        
        
       int ligne=ListeP.getSelectedRow();
       String cel1=ListeP.getModel().getValueAt(ligne, 0).toString();
       String cel2=ListeP.getModel().getValueAt(ligne, 1).toString();
       String cel3=ListeP.getModel().getValueAt(ligne, 4).toString();
      
        
         try{
             
             st=conn.getconnexion().createStatement();             
             String sql="insert into absence(id_etudiant,id_enseignant,id_matiere,numseance,date)values('"+cel2+"','"+cel1+"','"+cel3+"','"+numseance.getText()+"','"+date.getText()+"')";

           st.executeUpdate(sql);
           
             
             
         }catch(Exception ex){
             Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
         }
         
/*int ligne=ListeP.getSelectedRow();
String cel=ListeP.getModel().getValueAt(ligne, 0).toString();
ajouterabsence ab=new ajouterabsence() ;
ab.setVisible(true);
String sql="select id_enseignant from enseignant where login='"+llogin2.getText()+"'";
Statement st ;
ResultSet rs=null;
         try {
             st=conn.getconnexion().createStatement();
             rs=st.executeQuery(sql);
             
         } catch (SQLException ex) {
             Logger.getLogger(listepresence.class.getName()).log(Level.SEVERE, null, ex);
         }


ab.txten.setText(rs);
ab.txtet.setText(cel);
ab.txtnum.setText(numseance.getText());
ab.txtdate.setText(date.getText());*/


        
    }                                       

    private void retour1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        enseignantlistepresence enpr=new enseignantlistepresence();
        enpr.setVisible(true);
        enpr.llogin.setText(llogin2.getText());
        enpr.txtnumsenace.setText(numseance.getText());
        enpr.txtmatiere.setText(matiere.getText());
        enpr.txtfil.setText(fil.getText());
        enpr.txtniv.setText(niv.getText());
       enpr.txtlib.setText(lib.getText());
        Fermer();          
    }                                       

    private void ActualiserMouseClicked(java.awt.event.MouseEvent evt) {                                        
        AfficheListe();
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
            java.util.logging.Logger.getLogger(listepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(listepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(listepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(listepresence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listepresence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Actualiser;
    private javax.swing.JTable ListeP;
    private javax.swing.JButton ajouter;
    private javax.swing.JLabel date;
    public static javax.swing.JLabel fil;
    private javax.swing.JLabel heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lib;
    public static javax.swing.JLabel llogin2;
    public static javax.swing.JLabel matiere;
    public static javax.swing.JLabel niv;
    private javax.swing.JLabel niv1;
    public static javax.swing.JLabel numseance;
    private javax.swing.JButton retour1;
    // End of variables declaration                   
}