package vista;

import vista.agregarCliente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Reservaciones extends javax.swing.JFrame {
    /* CONEXIÓN */
    public static final String URL = "jdbc:mysql://localhost:3306/salon de fiestas";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
        } catch(Exception e){
            System.out.println(e);
        }
        return con;
        
    }
    /* CONEXIÓN */
    
    private void limpiarCajas(){
        decoracion.setSelected(false);
        platillo.setSelected(false);
        postres.setSelected(false);
        fotos.setSelected(false);
        meseros.setSelected(false);
        lights.setSelected(false);
        coordinador.setSelected(false);
        piñata.setSelected(false);
        invites.setSelected(false);
        musica.setSelected(false);
        show.setSelected(false);
        cake.setSelected(false);
        decoracion.setEnabled(true);
        platillo.setEnabled(true);
        postres.setEnabled(true);
        fotos.setEnabled(true);
        meseros.setEnabled(true);
        lights.setEnabled(true);
        coordinador.setEnabled(true);
        piñata.setEnabled(true);
        invites.setEnabled(true);
        musica.setEnabled(true);
        show.setEnabled(true);
        cake.setEnabled(true);
        paquete.setSelectedIndex(0);
        tipoEvento.setText(null);
        fecha.setText(null);
        duracion.setText(null);
        nombrecliente.setText(null);
        txtId.setText(null);
        
    }
    
    /**
     * Creates new form vista
     */
    public Reservaciones() {
        initComponents();
        txtId.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFrame1 = new javax.swing.JFrame();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 240), new java.awt.Dimension(0, 240), new java.awt.Dimension(32767, 240));
        jTextField9 = new javax.swing.JTextField();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombrecliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        decoracion = new javax.swing.JCheckBox();
        platillo = new javax.swing.JCheckBox();
        meseros = new javax.swing.JCheckBox();
        show = new javax.swing.JCheckBox();
        musica = new javax.swing.JCheckBox();
        lights = new javax.swing.JCheckBox();
        postres = new javax.swing.JCheckBox();
        cake = new javax.swing.JCheckBox();
        coordinador = new javax.swing.JCheckBox();
        piñata = new javax.swing.JCheckBox();
        invites = new javax.swing.JCheckBox();
        fotos = new javax.swing.JCheckBox();
        addserv = new javax.swing.JButton();
        deleteserv = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        costo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paquete = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 240), new java.awt.Dimension(0, 240), new java.awt.Dimension(32767, 240));
        regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tipoEvento = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        duracion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();

        jButton2.setText("Agregar servicio");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jFormattedTextField1.setText("jFormattedTextField1");

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.setBackground(new java.awt.Color(153, 102, 255));
        jFrame1.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jFrame1.setForeground(java.awt.Color.pink);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Salon de Fiestas");

        jLabel13.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel13.setText("Cliente");

        jLabel14.setText("Nombre del cliente: ");

        jLabel15.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel15.setText("Paquetes");

        jLabel16.setText("Paquete:");

        jLabel17.setText("Seleccione los servicios que desea agregar:");

        jLabel18.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel18.setText("Servicios");

        jCheckBox13.setText("Decoracion del salon");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setText("Platillo de comida");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setText("Meseros durante el evento");

        jCheckBox16.setText("Show durante el evento");

        jCheckBox17.setText("Música durante el evento");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jCheckBox18.setText("Iluminación");
        jCheckBox18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox18ActionPerformed(evt);
            }
        });

        jCheckBox19.setText("Mesa de postres");

        jCheckBox20.setText("Pastel");

        jCheckBox21.setText("Coordinador durante el evento");

        jCheckBox22.setText("Piñata");

        jCheckBox23.setText("Invitaciones");

        jCheckBox24.setText("Fotografías y video durante el evento");

        jButton6.setText("Agregar servicio");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(30, 204, 51));
        jButton7.setForeground(new java.awt.Color(255, 102, 102));
        jButton7.setText("Borrar servicio");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Limpiar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Registrar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel19.setText("Descripción del paquete");

        jLabel20.setText("Total:");

        jLabel21.setText("Servicio");

        jLabel22.setText("Costo");

        jTextField7.setMargin(new java.awt.Insets(2, 0, 2, 0));

        jTextField8.setMargin(new java.awt.Insets(2, 0, 2, 0));
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paquete 1", "Paquete 2" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(jLabel15)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(48, 48, 48)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox21)
                            .addComponent(jCheckBox17))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jCheckBox16)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox20))
                            .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton6)
                                .addGroup(jFrame1Layout.createSequentialGroup()
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox14)
                                        .addComponent(jCheckBox15)
                                        .addComponent(jCheckBox22))
                                    .addGap(8, 8, 8)
                                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox23)
                                        .addComponent(jCheckBox19)
                                        .addComponent(jCheckBox18))
                                    .addGap(22, 22, 22)))))
                    .addComponent(jCheckBox13))
                .addGap(20, 20, 20)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(127, 127, 127))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(394, 394, 394))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addGap(25, 25, 25))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(264, 264, 264)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8)
                            .addComponent(jLabel20)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox19))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox24)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox18))
                        .addGap(10, 10, 10)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox21)
                            .addComponent(jCheckBox22)
                            .addComponent(jCheckBox23))
                        .addGap(11, 11, 11)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox20)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox17))
                        .addGap(35, 35, 35)
                        .addComponent(jButton6))
                    .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTextField9.setText("jTextField9");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Decoración del salón", "$2,000"},
                {"Platillo de comida", "$50 por persona"},
                {"Meseros durante el evento", "$1,500"},
                {"Show durante el evento", "$3,500"},
                {"Música durante el evento", "$2,500"},
                {"Iluminación", "$1000"},
                {"Mesa de postres", "$2,500"},
                {"Pastel", "$1,750"},
                {"Coordinador durante el evento", "$1000"},
                {"Piñata", "$450"},
                {"Invitaciones", "$10 por persona"},
                {"Fotografías y video", "$2,500"},
                {"Cabina fotográfica", "$2,000"},
                {"Renta de salón", "$13,000"},
                {"Barra libre", "$120 por persona"}
            },
            new String [] {
                "Servicio", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Salón de Fiestas");
        setBackground(new java.awt.Color(153, 102, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.pink);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Salon de Fiestas");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre del cliente: ");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setText("Paquetes");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Paquete:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Seleccione los servicios que desea agregar:");

        jLabel11.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel11.setText("Servicios");

        decoracion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        decoracion.setText("Decoracion del salon");
        decoracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decoracionActionPerformed(evt);
            }
        });

        platillo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        platillo.setText("Platillo de comida");
        platillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platilloActionPerformed(evt);
            }
        });

        meseros.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        meseros.setText("Meseros durante el evento");

        show.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        show.setText("Show durante el evento");

        musica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        musica.setText("Música durante el evento");
        musica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicaActionPerformed(evt);
            }
        });

        lights.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lights.setText("Iluminación");
        lights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lightsActionPerformed(evt);
            }
        });

        postres.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        postres.setText("Mesa de postres");

        cake.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cake.setText("Pastel");

        coordinador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coordinador.setText("Coordinador durante el evento");

        piñata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        piñata.setText("Piñata");

        invites.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        invites.setText("Invitaciones");

        fotos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fotos.setText("Fotografías y video durante el evento");

        addserv.setText("Agregar servicio");
        addserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addservActionPerformed(evt);
            }
        });

        deleteserv.setBackground(new java.awt.Color(217, 64, 50));
        deleteserv.setForeground(new java.awt.Color(255, 255, 255));
        deleteserv.setText("Borrar servicio");
        deleteserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteservActionPerformed(evt);
            }
        });

        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setText("Descripción del paquete");

        jLabel7.setText("Total:");

        paquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--", "Paquete 1", "Paquete 2" }));
        paquete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paqueteActionPerformed(evt);
            }
        });

        regresar.setText("Regresar al menú principal");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ss", null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setText("Tipo de evento:");

        jLabel9.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jLabel9.setText("Fecha:");

        jLabel23.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel23.setText("Duración:");

        tipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoEventoActionPerformed(evt);
            }
        });

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fotos)
                                    .addComponent(coordinador)
                                    .addComponent(musica))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(show)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(platillo)
                                            .addComponent(meseros)
                                            .addComponent(piñata))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(invites)
                                            .addComponent(postres)
                                            .addComponent(lights)
                                            .addComponent(cake))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(39, 39, 39)
                                                .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(42, 42, 42)
                                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addComponent(decoracion)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel23))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addserv)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteserv)
                                .addGap(18, 18, 18)
                                .addComponent(limpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(costo)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(regresar)
                    .addComponent(jLabel1))
                .addGap(394, 394, 394))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(deleteserv)
                                    .addComponent(limpiar)
                                    .addComponent(jLabel7)
                                    .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registrar))
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decoracion)
                            .addComponent(platillo)
                            .addComponent(postres))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fotos)
                            .addComponent(meseros)
                            .addComponent(lights))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coordinador)
                            .addComponent(piñata)
                            .addComponent(invites))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cake)
                            .addComponent(show)
                            .addComponent(musica))
                        .addGap(18, 18, 18)
                        .addComponent(addserv)
                        .addGap(35, 35, 35)))
                .addComponent(regresar)
                .addGap(20, 20, 20))
        );

        meseros.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void decoracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decoracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decoracionActionPerformed

    private void platilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_platilloActionPerformed

    private void musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_musicaActionPerformed

    private void addservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addservActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_addservActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteservActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_limpiarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Connection con = null;
        if(paquete.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningún paquete ni servicio.");
        } else{
            try{
                con = getConnection();

                /* ENLACE CON 'CLIENTE_ID' */
                ps=con.prepareStatement("SELECT id_cliente FROM cliente WHERE nombre = ?");
                ps.setString(1, nombrecliente.getText());
                rs=ps.executeQuery();
                if(rs.next()){
                    txtId.setText(rs.getString("id_cliente"));
                } else{
                    JOptionPane.showMessageDialog(null,"");
                }

                /* REALIZA LA RESERVACION EN LA TABLA 'EVENTO' */
                ps=con.prepareStatement("INSERT INTO evento (tipo_evento, fecha_evento, duracion_evento, costo_evento, id_servicios, paquete_id, cliente_id) VALUES(?,?,?,?,?,?,?)");
                ps.setString(1, tipoEvento.getText());
                ps.setDate(2, Date.valueOf(fecha.getText()));
                ps.setString(3, duracion.getText());
                ps.setString(4, costo.getText());
                ps.setInt(5, 5);
                if(paquete.getSelectedIndex()==1){
                    ps.setInt(6, 1);
                } else if(paquete.getSelectedIndex()==2){
                    ps.setInt(6, 2);
                }
                ps.setString(7, txtId.getText());
                int res = ps.executeUpdate();
                if(res>0){
                    JOptionPane.showMessageDialog(null, "Evento reservado.");
                    limpiarCajas();
                } else{
                    JOptionPane.showMessageDialog(null, "Error en uno de los campos.");
                    limpiarCajas();
                }
                con.close();

            } catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoActionPerformed

    private void paqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paqueteActionPerformed
        if(paquete.getSelectedIndex()==1){
            decoracion.setSelected(false);
            platillo.setSelected(false);
            postres.setSelected(false);
            fotos.setSelected(false);
            meseros.setSelected(false);
            lights.setSelected(false);
            coordinador.setSelected(false);
            piñata.setSelected(false);
            invites.setSelected(false);
            musica.setSelected(false);
            show.setSelected(false);
            cake.setSelected(false);
            platillo.setSelected(true);
            fotos.setSelected(true);
            meseros.setSelected(true);
            musica.setSelected(true);
            cake.setSelected(true);
            decoracion.setEnabled(false);
            platillo.setEnabled(false);
            postres.setEnabled(false);
            fotos.setEnabled(false);
            meseros.setEnabled(false);
            lights.setEnabled(false);
            coordinador.setEnabled(false);
            piñata.setEnabled(false);
            invites.setEnabled(false);
            musica.setEnabled(false);
            show.setEnabled(false);
            cake.setEnabled(false);
            costo.setText("$23,500");
            
        } else if(paquete.getSelectedIndex()==2){
            decoracion.setSelected(false);
            platillo.setSelected(false);
            postres.setSelected(false);
            fotos.setSelected(false);
            meseros.setSelected(false);
            lights.setSelected(false);
            coordinador.setSelected(false);
            piñata.setSelected(false);
            invites.setSelected(false);
            musica.setSelected(false);
            show.setSelected(false);
            cake.setSelected(false);
            decoracion.setSelected(true);
            platillo.setSelected(true);
            postres.setSelected(true);
            fotos.setSelected(true);
            meseros.setSelected(true);
            invites.setSelected(true);
            musica.setSelected(true);
            cake.setSelected(true);
            decoracion.setEnabled(false);
            platillo.setEnabled(false);
            postres.setEnabled(false);
            fotos.setEnabled(false);
            meseros.setEnabled(false);
            lights.setEnabled(false);
            coordinador.setEnabled(false);
            piñata.setEnabled(false);
            invites.setEnabled(false);
            musica.setEnabled(false);
            show.setEnabled(false);
            cake.setEnabled(false);
            costo.setText("$33,500");
        } else{
            decoracion.setSelected(false);
            platillo.setSelected(false);
            postres.setSelected(false);
            fotos.setSelected(false);
            meseros.setSelected(false);
            lights.setSelected(false);
            coordinador.setSelected(false);
            piñata.setSelected(false);
            invites.setSelected(false);
            musica.setSelected(false);
            show.setSelected(false);
            cake.setSelected(false);
            decoracion.setEnabled(true);
            platillo.setEnabled(true);
            postres.setEnabled(true);
            fotos.setEnabled(true);
            meseros.setEnabled(true);
            lights.setEnabled(true);
            coordinador.setEnabled(true);
            piñata.setEnabled(true);
            invites.setEnabled(true);
            musica.setEnabled(true);
            show.setEnabled(true);
            cake.setEnabled(true);
            paquete.setSelectedIndex(0);
            costo.setText(null);
        }
    }//GEN-LAST:event_paqueteActionPerformed

    private void lightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lightsActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox18ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        menuPrincipal second = new menuPrincipal();
        second.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void tipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoEventoActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addserv;
    public javax.swing.JCheckBox cake;
    public javax.swing.JCheckBox coordinador;
    private javax.swing.JTextField costo;
    public javax.swing.JCheckBox decoracion;
    private javax.swing.JButton deleteserv;
    private javax.swing.JTextField duracion;
    private javax.swing.JTextField fecha;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    public javax.swing.JCheckBox fotos;
    public javax.swing.JCheckBox invites;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JCheckBox lights;
    private javax.swing.JButton limpiar;
    public javax.swing.JCheckBox meseros;
    public javax.swing.JCheckBox musica;
    public javax.swing.JTextField nombrecliente;
    private javax.swing.JComboBox<String> paquete;
    public javax.swing.JCheckBox piñata;
    public javax.swing.JCheckBox platillo;
    public javax.swing.JCheckBox postres;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    public javax.swing.JCheckBox show;
    private javax.swing.JTextField tipoEvento;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
