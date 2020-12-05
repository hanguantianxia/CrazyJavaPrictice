import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class TransactionTest {
    private String driver;
    private String url;
    private String user;
    private String pass;

    public void initParam(String paramFile) throws Exception{
        // use properties class to load properties
        Properties props = new Properties();
        props.load(new FileInputStream(paramFile));
        driver = props.getProperty("driver");
        url = props.getProperty("url");
        user = props.getProperty("user");
        pass = props.getProperty("pass");

    }

    public void insertInTransaction(String[] sqls) throws Exception{
        // load driver
        Class.forName(driver);
        try(
                Connection conn = DriverManager.getConnection(url, user, pass)
        ){
            conn.setAutoCommit(false);// open transation and close the auto commit
            try(Statement stmt = conn.createStatement()){
                for(String sql:sqls){
                    stmt.executeUpdate(sql);
                    
                }
            }
            conn.commit();
        }
    }

    public static void main(String[] args) throws Exception{
        TransactionTest tt = new TransactionTest();
        tt.initParam("mysql.ini");
        String[] sqls = new String[]{
                "insert into student_table values (null, 'aaa', 1)",
                "insert into student_table values (null, 'bbb', 1)",
                "insert into student_table values (null, 'ccc', 1)",
                "insert into student_table values (null, 'ccc', 6)",
        };
        tt.insertInTransaction(sqls);
    }
}
