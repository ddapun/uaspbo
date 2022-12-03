/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package database;

/**
 *
 * @author Dafin
 */
public interface CRUD {
    abstract public void insertFigure(String nama, String ukuran, String jenis);
    abstract public void insertFigure(String nama, String ukuran);
    abstract public void insertFigure(String nama);
}
