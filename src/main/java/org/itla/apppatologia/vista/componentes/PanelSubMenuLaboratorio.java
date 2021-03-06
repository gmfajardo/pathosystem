/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itla.apppatologia.vista.componentes;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import org.itla.apppatologia.vista.MainFrame;
import org.itla.apppatologia.vista.mantenimientos.IMantenimiento;
import org.itla.apppatologia.vista.mantenimientos.PanelFragmento;
import org.itla.apppatologia.vista.mantenimientos.PanelPatologos;
import org.itla.apppatologia.vista.viewers.IViewerObservable;
import org.itla.apppatologia.vista.viewers.ViewerFragmento;

/**
 *
 * @author Chu
 */
public class PanelSubMenuLaboratorio extends javax.swing.JPanel implements ISubMenuObservable{

    private ArrayList<IPanelCentralObservador> observadores;
    JPanel pnForm;
    JPanel pnViewer;
    JPanel pn = null;
    private String nombre;
    private IPanelCentralObservador observador;
    /**
     * Creates new form PanelResultado
     */  
    public PanelSubMenuLaboratorio() {
        initComponents();
        observadores = new ArrayList<>();
        nombre = "patologos";
        pnForm = null;
        pnViewer = null;
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tbtnPatologo = new javax.swing.JToggleButton();
        pnSubMenuFragmento = new javax.swing.JPanel();
        tbtnFragmento = new javax.swing.JToggleButton();
        jPanel8 = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jPanel9 = new javax.swing.JPanel();
        jToggleButton6 = new javax.swing.JToggleButton();
        jPanel10 = new javax.swing.JPanel();
        jToggleButton7 = new javax.swing.JToggleButton();
        jPanel11 = new javax.swing.JPanel();
        jToggleButton8 = new javax.swing.JToggleButton();

        setLayout(new java.awt.GridLayout(0, 1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel2.setBackground(new java.awt.Color(240, 240, 240));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

        tbtnPatologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3.png"))); // NOI18N
        tbtnPatologo.setText("<html>Patologo</html>");
        tbtnPatologo.setContentAreaFilled(false);
        tbtnPatologo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tbtnPatologo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        tbtnPatologo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        tbtnPatologo.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        tbtnPatologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnPatologoActionPerformed(evt);
            }
        });
        jPanel2.add(tbtnPatologo);

        jPanel1.add(jPanel2);

        pnSubMenuFragmento.setBackground(new java.awt.Color(240, 240, 240));
        pnSubMenuFragmento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSubMenuFragmentoMouseClicked(evt);
            }
        });
        pnSubMenuFragmento.setLayout(new javax.swing.OverlayLayout(pnSubMenuFragmento));

        tbtnFragmento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3.png"))); // NOI18N
        tbtnFragmento.setText("<html>Fragmento</html>");
        tbtnFragmento.setContentAreaFilled(false);
        tbtnFragmento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tbtnFragmento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        tbtnFragmento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        tbtnFragmento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        tbtnFragmento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnFragmentoActionPerformed(evt);
            }
        });
        pnSubMenuFragmento.add(tbtnFragmento);

        jPanel1.add(pnSubMenuFragmento);

        jPanel8.setBackground(new java.awt.Color(240, 240, 240));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new javax.swing.OverlayLayout(jPanel8));

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3.png"))); // NOI18N
        jToggleButton5.setText("<html>Estado Fragmento</html>");
        jToggleButton5.setContentAreaFilled(false);
        jToggleButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton5.setPreferredSize(new java.awt.Dimension(150, 44));
        jToggleButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jToggleButton5);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(240, 240, 240));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new javax.swing.OverlayLayout(jPanel9));

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3.png"))); // NOI18N
        jToggleButton6.setText("<html>Tipo Fragmento</html>");
        jToggleButton6.setContentAreaFilled(false);
        jToggleButton6.setHideActionText(true);
        jToggleButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton6.setPreferredSize(new java.awt.Dimension(148, 44));
        jToggleButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jToggleButton6);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(240, 240, 240));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });
        jPanel10.setLayout(new javax.swing.OverlayLayout(jPanel10));

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3.png"))); // NOI18N
        jToggleButton7.setText("<html>Tipo Estudio</html>");
        jToggleButton7.setContentAreaFilled(false);
        jToggleButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton7.setPreferredSize(new java.awt.Dimension(150, 44));
        jToggleButton7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jToggleButton7);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(240, 240, 240));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new javax.swing.OverlayLayout(jPanel11));

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3.png"))); // NOI18N
        jToggleButton8.setText("<html>Accion Estudio</html>");
        jToggleButton8.setContentAreaFilled(false);
        jToggleButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/org/itla/apppatologia/vista/PNG/tool-3-seleccted.png"))); // NOI18N
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jToggleButton8);

        jPanel1.add(jPanel11);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    
    public void Enlazar(IPanelCentralObservador o){
        observadores.add(o);
        observador = o;
    }
    private void tbtnPatologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnPatologoActionPerformed
        
        UnSelectAllButton();
        
        pn = new PanelPatologos();
        tbtnPatologo.setSelected(true);
        jPanel2.setBackground(new Color(204,204,204));
        
        PanelPatologos pnLaboratorio = new PanelPatologos();
        //GetPanel(pn);
        
        observador.OcultarSubMenu();
    }//GEN-LAST:event_tbtnPatologoActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        UnSelectAllButton();
        jToggleButton5.setSelected(true);
        jPanel8.setBackground(new Color(204,204,204));
        
        
        observador.OcultarSubMenu();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        UnSelectAllButton();
        jToggleButton6.setSelected(true);
        jPanel9.setBackground(new Color(204,204,204));
        
        
        observador.OcultarSubMenu();
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        UnSelectAllButton();
        jToggleButton7.setSelected(true);
        jPanel10.setBackground(new Color(204,204,204));
        
        
        observador.OcultarSubMenu();
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        UnSelectAllButton();
        jToggleButton8.setSelected(true);
        jPanel11.setBackground(new Color(204,204,204));
        
        
        observador.OcultarSubMenu();
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        tbtnPatologoActionPerformed(null);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        
        
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        jToggleButton5ActionPerformed(null);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        jToggleButton6ActionPerformed(null);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        jToggleButton7ActionPerformed(null);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        jToggleButton8ActionPerformed(null);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void tbtnFragmentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnFragmentoActionPerformed
        UnSelectAllButton();
        tbtnFragmento.setSelected(true);
        pnSubMenuFragmento.setBackground(new Color(204,204,204));
        pnForm = new PanelFragmento();
        
        MainFrame padre = (MainFrame)observador;
        
        pnViewer = new ViewerFragmento(padre.getEntityManager());
        GetPanel(pnForm,pnViewer,false);
        IMantenimiento m =(IMantenimiento)pnForm;
        IViewerObservable v = (IViewerObservable)pnViewer;
        m.bind(v,observador);
        v.bind(m);
        
        
        observador.OcultarSubMenu();
        
        revalidate();
        repaint();
    }//GEN-LAST:event_tbtnFragmentoActionPerformed

    private void pnSubMenuFragmentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSubMenuFragmentoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnSubMenuFragmentoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JPanel pnSubMenuFragmento;
    private javax.swing.JToggleButton tbtnFragmento;
    private javax.swing.JToggleButton tbtnPatologo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void Notificar() {
        for(IPanelCentralObservador ob: observadores){
//            ob.SetPanel(pn);
        }
    }

    @Override
    public void GetPanel(JPanel pnfrm, JPanel pnview, boolean sobreponer) {
        for(IPanelCentralObservador ob: observadores){
            ob.SetPanel(pnfrm,pnview,sobreponer);
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getName() {
        return nombre;
//return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    public void UnSelectAllButton(){
        JToggleButton jtb = new JToggleButton();
        for(Component c: jPanel1.getComponents()){
            if (c instanceof JPanel) {
                JPanel jp = new JPanel();
                jp = (JPanel)c;
                jp.setBackground(new Color(240,240,240));
                for(Component cc:jp.getComponents()){
                    if (cc instanceof JToggleButton) {
                        jtb = (JToggleButton)cc;
                        jtb.setSelected(false);
                    }
                }
            }
        }
    }
}
