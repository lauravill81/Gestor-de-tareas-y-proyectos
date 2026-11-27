package pagina_web;
import java.awt.*;              
public class Pantalla_Principal extends javax.swing.JFrame {
    private Proyecto[] proyectos = new Proyecto[6];
    ArbolTareas misTareas = new ArbolTareas();
    int activos = 0;
    int completadas = 0;
    
    java.util.List<Recorda> listaPendientes = new java.util.ArrayList<>();
    private int contadorHechos = 0;
    
    java.util.List<Tarea> listaTareas = new java.util.ArrayList<>();
    java.util.List<Recorda> listaRecordatorios = new java.util.ArrayList<>();
    private int completados = 0;
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName());
    private void inicializarProyectos() {
        for (int i = 0; i < proyectos.length; i++) {
            proyectos[i] = null;
        }
    }
    
    private boolean hayProyectoEnTarjeta(int indiceProyecto) {
        if (indiceProyecto < 0 || indiceProyecto >= proyectos.length) {
            return false;
        }
        Proyecto p = proyectos[indiceProyecto];
        return p != null && p.getNombre() != null && !p.getNombre().trim().isEmpty();
    }

    private void abrirVentanaTareas(int indiceProyecto) {
        if (!hayProyectoEnTarjeta(indiceProyecto)) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "no hay un proyecto creado",
                "Aviso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        VentanaTareas ventana = new VentanaTareas(proyectos[indiceProyecto]);
        ventana.setVisible(true);
    }
    private void abrirVentanaIntegrantes(int indiceProyecto) {
        if (!hayProyectoEnTarjeta(indiceProyecto)) {
            javax.swing.JOptionPane.showMessageDialog(
                this,
                "no hay un proyecto creado",
                "Aviso",
                javax.swing.JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        VentanaIntegrantes ventana = new VentanaIntegrantes(proyectos[indiceProyecto]);
        ventana.setVisible(true);
    }
    
    public Pantalla_Principal() {
        initComponents();
        inicializarProyectos();
        jTextArea1.setOpaque(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);
        jScrollPane2.getViewport().setOpaque(false);
        jTextArea1.setBorder(null);
        jScrollPane2.setBorder(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Boton_Proyectos = new javax.swing.JButton();
        Boton_Recordatorios = new javax.swing.JButton();
        Imagen1 = new javax.swing.JLabel();
        imagen4 = new javax.swing.JLabel();
        imagen5 = new javax.swing.JLabel();
        imagen6 = new javax.swing.JLabel();
        imagen8 = new javax.swing.JLabel();
        Boton_Perfil = new javax.swing.JButton();
        Boton_Informacion = new javax.swing.JButton();
        Panel_Mis_Tareas = new javax.swing.JPanel();
        pantallaProyectos = new PanelDisenoAvanzado();
        titulo_proyectos1 = new javax.swing.JLabel();
        Subtitulo_proyectos1 = new javax.swing.JLabel();
        nuevo_proyecto3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Texto_proyectos_activos = new javax.swing.JLabel();
        Imagen_carpeta = new javax.swing.JLabel();
        lblNumActivos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Texto_tareas_completas = new javax.swing.JLabel();
        Imagen_check_list = new javax.swing.JLabel();
        lblCompletadas = new javax.swing.JLabel();
        Texto_esta_semana = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Texto_fecha_limite = new javax.swing.JLabel();
        lblFechaProxima = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblNombreInfo = new javax.swing.JLabel();
        lblFechaInfo = new javax.swing.JLabel();
        lblImportanciaInfo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblNombreInfo1 = new javax.swing.JLabel();
        lblFechaInfo1 = new javax.swing.JLabel();
        lblImportanciaInfo1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblNombreInfo2 = new javax.swing.JLabel();
        lblFechaInfo2 = new javax.swing.JLabel();
        lblImportanciaInfo2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblNombreInfo3 = new javax.swing.JLabel();
        lblFechaInfo3 = new javax.swing.JLabel();
        lblImportanciaInfo3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblNombreInfo4 = new javax.swing.JLabel();
        lblFechaInfo4 = new javax.swing.JLabel();
        lblImportanciaInfo4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblNombreInfo5 = new javax.swing.JLabel();
        lblFechaInfo5 = new javax.swing.JLabel();
        lblImportanciaInfo5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pantallaRecordatorios = new PanelDisenoAvanzado();
        titulo_recordatorios = new javax.swing.JLabel();
        Subtitulo_recordatorios = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Imagen_campana = new javax.swing.JLabel();
        Texto_total_recordatorios = new javax.swing.JLabel();
        Texto_recordatorios = new javax.swing.JLabel();
        lblTotalRecordatorios = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Imagen_chulito = new javax.swing.JLabel();
        Texto_completados_recordatorios = new javax.swing.JLabel();
        Texto_esta_semama_recordatorios = new javax.swing.JLabel();
        lblCompletados01 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Imagen_reloj = new javax.swing.JLabel();
        Texto_pendientes_recordatorios = new javax.swing.JLabel();
        Texto_por_completar_recordatorios = new javax.swing.JLabel();
        lblPendientes01 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Imagen_calendario = new javax.swing.JLabel();
        Texto_proximos_recordatorios = new javax.swing.JLabel();
        Tiempo_proximos_recordartorios = new javax.swing.JLabel();
        lblProximosContador01 = new javax.swing.JLabel();
        Boton_nuevo_recordatorio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblNombre01 = new javax.swing.JLabel();
        lblFecha01 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblDesc01 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblNombre02 = new javax.swing.JLabel();
        lblFecha02 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblDesc02 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblNombre03 = new javax.swing.JLabel();
        lblFecha03 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblDesc03 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lblNombre04 = new javax.swing.JLabel();
        lblFecha04 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        lblDesc04 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Organizador de Tareas");
        setBackground(new java.awt.Color(247, 247, 247));

        Panel_Principal.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Principal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel1.setText("Tareas");

        Boton_Proyectos.setBackground(new java.awt.Color(243, 240, 255));
        Boton_Proyectos.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Boton_Proyectos.setText("Proyectos");
        Boton_Proyectos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Boton_Proyectos.setOpaque(true);
        Boton_Proyectos.addActionListener(this::Boton_ProyectosActionPerformed);

        Boton_Recordatorios.setBackground(new java.awt.Color(243, 240, 255));
        Boton_Recordatorios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        Boton_Recordatorios.setText("Recordatorios");
        Boton_Recordatorios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Boton_Recordatorios.setOpaque(true);
        Boton_Recordatorios.addActionListener(this::Boton_RecordatoriosActionPerformed);

        Imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/verificado.png"))); // NOI18N

        imagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/proyectos.png"))); // NOI18N

        imagen5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/recordatorio.png"))); // NOI18N
        imagen5.setToolTipText("");

        imagen6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/perfil.png"))); // NOI18N

        imagen8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/informacion.png"))); // NOI18N
        imagen8.setToolTipText("");
        imagen8.setMaximumSize(new java.awt.Dimension(30, 30));
        imagen8.setMinimumSize(new java.awt.Dimension(30, 30));

        Boton_Perfil.setText("Perfil");
        Boton_Perfil.setContentAreaFilled(false);
        Boton_Perfil.addActionListener(this::Boton_PerfilActionPerformed);

        Boton_Informacion.setText("Informacion");
        Boton_Informacion.setContentAreaFilled(false);
        Boton_Informacion.addActionListener(this::Boton_InformacionActionPerformed);

        javax.swing.GroupLayout Panel_PrincipalLayout = new javax.swing.GroupLayout(Panel_Principal);
        Panel_Principal.setLayout(Panel_PrincipalLayout);
        Panel_PrincipalLayout.setHorizontalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Perfil)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(imagen8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton_Informacion))
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(Boton_Proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen4))
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(Boton_Recordatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagen5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_PrincipalLayout.setVerticalGroup(
            Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Imagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_Proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagen4))
                .addGap(40, 40, 40)
                .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(Boton_Recordatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton_Perfil, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imagen6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Boton_Informacion)
                            .addComponent(imagen8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40))
                    .addGroup(Panel_PrincipalLayout.createSequentialGroup()
                        .addComponent(imagen5)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        Panel_Mis_Tareas.setLayout(new java.awt.CardLayout());

        pantallaProyectos.setOpaque(false);

        titulo_proyectos1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        titulo_proyectos1.setText("PROYECTOS");

        Subtitulo_proyectos1.setText("Gestiona y da seguimiento a tus propios proyectos");

        nuevo_proyecto3.setBackground(new java.awt.Color(139, 206, 240));
        nuevo_proyecto3.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        nuevo_proyecto3.setText(" + Nuevo Proyecto");
        nuevo_proyecto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevo_proyecto3.addActionListener(this::nuevo_proyecto3ActionPerformed);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Texto_proyectos_activos.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Texto_proyectos_activos.setText("Proyectos activos");

        lblNumActivos.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblNumActivos.setText("0");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/proyectos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Imagen_carpeta)
                    .addComponent(Texto_proyectos_activos))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumActivos)
                .addGap(239, 239, 239))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto_proyectos_activos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagen_carpeta)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(lblNumActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        Texto_tareas_completas.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Texto_tareas_completas.setText("Proyectos Completados");

        Imagen_check_list.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N

        lblCompletadas.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblCompletadas.setText("0 / 0");

        Texto_esta_semana.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Texto_esta_semana.setForeground(new java.awt.Color(25, 255, 0));
        Texto_esta_semana.setText("En total");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/configuracion.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Texto_tareas_completas))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Imagen_check_list)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompletadas))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Texto_esta_semana)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto_tareas_completas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagen_check_list)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(lblCompletadas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Texto_esta_semana))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        Texto_fecha_limite.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Texto_fecha_limite.setText("Fecha limite proxima");

        lblFechaProxima.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblFechaProxima.setText("No hay fecha");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/Calendario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblFechaProxima))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Texto_fecha_limite)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Texto_fecha_limite)
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFechaProxima)
                    .addComponent(jLabel10))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/verificado.png"))); // NOI18N

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setText("Nombre:");

        jLabel6.setText("Fecha:");

        jLabel7.setText("Importacia:");

        lblNombreInfo.setText("...");

        lblFechaInfo.setText("...");

        lblImportanciaInfo.setText("...");

        jButton1.setBackground(new java.awt.Color(139, 206, 240));
        jButton1.setText("Completar");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton11.setBackground(new java.awt.Color(139, 206, 240));
        jButton11.setText("Tareas");
        jButton11.addActionListener(this::jButton11ActionPerformed);

        jButton12.setBackground(new java.awt.Color(139, 206, 240));
        jButton12.setText("Equipo");
        jButton12.addActionListener(this::jButton12ActionPerformed);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreInfo)
                    .addComponent(lblImportanciaInfo)
                    .addComponent(lblFechaInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblNombreInfo))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblFechaInfo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblImportanciaInfo)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("Nombre:");

        jLabel9.setText("Fecha:");

        jLabel11.setText("Importacia:");

        lblNombreInfo1.setText("...");

        lblFechaInfo1.setText("...");

        lblImportanciaInfo1.setText("...");

        jButton2.setBackground(new java.awt.Color(139, 206, 240));
        jButton2.setText("Completar");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton17.setBackground(new java.awt.Color(139, 206, 240));
        jButton17.setText("Tareas");
        jButton17.addActionListener(this::jButton17ActionPerformed);

        jButton13.setBackground(new java.awt.Color(139, 206, 240));
        jButton13.setText("Equipo");
        jButton13.addActionListener(this::jButton13ActionPerformed);

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(lblNombreInfo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaInfo1)
                            .addComponent(lblImportanciaInfo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblNombreInfo1))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblFechaInfo1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblImportanciaInfo1)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setText("Nombre:");

        jLabel13.setText("Fecha:");

        jLabel14.setText("Importacia:");

        lblNombreInfo2.setText("...");

        lblFechaInfo2.setText("...");

        lblImportanciaInfo2.setText("...");

        jButton3.setBackground(new java.awt.Color(139, 206, 240));
        jButton3.setText("Completar");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton18.setBackground(new java.awt.Color(139, 206, 240));
        jButton18.setText("Tareas");
        jButton18.addActionListener(this::jButton18ActionPerformed);

        jButton14.setBackground(new java.awt.Color(139, 206, 240));
        jButton14.setText("Equipo");
        jButton14.addActionListener(this::jButton14ActionPerformed);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreInfo2)
                    .addComponent(lblFechaInfo2)
                    .addComponent(lblImportanciaInfo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblNombreInfo2))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblFechaInfo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblImportanciaInfo2)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setText("Nombre:");

        jLabel19.setText("Fecha:");

        jLabel20.setText("Importacia:");

        lblNombreInfo3.setText("...");

        lblFechaInfo3.setText("...");

        lblImportanciaInfo3.setText("...");

        jButton6.setBackground(new java.awt.Color(139, 206, 240));
        jButton6.setText("Completar");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButton19.setBackground(new java.awt.Color(139, 206, 240));
        jButton19.setText("Tareas");
        jButton19.addActionListener(this::jButton19ActionPerformed);

        jButton15.setBackground(new java.awt.Color(139, 206, 240));
        jButton15.setText("Equipo");
        jButton15.addActionListener(this::jButton15ActionPerformed);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(lblNombreInfo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaInfo3)
                            .addComponent(lblImportanciaInfo3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblNombreInfo3))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lblFechaInfo3)
                    .addComponent(jButton19))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lblImportanciaInfo3)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton15)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setText("Nombre:");

        jLabel22.setText("Fecha:");

        jLabel23.setText("Importacia:");

        lblNombreInfo4.setText("...");

        lblFechaInfo4.setText("...");

        lblImportanciaInfo4.setText("...");

        jButton5.setBackground(new java.awt.Color(139, 206, 240));
        jButton5.setText("Completar");
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButton20.setBackground(new java.awt.Color(139, 206, 240));
        jButton20.setText("Tareas");
        jButton20.addActionListener(this::jButton20ActionPerformed);

        jButton16.setBackground(new java.awt.Color(139, 206, 240));
        jButton16.setText("Equipo");
        jButton16.addActionListener(this::jButton16ActionPerformed);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(lblNombreInfo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(jButton5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaInfo4)
                            .addComponent(lblImportanciaInfo4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(lblNombreInfo4))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lblFechaInfo4)
                    .addComponent(jButton20))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(lblImportanciaInfo4)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton16)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setText("Nombre:");

        jLabel25.setText("Fecha:");

        jLabel26.setText("Importacia:");

        lblNombreInfo5.setText("...");

        lblFechaInfo5.setText("...");

        lblImportanciaInfo5.setText("...");

        jButton4.setBackground(new java.awt.Color(139, 206, 240));
        jButton4.setText("Completar");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton21.setBackground(new java.awt.Color(139, 206, 240));
        jButton21.setText("Tareas");
        jButton21.addActionListener(this::jButton21ActionPerformed);

        jButton22.setBackground(new java.awt.Color(139, 206, 240));
        jButton22.setText("Equipo");
        jButton22.addActionListener(this::jButton22ActionPerformed);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreInfo5)
                            .addComponent(lblImportanciaInfo5))
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jButton22, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(lblFechaInfo5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(lblNombreInfo5))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(lblFechaInfo5)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(lblImportanciaInfo5))
                    .addComponent(jButton22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Nota: Recuerda que puedes gestionar un máximo de 6 tareas activas simultáneamente. \nNo olvides pulsar el botón \"Completar\" una vez finalices cada proyecto para mantener tu dashboard actualizado y liberar espacio.");
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setFocusable(false);
        jTextArea1.setOpaque(false);
        jTextArea1.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout pantallaProyectosLayout = new javax.swing.GroupLayout(pantallaProyectos);
        pantallaProyectos.setLayout(pantallaProyectosLayout);
        pantallaProyectosLayout.setHorizontalGroup(
            pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaProyectosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaProyectosLayout.createSequentialGroup()
                        .addComponent(Subtitulo_proyectos1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pantallaProyectosLayout.createSequentialGroup()
                        .addComponent(titulo_proyectos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nuevo_proyecto3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(pantallaProyectosLayout.createSequentialGroup()
                        .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pantallaProyectosLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pantallaProyectosLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantallaProyectosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pantallaProyectosLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(323, Short.MAX_VALUE))))
            .addGroup(pantallaProyectosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pantallaProyectosLayout.setVerticalGroup(
            pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaProyectosLayout.createSequentialGroup()
                .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pantallaProyectosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevo_proyecto3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titulo_proyectos1))
                        .addGap(9, 9, 9)
                        .addComponent(Subtitulo_proyectos1)
                        .addGap(18, 18, 18)
                        .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pantallaProyectosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55)
                .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pantallaProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );

        Panel_Mis_Tareas.add(pantallaProyectos, "pantallaProyectos");

        titulo_recordatorios.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        titulo_recordatorios.setText("Recordatorios");

        Subtitulo_recordatorios.setBackground(new java.awt.Color(204, 204, 204));
        Subtitulo_recordatorios.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Subtitulo_recordatorios.setText("No olvides lo importante. Crea y gestiona tus recordatorios");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        Texto_total_recordatorios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Texto_total_recordatorios.setText("Total");

        Texto_recordatorios.setText("Recordatorios");

        lblTotalRecordatorios.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblTotalRecordatorios.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen_campana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTotalRecordatorios))
                    .addComponent(Texto_recordatorios)
                    .addComponent(Texto_total_recordatorios))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Texto_total_recordatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imagen_campana)
                .addGap(7, 7, 7)
                .addComponent(lblTotalRecordatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_recordatorios)
                .addGap(10, 10, 10))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        Texto_completados_recordatorios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Texto_completados_recordatorios.setText("Completados");

        Texto_esta_semama_recordatorios.setText("esta semana");

        lblCompletados01.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblCompletados01.setText("0");

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/panel.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto_completados_recordatorios)
                            .addComponent(Texto_esta_semama_recordatorios)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Imagen_chulito)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCompletados01)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Texto_completados_recordatorios)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel28)
                        .addGap(12, 12, 12)
                        .addComponent(Imagen_chulito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCompletados01)
                        .addGap(16, 16, 16)))
                .addComponent(Texto_esta_semama_recordatorios)
                .addGap(10, 10, 10))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        Texto_pendientes_recordatorios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Texto_pendientes_recordatorios.setText("Pendientes");

        Texto_por_completar_recordatorios.setText("Por completar");

        lblPendientes01.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblPendientes01.setText("0");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/registro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Texto_pendientes_recordatorios)
                            .addComponent(Texto_por_completar_recordatorios)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Imagen_reloj))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPendientes01)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Texto_pendientes_recordatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPendientes01)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Imagen_reloj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Texto_por_completar_recordatorios)
                .addGap(18, 18, 18))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        Imagen_calendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pagina_web/Calendario.png"))); // NOI18N

        Texto_proximos_recordatorios.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        Texto_proximos_recordatorios.setText("Proximos");

        Tiempo_proximos_recordartorios.setText("en las proximas horas");

        lblProximosContador01.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblProximosContador01.setText("0");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Imagen_calendario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto_proximos_recordatorios)
                    .addComponent(Tiempo_proximos_recordartorios)
                    .addComponent(lblProximosContador01))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Texto_proximos_recordatorios)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblProximosContador01))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Imagen_calendario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tiempo_proximos_recordartorios)
                .addGap(17, 17, 17))
        );

        Boton_nuevo_recordatorio.setBackground(new java.awt.Color(139, 206, 240));
        Boton_nuevo_recordatorio.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        Boton_nuevo_recordatorio.setText("+ Nuevo recordatorio");
        Boton_nuevo_recordatorio.addActionListener(this::Boton_nuevo_recordatorioActionPerformed);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setText("Recordatorio");

        jLabel16.setText("Descripcion:");

        jLabel17.setText("Fecha:");

        lblNombre01.setText("...");

        lblFecha01.setText("...");

        jLabel27.setText("Nombre:");

        lblDesc01.setText("...");

        jButton7.setBackground(new java.awt.Color(139, 206, 240));
        jButton7.setText("Completar");
        jButton7.addActionListener(this::jButton7ActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDesc01))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFecha01))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombre01)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblNombre01))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblFecha01)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblDesc01))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setText("Recordatorio");

        jLabel31.setText("Descripcion:");

        jLabel32.setText("Fecha:");

        lblNombre02.setText("...");

        lblFecha02.setText("...");

        jLabel33.setText("Nombre:");

        lblDesc02.setText("...");

        jButton10.setBackground(new java.awt.Color(139, 206, 240));
        jButton10.setText("Completar");
        jButton10.addActionListener(this::jButton10ActionPerformed);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel30)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDesc02))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFecha02))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombre02)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(lblNombre02))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(lblFecha02)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(lblDesc02))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel34.setText("Recordatorio");

        jLabel35.setText("Descripcion:");

        jLabel36.setText("Fecha:");

        lblNombre03.setText("...");

        lblFecha03.setText("...");

        jLabel37.setText("Nombre:");

        lblDesc03.setText("...");

        jButton8.setBackground(new java.awt.Color(139, 206, 240));
        jButton8.setText("Completar");
        jButton8.addActionListener(this::jButton8ActionPerformed);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel34)
                        .addGap(0, 168, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDesc03))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFecha03))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombre03)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lblNombre03))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(lblFecha03))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(lblDesc03))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 255, 255));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel38.setText("Recordatorio");

        jLabel39.setText("Descripcion:");

        jLabel40.setText("Fecha:");

        lblNombre04.setText("...");

        lblFecha04.setText("...");

        jLabel41.setText("Nombre:");

        lblDesc04.setText("...");

        jButton9.setBackground(new java.awt.Color(139, 206, 240));
        jButton9.setText("Completar");
        jButton9.addActionListener(this::jButton9ActionPerformed);

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel38)
                        .addGap(0, 154, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDesc04))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFecha04))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombre04)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(lblNombre04))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(lblFecha04))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(lblDesc04))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pantallaRecordatoriosLayout = new javax.swing.GroupLayout(pantallaRecordatorios);
        pantallaRecordatorios.setLayout(pantallaRecordatoriosLayout);
        pantallaRecordatoriosLayout.setHorizontalGroup(
            pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaRecordatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pantallaRecordatoriosLayout.createSequentialGroup()
                        .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulo_recordatorios)
                            .addComponent(Subtitulo_recordatorios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton_nuevo_recordatorio))
                    .addGroup(pantallaRecordatoriosLayout.createSequentialGroup()
                        .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantallaRecordatoriosLayout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pantallaRecordatoriosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pantallaRecordatoriosLayout.createSequentialGroup()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 402, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pantallaRecordatoriosLayout.setVerticalGroup(
            pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaRecordatoriosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Boton_nuevo_recordatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo_recordatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtitulo_recordatorios)
                .addGap(18, 18, 18)
                .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(71, 71, 71)
                .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pantallaRecordatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(665, Short.MAX_VALUE))
        );

        Panel_Mis_Tareas.add(pantallaRecordatorios, "pantallaRecordatorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel_Mis_Tareas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel_Mis_Tareas, javax.swing.GroupLayout.PREFERRED_SIZE, 708, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void refrescarDashboard(Tarea nueva) {
    if (listaTareas.size() < 6) {
        listaTareas.add(nueva);
        int idx = listaTareas.size() - 1;
            java.text.SimpleDateFormat sdfNuevo = new java.text.SimpleDateFormat("dd/MM/yyyy");
            String fechaStr = (nueva.getFechaEntrega() != null)
                    ? sdfNuevo.format(nueva.getFechaEntrega())
                    : "Sin fecha";
            proyectos[idx] = new Proyecto(
                    nueva.getNombre(),
                    fechaStr,
                    String.valueOf(nueva.getImportancia())
            );
    }

    activos = listaTareas.size();
    lblNumActivos.setText(String.valueOf(activos));
    lblCompletadas.setText(completadas + " / " + activos);


    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
    Tarea proxima = misTareas.obtenerMasProxima();
    if (proxima != null) {
        lblFechaProxima.setText(sdf.format(proxima.getFechaEntrega()));
    }

    actualizarCuadros(sdf);
}
    public void refrescarRecordatorios(Recorda nuevo) {
    if (listaPendientes.size() >= 4) {
        javax.swing.JOptionPane.showMessageDialog(this, "Límite alcanzado.");
        return;
    }
    listaPendientes.add(nuevo);
    java.util.Collections.sort(listaPendientes, (r1, r2) -> r1.getFecha().compareTo(r2.getFecha()));

    actualizarInterfazRecordatorios();
}

private void limpiarCuadrosRecorda() {
    
    lblNombre01.setText(""); lblFecha01.setText(""); lblDesc01.setText("");
   
    lblNombre02.setText(""); lblFecha02.setText(""); lblDesc02.setText("");
   
    lblNombre03.setText(""); lblFecha03.setText(""); lblDesc03.setText("");
   
    lblNombre04.setText(""); lblFecha04.setText(""); lblDesc04.setText("");
}
private void dibujarPanelesRecordatorios() {
    limpiarCuadrosRecorda(); 

    for (int i = 0; i < listaPendientes.size(); i++) {
        Recorda r = listaPendientes.get(i);
        
        switch(i) {
            case 0:
                lblNombre01.setText(r.getNombre());
                lblFecha01.setText(r.getFecha());
                lblDesc01.setText(r.getDescripcion());
                break;
            case 1:
                lblNombre02.setText(r.getNombre());
                lblFecha02.setText(r.getFecha());
                lblDesc02.setText(r.getDescripcion());
                break;
            case 2:
                lblNombre03.setText(r.getNombre());
                lblFecha03.setText(r.getFecha());
                lblDesc03.setText(r.getDescripcion());
                break;
            case 3:
                lblNombre04.setText(r.getNombre());
                lblFecha04.setText(r.getFecha());
                lblDesc04.setText(r.getDescripcion());
                break;
        }
    }
}
private void actualizarInterfazRecordatorios() {
    int total = listaPendientes.size();
    
  
    lblTotalRecordatorios.setText(String.valueOf(total));
    lblPendientes01.setText(String.valueOf(total)); 
    lblCompletados01.setText(String.valueOf(contadorHechos));
    
    if (total > 0) {
       
        Recorda r = listaPendientes.get(0);
        lblProximosContador01.setText(r.getFecha()); 
    } else {
        lblProximosContador01.setText("Sin pendientes");
    }

    dibujarPanelesRecordatorios();
}
public void completarTarea(int indice) {
    if (indice >= 0 && indice < listaTareas.size()) {
        listaTareas.remove(indice);
        completadas++;
        
     
        limpiarCuadrosVisualmente();
        
       
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
        actualizarCuadros(sdf);
        
   
        activos = listaTareas.size();
        lblNumActivos.setText(String.valueOf(activos));
        lblCompletadas.setText(String.valueOf(completadas)); 
        
       
        Tarea proxima = misTareas.obtenerMasProxima();
        if (proxima != null) {
            lblFechaProxima.setText(sdf.format(proxima.getFechaEntrega()));
        } else {
            lblFechaProxima.setText("No hay fecha");
        }
    }
}


private void limpiarCuadrosVisualmente() {
    javax.swing.JLabel[] nombres = {lblNombreInfo, lblNombreInfo1, lblNombreInfo2, lblNombreInfo3, lblNombreInfo4, lblNombreInfo5};
    javax.swing.JLabel[] fechas = {lblFechaInfo, lblFechaInfo1, lblFechaInfo2, lblFechaInfo3, lblFechaInfo4, lblFechaInfo5};
    javax.swing.JLabel[] importancias = {lblImportanciaInfo, lblImportanciaInfo1, lblImportanciaInfo2, lblImportanciaInfo3, lblImportanciaInfo4, lblImportanciaInfo5};

    for (int i = 0; i < 6; i++) {
        nombres[i].setText(""); 
        fechas[i].setText("");  
        importancias[i].setText(""); 
    }
}    

private void actualizarCuadros(java.text.SimpleDateFormat sdf) {
    limpiarCuadrosVisualmente();
    for (int j = 0; j < proyectos.length; j++) {
        proyectos[j] = null;
    }

    for (int i = 0; i < listaTareas.size() && i < 6; i++) {
        Tarea t = listaTareas.get(i);
        String fechaTexto = (t.getFechaEntrega() != null) ? sdf.format(t.getFechaEntrega()) : "Sin fecha";
        
        proyectos[i] = new Proyecto(
            t.getNombre(),
            fechaTexto,
            String.valueOf(t.getImportancia())
        );
        switch (i) {
            case 0: 
                lblNombreInfo.setText("Nombre: " + t.getNombre());
                lblFechaInfo.setText("Fecha: " + fechaTexto);
                lblImportanciaInfo.setText("Importancia: " + t.getImportancia());
                break;
            case 1: 
                lblNombreInfo1.setText("Nombre: " + t.getNombre());
                lblFechaInfo1.setText("Fecha: " + fechaTexto);
                lblImportanciaInfo1.setText("Importancia: " + t.getImportancia());
                break;
            case 2:
                lblNombreInfo2.setText("Nombre: " + t.getNombre());
                lblFechaInfo2.setText("Fecha: " + fechaTexto);
                lblImportanciaInfo2.setText("Importancia: " + t.getImportancia());
                break;
            case 3:
                lblNombreInfo3.setText("Nombre: " + t.getNombre());
                lblFechaInfo3.setText("Fecha: " + fechaTexto);
                lblImportanciaInfo3.setText("Importancia: " + t.getImportancia());
                break;
            case 4:
                lblNombreInfo4.setText("Nombre: " + t.getNombre());
                lblFechaInfo4.setText("Fecha: " + fechaTexto);
                lblImportanciaInfo4.setText("Importancia: " + t.getImportancia());
                break;
            case 5:
                lblNombreInfo5.setText("Nombre: " + t.getNombre());
                lblFechaInfo5.setText("Fecha: " + fechaTexto);
                lblImportanciaInfo5.setText("Importancia: " + t.getImportancia());
                break;
        }
    }
}

    private void limpiarMenu() {
        Color blanco = Color.WHITE;
        Boton_Proyectos.setBackground(blanco);
        Boton_Recordatorios.setBackground(blanco);
    }
    
    private void Boton_ProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ProyectosActionPerformed
        CardLayout card = (CardLayout) Panel_Mis_Tareas.getLayout();
        card.show(Panel_Mis_Tareas, "pantallaProyectos");

        limpiarMenu();
        Boton_Proyectos.setBackground(new Color(139, 206, 240));
    }//GEN-LAST:event_Boton_ProyectosActionPerformed

    private void Boton_RecordatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_RecordatoriosActionPerformed
        CardLayout card = (CardLayout) Panel_Mis_Tareas.getLayout();
        card.show(Panel_Mis_Tareas, "pantallaRecordatorios");

        limpiarMenu();
        Boton_Recordatorios.setBackground(new Color(139, 206, 240));
    }//GEN-LAST:event_Boton_RecordatoriosActionPerformed

    private void Boton_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_PerfilActionPerformed
        VentanaPerfil aviso = new VentanaPerfil(this, true);
        aviso.setLocationRelativeTo(this);
        aviso.setVisible(true);
    }//GEN-LAST:event_Boton_PerfilActionPerformed

    private void Boton_InformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_InformacionActionPerformed
        VentanaInfo aviso = new VentanaInfo(this, true);
        aviso.setLocationRelativeTo(this);
        aviso.setVisible(true);
    }//GEN-LAST:event_Boton_InformacionActionPerformed

    private void nuevo_proyecto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_proyecto3ActionPerformed

    if (listaTareas.size() >= 6) {
        javax.swing.JOptionPane.showMessageDialog(this, """
                                                        Has alcanzado el l\u00edmite m\u00e1ximo de 6 tareas activas.
                                                        Debes completar alguna antes de a\u00f1adir m\u00e1s.""", 
            "Límite alcanzado", 
            javax.swing.JOptionPane.WARNING_MESSAGE);
    } else {
  
        AgregarTarea ventana = new AgregarTarea(this, true);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }          
    }//GEN-LAST:event_nuevo_proyecto3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        completarTarea(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        completarTarea(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       completarTarea(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       completarTarea(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       completarTarea(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        completarTarea(5);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Boton_nuevo_recordatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_nuevo_recordatorioActionPerformed
        RecordatorioDialog dialog = new RecordatorioDialog(this, true);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }//GEN-LAST:event_Boton_nuevo_recordatorioActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!listaPendientes.isEmpty()) {
        listaPendientes.remove(0); 
        contadorHechos++;          
        actualizarInterfazRecordatorios(); 
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (listaPendientes.size() > 1) {
        listaPendientes.remove(1); 
        contadorHechos++;
        actualizarInterfazRecordatorios();
}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (listaPendientes.size() > 2) {
        listaPendientes.remove(2); 
        contadorHechos++;
        actualizarInterfazRecordatorios();
}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (listaPendientes.size() > 3) {
        listaPendientes.remove(3); 
        contadorHechos++;
        actualizarInterfazRecordatorios();
}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        abrirVentanaTareas(0);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        abrirVentanaTareas(1);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        abrirVentanaTareas(2);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        abrirVentanaTareas(3);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        abrirVentanaTareas(4);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        abrirVentanaTareas(5);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        abrirVentanaIntegrantes(0);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        abrirVentanaIntegrantes(1);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        abrirVentanaIntegrantes(2);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        abrirVentanaIntegrantes(3);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        abrirVentanaIntegrantes(4);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        abrirVentanaIntegrantes(5);
    }//GEN-LAST:event_jButton22ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Pantalla_Principal().setVisible(true));
    }
    // 1. Coloca la clase al final de tu archivo Pantalla_Principal.java
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
            java.awt.Color color2 = new java.awt.Color(175, 200, 235);
            java.awt.GradientPaint gp = new java.awt.GradientPaint(0, 0, color1, 0, h, color2);
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, w, h);

            // 2. LA MALLA DE PUNTOS
            g2d.setColor(new java.awt.Color(200, 220, 255, 250)); // Un poco más oscuros para que los veas
            int espacio = 25;
            for (int x = 0; x < w; x += espacio) {
                for (int y = 0; y < h; y += espacio) {
                    g2d.fillOval(x, y, 3, 3);
                }
            }
        
            g2d.dispose();
        // Llamamos al super al final para que los componentes (botones, etc.) se pinten encima
            super.paintComponent(g);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Informacion;
    private javax.swing.JButton Boton_Perfil;
    private javax.swing.JButton Boton_Proyectos;
    private javax.swing.JButton Boton_Recordatorios;
    private javax.swing.JButton Boton_nuevo_recordatorio;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel Imagen_calendario;
    private javax.swing.JLabel Imagen_campana;
    private javax.swing.JLabel Imagen_carpeta;
    private javax.swing.JLabel Imagen_check_list;
    private javax.swing.JLabel Imagen_chulito;
    private javax.swing.JLabel Imagen_reloj;
    private javax.swing.JPanel Panel_Mis_Tareas;
    private javax.swing.JPanel Panel_Principal;
    private javax.swing.JLabel Subtitulo_proyectos1;
    private javax.swing.JLabel Subtitulo_recordatorios;
    private javax.swing.JLabel Texto_completados_recordatorios;
    private javax.swing.JLabel Texto_esta_semama_recordatorios;
    private javax.swing.JLabel Texto_esta_semana;
    private javax.swing.JLabel Texto_fecha_limite;
    private javax.swing.JLabel Texto_pendientes_recordatorios;
    private javax.swing.JLabel Texto_por_completar_recordatorios;
    private javax.swing.JLabel Texto_proximos_recordatorios;
    private javax.swing.JLabel Texto_proyectos_activos;
    private javax.swing.JLabel Texto_recordatorios;
    private javax.swing.JLabel Texto_tareas_completas;
    private javax.swing.JLabel Texto_total_recordatorios;
    private javax.swing.JLabel Tiempo_proximos_recordartorios;
    private javax.swing.JLabel imagen4;
    private javax.swing.JLabel imagen5;
    private javax.swing.JLabel imagen6;
    private javax.swing.JLabel imagen8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCompletadas;
    private javax.swing.JLabel lblCompletados01;
    private javax.swing.JLabel lblDesc01;
    private javax.swing.JLabel lblDesc02;
    private javax.swing.JLabel lblDesc03;
    private javax.swing.JLabel lblDesc04;
    private javax.swing.JLabel lblFecha01;
    private javax.swing.JLabel lblFecha02;
    private javax.swing.JLabel lblFecha03;
    private javax.swing.JLabel lblFecha04;
    private javax.swing.JLabel lblFechaInfo;
    private javax.swing.JLabel lblFechaInfo1;
    private javax.swing.JLabel lblFechaInfo2;
    private javax.swing.JLabel lblFechaInfo3;
    private javax.swing.JLabel lblFechaInfo4;
    private javax.swing.JLabel lblFechaInfo5;
    private javax.swing.JLabel lblFechaProxima;
    private javax.swing.JLabel lblImportanciaInfo;
    private javax.swing.JLabel lblImportanciaInfo1;
    private javax.swing.JLabel lblImportanciaInfo2;
    private javax.swing.JLabel lblImportanciaInfo3;
    private javax.swing.JLabel lblImportanciaInfo4;
    private javax.swing.JLabel lblImportanciaInfo5;
    private javax.swing.JLabel lblNombre01;
    private javax.swing.JLabel lblNombre02;
    private javax.swing.JLabel lblNombre03;
    private javax.swing.JLabel lblNombre04;
    private javax.swing.JLabel lblNombreInfo;
    private javax.swing.JLabel lblNombreInfo1;
    private javax.swing.JLabel lblNombreInfo2;
    private javax.swing.JLabel lblNombreInfo3;
    private javax.swing.JLabel lblNombreInfo4;
    private javax.swing.JLabel lblNombreInfo5;
    private javax.swing.JLabel lblNumActivos;
    private javax.swing.JLabel lblPendientes01;
    private javax.swing.JLabel lblProximosContador01;
    private javax.swing.JLabel lblTotalRecordatorios;
    private javax.swing.JButton nuevo_proyecto3;
    private javax.swing.JPanel pantallaProyectos;
    private javax.swing.JPanel pantallaRecordatorios;
    private javax.swing.JLabel titulo_proyectos1;
    private javax.swing.JLabel titulo_recordatorios;
    // End of variables declaration//GEN-END:variables
}
