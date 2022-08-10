package Lesson11;

import java.util.Map;

public class PayrollService {
    /**
     * @param accountMoneyMap Map of accounts and amount of money
     */
    public static void transferMoney(Map<String, Float> accountMoneyMap) {
        for (Map.Entry<String, Float> entry : accountMoneyMap.entrySet()) {
            transfer(entry.getKey(), entry.getValue());
        }
    }

    private static void transfer(String accountId, Float money) {
        String text = String.format("Transferred %s$ to the account = %s", money, accountId);
        System.out.println(text);
    }
}
