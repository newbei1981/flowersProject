package dao;
import  entitiy.Flower;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FlowerDAO extends  AbstractDAO {
    private static FlowerDAO instance;

    private FlowerDAO() {

    }

    public static FlowerDAO getInstance() {
        if (instance == null) {
            instance = new FlowerDAO();
        }
        return instance;
    }

    public void addFlower(Flower flower) {

    }

    public List<Flower> getAll() {
        Connection connection = null;
        Statement statement = null;
        List<Flower> flowers = new ArrayList<Flower>();

        try {
            connection = getConnection();
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT f.id, fl.mark, f.color, " +
                    "f.length_steak, f.freshness, f.price, f.quantity" +
                    "FROM flowers_exists f INNER JOIN flowers fl ON f.mark_id = fl.id WHERE f.bunch_id iS NULL ");

            while (rs.next()) {
                int id = rs.getInt(1);
                String mark = rs.getString(2);
                String color = rs.getString(3);
                int lengthSteack = rs.getInt(4);
                int freshness = rs.getInt(5);
                double price = rs.getDouble(6);
                int quantity =rs.getInt(7);

                Flower flower = new Flower();
                flower.setId(id);
                flower.setMark(mark);
                flower.setPrice(price);
                flower.setLengthSteak(lengthSteack);
                flower.setFreshness(freshness);
                flower.setPrice(price);
                flower.setQuantity(quantity);
                flowers.add(flower);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null && statement != null) {
                    connection.close();
                    statement.close();
                }
            } catch (SQLException  e) {
                e.printStackTrace();
            }
        }

        return flowers;
    }

    public void deleteFlower(Flower flower){}
}
