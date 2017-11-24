/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;
import tables.Asset;
import tables.Loan;

/**
 *
 * @author Nedrith
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        initModels();
        loadAllLoans();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("Plik");

        jMenuItem1.setText("Zamknij");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Magazyn");

        jMenuItem4.setText("Pokaz stan");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem3.setText("Dodaj");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenuItem8.setText("Usuń aktywo");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Wypożyczenia");

        jMenuItem5.setText("Pokaz stan");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuItem6.setText("Wypozycz");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Usun wypozyczenie");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

        jMenuBar1.add(jMenu6);

        jMenu2.setText("Pomoc");

        jMenuItem2.setText("Pomoc");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        new AssetAddWindow(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        loadAllAssets();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if(!isAssets())
        {
            new AlertWindow("Brak aktywów", "Nie masz aktywów, które możesz pożyczyć").setVisible(true);
            return;
        }
        new AddLoanWindow(this).setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        deleteLoan();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        loadAllLoans();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new AlertWindow("Pomoc", "Manager pożyczek.\r\nAutor: Przemysław Lenczewski \r\n"
                + "Licencja: GNU\r\n"
                + "Program ułatwia zarządzanie\r\n"
                + "udzielonymi pożyczkami.\r\n"
                + "Dzięki magazynowy"
                + "zawsze wiesz ile masz\r\n"
                + "jeszcze przedmiotów na\r\n"
                + "stanie.Zawsze możesz"
                + "podejrzeć kto z czym Ci zalega.").setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        deleteAsset();
    }//GEN-LAST:event_jMenuItem8ActionPerformed
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel warehouseModel;
    private DefaultTableModel loanModel;
    

    private void initModels()
    {
        this.loanModel = new DefaultTableModel();
        this.loanModel.addColumn("Id");
        this.loanModel.addColumn("Pożyczono");
        this.loanModel.addColumn("Przedmiot");
        this.loanModel.addColumn("Data");
        
        this.warehouseModel = new DefaultTableModel();
        this.warehouseModel.addColumn("Id");
        this.warehouseModel.addColumn("Przedmiot");
        this.warehouseModel.addColumn("Ilość");
        this.warehouseModel.addColumn("wartość");  
    }
    
    private void deleteLoan()
    {
        if(this.isWarehouse)
        {
            new AlertWindow("Nie można usunąć", "Aby usuwać pożyczki \r\n"
                    + "przejdz do widoku wypożyczenia"
            ).setVisible(true);
            return;
        }
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");
        EntityManager entityManager = entityManagerFactory.createEntityManager(); 
        Loan loan = new Loan();
        DefaultTableModel currModel = (DefaultTableModel) jTable1.getModel();
        entityManager.getTransaction().begin();
        loan = entityManager.find(Loan.class, currModel.getValueAt(jTable1.getSelectedRow(), 0));
        Asset asset = entityManager.find(Asset.class, loan.getAssetId());
        entityManager.remove(loan);
        asset.setQuantity(asset.getQuantity() + 1);
        entityManager.getTransaction().commit();
        loadAllLoans();
    }
     private void deleteAsset()
    {
        if(!this.isWarehouse)
        {
            new AlertWindow("Nie można usunąć", "Aby usuwać aktywa \r\n"
                    + "przejdz do widoku magazynu"
            ).setVisible(true);
            return;
        }
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");
        EntityManager entityManager = entityManagerFactory.createEntityManager(); 
        Asset asset = new Asset();
        DefaultTableModel currModel = (DefaultTableModel) jTable1.getModel();
        entityManager.getTransaction().begin();
        asset = entityManager.find(Asset.class, currModel.getValueAt(jTable1.getSelectedRow(), 0));
        entityManager.remove(asset);
        entityManager.getTransaction().commit();
        loadAllLoans();
    }   
    
    public void loadAllLoans()
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Asset asset = new Asset();
        int rowCount = this.loanModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            this.loanModel.removeRow(0);
        }

        List<Loan> loans = entityManager.createQuery("SELECT e FROM Loan e", Loan.class).getResultList();
        for (Loan loan : loans) {
            entityManager.getTransaction().begin();
            asset = entityManager.find(Asset.class, loan.getAssetId());
            entityManager.getTransaction().commit();
            Object[] obj = {
                loan.getId(),
                loan.getBorrower(),
                asset.getName(),
                loan.getWhen()
            };
            this.loanModel.addRow(obj);
            this.loanModel.moveRow(this.loanModel.getRowCount() - 1, this.loanModel.getRowCount() - 1, 0);
        }
        jTable1.setModel(loanModel);
        entityManager.close();
        entityManagerFactory.close();
        this.isWarehouse = false;
    }
    
    public void loadAllAssets()
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        int rowCount = this.warehouseModel.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            this.warehouseModel.removeRow(0);
        }

        List<Asset> assets = entityManager.createQuery("SELECT e FROM Asset e Where quantity > 0", Asset.class).getResultList();
        for (Asset asset : assets) {
            Object[] obj = {
                asset.getId(),
                asset.getName(),
                asset.getQuantity(),
                asset.getValue()
            };
            this.warehouseModel.addRow(obj);
            this.warehouseModel.moveRow(this.warehouseModel.getRowCount() - 1, this.warehouseModel.getRowCount() - 1, 0);
        }
        jTable1.setModel(warehouseModel);
        entityManager.close();
        entityManagerFactory.close();
        this.isWarehouse = true;
    }
    
    private boolean isAssets()
    {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("manager");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Asset> assets = entityManager.createQuery("SELECT e FROM Asset e Where quantity > 0", Asset.class).getResultList();
        entityManager.close();
        entityManagerFactory.close();  
        return !assets.isEmpty();
    }
    
    private boolean isWarehouse;
}