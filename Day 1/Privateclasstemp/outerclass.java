public class outerclass {
    private static class InnerClass {
        private void displayMessage() {
            System.out.println(" private class text message");
        }
    }

    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        ic.displayMessage();
    }
}

