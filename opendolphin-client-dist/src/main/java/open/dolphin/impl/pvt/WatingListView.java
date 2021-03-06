/*
 * WatingListView.java
 *
 * Created on 2007/11/25, 15:42
 */

package open.dolphin.impl.pvt;

/**
 *
 * @author  kazm
 */
public class WatingListView extends javax.swing.JPanel {
    
    /** Creates new form WatingListView */
    public WatingListView() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new RowTipsTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kutuBtn = new javax.swing.JButton();
        pvtInfoLbl = new javax.swing.JLabel();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/dolphin/resources/images/apps_16.gif"))); // NOI18N
        jLabel1.setText("検査・処置等");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/dolphin/resources/images/flag_16.gif"))); // NOI18N
        jLabel2.setText("診察終了");

        kutuBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open/dolphin/resources/images/kutu01.gif"))); // NOI18N

        pvtInfoLbl.setFont(new java.awt.Font("Lucida Grande", 0, 10));
        pvtInfoLbl.setText("pvtInfo");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(kutuBtn)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(pvtInfoLbl, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 109, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 190, Short.MAX_VALUE)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel1)
                        .add(pvtInfoLbl))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, kutuBtn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kutuBtn;
    private javax.swing.JLabel pvtInfoLbl;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getKutuBtn() {
        return kutuBtn;
    }

    public javax.swing.JTable getTable() {
        return table;
    }

    /**
     * @return the pvtInfoLbl
     */
    public javax.swing.JLabel getPvtInfoLbl() {
        return pvtInfoLbl;
    }    
}
