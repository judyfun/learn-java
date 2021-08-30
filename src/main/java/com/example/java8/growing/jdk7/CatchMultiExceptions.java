package java8.growing.jdk7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CatchMultiExceptions {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(""));
            Connection     conn   = null;
            Statement      stmt   = conn.createStatement();
        } catch (FileNotFoundException | SQLException e) {
            // catch multiple exceptions
            e.printStackTrace();
        }


    }
}
