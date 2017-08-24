/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append(Danish_and_Nick());
        System.out.println(builder.toString());


    }

    private static String Danish_and_Nick() {
        return "Danish and Nick say 'Hello!'\n";
    }
}
