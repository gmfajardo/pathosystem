/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.apppatologia.vista.mantenimientos;

import javax.swing.JPanel;
import org.itla.apppatologia.DTO.ArsDTO;
import org.itla.apppatologia.Repository.Aseguradora;
import org.itla.apppatologia.appservices.AseguradoraService;
import org.itla.apppatologia.appservices.IAseguradoraAppService;
import org.itla.apppatologia.vista.componentes.IPanelCentralObservador;
import org.itla.apppatologia.vista.viewers.IViewerObservable;

/**
 *
 * @author Chu
 */
public class PanelARS extends javax.swing.JPanel implements IMantenimiento{

    /**
     * Creates new form PanelARS
     */
    ArsDTO ars;
    IAseguradoraAppService aseguradoraService;
    IPanelCentralObservador padre;
    IViewerObservable viewerAsociado;
    String nombre;
    boolean isPinned = false;
    public PanelARS() {
        initComponents();
        aseguradoraService = new AseguradoraService();
         nombre="ars";
    }
    public void Enlazar(){
        nombre="ars";
    }

    @Override
    public String getName() {
        return nombre; //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        txtDireccion4 = new javax.swing.JTextField();
        lblDireccion4 = new javax.swing.JLabel();
        lblTelefono4 = new javax.swing.JLabel();
        txtTelefono4 = new javax.swing.JTextField();
        txtNombre4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        lblValorCodigo2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        tbPinned = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.OverlayLayout(this));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBar(null);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel10.setPreferredSize(new java.awt.Dimension(150, 150));

        lblDireccion4.setText("Dirección");

        lblTelefono4.setText("Teléfono");

        jLabel5.setText("Nombre");

        lblNombre2.setText("Código");

        lblValorCodigo2.setText("valorCodigo");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        tbPinned.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/pushpin.png"))); // NOI18N
        tbPinned.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbPinnedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(tbPinned, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbPinned)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre2)
                    .addComponent(jLabel5)
                    .addComponent(lblTelefono4)
                    .addComponent(lblDireccion4))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblValorCodigo2)
                        .addComponent(txtTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDireccion4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addComponent(txtNombre4))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre2)
                    .addComponent(lblValorCodigo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTelefono4)
                    .addComponent(txtTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblDireccion4)
                    .addComponent(txtDireccion4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addContainerGap(247, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel10);

        add(jScrollPane2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        viewerAsociado.mandar(txtTelefono4.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbPinnedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbPinnedActionPerformed
        isPinned = tbPinned.isSelected();
        padre.IsPinned(isPinned);
    }//GEN-LAST:event_tbPinnedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDireccion4;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblTelefono4;
    private javax.swing.JLabel lblValorCodigo2;
    private javax.swing.JToggleButton tbPinned;
    private javax.swing.JTextField txtDireccion4;
    private javax.swing.JTextField txtNombre4;
    private javax.swing.JTextField txtTelefono4;
    // End of variables declaration//GEN-END:variables

    @Override
    public ArsDTO Save() {
        
        ars.setNombre(txtNombre4.getText());
        ars.setTelefono(txtTelefono4.getText());
        ars.setDirecion(txtDireccion4.getText());
        
        ars.setId(aseguradoraService.ActualizarAseguradora(ars).getId());
        
        return ars;
    }

    @Override
    public boolean Clean() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean CanModify(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void bind(IViewerObservable v, IPanelCentralObservador p) {
        viewerAsociado = v;
        padre = p;
    }

    @Override
    public void Show(Object o) {
        //o = new ArsDTO();
        //ars = new ArsDTO();
        ars = (ArsDTO) o;
        lblValorCodigo2.setText(Integer.toString(ars.getId()));
        txtNombre4.setText(ars.getNombre());
        txtTelefono4.setText(ars.getTelefono());
        txtDireccion4.setText(ars.getDirecion());
    }

    @Override
    public boolean IsPinned() {
        return isPinned;
    }

    @Override
    public boolean Borrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarMantenimiento(JPanel pnvwr, JPanel pnfrm, boolean sobreponer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MandarSizePadre(Integer size) {
        padre.SetDividerSize(size);
    }
    
}
