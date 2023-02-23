class ArithmeticIntOp {
    public int op(int a, int b) {
        return a + b;
    }
}

class RelationalOp {
    public boolean op(int a, int b) {
        return a == b;
    }
}

class BitwiseOp {
    public int op(int a, int b) {
        return a & b;
    }
}

class OperatorExt {
    public static void main(String[] args) {
        ArithmeticIntOp aOp = new ArithmeticIntOp();
        RelationalOp rOp = new RelationalOp();
        BitwiseOp bOp = new BitwiseOp();

        int a = 5, b = 3;

        while (true) {
            System.out.println("Select an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Equality");
            System.out.println("3. Bitwise AND");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(a + " + " + b + " = " + aOp.op(a, b));
                    break;
                case 2:
                    System.out.println(a + " == " + b + " is " + rOp.op(a, b));
                    break;
                case 3:
                    System.out.println(a + " & " + b + " = " + bOp.op(a, b));
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
