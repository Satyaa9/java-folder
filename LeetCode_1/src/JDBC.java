public class JDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver");
        }
        catch (Exception e){
            e.getStackTrace();
        }
    }
}
