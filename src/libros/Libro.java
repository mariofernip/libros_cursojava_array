/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libros;

/**
 *
 * @author mario
 */
public class Libro {
    
    private String codigo;
    private String nombre;
    private String autor;

    public Libro() {
    }

    public Libro(String codigo, String nombre, String autor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
