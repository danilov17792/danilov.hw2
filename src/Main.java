import exception.*;
import convertor.*;
public class Main {

    public static void main(String[] args) {
        String[][] agr = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        try {
            System.out.println(Convertor.strConvertor(agr));
        } catch (AllException e) {
            e.getMessage();
            {
                System.err.println(e.getMessage());
            }
        }
    }
}
