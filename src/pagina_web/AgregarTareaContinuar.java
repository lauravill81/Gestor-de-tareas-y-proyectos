package pagina_web;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;


public class AgregarTareaContinuar extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AgregarTareaContinuar.class.getName());

  
    public AgregarTareaContinuar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        setContentPane(new PanelDisenoAvanzado());
        initComponents();
        
        Boton_Finalizar.setContentAreaFilled(false); // Quita el fondo gris sólido
        Boton_Finalizar.setFocusPainted(false);      // Quita el recuadro de enfoque al hacer clic
        Boton_Finalizar.setFont(new java.awt.Font("Segoe UI", java.awt.Font.BOLD, 12));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_Finalizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Boton_Finalizar.setText("Finalizar");
        Boton_Finalizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton_Finalizar.addActionListener(this::Boton_FinalizarActionPerformed);
        getContentPane().add(Boton_Finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 60, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de entrega");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, 22));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/personas (2).png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Nombre del proyecto");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 22));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/Calendario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_FinalizarActionPerformed

    String nombre = jTextField2.getText().trim();
    java.util.Date fechaSeleccionada = jDateChooser1.getDate();
    java.util.Date hoy = new java.util.Date();

   
    if (nombre.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.", "Error", 0);
        return;
    }

    
    if (fechaSeleccionada == null) {
        javax.swing.JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha válida usando el calendario.", "Fecha Inválida", 0);
        return;
    }
    
    
    if (fechaSeleccionada.before(hoy)) {
        long diff = hoy.getTime() - fechaSeleccionada.getTime();
        if (diff > (1000 * 60 * 60 * 24)) {
            javax.swing.JOptionPane.showMessageDialog(this, "No puedes asignar tareas a fechas pasadas.", "Error de Cronología", 0);
            return;
        }
    }

   
    Tarea nueva = new Tarea(nombre, fechaSeleccionada);
    
    for (java.awt.Window win : java.awt.Window.getWindows()) {
        if (win instanceof Pantalla_Principal) {
            Pantalla_Principal principal = (Pantalla_Principal) win;
            principal.misTareas.insertar(nueva);
            principal.refrescarDashboard(nueva);
            break;
        }
    }
    this.dispose();
    }//GEN-LAST:event_Boton_FinalizarActionPerformed

    
    public static void main(String args[]) {
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AgregarTareaContinuar dialog = new AgregarTareaContinuar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Boton_Finalizar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
