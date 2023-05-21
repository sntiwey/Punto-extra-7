package org.example;
import org.example.persistencia.LibroDAO;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {

 LibroDAO ldao = new LibroDAO();
        try {
            if (ldao.delete("11")){
            System.out.println("Se elimino correctamente");
        }else{
            System.out.println("No se pudo eliminar");
        }
        } catch (SQLException sqle) {
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }
    }
}