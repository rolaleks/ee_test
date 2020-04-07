package ru.geekbrains.servlet.route.record;


import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletContext;
import java.sql.*;

@ApplicationScoped
@Named
public class DbConnection {

    @Inject
    private ServletContext ctx;

    private Connection connection;
    private Statement stmt;

    @PostConstruct
    public void init() throws SQLException {
        connection = DriverManager.getConnection(ctx.getInitParameter("dbConnection"), ctx.getInitParameter("dbUser"), ctx.getInitParameter("dbPass"));
        stmt = connection.createStatement();
    }

    public int executeUpdate(String query, Object... params) {
        try {
            PreparedStatement ps = this.getConnection().prepareStatement(query);

            prepareParams(ps, params);

            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int executeInsert(String query, Object... params) {
        try {
            PreparedStatement ps = this.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            prepareParams(ps, params);

            return ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public ResultSet executeQuery(String query, Object... params) {

        try {
            PreparedStatement ps = this
                    .getConnection()
                    .prepareStatement(query);

            prepareParams(ps, params);
            return ps.executeQuery();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void prepareParams(PreparedStatement ps, Object[] params) throws SQLException {
        int i = 1;

        for (Object param : params) {
            if (param instanceof Integer) {
                ps.setInt(i++, (Integer) param);
            } else if (param instanceof Double) {
                ps.setDouble(i++, (Double) param);
            } else if (param instanceof Float) {
                ps.setFloat(i++, (Float) param);
            } else {
                ps.setString(i++, (String) param);
            }
        }
    }

    public void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
