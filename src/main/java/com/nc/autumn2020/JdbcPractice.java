package com.nc.autumn2020.databaseH2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String,Integer> goods = new HashMap<>();

    private static void addToGoods (){
        goods.put("bublegum", 25);
        goods.put("blaster", 1000);
        goods.put("dog-hot", 50);
        goods.put("pizza", 110);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        addToGoods();
        Class.forName("org.h2.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "")){
            try(Statement statement = conn.createStatement()){
                statement.executeUpdate("CREATE TABLE IF NOT EXISTS LAREK (id int auto_increment, name varchar(255), price varchar(255))");
                System.out.println("done");
            }
            int id = 0;
            for (Map.Entry<String, Integer> pair: goods.entrySet()) {
                try(PreparedStatement insStatement = conn.prepareStatement("INSERT INTO LAREK VALUES (?,?,?)")){
                    insStatement.setInt(1, id);
                    id++;
                    insStatement.setString(2,pair.getKey());
                    insStatement.setInt(3, pair.getValue());
                    insStatement.executeUpdate();
                }
            }
            id = 0;
            Statement statement = conn.createStatement();
            String sqlCommand = "SELECT * FROM LAREK";
            ResultSet resultSet = statement.executeQuery(sqlCommand);
            for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
                System.out.print(resultSet.getMetaData().getColumnLabel(i) + " ");
            }
            System.out.println();
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " "
                        + resultSet.getString(2) + " "
                        + resultSet.getInt(3));
            }





        }
    }
}
