package pagina_web;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.text.SimpleDateFormat;
public class RecordatorioDialog extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(RecordatorioDialog.class.getName());

    public RecordatorioDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        setContentPane(new PanelDisenoAvanzado());
        initComponents();
        this.setLocationRelativeTo(parent);
        ((javax.swing.JPanel)this.getContentPane()).setOpaque(false);

        // 1. Definimos un blanco con un toque de transparencia (RGB: 255, 255, 255 | Alpha: 200)
        Boton_cancelar.setBackground(new java.awt.Color(255, 255, 255, 200));


        // 5. Los CheckBox y ComboBox también suelen tener fondo gris
        Opcion_uno_notificaciones.setOpaque(false);
        Opcion_dos_notificaciones.setOpaque(false);
        Opcion_tres_notificaciones.setOpaque(false);
        Opcion_cuatro_notificaciones.setOpaque(false);
        Opciones_lista.setOpaque(false);
        calendarFecha.getJCalendar().setMinSelectableDate(new java.util.Date());
        lblNombreRecordatorio.setBorder(new LineBorder(new Color(230, 233, 237), 1, true));
        lblNombreRecordatorio.setBackground(Color.WHITE);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto_nuevo_recordatorio = new javax.swing.JLabel();
        Texto_lista_del_recordatorio = new javax.swing.JLabel();
        lblNombreRecordatorio = new javax.swing.JTextField();
        Texto_nombre_del_recordatorio1 = new javax.swing.JLabel();
        Opciones_lista = new javax.swing.JComboBox<>();
        Texto_fecha_hora_del_recordatorio = new javax.swing.JLabel();
        lblHoraRecordatorio = new javax.swing.JFormattedTextField();
        Texto_repetir_del_recordatorio = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Texto_notificaciones_del_recordatorio = new javax.swing.JLabel();
        Subtitulo_notificaciones_recordatorio = new javax.swing.JLabel();
        Opcion_uno_notificaciones = new javax.swing.JCheckBox();
        Opcion_dos_notificaciones = new javax.swing.JCheckBox();
        Opcion_tres_notificaciones = new javax.swing.JCheckBox();
        Opcion_cuatro_notificaciones = new javax.swing.JCheckBox();
        Texto_notas_del_recordatorio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblDescRecordatorio = new javax.swing.JTextArea();
        Boton_confirmar_recordatorio = new javax.swing.JButton();
        Boton_cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        calendarFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        Texto_nuevo_recordatorio.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Texto_nuevo_recordatorio.setText("Nuevo recordatorio");

        Texto_lista_del_recordatorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Texto_lista_del_recordatorio.setText("Lista");

        lblNombreRecordatorio.setText("Ej. Reunion con cliente");
        lblNombreRecordatorio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblNombreRecordatorioordatorioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblNombreRecordatorioordatorioFocusLost(evt);
            }
        });
        lblNombreRecordatorio.addActionListener(this::lblNombreRecordatorioordatorioActionPerformed);

        Texto_nombre_del_recordatorio1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Texto_nombre_del_recordatorio1.setText("Nombre del recordatorio");

        Opciones_lista.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Opciones_lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal", "Trabajo", "Estudios", "Salud", "Compras" }));
        Opciones_lista.addActionListener(this::Opciones_listaActionPerformed);

        Texto_fecha_hora_del_recordatorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Texto_fecha_hora_del_recordatorio.setText("Fecha y hora");

        try {
            lblHoraRecordatorio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lblHoraRecordatorio.addActionListener(this::lblHoraRecordatorioActionPerformed);

        Texto_repetir_del_recordatorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Texto_repetir_del_recordatorio.setText("Repetir");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No repetir", "Si repetir" }));

        Texto_notificaciones_del_recordatorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Texto_notificaciones_del_recordatorio.setText("Notificaciones");

        Subtitulo_notificaciones_recordatorio.setText("Elige cuándo quieras recibir notificaciones");

        Opcion_uno_notificaciones.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Opcion_uno_notificaciones.setText("En el momento programado");
        Opcion_uno_notificaciones.addActionListener(this::Opcion_uno_notificacionesActionPerformed);

        Opcion_dos_notificaciones.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Opcion_dos_notificaciones.setText("10 minutos antes");

        Opcion_tres_notificaciones.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Opcion_tres_notificaciones.setText("1 Hora antes");
        Opcion_tres_notificaciones.setToolTipText("");

        Opcion_cuatro_notificaciones.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Opcion_cuatro_notificaciones.setText("1 Dia antes");

        Texto_notas_del_recordatorio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Texto_notas_del_recordatorio.setText("Notas (opcional)");

        lblDescRecordatorio.setColumns(20);
        lblDescRecordatorio.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblDescRecordatorio.setLineWrap(true);
        lblDescRecordatorio.setRows(5);
        lblDescRecordatorio.setWrapStyleWord(true);
        jScrollPane1.setViewportView(lblDescRecordatorio);

        Boton_confirmar_recordatorio.setBackground(new java.awt.Color(139, 206, 240));
        Boton_confirmar_recordatorio.setText("Crear recordatorio");
        Boton_confirmar_recordatorio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton_confirmar_recordatorio.addActionListener(this::Boton_confirmar_recordatorioActionPerformed);

        Boton_cancelar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        Boton_cancelar.setText("Cancelar");
        Boton_cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton_cancelar.addActionListener(this::Boton_cancelarActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/Relojpeuqeño.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/verificado.png"))); // NOI18N

        calendarFecha.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombreRecordatorio, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(Opciones_lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Texto_nuevo_recordatorio))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Texto_lista_del_recordatorio)
                                        .addComponent(Texto_nombre_del_recordatorio1))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addComponent(Texto_fecha_hora_del_recordatorio)
                            .addComponent(Texto_repetir_del_recordatorio)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto_notificaciones_del_recordatorio)
                            .addComponent(Subtitulo_notificaciones_recordatorio)
                            .addComponent(Opcion_uno_notificaciones)
                            .addComponent(Opcion_dos_notificaciones)
                            .addComponent(Opcion_tres_notificaciones)
                            .addComponent(Opcion_cuatro_notificaciones)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(lblHoraRecordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(Texto_notas_del_recordatorio)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Boton_confirmar_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Texto_nuevo_recordatorio)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(Texto_nombre_del_recordatorio1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreRecordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Texto_lista_del_recordatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opciones_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Texto_fecha_hora_del_recordatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblHoraRecordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calendarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Texto_repetir_del_recordatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Texto_notificaciones_del_recordatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtitulo_notificaciones_recordatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion_uno_notificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion_dos_notificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion_tres_notificaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Opcion_cuatro_notificaciones)
                .addGap(18, 18, 18)
                .addComponent(Texto_notas_del_recordatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_confirmar_recordatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNombreRecordatorioordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNombreRecordatorioordatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNombreRecordatorioordatorioActionPerformed

    private void lblNombreRecordatorioordatorioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNombreRecordatorioordatorioFocusGained
        if (lblNombreRecordatorio.getText().equals("Ej. Reunión con cliente")) {
        lblNombreRecordatorio.setText("");
        lblNombreRecordatorio.setForeground(java.awt.Color.BLACK);
    }
    }//GEN-LAST:event_lblNombreRecordatorioordatorioFocusGained

    private void lblNombreRecordatorioordatorioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblNombreRecordatorioordatorioFocusLost
        if (lblNombreRecordatorio.getText().isEmpty()) {
        lblNombreRecordatorio.setForeground(new java.awt.Color(153,153,153));
        lblNombreRecordatorio.setText("Ej. Reunión con cliente");
    }
    }//GEN-LAST:event_lblNombreRecordatorioordatorioFocusLost

    private void Opciones_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opciones_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opciones_listaActionPerformed

    private void lblHoraRecordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblHoraRecordatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHoraRecordatorioActionPerformed

    private void Opcion_uno_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion_uno_notificacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opcion_uno_notificacionesActionPerformed

    private void Boton_confirmar_recordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_confirmar_recordatorioActionPerformed

        String nombre = lblNombreRecordatorio.getText();
        String lista = Opciones_lista.getSelectedItem().toString();
        String horaTexto = lblHoraRecordatorio.getText();
        String notas = lblDescRecordatorio.getText();
        
        java.util.Calendar ahora = java.util.Calendar.getInstance();
        java.util.Date fechaSeleccionada = calendarFecha.getDate();
        java.text.SimpleDateFormat dFormat = new java.text.SimpleDateFormat("dd/MM/yyyy");


        if (fechaSeleccionada == null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor selecciona una fecha.", "Fecha faltante", 2);
            return;
        }

      
        if (isSameDay(fechaSeleccionada, ahora.getTime())) {
            try {
                String[] partesHora = horaTexto.split(":");
                int horaIngresada = Integer.parseInt(partesHora[0].trim());
                int minIngresado = Integer.parseInt(partesHora[1].trim());
                
                int horaActual = ahora.get(java.util.Calendar.HOUR_OF_DAY);
                int minActual = ahora.get(java.util.Calendar.MINUTE);
                
                if (horaIngresada < horaActual || (horaIngresada == horaActual && minIngresado <= minActual)) {
                    javax.swing.JOptionPane.showMessageDialog(this, "La hora ya ha pasado hoy.", "Hora Inválida", 0);
                    return;
                }
            } catch (Exception e) {
             
            }
        }

      
        if (nombre.isEmpty() || nombre.equals("Ej. Reunión con cliente") || horaTexto.equals("HH : mm")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Datos faltantes", 2);
            return;
        }


        String fechaFinal = dFormat.format(fechaSeleccionada);
        Recorda nuevoRec = new Recorda(nombre, lista, fechaFinal + " " + horaTexto, notas);

        for (java.awt.Window window : java.awt.Window.getWindows()) {
            if (window instanceof Pantalla_Principal) {
                ((Pantalla_Principal) window).refrescarRecordatorios(nuevoRec); 
                break;
            }
        }
        this.dispose();
    }//GEN-LAST:event_Boton_confirmar_recordatorioActionPerformed

    private void Boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_cancelarActionPerformed
        lblNombreRecordatorio.setText("");
        lblDescRecordatorio.setText("");
        this.dispose();
    }//GEN-LAST:event_Boton_cancelarActionPerformed
        private boolean isSameDay(java.util.Date date1, java.util.Date date2) {
        java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("yyyyMMdd");
        return fmt.format(date1).equals(fmt.format(date2));
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                RecordatorioDialog dialog = new RecordatorioDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });   
    }
    
    class PanelDisenoAvanzado extends javax.swing.JPanel {
    
        public PanelDisenoAvanzado() {
            // Esto es vital: le dice a Swing que no pinte el fondo gris por defecto
            this.setOpaque(false);
        }

        @Override
        protected void paintComponent(java.awt.Graphics g) {
            // Dibujamos el fondo personalizado ANTES de llamar al super
            java.awt.Graphics2D g2d = (java.awt.Graphics2D) g.create();
        
            // Calidad de dibujo
            g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        
            int w = getWidth();
            int h = getHeight();

            // 1. EL DEGRADADO
            java.awt.Color color1 = java.awt.Color.WHITE;
            java.awt.Color color2 = new java.awt.Color(230, 235, 245);
            java.awt.GradientPaint gp = new java.awt.GradientPaint(0, 0, color1, 0, h, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, w, h);

            // 2. LA MALLA DE PUNTOS
            g2d.setColor(new java.awt.Color(200, 220, 255, 250)); // Un poco más oscuros para que los veas
            int espacio = 25;
            for (int x = 0; x < w; x += espacio) {
                for (int y = 0; y < h; y += espacio) {
                    g2d.fillOval(x, y, 2, 2);
                }
            }
        
            g2d.dispose();
        // Llamamos al super al final para que los componentes (botones, etc.) se pinten encima
            super.paintComponent(g);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_cancelar;
    private javax.swing.JButton Boton_confirmar_recordatorio;
    private javax.swing.JCheckBox Opcion_cuatro_notificaciones;
    private javax.swing.JCheckBox Opcion_dos_notificaciones;
    private javax.swing.JCheckBox Opcion_tres_notificaciones;
    private javax.swing.JCheckBox Opcion_uno_notificaciones;
    private javax.swing.JComboBox<String> Opciones_lista;
    private javax.swing.JLabel Subtitulo_notificaciones_recordatorio;
    private javax.swing.JLabel Texto_fecha_hora_del_recordatorio;
    private javax.swing.JLabel Texto_lista_del_recordatorio;
    private javax.swing.JLabel Texto_nombre_del_recordatorio1;
    private javax.swing.JLabel Texto_notas_del_recordatorio;
    private javax.swing.JLabel Texto_notificaciones_del_recordatorio;
    private javax.swing.JLabel Texto_nuevo_recordatorio;
    private javax.swing.JLabel Texto_repetir_del_recordatorio;
    private com.toedter.calendar.JDateChooser calendarFecha;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea lblDescRecordatorio;
    private javax.swing.JFormattedTextField lblHoraRecordatorio;
    private javax.swing.JTextField lblNombreRecordatorio;
    // End of variables declaration//GEN-END:variables
}
