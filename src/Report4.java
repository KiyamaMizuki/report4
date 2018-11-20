public class Report4 extends Exception{
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("NullPointerException");
            System.out.println(e.getMessage());
        }
    }
}