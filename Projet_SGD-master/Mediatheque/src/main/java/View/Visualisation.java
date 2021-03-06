/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controleur;

/**
 *
 * @author mg015362
 */
public class Visualisation extends javax.swing.JDialog {

    /**
     * Creates new form Visualisation
     */
    public Visualisation(java.awt.Frame parent, boolean modal, int i) {
        super(parent, modal);
        initComponents();
        if (i == 0)
        {
            menu.setVisible(false);
        }
    }
    
    public void addControleur(Controleur c)
    {
        deconnexion.addActionListener(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        recherche_g_champ = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        recherche_globale = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        deconnexion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        genre = new javax.swing.JComboBox<>();
        plateforme = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        prixMin = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        prixMax = new javax.swing.JTextField();
        recherche_complete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        liste = new javax.swing.JList<>();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));
        jPanel2.add(jSeparator3);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));
        jPanel3.add(jLabel5);
        jPanel3.add(recherche_g_champ);
        jPanel3.add(jLabel6);

        recherche_globale.setText("Recherche globale");
        jPanel3.add(recherche_globale);
        jPanel3.add(jLabel3);

        jPanel1.setLayout(new java.awt.GridLayout());

        deconnexion.setText("Deconnexion");
        deconnexion.setName("deconnexion"); // NOI18N
        jPanel1.add(deconnexion);

        jPanel3.add(jPanel1);

        jPanel2.add(jPanel3);
        jPanel2.add(jSeparator1);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        genre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENRE" }));
        genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreActionPerformed(evt);
            }
        });
        jPanel7.add(genre);

        plateforme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLATEFORME" }));
        jPanel7.add(plateforme);

        jPanel4.add(jPanel7);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Prix MIN");
        jPanel5.add(jLabel2);
        jPanel5.add(prixMin);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Prix MAX");
        jPanel5.add(jLabel1);
        jPanel5.add(prixMax);

        recherche_complete.setText("Recherche");
        jPanel5.add(recherche_complete);

        jPanel4.add(jPanel5);

        jPanel2.add(jPanel4);
        jPanel2.add(jSeparator2);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trier par" }));
        jPanel8.add(jComboBox3, java.awt.BorderLayout.EAST);

        jPanel2.add(jPanel8);

        jPanel6.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        liste.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(liste);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel6, java.awt.BorderLayout.CENTER);

        menu.setName("menu"); // NOI18N

        jMenu1.setText("Insertion");
        menu.add(jMenu1);

        jMenu2.setText("Suppression");
        menu.add(jMenu2);

        jMenu3.setText("Analyse");
        menu.add(jMenu3);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deconnexion;
    private javax.swing.JComboBox<String> genre;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList<String> liste;
    private javax.swing.JMenuBar menu;
    private javax.swing.JComboBox<String> plateforme;
    private javax.swing.JTextField prixMax;
    private javax.swing.JTextField prixMin;
    private javax.swing.JButton recherche_complete;
    private javax.swing.JTextField recherche_g_champ;
    private javax.swing.JButton recherche_globale;
    // End of variables declaration//GEN-END:variables
}
