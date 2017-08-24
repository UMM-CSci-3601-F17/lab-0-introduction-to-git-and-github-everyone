/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("Hello, folks!\n");
        builder.append(nic_says_hello());
        builder.append(kk_says_hello());
        builder.append(Ethan_and_Liz_say_hello());
        builder.append(sam_and_colin_say_hello());
        builder.append(Danish_and_Nick());

        System.out.println(builder.toString());
    }

    private static String nic_says_hello() {
        return "Nic says 'Howdy!'\n";
    }

    private static String kk_says_hello() {
        return "KK says 'Hello!'\n";
    }

    private static String sam_and_colin_say_hello() {
        return "Sam and Colin say 'Hey!'\n";
    }

    private static String Ethan_and_Liz_say_hello() {
        return "Ethan and Liz say 'Hello!'\n";
    }
    private static String Danish_and_Nick() {
        return "Danish and Nick say 'Hello!'\n";
    }
}
