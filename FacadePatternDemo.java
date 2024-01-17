// Subsystem classes

class CheckingModule {
    public void checkBalance() {
        System.out.println("Account Balance: BDT 20000");
    }

    public void deposit(double amount) {
        System.out.println("Depositing BDT" + amount + " into Checking Account");
    }
}

class SavingModule {
    public void checkBalance() {
        System.out.println("Saving Account Balance: BDT 40000");
    }

    public void deposit(double amount) {
        System.out.println("Depositing BDT" + amount + " into Saving Account");
    }
}

class InvestmentModule {
    public void checkBalance() {
        System.out.println("Investment Account Balance: BDT 20000");
    }

    public void invest(double amount) {
        System.out.println("Investing BDT " + amount + " in Investment Account");
    }
}

// Facade class

class BankingServiceFacade {
    private CheckingModule checkingModule;
    private SavingModule savingModule;
    private InvestmentModule investmentModule;

    public BankingServiceFacade() {
        this.checkingModule = new CheckingModule();
        this.savingModule = new SavingModule();
        this.investmentModule = new InvestmentModule();
    }

    public void checkCheckingAccountBalance() {
        checkingModule.checkBalance();
    }

    public void depositToChecking(double amount) {
        checkingModule.deposit(amount);
    }

    public void checkSavingAccountBalance() {
        savingModule.checkBalance();
    }

    public void depositToSaving(double amount) {
        savingModule.deposit(amount);
    }

    public void checkInvestmentAccountBalance() {
        investmentModule.checkBalance();
    }

    public void investInInvestment(double amount) {
        investmentModule.invest(amount);
    }
}

// Main class to demonstrate the facade pattern
public class FacadePatternDemo {
    public static void main(String[] args) {
        BankingServiceFacade facade = new BankingServiceFacade();

        System.out.println("Checking Account Balance: ");
        facade.checkCheckingAccountBalance();
        facade.depositToChecking(5500);

        System.out.println("\nSaving Account Status: ");
        facade.checkSavingAccountBalance();
        facade.depositToSaving(35000);

        System.out.println("\nInvestment Account Status: ");
        facade.checkInvestmentAccountBalance();
        facade.investInInvestment(25000);
    }
}
