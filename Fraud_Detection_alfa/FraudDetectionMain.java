import Fraud_Detection_alfa.FraudDetection;

public class FraudDetectionMain{
    public static void main(String[] args) {
        Transaction transaction = new Transaction(1200, "USA", "ValidMerchant", 2);
        FraudDetection chain = new FraudDetection();
        boolean isTransactionApproved = chain.processTransaction(transaction);
        System.out.println("Transaction Approved: " + isTransactionApproved);
    }
}