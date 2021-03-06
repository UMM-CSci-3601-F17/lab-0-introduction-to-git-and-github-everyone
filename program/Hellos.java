/**
 * A simple Java program used to demonstrate merge conflicts when
 * multiple people edit the same piece of code.
 */
public class Hellos {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append(Nick_and_Dexter_say_hello());
        builder.append("Hello, folks!\n");
        builder.append(nic_says_hello());
        builder.append(kk_says_hello());
        builder.append(kyle_and_dylan_say_hello());
        builder.append(Ethan_and_Liz_say_hello());
        builder.append(paul_and_liam_says_hello());
        builder.append(charlot_and_vips_say_hello());
        builder.append(sam_and_colin_say_hello());
        builder.append(Danish_and_Nick());

        System.out.println(builder.toString());
    }

    private static String nic_says_hello() {
        return "Nic says 'Howdy!'\n";
    }

    private static String charlot_and_vips_say_hello() {return "Charlot says 'Saluton', Vips says 'Hi'!'\n";}

    private static String kk_says_hello() {
        return "KK says 'Hello!'\n";
    }
    private static String paul_and_liam_says_hello() {
        return "Liam and Paul says 'Hey'\n";
    }

    private static String kyle_and_dylan_say_hello() { return "Kyle and Dylan say 'Hello!'\n"; }
    private static String sam_and_colin_say_hello() {
        return "Sam and Colin say 'Hey!'\n";
    }

    private static String Ethan_and_Liz_say_hello() {
        return "Ethan and Liz say 'Hello!'\n";
    }
    private static String Danish_and_Nick() {
        return "Danish and Nick say 'Hello!'\n";
    }
    private static String Nick_and_Dexter_say_hello() {
        return "Nick and Dexter say 'Hello!'\n";
    }
}
