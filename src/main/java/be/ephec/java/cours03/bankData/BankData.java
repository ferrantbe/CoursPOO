package be.ephec.java.cours03.bankData;

public class BankData {
    AccountInfo[] accountInformations;


    public void createAccountInfo(int nrAccounts) {
        accountInformations = new AccountInfo[nrAccounts];
    }

    public void addAccountInfo(int i, AccountInfo accountInfo) {
        accountInformations[i] = accountInfo;
    }
}
