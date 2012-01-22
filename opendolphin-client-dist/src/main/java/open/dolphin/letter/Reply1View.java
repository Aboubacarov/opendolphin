/*
 * LetterReply.java
 *
 * Created on 2008/02/11, 13:17
 */

package open.dolphin.letter;

import open.dolphin.client.Panel2;

/**
 *
 * @author  kazm
 */
public class Reply1View extends Panel2 {
    
    /** Creates new form LetterReply */
    public Reply1View() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        clientHospital = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clientDept = new javax.swing.JTextField();
        atesakiLbl = new javax.swing.JLabel();
        clientDoctor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        patientName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        patientBirthday = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        visitedDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        informedContent = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        confirmed = new javax.swing.JLabel();
        consultantAddress = new javax.swing.JTextField();
        consultantTelephone = new javax.swing.JTextField();
        consultantHospital = new javax.swing.JTextField();
        consultantDoctor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(585, 794));

        jLabel1.setText("紹介患者経過報告書（フォーム）"); // NOI18N

        jLabel2.setText("紹介元医療機関:"); // NOI18N

        clientHospital.setFont(new java.awt.Font("SansSerif", 0, 12));

        jLabel3.setText("担当:"); // NOI18N

        clientDept.setFont(new java.awt.Font("SansSerif", 0, 12));

        atesakiLbl.setText("先生　御机下"); // NOI18N

        clientDoctor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        clientDoctor.setToolTipText("設定の紹介状等で、敬称を選択できます"); // NOI18N

        jLabel5.setText("科"); // NOI18N

        jLabel6.setText("患者氏名:"); // NOI18N

        patientName.setFont(new java.awt.Font("SansSerif", 0, 12));

        jLabel7.setText("生年月日:"); // NOI18N

        patientBirthday.setFont(new java.awt.Font("SansSerif", 0, 12));

        jLabel8.setText("受診年月日:"); // NOI18N

        visitedDate.setEditable(false);
        visitedDate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        visitedDate.setToolTipText("右クリックでカレンダーから入力できます。PDF作成時、ハイフォンは漢字の年月日に変換されます。"); // NOI18N

        informedContent.setColumns(20);
        informedContent.setFont(new java.awt.Font("SansSerif", 0, 12));
        informedContent.setLineWrap(true);
        informedContent.setRows(5);
        jScrollPane1.setViewportView(informedContent);

        jLabel9.setText("拝見し、下記のとおり説明いたしました。"); // NOI18N

        jLabel10.setText("ご紹介戴き、ありがとうございました。取り急ぎ返信まで。"); // NOI18N

        confirmed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        confirmed.setText("年月日"); // NOI18N

        consultantAddress.setEditable(false);
        consultantAddress.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        consultantTelephone.setEditable(false);
        consultantTelephone.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        consultantHospital.setEditable(false);
        consultantHospital.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        consultantDoctor.setEditable(false);
        consultantDoctor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel11.setText("電話"); // NOI18N

        jLabel12.setText("印"); // NOI18N

        jLabel13.setText("担当"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(175, 175, 175)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(23, 23, 23)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel8)
                                    .add(jLabel3)
                                    .add(jLabel2)
                                    .add(jLabel6))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(patientName, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .add(visitedDate, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(layout.createSequentialGroup()
                                                .add(jLabel7)
                                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                                .add(patientBirthday))
                                            .add(jLabel9)))
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, clientHospital)
                                        .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                            .add(clientDept, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jLabel5)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(clientDoctor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(atesakiLbl)))))
                            .add(jLabel10)
                            .add(layout.createSequentialGroup()
                                .add(290, 290, 290)
                                .add(jLabel13)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(consultantDoctor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel12))
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(layout.createSequentialGroup()
                                    .add(jLabel11)
                                    .add(18, 18, 18)
                                    .add(consultantTelephone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 113, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(consultantAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 357, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 465, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(consultantHospital, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 305, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(381, 381, 381)
                        .add(confirmed, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 118, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(confirmed)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE, false)
                    .add(jLabel2)
                    .add(clientHospital, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(clientDept, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5)
                    .add(atesakiLbl)
                    .add(clientDoctor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jLabel7)
                    .add(patientBirthday, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(patientName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(visitedDate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 293, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jLabel10)
                .add(18, 18, 18)
                .add(consultantAddress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(consultantTelephone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(consultantHospital, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(7, 7, 7)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(consultantDoctor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12)
                    .add(jLabel13))
                .add(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atesakiLbl;
    private javax.swing.JTextField clientDept;
    private javax.swing.JTextField clientDoctor;
    private javax.swing.JTextField clientHospital;
    private javax.swing.JLabel confirmed;
    private javax.swing.JTextField consultantAddress;
    private javax.swing.JTextField consultantDoctor;
    private javax.swing.JTextField consultantHospital;
    private javax.swing.JTextField consultantTelephone;
    private javax.swing.JTextArea informedContent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientBirthday;
    private javax.swing.JTextField patientName;
    private javax.swing.JTextField visitedDate;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getClientDept() {
        return clientDept;
    }

    public javax.swing.JTextField getClientDoctor() {
        return clientDoctor;
    }

    public javax.swing.JTextField getClientHospital() {
        return clientHospital;
    }

    public javax.swing.JTextArea getInformedContent() {
        return informedContent;
    }

    public javax.swing.JTextField getPatientBirthday() {
        return patientBirthday;
    }

    public javax.swing.JTextField getPatientName() {
        return patientName;
    }

    public javax.swing.JTextField getVisited() {
        return visitedDate;
    }

    public javax.swing.JLabel getConfirmed() {
        return confirmed;
    }

    /**
     * @return the consultantAddress
     */
    public javax.swing.JTextField getConsultantAddress() {
        return consultantAddress;
    }

    /**
     * @param consultantAddress the consultantAddress to set
     */
    public void setConsultantAddress(javax.swing.JTextField consultantAddress) {
        this.consultantAddress = consultantAddress;
    }

    /**
     * @return the consultantDoctor
     */
    public javax.swing.JTextField getConsultantDoctor() {
        return consultantDoctor;
    }

    /**
     * @param consultantDoctor the consultantDoctor to set
     */
    public void setConsultantDoctor(javax.swing.JTextField consultantDoctor) {
        this.consultantDoctor = consultantDoctor;
    }

    /**
     * @return the consultantHospital
     */
    public javax.swing.JTextField getConsultantHospital() {
        return consultantHospital;
    }

    /**
     * @param consultantHospital the consultantHospital to set
     */
    public void setConsultantHospital(javax.swing.JTextField consultantHospital) {
        this.consultantHospital = consultantHospital;
    }

    /**
     * @return the consultantTelephone
     */
    public javax.swing.JTextField getConsultantTelephone() {
        return consultantTelephone;
    }

    /**
     * @param consultantTelephone the consultantTelephone to set
     */
    public void setConsultantTelephone(javax.swing.JTextField consultantTelephone) {
        this.consultantTelephone = consultantTelephone;
    }

    public javax.swing.JLabel getAtesakiLbl() {
        return atesakiLbl;
    }
    
}
