// File: BankSystemGUI.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Account {
    private static int idCounter = 1001;
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String name, double initialDeposit) {
        this.accountHolder = name;
        this.balance = initialDeposit;
        this.accountNumber = idCounter++;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public String getDetails() {
        return "Account Number: " + accountNumber +
               "\nHolder Name: " + accountHolder +
               "\nBalance: ₹" + balance;
    }
}

public class BankSystemGUI extends JFrame {
    private java.util.List<Account> accounts = new ArrayList<>();

    public BankSystemGUI() {
        setTitle("Banking System");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(6, 1, 10, 10));

        JButton createBtn = new JButton("Create Account");
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton balanceBtn = new JButton("View Balance");
        JButton detailsBtn = new JButton("View Account Details");
        JButton exitBtn = new JButton("Exit");

        add(createBtn);
        add(depositBtn);
        add(withdrawBtn);
        add(balanceBtn);
        add(detailsBtn);
        add(exitBtn);

        createBtn.addActionListener(e -> createAccount());
        depositBtn.addActionListener(e -> deposit());
        withdrawBtn.addActionListener(e -> withdraw());
        balanceBtn.addActionListener(e -> checkBalance());
        detailsBtn.addActionListener(e -> showDetails());
        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private Account findAccount(int accNum) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNum)
                return acc;
        }
        return null;
    }

    private void createAccount() {
        String name = JOptionPane.showInputDialog(this, "Enter Holder Name:");
        if (name == null || name.isEmpty()) return;

        String depositStr = JOptionPane.showInputDialog(this, "Enter Initial Deposit:");
        try {
            double deposit = Double.parseDouble(depositStr);
            Account acc = new Account(name, deposit);
            accounts.add(acc);
            JOptionPane.showMessageDialog(this, "Account Created. Account Number: " + acc.getAccountNumber());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid amount.");
        }
    }

    private void deposit() {
        String accStr = JOptionPane.showInputDialog(this, "Enter Account Number:");
        String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Deposit:");

        try {
            int accNum = Integer.parseInt(accStr);
            double amount = Double.parseDouble(amountStr);
            Account acc = findAccount(accNum);
            if (acc != null) {
                acc.deposit(amount);
                JOptionPane.showMessageDialog(this, "Deposit Successful. Balance: ₹" + acc.getBalance());
            } else {
                JOptionPane.showMessageDialog(this, "Account not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
        }
    }

    private void withdraw() {
        String accStr = JOptionPane.showInputDialog(this, "Enter Account Number:");
        String amountStr = JOptionPane.showInputDialog(this, "Enter Amount to Withdraw:");

        try {
            int accNum = Integer.parseInt(accStr);
            double amount = Double.parseDouble(amountStr);
            Account acc = findAccount(accNum);
            if (acc != null) {
                if (acc.withdraw(amount)) {
                    JOptionPane.showMessageDialog(this, "Withdrawal Successful. Balance: ₹" + acc.getBalance());
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient balance.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Account not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
        }
    }

    private void checkBalance() {
        String accStr = JOptionPane.showInputDialog(this, "Enter Account Number:");

        try {
            int accNum = Integer.parseInt(accStr);
            Account acc = findAccount(accNum);
            if (acc != null) {
                JOptionPane.showMessageDialog(this, "Current Balance: ₹" + acc.getBalance());
            } else {
                JOptionPane.showMessageDialog(this, "Account not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
        }
    }

    private void showDetails() {
        String accStr = JOptionPane.showInputDialog(this, "Enter Account Number:");

        try {
            int accNum = Integer.parseInt(accStr);
            Account acc = findAccount(accNum);
            if (acc != null) {
                JOptionPane.showMessageDialog(this, acc.getDetails());
            } else {
                JOptionPane.showMessageDialog(this, "Account not found.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BankSystemGUI::new);
    }
}
