/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ticketing;

import DAOImplements.DaoImplements;
import Pojo.*;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class GestionTicketing extends javax.swing.JFrame {

    Perfil p = null;

    /**
     * Creates new form GestionTicketing
     */
    public GestionTicketing(Perfil p) {
        initComponents();
        this.p = p;
        this.jTextFieldIncidencia.setVisible(false);
        this.jLabelAutor.setVisible(false);
        this.jLabelEstado.setVisible(false);
        this.jLabelDescripcion.setVisible(false);
        this.jLabelFechaCierre.setVisible(false);
        this.jLabelFechaCreacion1.setVisible(false);
        this.jLabelId.setVisible(false);
        this.jLabelTitulo.setVisible(false);
        this.jLabelTipo.setVisible(false);
        this.jLabelTecnico.setVisible(false);
        this.jLabelBuscarIncidencia.setVisible(false);
        this.jLabelPrioridad.setVisible(false);
        this.jTextAreaDescripcion.setVisible(false);
        this.textFieldAutor.setVisible(false);
        this.textFieldEstado.setVisible(false);
        this.textFieldFechaCierre.setVisible(false);
        this.textFieldFechaCreacion.setVisible(false);
        this.textFieldPrioridad.setVisible(false);
        this.textFieldTecnico.setVisible(false);
        this.textFieldTipo.setVisible(false);
        this.textFieldTitulo.setVisible(false);
        this.textFieldBuscarIncidencia.setVisible(false);
        this.txtFieldId.setVisible(false);
        this.jScrollPane1.setVisible(false);
        this.btnBuscarIncidencia.setVisible(false);
        this.btnInsert.setVisible(false);
    }

    private GestionTicketing() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBuscar9 = new javax.swing.JButton();
        btnBuscar11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnIncidencia = new javax.swing.JButton();
        textFieldFechaCreacion = new javax.swing.JTextField();
        textFieldTitulo = new javax.swing.JTextField();
        jLabelAutor = new javax.swing.JLabel();
        jTextFieldIncidencia = new javax.swing.JTextField();
        btnBuscarIncidencia = new javax.swing.JButton();
        textFieldTipo = new javax.swing.JTextField();
        jLabelId = new javax.swing.JLabel();
        txtFieldId = new javax.swing.JTextField();
        jLabelFechaCierre = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        textFieldAutor = new javax.swing.JTextField();
        jLabelFechaCreacion1 = new javax.swing.JLabel();
        textFieldFechaCierre = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        textFieldEstado = new javax.swing.JTextField();
        textFieldPrioridad = new javax.swing.JTextField();
        jLabelPrioridad = new javax.swing.JLabel();
        jLabelTecnico = new javax.swing.JLabel();
        textFieldTecnico = new javax.swing.JTextField();
        jLabelDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        textFieldBuscarIncidencia = new javax.swing.JTextField();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelBuscarIncidencia = new javax.swing.JLabel();
        btnInsertaIncidencia = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        btnVerTodasLasIncidencias = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        btnBuscar9.setText("Buscar Incidencia");
        btnBuscar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar9ActionPerformed(evt);
            }
        });

        btnBuscar11.setText("Buscar Incidencia");
        btnBuscar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(138, 185, 244));

        jPanel1.setBackground(new java.awt.Color(136, 185, 244));

        jLabelTitulo.setText("Titulo");

        btnIncidencia.setText("Buscar Incidencia");
        btnIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncidenciaActionPerformed(evt);
            }
        });

        textFieldFechaCreacion.setEditable(false);

        textFieldTitulo.setEditable(false);
        textFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTituloActionPerformed(evt);
            }
        });

        jLabelAutor.setText("Autor");

        jTextFieldIncidencia.setEditable(false);
        jTextFieldIncidencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldIncidencia.setText("INCIDENCIAS");
        jTextFieldIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIncidenciaActionPerformed(evt);
            }
        });

        btnBuscarIncidencia.setText("Buscar");
        btnBuscarIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIncidenciaActionPerformed(evt);
            }
        });

        textFieldTipo.setEditable(false);

        jLabelId.setText("Id");

        txtFieldId.setEditable(false);
        txtFieldId.setFocusable(false);
        txtFieldId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFieldIdMouseClicked(evt);
            }
        });
        txtFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldIdActionPerformed(evt);
            }
        });

        jLabelFechaCierre.setText("Fecha Cierre");

        jLabelTipo.setText("Tipo");

        textFieldAutor.setEditable(false);

        jLabelFechaCreacion1.setText("Fecha Creación");

        textFieldFechaCierre.setEditable(false);

        jLabelEstado.setText("Estado");

        textFieldEstado.setEditable(false);

        textFieldPrioridad.setEditable(false);

        jLabelPrioridad.setText("Prioridad");

        jLabelTecnico.setText("Tecnico Asignado");

        textFieldTecnico.setEditable(false);

        jLabelDescripcion.setText("Descripcion");

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        textFieldBuscarIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldBuscarIncidenciaActionPerformed(evt);
            }
        });

        jLabelMensaje.setText("¿Que acción desea realizar?");

        jLabelBuscarIncidencia.setText("Buscar incidencia por id");

        btnInsertaIncidencia.setText("Insertar Incidencia");
        btnInsertaIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertaIncidenciaActionPerformed(evt);
            }
        });

        btnAdmin.setText("Soy Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnVerTodasLasIncidencias.setText("Ver todas las incidencias");
        btnVerTodasLasIncidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTodasLasIncidenciasActionPerformed(evt);
            }
        });

        btnInsert.setText("Insertar");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelBuscarIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldBuscarIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnInsertaIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVerTodasLasIncidencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelFechaCreacion1)
                                .addGap(5, 5, 5)
                                .addComponent(textFieldFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelFechaCierre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPrioridad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelTecnico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTecnico))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(307, 307, 307))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncidencia)
                    .addComponent(btnInsertaIncidencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldFechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaCierre, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jLabelFechaCreacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textFieldFechaCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdmin)
                    .addComponent(btnVerTodasLasIncidencias))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrioridad, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textFieldPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTecnico, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textFieldTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarIncidencia)
                    .addComponent(textFieldBuscarIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscarIncidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert))
                .addGap(78, 78, 78))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncidenciaActionPerformed
        // TODO add your handling code here:
        this.btnBuscarIncidencia.setVisible(true);
        this.jLabelBuscarIncidencia.setVisible(true);
        this.textFieldBuscarIncidencia.setVisible(true);

    }//GEN-LAST:event_btnIncidenciaActionPerformed

    private void jTextFieldIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIncidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIncidenciaActionPerformed

    private void txtFieldIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFieldIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldIdMouseClicked

    private void txtFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldIdActionPerformed

    private void textFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldTituloActionPerformed

    private void btnBuscarIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIncidenciaActionPerformed
        // TODO add your handling code here:
        try (DaoImplements di = new DaoImplements()) {
            this.jTextFieldIncidencia.setVisible(true);
            this.jLabelAutor.setVisible(true);
            this.jLabelEstado.setVisible(true);
            this.jLabelDescripcion.setVisible(true);
            this.jLabelFechaCierre.setVisible(true);
            this.jLabelFechaCreacion1.setVisible(true);
            this.jLabelId.setVisible(true);
            this.jLabelTitulo.setVisible(true);
            this.jLabelTipo.setVisible(true);
            this.jLabelTecnico.setVisible(true);
            this.jLabelPrioridad.setVisible(true);
            this.jTextAreaDescripcion.setVisible(true);
            this.textFieldAutor.setVisible(true);
            this.textFieldEstado.setVisible(true);
            this.textFieldFechaCierre.setVisible(true);
            this.textFieldFechaCreacion.setVisible(true);
            this.textFieldPrioridad.setVisible(true);
            this.textFieldTecnico.setVisible(true);
            this.textFieldTipo.setVisible(true);
            this.textFieldTitulo.setVisible(true);
            this.txtFieldId.setVisible(true);
            this.jScrollPane1.setVisible(true);

            this.jTextAreaDescripcion.setEditable(false);
            this.textFieldAutor.setEditable(false);
            this.textFieldEstado.setEditable(false);
            this.textFieldFechaCierre.setEditable(false);
            this.textFieldFechaCreacion.setEditable(false);
            this.textFieldPrioridad.setEditable(false);
            this.textFieldTecnico.setEditable(false);
            this.textFieldTipo.setEditable(false);
            this.textFieldTitulo.setEditable(false);
            this.btnInsert.setVisible(false);

            Incidencia i = di.buscaIncidenciaPorId(Integer.parseInt(this.textFieldBuscarIncidencia.getText()));
            this.textFieldAutor.setText(String.valueOf(i.getId_perfil()));
            this.textFieldEstado.setText(i.getEstado());
            this.txtFieldId.setText(String.valueOf(i.getId()));
            this.textFieldTitulo.setText(i.getTitulo());
            this.textFieldFechaCreacion.setText(i.getFecha_creacion());
            this.textFieldFechaCierre.setText(i.getFecha_cierre());
            this.textFieldTipo.setText(i.getTipo());
            this.textFieldPrioridad.setText(i.getPrioridad());
            this.textFieldTecnico.setText(String.valueOf(i.getId_tecnico()));
            this.jTextAreaDescripcion.setText(i.getDescripcion());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No existe esa incidencia");
            ex.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Hubo otros problemas");
        }

    }//GEN-LAST:event_btnBuscarIncidenciaActionPerformed

    private void textFieldBuscarIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldBuscarIncidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldBuscarIncidenciaActionPerformed

    private void btnInsertaIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertaIncidenciaActionPerformed
        // TODO add your handling code here:
        this.textFieldAutor.setText(String.valueOf(this.p.getId()));
        this.textFieldFechaCreacion.setText(String.valueOf(LocalDate.now()));

        this.jTextFieldIncidencia.setVisible(true);
        this.jLabelAutor.setVisible(true);
        this.jLabelEstado.setVisible(true);
        this.jLabelDescripcion.setVisible(true);
        this.jLabelFechaCierre.setVisible(true);
        this.jLabelFechaCreacion1.setVisible(true);
        this.jLabelTitulo.setVisible(true);
        this.jLabelTipo.setVisible(true);
        this.jLabelTecnico.setVisible(true);
        this.jLabelPrioridad.setVisible(true);
        this.jTextAreaDescripcion.setVisible(true);
        this.textFieldAutor.setVisible(true);
        this.textFieldEstado.setVisible(true);
        this.textFieldFechaCierre.setVisible(true);
        this.textFieldFechaCreacion.setVisible(true);
        this.textFieldPrioridad.setVisible(true);
        this.textFieldTecnico.setVisible(true);
        this.textFieldTipo.setVisible(true);
        this.textFieldTitulo.setVisible(true);
        this.jScrollPane1.setVisible(true);
        this.btnInsert.setVisible(true);
        this.txtFieldId.setVisible(false);
        this.jLabelId.setVisible(false);

        this.jTextAreaDescripcion.setEditable(true);
        this.textFieldAutor.setEditable(true);
        this.textFieldEstado.setEditable(true);
        this.textFieldFechaCierre.setEditable(true);
        this.textFieldFechaCreacion.setEditable(true);
        this.textFieldPrioridad.setEditable(true);
        this.textFieldTecnico.setEditable(true);
        this.textFieldTipo.setEditable(true);
        this.textFieldTitulo.setEditable(true);

        this.jTextAreaDescripcion.setText(null);
        this.textFieldEstado.setText(null);
        this.textFieldFechaCierre.setText(null);
        this.textFieldPrioridad.setText(null);
        this.textFieldTecnico.setText(null);
        this.textFieldTipo.setText(null);
        this.textFieldTitulo.setText(null);

    }//GEN-LAST:event_btnInsertaIncidenciaActionPerformed

    private void btnBuscar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar9ActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnBuscar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar11ActionPerformed

    private void btnVerTodasLasIncidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTodasLasIncidenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerTodasLasIncidenciasActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        try (DaoImplements di = new DaoImplements()) {
            Incidencia i = new Incidencia(this.textFieldEstado.getText(), this.jTextAreaDescripcion.getText(), this.textFieldPrioridad.getText(), this.textFieldTipo.getText(),
                    Integer.parseInt(this.txtFieldId.getText()), this.textFieldTitulo.getText());
            di.insertaIncidencia(i);
            JOptionPane.showMessageDialog(this, "Incidencia Registrada");
            this.jTextAreaDescripcion.setText(null);
            this.textFieldAutor.setText(null);
            this.textFieldEstado.setText(null);
            this.textFieldFechaCierre.setText(null);
            this.textFieldFechaCreacion.setText(null);
            this.textFieldPrioridad.setText(null);
            this.textFieldTecnico.setText(null);
            this.textFieldTipo.setText(null);
            this.textFieldTitulo.setText(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "No existe esa incidencia");
            ex.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Hubo otros problemas");
        }
    }//GEN-LAST:event_btnInsertActionPerformed

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
            java.util.logging.Logger.getLogger(GestionTicketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionTicketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionTicketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionTicketing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionTicketing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnBuscar11;
    private javax.swing.JButton btnBuscar9;
    private javax.swing.JButton btnBuscarIncidencia;
    private javax.swing.JButton btnIncidencia;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnInsertaIncidencia;
    private javax.swing.JButton btnVerTodasLasIncidencias;
    private javax.swing.JLabel jLabelAutor;
    private javax.swing.JLabel jLabelBuscarIncidencia;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelFechaCierre;
    private javax.swing.JLabel jLabelFechaCreacion1;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelPrioridad;
    private javax.swing.JLabel jLabelTecnico;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldIncidencia;
    private javax.swing.JTextField textFieldAutor;
    private javax.swing.JTextField textFieldBuscarIncidencia;
    private javax.swing.JTextField textFieldEstado;
    private javax.swing.JTextField textFieldFechaCierre;
    private javax.swing.JTextField textFieldFechaCreacion;
    private javax.swing.JTextField textFieldPrioridad;
    private javax.swing.JTextField textFieldTecnico;
    private javax.swing.JTextField textFieldTipo;
    private javax.swing.JTextField textFieldTitulo;
    private javax.swing.JTextField txtFieldId;
    // End of variables declaration//GEN-END:variables
}
