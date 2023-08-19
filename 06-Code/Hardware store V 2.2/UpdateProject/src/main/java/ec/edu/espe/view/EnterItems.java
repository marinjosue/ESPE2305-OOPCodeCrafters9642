
package ec.edu.espe.view;

import com.google.gson.Gson;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import ec.edu.espe.controller.DatabaseConnection;
import ec.edu.espe.controller.TableController;
import ec.edu.espe.model.Product;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author USER
 */
public class EnterItems extends javax.swing.JFrame {
  
    FondoPanel fondo = new FondoPanel();
 
    private static final String CONNECTION_STRING = "mongodb+srv://josuemarin:josuemarin@cluster0.lntjz9j.mongodb.net/";
    private static MongoClient mongoClient;
    private static MongoDatabase database;
    private static MongoCollection<Document>collection;
    Product product;
    DefaultTableModel tableModel;
    private DatabaseConnection dbConnection;
  

    
    /**
     * Creates new form EnterItems
     */
   
public EnterItems() {
        this.setContentPane(fondo);

        ConnectionString connectionString = new ConnectionString(CONNECTION_STRING);
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("Project");
        collection = database.getCollection("products");

        initComponents();
        this.setLocationRelativeTo(null);
        tableModel = (DefaultTableModel) jTable1.getModel();
        btnEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPane, "Artículo actualizado correctamente");
           
                jButton1ActionPerformed(e);
        dbConnection = new DatabaseConnection("products");

            }
        });
        btnErrarse.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteSelectedItem();
            }
        });  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNameItems = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        btnAccept = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnErrarse = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese los datos del inventario");

        jLabel2.setText("- ID:");

        jLabel3.setText("- Nombre del producto:");

        jLabel4.setText("- Ingrese el Stock del producto:");

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        jLabel5.setText("- Ingrese el precio del producto");

        jLabel6.setText("- Ingrese la descripción del producto:");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        btnAccept.setText("Agregar");
        btnAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAcceptMouseClicked(evt);
            }
        });
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jButton1.setText("Mostrar Stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Stock", "Precio", "Descripcion"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        btnEdit.setText("Actualizar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnErrarse.setText("Borrar");
        btnErrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnErrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnErrarseMouseClicked(evt);
            }
        });
        btnErrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnErrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtStock))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2))
                                            .addGap(58, 58, 58)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNameItems, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                                .addComponent(txtId))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAccept)
                                                .addGap(46, 46, 46)
                                                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnErrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNameItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAccept, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnErrarse, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        MenuOwner menuOwner = new MenuOwner();
        menuOwner.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        String cell1 = txtId.getText();
        String cell2 = txtNameItems.getText();
        String cell3 = txtStock.getText();
        String cell4 = txtPrice.getText();
        String cell5 = txtDescription.getText();
        if (cell1.isEmpty() || cell2.isEmpty() || cell3.isEmpty() || cell4.isEmpty() || cell5.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe llenar todas las celdas", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = Integer.parseInt(cell1);
            if (checkIdExists(id)) {
                JOptionPane.showMessageDialog(this, "El ID ya existe si desea actualizar aplaste el boton Editar", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                readData();
                StringBuilder confirmationMessage = appendItems();
                int option = JOptionPane.showConfirmDialog(this, confirmationMessage.toString());

                if (option == JOptionPane.YES_OPTION) {
                    Gson gson = new Gson();
                    String json = gson.toJson(product);
                    Document document = Document.parse(json);
                    collection.insertOne(document);
                    JOptionPane.showMessageDialog(rootPane, "Guardado");
                    addToTable(product);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Cancelado");
                }
            }
        }
    }//GEN-LAST:event_btnAcceptActionPerformed
    private void btnAcceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcceptMouseClicked
 try {
            readData();
            StringBuilder confirmationMessage = appendItems();

            int option = JOptionPane.showConfirmDialog(this, confirmationMessage.toString());

            if (option == JOptionPane.CANCEL_OPTION || option == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(rootPane, "Cancelado");
                return; 
            }

            if (option == JOptionPane.YES_OPTION) {
                Gson gson = new Gson();
                String json = gson.toJson(product);
                Document document = Document.parse(json);
                collection.insertOne(document);
                JOptionPane.showMessageDialog(rootPane, "Guardado");
                addToTable(product);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo números en los campos ID, Stock y Precio");
        }

    }//GEN-LAST:event_btnAcceptMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtId.setText("");
        txtNameItems.setText("");
        txtStock.setText("");
        txtPrice.setText("");
        txtDescription.setText("");

        
    }//GEN-LAST:event_btnNewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   TableController tableController = new TableController(dbConnection);
        jTable1.setModel(tableController.getTableModel());
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

String cell1 = txtId.getText();
String cell2 = txtNameItems.getText();
String cell3 = txtStock.getText();
String cell4 = txtPrice.getText();
String cell5 = txtDescription.getText();

if (cell1.isEmpty() || cell2.isEmpty() || cell3.isEmpty() || cell4.isEmpty() || cell5.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Debe llenar todas las celdas", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    
    int id = Integer.parseInt(txtId.getText());
    String name = txtNameItems.getText();
    int stock = Integer.parseInt(txtStock.getText());
    double price = Double.parseDouble(txtPrice.getText());
    String description = txtDescription.getText();

    Document selectedDocument = collection.find(Filters.eq("id", id)).first();

    boolean articuloEncontrado = false;

    if (selectedDocument != null) {
        int selectedRow = jTable1.getSelectedRow();

        selectedDocument.put("name", name);
        selectedDocument.put("stock", stock);
        selectedDocument.put("price", price);
        selectedDocument.put("description", description);

        collection.replaceOne(Filters.eq("id", id), selectedDocument);

       
        JOptionPane.showMessageDialog(this, "Artículo actualizado correctamente");

        articuloEncontrado = true;
    }

    if (!articuloEncontrado) {
        JOptionPane.showMessageDialog(this, "El artículo no existe en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Ingrese solo números en los campos ID, Stock y Precio", "Error", JOptionPane.ERROR_MESSAGE);
}

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnErrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnErrarseActionPerformed
 int selectedRow = jTable1.getSelectedRow();

int id = (int) jTable1.getValueAt(selectedRow, 1);


    int option = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el artículo seleccionado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (option == JOptionPane.YES_OPTION) {
        collection.deleteOne(Filters.eq("id", id));
        tableModel.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Artículo eliminado correctamente");
    }
    }//GEN-LAST:event_btnErrarseActionPerformed

    private void btnErrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnErrarseMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnErrarseMouseClicked

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     int fila = jTable1.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(null, "No se encontró ninguna fila seleccionada");
    } else {
        try {
            int id = Integer.parseInt(jTable1.getValueAt(fila, 0).toString());
            String nom = (String) jTable1.getValueAt(fila, 1);
            int stock = Integer.parseInt(jTable1.getValueAt(fila, 2).toString());
            double price = Double.parseDouble(jTable1.getValueAt(fila, 3).toString());
            String descrip = (String) jTable1.getValueAt(fila, 4);

            txtId.setText(String.valueOf(id));
            txtNameItems.setText(nom);
            txtStock.setText(String.valueOf(stock));
            txtPrice.setText(String.valueOf(price));
            txtDescription.setText(descrip);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los valores de la fila seleccionada");
        }
    }
   
    }//GEN-LAST:event_jTable1MouseClicked

    private StringBuilder appendItems() {
        StringBuilder confirmationMessage = new StringBuilder();
        confirmationMessage.append("Estas seguro de ingresar el siguiente producto?").append("\n\n");
        confirmationMessage.append("ID: ").append(product.getId()).append("\n");
        confirmationMessage.append("Name: ").append(product.getName()).append("\n");
        confirmationMessage.append("Stock: ").append(product.getStock()).append("\n");
        confirmationMessage.append("Price: ").append(product.getPrice()).append("\n");
        confirmationMessage.append("Description: ").append(product.getDescription()).append("\n");
        return confirmationMessage;
    }
    
    private boolean checkIdExists(int id) {
    Document query = new Document("id", id);
    return collection.countDocuments(query) > 0;
    }
    
    private void readData() throws NumberFormatException {
    int id;
    String name;
    int stock;
    double price;
    String description;

    id = Integer.parseInt(txtId.getText());
    name = txtNameItems.getText();
    stock = Integer.parseInt(txtStock.getText());
    price = Double.parseDouble(txtPrice.getText());
    description = txtDescription.getText();

    product = new Product(id, name, stock, price);
    product.setDescription(description);
    }

    private void addToTable(Product product) {
        Object[] row = {product.getId(), product.getName(), product.getStock(), product.getPrice(), product.getDescription()};
        tableModel.addRow(row);
    }
    


private void deleteSelectedItem() {
    int selectedRow = jTable1.getSelectedRow();

    int id = (int) jTable1.getValueAt(selectedRow, 0);

    int option = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el artículo seleccionado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

    if (option == JOptionPane.YES_OPTION) {
        collection.deleteOne(Filters.eq("id", id));
        tableModel.removeRow(selectedRow);
        JOptionPane.showMessageDialog(this, "Artículo eliminado correctamente");
    }
}


    
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
            java.util.logging.Logger.getLogger(EnterItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnterItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnterItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnterItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnterItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnErrarse;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNameItems;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
   class FondoPanel extends JPanel
    {
        private Image imagen;
        @Override
        public void paint (Graphics g){
            
            imagen = new ImageIcon(getClass().getResource("/Pictures/General.jpg")).getImage();
            
           
            g.drawImage(imagen,0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    
    } 






}
