/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author mg015362
 */
public class Insertion extends javax.swing.JDialog {

    /**
     * Creates new form Insertion
     */
    public Insertion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Date_parution = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Date_parution1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        titre1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Date_parution2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Date_parution3 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        titre2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Date_parution4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel4.setLayout(new java.awt.GridLayout(0, 1));

        jPanel5.setLayout(new java.awt.GridLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Titre");
        jPanel5.add(jLabel1);
        jPanel5.add(titre);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date de parution");
        jPanel5.add(jLabel2);
        jPanel5.add(Date_parution);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Genre");
        jPanel5.add(jLabel3);
        jPanel5.add(Date_parution1);

        jPanel4.add(jPanel5);

        jPanel6.setLayout(new java.awt.GridLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Editeur");
        jPanel6.add(jLabel4);
        jPanel6.add(titre1);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Plateformes (séparés par des ;)");
        jPanel6.add(jLabel5);
        jPanel6.add(Date_parution2);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Prix");
        jPanel6.add(jLabel6);
        jPanel6.add(Date_parution3);

        jPanel4.add(jPanel6);

        jPanel7.setLayout(new java.awt.GridLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Disponibilités");
        jPanel7.add(jLabel7);
        jPanel7.add(titre2);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Série");
        jPanel7.add(jLabel8);
        jPanel7.add(Date_parution4);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Image");
        jPanel7.add(jLabel9);

        jButton1.setText("Choisir");
        jPanel7.add(jButton1);

        jPanel4.add(jPanel7);

        jPanel8.setLayout(new java.awt.BorderLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Description    ");
        jPanel8.add(jLabel10, java.awt.BorderLayout.WEST);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel8);

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        jButton2.setText("Valider");
        getContentPane().add(jButton2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Date_parution;
    private javax.swing.JTextField Date_parution1;
    private javax.swing.JTextField Date_parution2;
    private javax.swing.JTextField Date_parution3;
    private javax.swing.JTextField Date_parution4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField titre;
    private javax.swing.JTextField titre1;
    private javax.swing.JTextField titre2;
    // End of variables declaration//GEN-END:variables
}
