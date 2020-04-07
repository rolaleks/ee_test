package ru.geekbrains.servlet.route.record;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Product extends Record {

    private Integer id;
    private String name;
    private String description;
    private double price;

    public static String getTableName() {
        return "products";
    }


    protected boolean insert() {

        int id = getDbConnection().executeInsert("INSERT INTO " + getTableName() + " (name,description,price)" +
                "VALUES(?,?,?)", this.name, this.description, this.price);

        boolean success = id != 0;
        if (success) {
            this.isNewRecord = false;
            this.id = id;
        }
        return success;
    }

    protected boolean update() {

        int result = getDbConnection().executeUpdate("UPDATE " + getTableName() + " SET name = ?, description = ?, price = ? " +
                "WHERE id = ?", this.name, this.description, this.price, this.id);

        return result == 1;
    }

    public boolean delete() {

        int result = getDbConnection().executeUpdate("DELETE FROM " + getTableName() + " WHERE id = ?", this.id);
        return result == 1;
    }

    public static Product findOne(Integer id) {

        ResultSet resultSet = getDbConnection().executeQuery("SELECT * FROM " + getTableName() + " WHERE id = ? LIMIT 1", id);
        try {
            if (resultSet.next()) {
                Product product = new Product();
                product.prepareModel(resultSet);


                return product;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    public static ArrayList<Product> findAll() {


        ResultSet resultSet = getDbConnection()
                .executeQuery("SELECT * FROM " + getTableName());

        ArrayList<Product> products = new ArrayList<>();
        try {

            while (resultSet.next()) {
                Product product = new Product();
                product.prepareModel(resultSet);


                products.add(product);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        return products;
    }


    public void prepareModel(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getInt("id");
        this.name = resultSet.getString("name");
        this.description = resultSet.getString("description");
        this.price = resultSet.getFloat("price");
        this.isNewRecord = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }


}
