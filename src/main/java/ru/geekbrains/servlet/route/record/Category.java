package ru.geekbrains.servlet.route.record;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Category extends Record {

    private Integer id;
    private String name;

    public static String getTableName() {
        return "categories";
    }

    public Category(String name) {
        this.name = name;
    }

    public Category() {

    }

    protected boolean insert() {

        int id = getDbConnection().executeInsert("INSERT INTO " + getTableName() + " (name)" +
                "VALUES(?)", this.name);

        boolean success = id != 0;
        if (success) {
            this.isNewRecord = false;
            this.id = id;
        }
        return success;
    }

    protected boolean update() {

        int result = getDbConnection().executeUpdate("UPDATE " + getTableName() + " SET name = ? " +
                "WHERE id = ?", this.name, this.id);

        return result == 1;
    }

    public boolean delete() {

        int result = getDbConnection().executeUpdate("DELETE FROM " + getTableName() + " WHERE id = ?", this.id);
        return result == 1;
    }

    public static Category findOne(Integer id) {

        ResultSet resultSet = (new Category()).getDbConnection().executeQuery("SELECT * FROM " + getTableName() + " WHERE id = ? LIMIT 1", id);
        try {
            if (resultSet.next()) {
                Category category = new Category();
                category.prepareModel(resultSet);


                return category;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        return null;
    }

    public static ArrayList<Category> findAll() {

        ResultSet resultSet = (new Category()).getDbConnection().executeQuery("SELECT * FROM " + getTableName());

        ArrayList<Category> categories = new ArrayList<>();
        try {

            while (resultSet.next()) {
                Category category = new Category();
                category.prepareModel(resultSet);


                categories.add(category);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        return categories;
    }


    public void prepareModel(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getInt("id");
        this.name = resultSet.getString("name");
        this.isNewRecord = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
