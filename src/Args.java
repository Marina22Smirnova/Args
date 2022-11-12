public class Args {

    public static void main(String[] args) {
        String phone_numbers[][] = {
                {"Andrey","8(909)123-45-67"},
                {"Oleg","8(921)123-55-77"},
                {"Mary","8(905)123-33-77"}
        };
        if (args.length !=1)
        System.out.println("Enter username:");
        else {
            for (int i = 0;i<phone_numbers.length; i++) {
                if (phone_numbers[i][0].equals(args[0]))
                    System.out.println(phone_numbers[i][0] + ":"+phone_numbers[i][1]);
                break;
            }
        }
    }
}
