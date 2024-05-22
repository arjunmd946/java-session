public class MainDemo {

    public static void main(String[] args) {
        //MainDemo demo = new MainDemo();
        System.out.println("Welcome to first line of the program");
        String operation = args[0];
        int number1 = Integer.parseInt(args[1]);
        int number2 = Integer.parseInt(args[2]);

        if(operation.equals("add"))
            System.out.println(number1 + number2);
        else if(operation.equals("minus"))
            System.out.println(number1 - number2);
    }

}
