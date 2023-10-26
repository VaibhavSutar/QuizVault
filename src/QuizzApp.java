import java.sql.*;
public class QuizzApp {
    public static void main(String[] args) {
        new LoginForm();
        // new QuizForm();
        // new Result();

        // String url = "jdbc:postgresql://localhost:5432/quizData";
        
        // String dbUsername = "admin";
        // String dbPassword = "admin";
        // Connection c;
        // // Statement st;
        // // ResultSet rs;
        // try {
        //     //  Class.forName("org.postgresql.Driver");
        //     c = DriverManager.getConnection(url, dbUsername, dbPassword);
        //     Statement st = c.createStatement();
        //     st.executeUpdate(
        //             "CREATE TABLE questions (question VARCHAR ( 200 ) UNIQUE NOT NULL, option1 VARCHAR ( 100 ), option2 VARCHAR ( 100 ), option3 VARCHAR ( 100 ), option4 VARCHAR ( 100 ), itemSelected Numeric (4), correctAnswer Numeric (4));");
        //     ResultSet rs = st.executeQuery("SELECT * FROM questions");
        //     rs.next();
        //     System.out.println(rs.getString(1));
        // } catch (Exception de) {
        //     System.out.println(de);
        //     // }
        // }
    }
}