
package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentModify {
 
    public static List<Student> findAll() {
        List<Student> studentlist = new ArrayList<>();
        Connection connection = null;
        
        Statement statement = null;
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:/studentmanagement", "root", "");
            
            String sql = "SELECT * FROM student";
            statement = connection.createStatement();
           
            ResultSet resultset = statement.executeQuery(sql);
            
            while (resultset.next()) {
                Student sv = new Student(resultset.getString("id"),
                        resultset.getString("name"),
                        resultset.getString("address"),
                        resultset.getInt("yob"),
                        resultset.getString("standard"));
                studentlist.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return studentlist;
    }

    // nhập dữ liệu 
    public static void insert(Student sv) {
        Connection connection = null;
        
        PreparedStatement preparedstatement = null; // phương thức nhập dữ liệu vào database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "");
            
            String sql = "INSERT INTO student (id, name, address, yob, standard) values(?, ?, ?, ?, ?) ";
            preparedstatement = connection.prepareCall(sql);
           
            preparedstatement.setString(1, sv.getId());
            preparedstatement.setString(2, sv.getName());
            preparedstatement.setString(3, sv.getAddress());
            preparedstatement.setInt(4, sv.getYob());
            preparedstatement.setString(5, sv.getStandard());
            preparedstatement.execute();
            // execute dùng để thực thi 1 câu lệnh SQL 
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    // cập nhất dữ liệu 
    public static void update(Student sv) {
        Connection connection = null;
       
        PreparedStatement preparedstatement = null; // phương thức nhập dữ liệu vào database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "");
           
            String sql = "UPDATE student SET  name = ? , address = ? , yob = ?, standard = ? WHERE id = ?";
            preparedstatement = connection.prepareCall(sql);
           
            
            preparedstatement.setString(1, sv.getName());
            preparedstatement.setString(2, sv.getAddress());
            preparedstatement.setInt(3, sv.getYob());
            preparedstatement.setString(4, sv.getStandard());
            preparedstatement.setString(5, sv.getId());
            preparedstatement.execute();
           
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    
    public static void delete(String id) {
        Connection connection = null;
       
        PreparedStatement preparedstatement = null; // phương thức nhập dữ liệu vào database
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "");
            
            String sql = "DELETE FROM student WHERE id = ? ";
            preparedstatement = connection.prepareCall(sql);
            
            preparedstatement.setString(1,id);
            preparedstatement.execute();
           
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static List<Student> search(String name) {
        List<Student> studentlist = new ArrayList<>();
        Connection connection = null;
       
        PreparedStatement preparedstatement = null; // phuong thuc thuc thi cau lenh truy van
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "");
           
            String sql = "SELECT * FROM student WHERE name LIKE ? ";
            preparedstatement = connection.prepareCall(sql);
            preparedstatement.setString(1,"%"+ name + "%");
          
            ResultSet resultset = preparedstatement.executeQuery();
           
            while (resultset.next()) {
                Student sv = new Student(resultset.getString("id"),
                        resultset.getString("name"),
                        resultset.getString("address"),
                        resultset.getInt("yob"),
                        resultset.getString("standard"));
                studentlist.add(sv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (preparedstatement != null) {
                try {
                    preparedstatement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return studentlist;
    }
}