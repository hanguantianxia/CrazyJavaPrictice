import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class LoginFrame {
    private final String PROP_FILE = "mysql.ini";
    private String driver;
    private String url;
    private String user;
    private String pass;

    // GUI cota
    private JFrame jf = new JFrame("Login");
    private JTextField userField = new JTextField(20);
    private JTextField passFiled = new JTextField(20);
    private JButton loginButton = new JButton("Login");
    public void init() throws Exception{
        Properties connProp = new Properties();
        connProp.load(new FileInputStream(PROP_FILE));
        driver = connProp.getProperty("driver");
        url = connProp.getProperty("url");
        user = connProp.getProperty("user");
        pass = connProp.getProperty("pass");

        // add driver
        Class.forName(driver);
        loginButton.addActionListener(e->{
            if(validate(userField.getText(), passFiled.getText())){
                JOptionPane.showMessageDialog(jf, "Login Success!");
            }
            else{
                JOptionPane.showMessageDialog(jf, "Login Failed!");
            }
        });
        jf.add(userField, BorderLayout.NORTH);
        jf.add(passFiled);
        jf.add(loginButton, BorderLayout.SOUTH);
        jf.pack();
        jf.setVisible(true);

    }

    private boolean validate(String userName, String userPass){
        // execute sql statement
        String sql = "select * from jdbc_test " +
                "where jdbc_name='" + userName
                + "' and jdbc_desc='" + userPass + "'";
        System.out.println(sql);
        try(
                Connection conn = DriverManager.getConnection(url, user, pass);
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
        )
        {
            if(rs.next()){
                return true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    private boolean validatePrepare(String userName, String userPass){
        try(
                Connection conn = DriverManager.getConnection(url, user, pass);
                PreparedStatement pstmt = conn.prepareStatement(
                        "select * from jdbc_test wehre jdbc_name=? and jdbc_desc=?"
                )
        ){
            pstmt.setString(1, userName);
            pstmt.setString(2, userPass);
            try(
                ResultSet rs = pstmt.executeQuery()
            ){
                if(rs.next()){
                    return true;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        new LoginFrame().init();
    }
}
