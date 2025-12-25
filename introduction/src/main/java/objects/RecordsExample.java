package objects;

public class RecordsExample {
    public record Account(
            int customerId,
            String type,
            double balance
    ) {}

//    public static class Account {
//        private final int customerId;
//        private final String type;
//        private final double balance;
//
//        public Account(int customerId, String type, double balance) {
//            this.customerId = customerId;
//            this.type = type;
//            this.balance = balance;
//        }
//
//        public int getCustomerId() {
//            return customerId;
//        }
//
//        public String getType() {
//            return type;
//        }
//
//        public double getBalance() {
//            return balance;
//        }
//    }

    public static void main(String[] args) {
        Account myAccount = new Account(123, "CHECKING", 5234.5);
        double balance = myAccount.balance();
    }
}
