package Application1;

import static Application1.enseignantlistepresence.llogin;
import static Application1.listepresence.fil;
import static Application1.listepresence.lib;
import static Application1.listepresence.niv;
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
public class presence extends javax.swing.JFrame {

    /**
     * Creates new form presence
     */
    private void matiere(){
        
        Statement st;
        ResultSet rs;
        try{
            String sql="select * from matiere";        
            st=conn.getconnexion().createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String mati=rs.getString("libelle");
                mat.addItem(mati);
            }

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
        date.setText(jo+"-"+(mois+1)+"-"+annee);
        
    }
        
         void Fermer(){
        dispose();
    }
    
    Connexion conn = new Connexion();
    public presence() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Zone De choix");
        date();
        
        matiere();
        
       
           
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
        llogin1 = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        retour = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        fi = new javax.swing.JComboBox<>();
        num = new javax.swing.JComboBox<>();
        mat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        li = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        ni = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Liste du Pr�sence");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\QUEEN-HP\\Desktop\\icone\\Teachers-icon.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 20, 140, 130);

        llogin1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        llogin1.setForeground(new java.awt.Color(255, 51, 51));
        llogin1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                llogin1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(llogin1);
        llogin1.setBounds(470, 130, 340, 50);

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
        jLabel2.setText("Zone de Choix");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(260, 10, 370, 60);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(60, 190, 700, 10);

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
        retour.setBounds(0, 330, 110, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Mati�re : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 90, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("fili�re : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(210, 270, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("Num�ro de s�ance :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 30, 170, 30);

        ok.setBackground(new java.awt.Color(204, 255, 255));
        ok.setForeground(new java.awt.Color(255, 153, 153));
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok);
        ok.setBounds(760, 330, 50, 40);

        fi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "informatique", "mathematique", "physique", "biologie", "chimie", "droit", "economie", "gestion" }));
        jPanel1.add(fi);
        fi.setBounds(330, 270, 230, 30);

        num.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        jPanel1.add(num);
        num.setBounds(330, 30, 230, 30);

        jPanel1.add(mat);
        mat.setBounds(330, 90, 230, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("lib�lle: ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 150, 70, 30);

        li.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "licence", "master ", "ingenierie", "doctorat" }));
        jPanel1.add(li);
        li.setBounds(330, 150, 230, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel7.setText("Niveau :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 210, 70, 30);

        ni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jPanel1.add(ni);
        ni.setBounds(330, 210, 230, 30);

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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void llogin1AncestorAdded(javax.swing.event.AncestorEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void retourActionPerformed(java.awt.event.ActionEvent evt) {                                       
        login log=new login();
        log.setVisible(true);
        Fermer();
    }                                      

    private void okActionPerformed(java.awt.event.ActionEvent evt) {                                   
        enseignantlistepresence en=new enseignantlistepresence();
        en.setVisible(true);
        en.txtnumsenace.setText((String) num.getSelectedItem());
        en.txtmatiere.setText((String) mat.getSelectedItem());
        en.txtlib.setText((String) li.getSelectedItem());
        en.txtfil.setText((String) fi.getSelectedItem());
        en.txtniv.setText((String) ni.getSelectedItem());
        en.llogin.setText(llogin1.getText());
        Fermer(); 
    }                                  

    private void numActionPerformed(java.awt.event.ActionEvent evt) {                                    
         
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
            java.util.logging.Logger.getLogger(presence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(presence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(presence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(presence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new presence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel date;
    private javax.swing.JComboBox<String> fi;
    private javax.swing.JLabel heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> li;
    public static javax.swing.JLabel llogin1;
    private javax.swing.JComboBox<String> mat;
    private javax.swing.JComboBox<String> ni;
    private javax.swing.JComboBox<String> num;
    private javax.swing.JButton ok;
    private javax.swing.JButton retour;
    // End of variables declaration                   
}
