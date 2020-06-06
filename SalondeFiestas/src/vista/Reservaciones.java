package vista;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
            JOptionPane.showMessageDialog(null,"No hay conexión con la base de datos.");
        }
        return con;
        
    }
    /* CONEXIÓN */
    
    private void limpiarOpciones(){
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
        renta.setSelected(false);
        cabina.setSelected(false);
        barra.setSelected(false);
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
        renta.setEnabled(true);
        cabina.setEnabled(true);
        barra.setEnabled(true);
        cantidadPersonas.setText(null);
        numeroservicios.setText(null);
        cantidadPersonas.setText("0");
    }
    
    private void limpiarCajas(){
        limpiarOpciones();
        paquete.setSelectedIndex(0);
        tipoEvento.setText(null);
        fecha.setText(null);
        duracion.setText(null);
        nombrecliente.setText(null);
        txtId.setText(null);
        costo.setText(null);
        int suma=0;
        costo.setText(Integer.toString(suma));
    }
    
    /**
     * Creates new form vista
     */
    public Reservaciones() {
        initComponents();
        txtId.setVisible(false);
        numeroservicios.setVisible(false);
        cantidadPersonas.setText("0");
        int suma=0;
        costo.setText(Integer.toString(suma));
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
        descripcionPaquete = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tipoEvento = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        duracion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        cabina = new javax.swing.JCheckBox();
        renta = new javax.swing.JCheckBox();
        barra = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        cantidadPersonas = new javax.swing.JTextField();
        numeroservicios = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

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
        decoracion.setText("Decoración del salón");
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
        meseros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meserosActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        show.setText("Show durante el evento");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

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
        postres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postresActionPerformed(evt);
            }
        });

        cake.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cake.setText("Pastel");
        cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeActionPerformed(evt);
            }
        });

        coordinador.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        coordinador.setText("Coordinador durante el evento");
        coordinador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coordinadorActionPerformed(evt);
            }
        });

        piñata.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        piñata.setText("Piñata");
        piñata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piñataActionPerformed(evt);
            }
        });

        invites.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        invites.setText("Invitaciones");
        invites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitesActionPerformed(evt);
            }
        });

        fotos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fotos.setText("Fotografías y video durante el evento");
        fotos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fotosActionPerformed(evt);
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

        paquete.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Paquete 1", "Paquete 2" }));
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

        descripcionPaquete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Servicios", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(descripcionPaquete);
        if (descripcionPaquete.getColumnModel().getColumnCount() > 0) {
            descripcionPaquete.getColumnModel().getColumn(0).setResizable(false);
            descripcionPaquete.getColumnModel().getColumn(1).setResizable(false);
        }

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

        cabina.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cabina.setText("Cabina fotográfica");
        cabina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabinaActionPerformed(evt);
            }
        });

        renta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        renta.setText("Renta del salón");
        renta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentaActionPerformed(evt);
            }
        });

        barra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        barra.setText("Barra libre");
        barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("Cantidad de invitados:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 51, 51));
        jLabel25.setText("Importante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(410, 410, 410))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(regresar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fotos)
                                            .addComponent(coordinador)
                                            .addComponent(musica)
                                            .addComponent(renta))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(show)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(platillo)
                                                    .addComponent(meseros)
                                                    .addComponent(piñata)
                                                    .addComponent(cabina))
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(barra)
                                                    .addComponent(invites)
                                                    .addComponent(postres)
                                                    .addComponent(lights)
                                                    .addComponent(cake)))))
                                    .addComponent(jLabel4)
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
                                            .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(39, 39, 39)
                                                    .addComponent(nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(42, 42, 42)
                                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(jLabel5)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                                                    .addGap(45, 45, 45)
                                                    .addComponent(jLabel24)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(cantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(deleteserv)
                                        .addGap(18, 18, 18)
                                        .addComponent(limpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(costo)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numeroservicios, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE))))))
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
                        .addGap(0, 0, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(cantidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(decoracion)
                            .addComponent(platillo)
                            .addComponent(postres))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fotos)
                            .addComponent(meseros)
                            .addComponent(lights))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(coordinador)
                            .addComponent(piñata)
                            .addComponent(invites))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cake)
                            .addComponent(show)
                            .addComponent(musica))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cabina)
                            .addComponent(renta)
                            .addComponent(barra)
                            .addComponent(numeroservicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addComponent(regresar)))
                .addContainerGap())
        );

        meseros.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void decoracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decoracionActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(decoracion.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+2000));
            String newtext=numeroservicios.getText()+",01";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Decoración del salón", "$2,000"});
        }
    }//GEN-LAST:event_decoracionActionPerformed

    private void platilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platilloActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(platillo.isSelected()){
            int cant=(Integer.parseInt(cantidadPersonas.getText()));
            if(cant<=0){
                JOptionPane.showMessageDialog(null, "Indique la cantidad de personas que asistirán.");
                platillo.setSelected(false);
            } else{
                int costoplatillos=50*cant;
                int suma=(Integer.parseInt(costo.getText()));
                costo.setText(Integer.toString(suma+costoplatillos));
                String newtext=numeroservicios.getText()+",02";
                numeroservicios.setText(newtext);
                String totalplatillos=Integer.toString(costoplatillos);
                model.addRow(new Object[]{"Comida", totalplatillos});    
            }            
        }
    }//GEN-LAST:event_platilloActionPerformed

    private void musicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicaActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(musica.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+2500));
            String newtext=numeroservicios.getText()+",05";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Música durante el evento", "2500"});
        }
    }//GEN-LAST:event_musicaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void deleteservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteservActionPerformed
        DefaultTableModel model = (DefaultTableModel) this.descripcionPaquete.getModel();
        int[] rows = descripcionPaquete.getSelectedRows();
        for(int i=0;i<rows.length;i++){
            String valor=(String) model.getValueAt(rows[i]-i,1);
            System.out.println(valor);
            String cadena = valor;
            String replace1=cadena.replace("$","");
            String replace2=replace1.replace(",","");
            System.out.println(replace2);
            System.out.println(model.getValueAt(rows[i]-i,1));
            int costoservicio = (Integer.parseInt(replace2));
            int suma=(Integer.parseInt(costo.getText()));
            System.out.println(costoservicio);
            costo.setText(Integer.toString(suma-costoservicio));
            System.out.println(costo.getText());
            
            String texto=(String) model.getValueAt(rows[i]-i,0);
            switch (texto){
                case "Decoración del salón":
                    String viejos=numeroservicios.getText();
                    String nuevos=viejos.replace(",01","");
                    numeroservicios.setText(nuevos);
                    decoracion.setSelected(false);
                    break;
                case "Comida":
                    String viejos2=numeroservicios.getText();
                    String nuevos2=viejos2.replace(",02","");
                    numeroservicios.setText(nuevos2);
                    platillo.setSelected(false);
                    break;
                case "Meseros durante el evento":
                    String viejos3=numeroservicios.getText();
                    String nuevos3=viejos3.replace(",03","");
                    numeroservicios.setText(nuevos3);
                    meseros.setSelected(false);
                    break;
                case "Show durante el evento":
                    String viejos4=numeroservicios.getText();
                    String nuevos4=viejos4.replace(",04","");
                    numeroservicios.setText(nuevos4);
                    show.setSelected(false);
                    break;
                case "Música durante el evento":
                    String viejos5=numeroservicios.getText();
                    String nuevos5=viejos5.replace(",05","");
                    numeroservicios.setText(nuevos5);
                    musica.setSelected(false);
                    break;
                case "Iluminación":
                    String viejos6=numeroservicios.getText();
                    String nuevos6=viejos6.replace(",06","");
                    numeroservicios.setText(nuevos6);
                    lights.setSelected(false);
                    break;
                case "Mesa de postres":
                    String viejos7=numeroservicios.getText();
                    String nuevos7=viejos7.replace(",07","");
                    numeroservicios.setText(nuevos7);
                    postres.setSelected(false);
                    break;
                case "Pastel":
                    String viejos8=numeroservicios.getText();
                    String nuevos8=viejos8.replace(",08","");
                    numeroservicios.setText(nuevos8);
                    cake.setSelected(false);
                    break;
                case "Coordinador durante el evento":
                    String viejos9=numeroservicios.getText();
                    String nuevos9=viejos9.replace(",09","");
                    numeroservicios.setText(nuevos9);
                    coordinador.setSelected(false);
                    break;
                case "Piñata":
                    String viejos10=numeroservicios.getText();
                    String nuevos10=viejos10.replace(",10","");
                    numeroservicios.setText(nuevos10);
                    piñata.setSelected(false);
                    break;
                case "Invitaciones":
                    String viejos11=numeroservicios.getText();
                    String nuevos11=viejos11.replace(",11","");
                    numeroservicios.setText(nuevos11);
                    invites.setSelected(false);
                    break;
                case "Fotografías y video":
                    String viejos12=numeroservicios.getText();
                    String nuevos12=viejos12.replace(",12","");
                    numeroservicios.setText(nuevos12);
                    fotos.setSelected(false);
                    break;
                case "Cabina fotográfica":
                    String viejos13=numeroservicios.getText();
                    String nuevos13=viejos13.replace(",13","");
                    numeroservicios.setText(nuevos13);
                    cabina.setSelected(false);
                    break;
                case "Renta del salón":
                    String viejos14=numeroservicios.getText();
                    String nuevos14=viejos14.replace(",14","");
                    numeroservicios.setText(nuevos14);
                    renta.setSelected(false);
                    break;
                case "Barra libre":
                    String viejos15=numeroservicios.getText();
                    String nuevos15=viejos15.replace(",15","");
                    numeroservicios.setText(nuevos15);
                    barra.setSelected(false);
                    break;
            }
            
            model.removeRow(rows[i]-i);
        }
    }//GEN-LAST:event_deleteservActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiarCajas();
    }//GEN-LAST:event_limpiarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Connection con = null;
        if((paquete.getSelectedIndex()==0 && numeroservicios==null) || cantidadPersonas==null || (Integer.parseInt(cantidadPersonas.getText()))<=0){
            JOptionPane.showMessageDialog(null,"Verifique bien los campos antes de registrar.");
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
                    JOptionPane.showMessageDialog(null,"Cliente no encontrado.");
                }

                /* REALIZA LA RESERVACION EN LA TABLA 'EVENTO' */
                ps=con.prepareStatement("INSERT INTO evento (tipo_evento, fecha_evento, duracion_evento, costo_evento, id_servicios, paquete_id, cliente_id) VALUES(?,?,?,?,?,?,?)");
                ps.setString(1, tipoEvento.getText());
                ps.setDate(2, Date.valueOf(fecha.getText()));
                ps.setString(3, duracion.getText());
                ps.setString(4, "$"+costo.getText());
                String ahoraSiUltimoReplaceParaElInsert=numeroservicios.getText();
                String ahilesva=ahoraSiUltimoReplaceParaElInsert.replaceFirst(",","");
                ps.setString(5, ahilesva);
                switch (paquete.getSelectedIndex()) {
                    case 1:
                        ps.setInt(6, 1);
                        break;
                    case 2:
                        ps.setInt(6, 2);
                        break;
                    default:
                        ps.setInt(6, 0);
                        break;
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
                JOptionPane.showMessageDialog(null,"Error.");
            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed

    }//GEN-LAST:event_costoActionPerformed

    private void paqueteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paqueteActionPerformed
        switch (paquete.getSelectedIndex()) {
            case 1:
                limpiarOpciones();
                renta.setSelected(true);
                platillo.setSelected(true);
                musica.setSelected(true);
                meseros.setSelected(true);
                cake.setSelected(true);
                fotos.setSelected(true);
                renta.setEnabled(false);
                platillo.setEnabled(false);
                musica.setEnabled(false);
                meseros.setEnabled(false);
                cake.setEnabled(false);
                fotos.setEnabled(false);
                cantidadPersonas.setText("100");
                costo.setText("23500");
                descripcionPaquete.setModel(new javax.swing.table.DefaultTableModel(
                        new String [][] {
                            {"Renta del salón", "$13,000"},
                            {"Capacidad de 100 personas", ""},
                            {"Comida", "$2,000"},
                            {"Música durante el evento", "$2,500"},
                            {"Meseros", "$1,500"},
                            {"Pastel", "$1,750"},
                            {"Fotografías y video", "$2,500"},
                        },
                        new String [] {
                            "Servicio", "Costo"
                        }
                ));
                
                
                break;
            case 2:
                limpiarOpciones();
                renta.setSelected(true);
                platillo.setSelected(true);
                musica.setSelected(true);
                meseros.setSelected(true);
                cake.setSelected(true);
                fotos.setSelected(true);
                decoracion.setSelected(true);
                postres.setSelected(true);
                invites.setSelected(true);
                renta.setEnabled(false);
                platillo.setEnabled(false);
                musica.setEnabled(false);
                meseros.setEnabled(false);
                cake.setEnabled(false);
                fotos.setEnabled(false);
                decoracion.setEnabled(false);
                postres.setEnabled(false);
                invites.setEnabled(false);
                cantidadPersonas.setText("200");
                costo.setText("33500");
                descripcionPaquete.setModel(new javax.swing.table.DefaultTableModel(
                        new String [][] {
                            {"Renta del salón", "$13,000"},
                            {"Capacidad de 200 personas", ""},
                            {"Comida", "$2,000"},
                            {"Música durante el evento", "$2,500"},
                            {"Meseros", "$1,500"},
                            {"Pastel", "$1,750"},
                            {"Fotografías y video", "$2,500"},
                            {"Decoración del salón", "$2,000"},
                            {"Mesa de postres", "$2,500"},
                            {"Invitaciones", "$2,000"},
                        },
                        new String [] {
                            "Servicio", "Costo"
                        }
                )); break;
            default:
                limpiarOpciones();
                descripcionPaquete.setModel(new javax.swing.table.DefaultTableModel(
                        new String[][] {
                        },
                        new String [] {
                            "Servicio", "Costo"
                        }
                ));
                break;
        }
        
    }//GEN-LAST:event_paqueteActionPerformed

    private void lightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lightsActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(lights.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+1000));
            String newtext=numeroservicios.getText()+",06";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Iluminación", "$1,000"});
        }
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

    private void barraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(barra.isSelected()){
            int cant=(Integer.parseInt(cantidadPersonas.getText()));
            if(cant<=0){
                JOptionPane.showMessageDialog(null, "Indique la cantidad de personas que asistirán.");
                barra.setSelected(false);
            } else{
                int costobarra=120*cant;
                int suma=(Integer.parseInt(costo.getText()));
                costo.setText(Integer.toString(suma+costobarra));
                String newtext=numeroservicios.getText()+",15";
                numeroservicios.setText(newtext);
                String totalbarra=Integer.toString(costobarra);
                model.addRow(new Object[]{"Barra libre", totalbarra});
            }
        }
    }//GEN-LAST:event_barraActionPerformed

    private void postresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postresActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(postres.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+2500));
            String newtext=numeroservicios.getText()+",07";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Mesa de postres", "$2,500"});
        }
    }//GEN-LAST:event_postresActionPerformed

    private void fotosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fotosActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(fotos.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+2500));
            String newtext=numeroservicios.getText()+",12";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Fotografías y video", "$2,500"});
        }
    }//GEN-LAST:event_fotosActionPerformed

    private void meserosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meserosActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(meseros.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+1500));
            String newtext=numeroservicios.getText()+",03";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Meseros durante el evento", "$1,500"});
        }
    }//GEN-LAST:event_meserosActionPerformed

    private void coordinadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coordinadorActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(coordinador.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+1000));
            String newtext=numeroservicios.getText()+",09";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Coordinador durante el evento", "$1,000"});
        }
    }//GEN-LAST:event_coordinadorActionPerformed

    private void piñataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piñataActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(piñata.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+450));
            String newtext=numeroservicios.getText()+",10";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Piñata", "$450"});
        }
    }//GEN-LAST:event_piñataActionPerformed

    private void invitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitesActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(invites.isSelected()){
            int cant=(Integer.parseInt(cantidadPersonas.getText()));
            if(cant<=0){
                JOptionPane.showMessageDialog(null, "Indique la cantidad de personas que asistirán.");
                invites.setSelected(false);
            }
            else{
                int costoinvitaciones=10*cant;
                int suma=(Integer.parseInt(costo.getText()));
                costo.setText(Integer.toString(suma+costoinvitaciones));
                String newtext=numeroservicios.getText()+",11";
                numeroservicios.setText(newtext);
                String totalinvitaciones=Integer.toString(costoinvitaciones);
                model.addRow(new Object[]{"Invitaciones", totalinvitaciones});
            }
        }
    }//GEN-LAST:event_invitesActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(show.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+3500));
            String newtext=numeroservicios.getText()+",04";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Show durante el evento", "$3,500"});
        }
    }//GEN-LAST:event_showActionPerformed

    private void cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(cake.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+1750));
            String newtext=numeroservicios.getText()+",08";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Pastel", "$1,750"});
        }
    }//GEN-LAST:event_cakeActionPerformed

    private void rentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentaActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(renta.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+13000));
            String newtext=numeroservicios.getText()+",14";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Renta del salón", "$13,000"});
        }
    }//GEN-LAST:event_rentaActionPerformed

    private void cabinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabinaActionPerformed
        DefaultTableModel model = (DefaultTableModel) descripcionPaquete.getModel();
        if(cabina.isSelected()){
            int suma=(Integer.parseInt(costo.getText()));
            costo.setText(Integer.toString(suma+2000));
            String newtext=numeroservicios.getText()+",13";
            numeroservicios.setText(newtext);
            model.addRow(new Object[]{"Cabina fotográfica", "$2,000"});
        }
    }//GEN-LAST:event_cabinaActionPerformed

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
    private javax.swing.JCheckBox barra;
    private javax.swing.JCheckBox cabina;
    public javax.swing.JCheckBox cake;
    private javax.swing.JTextField cantidadPersonas;
    public javax.swing.JCheckBox coordinador;
    public javax.swing.JTextField costo;
    public javax.swing.JCheckBox decoracion;
    private javax.swing.JButton deleteserv;
    public javax.swing.JTable descripcionPaquete;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField numeroservicios;
    public javax.swing.JComboBox<String> paquete;
    public javax.swing.JCheckBox piñata;
    public javax.swing.JCheckBox platillo;
    public javax.swing.JCheckBox postres;
    private javax.swing.JButton registrar;
    private javax.swing.JButton regresar;
    private javax.swing.JCheckBox renta;
    public javax.swing.JCheckBox show;
    private javax.swing.JTextField tipoEvento;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
