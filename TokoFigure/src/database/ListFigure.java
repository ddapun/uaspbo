package database;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ListFigure extends Database implements CRUD{
    // Constructor untuk Connect ke Database
    public ListFigure() throws ClassNotFoundException, SQLException {
        super();
    }

    public static void info(){
        JOptionPane.showMessageDialog(null, "Anda Lupa Memasukkan Ukuran");
    }
    // Create
    @Override
    public void insertFigure(String nama, String ukuran, String jenis)  {
        try {
        String sql = String.format("INSERT INTO figure (nama, ukuran, jenis) VALUES ('%s', '%s', '%s')", nama, ukuran,
                jenis);
        this.setQuery(sql);
        this.execute();            
        } catch (Exception e) {
        }

    }

    // Read
    public void getAll() throws SQLException {
        String sql = "SELECT * FROM figure";
        this.setQuery(sql);
        this.fetch();
    }
    
    // Update
    public void updateFigure(int id, String nama, String ukuran, String jenis) throws SQLException {
        String sql = String.format("UPDATE figure SET nama = '%s', ukuran = '%s', jenis = '%s' WHERE id_figure = %d",
                nama, ukuran, jenis, id);
        this.setQuery(sql);
        this.execute();
    }

    // Delete
    public void deleteFigure(int id) throws SQLException {
        String sql = String.format("DELETE FROM figure WHERE id_figure = %d", id);
        this.setQuery(sql);
        this.execute();
    }

    // Validation untuk mencegah redudansi data
    public boolean checkFigure(String nama) throws SQLException {
        getAll();
        while (this.value.next()) {
            if (this.value.getString("nama") == nama) {
                return false;
            }
        }
        return true;
    }

    // Print hewan
    public String[][] showFigure() throws SQLException {
        String[][] data = new String[this.lenFigure()][4];
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            data[i][0] =  Integer.toString(this.value.getInt("id_figure"));
            data[i][1] = this.value.getString("nama");
            data[i][2] = this.value.getString("ukuran");
            data[i][3] = this.value.getString("jenis");
            i++;
        }
        return data;
    }
    
    public int lenFigure() throws SQLException {
        getAll();
        this.fetch();
        int i = 0;
        while (this.value.next()) {
            i++;
        }
        return i;
    }

    @Override
    public void insertFigure(String nama, String ukuran) {
        JOptionPane.showMessageDialog(null, "Anda Lupa Memasukkan Jenis");
    }

    @Override
    public void insertFigure(String nama){
        info();
    }
}
