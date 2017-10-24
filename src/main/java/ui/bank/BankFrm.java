package ui.bank;

<<<<<<< HEAD
//import bank.customer.Individual;
//import bank.interest.CheckingInterest;
//import bank.interest.SavingInterest;
//import bank.type.CheckingAccount;
//import bank.type.SavingAccount;
//import framework.Account;
//import framework.AccountService;
//import framework.Address;
//import ui.bank.command.CommandInvoker;
=======
import bank.command.*;
import framework.AccounTypeEnum;
import framework.AccountService;
import framework.DataMap;
import ui.bank.command.Command;
import ui.bank.command.CommandInvoker;
>>>>>>> 977afb3ddf07185e8c314a3ee7870e3aa96d4aeb

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

/**
 * A basic JFC based application.
 */
public class BankFrm extends JFrame{
    /****
     * init variables in the object
     ****/
    String accountnr, clientName, street, city, state, zip, birthDate, noOfEmployee, email, accountType;
    String clientType, amount;
    boolean newaccount;
    private DefaultTableModel model;
    private JTable JTable1;
    private JScrollPane JScrollPane1;
    private BankFrm myframe;
    private Object rowdata[];
//    private AccountService accountService;
//
//    private CommandInvoker commandInvoker = new CommandInvoker();

    public BankFrm() {
        myframe = this;
        //TODO initial accountService variable

        setTitle("Bank Application.");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout(0, 0));
        setSize(575, 310);
        setVisible(false);
        JPanel1.setLayout(null);
        getContentPane().add(BorderLayout.CENTER, JPanel1);
        JPanel1.setBounds(0, 0, 575, 310);
        /*
        /Add five buttons on the pane
		/for Adding personal account, Adding company account
		/Deposit, Withdraw and Exit from the system
		*/
        JScrollPane1 = new JScrollPane();
        model = new DefaultTableModel();
        JTable1 = new JTable(model);
        model.addColumn("AccountNr");
        model.addColumn("Name");
        model.addColumn("City");
        model.addColumn("P/C");
        model.addColumn("Ch/S");
        model.addColumn("Amount");
        rowdata = new Object[8];
        newaccount = false;


        JPanel1.add(JScrollPane1);
        JScrollPane1.setBounds(12, 92, 444, 160);
        JScrollPane1.getViewport().add(JTable1);
        JTable1.setBounds(0, 0, 420, 0);
        //        rowdata = new Object[8];

        JButton_PerAC.setText("Add personal account");
        JPanel1.add(JButton_PerAC);
        JButton_PerAC.setBounds(24, 20, 192, 33);
        JButton_CompAC.setText("Add company account");
        JButton_CompAC.setActionCommand("jbutton");
        JPanel1.add(JButton_CompAC);
        JButton_CompAC.setBounds(240, 20, 192, 33);
        JButton_Deposit.setText("Deposit");
        JPanel1.add(JButton_Deposit);
        JButton_Deposit.setBounds(468, 104, 96, 33);
        JButton_Withdraw.setText("Withdraw");
        JPanel1.add(JButton_Withdraw);
        JButton_Addinterest.setBounds(448, 20, 106, 33);
        JButton_Addinterest.setText("Add interest");
        JPanel1.add(JButton_Addinterest);
        JButton_Withdraw.setBounds(468, 164, 96, 33);
        JButton_Exit.setText("Exit");
        JPanel1.add(JButton_Exit);
        JButton_Exit.setBounds(468, 248, 96, 31);
        // lineBorder1.setRoundedCorners(true);
        // lineBorder1.setLineColor(java.awt.Color.green);
        //$$ lineBorder1.move(24,312);

        JButton_PerAC.setActionCommand("jbutton");

        SymWindow aSymWindow = new SymWindow();
        this.addWindowListener(aSymWindow);
        SymAction lSymAction = new SymAction();
        JButton_Exit.addActionListener(lSymAction);
        JButton_PerAC.addActionListener(lSymAction);
        JButton_CompAC.addActionListener(lSymAction);
        JButton_Deposit.addActionListener(lSymAction);
        JButton_Withdraw.addActionListener(lSymAction);
        JButton_Addinterest.addActionListener(lSymAction);

    }


    /*****************************************************
     * The entry point for this application.
     * Sets the Look and Feel to the System Look and Feel.
     * Creates a new JFrame1 and makes it visible.
     *****************************************************/
    static public void main(String args[]) {
        try {
            // Add the following code if you want the Look and Feel
            // to be set to the Look and Feel of the native system.

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
            }

            //Create a new instance of our application's frame, and make it visible.
            (new BankFrm()).setVisible(true);
        } catch (Throwable t) {
            t.printStackTrace();
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }


    JPanel JPanel1 = new JPanel();
    JButton JButton_PerAC = new JButton();
    JButton JButton_CompAC = new JButton();
    JButton JButton_Deposit = new JButton();
    JButton JButton_Withdraw = new JButton();
    JButton JButton_Addinterest = new JButton();
    JButton JButton_Exit = new JButton();

    void exitApplication() {
        try {
            this.setVisible(false);    // hide the Frame
            this.dispose();            // free the system resources
            System.exit(0);            // close the application
        } catch (Exception e) {
        }
    }

    class SymWindow extends java.awt.event.WindowAdapter{
        public void windowClosing(WindowEvent event) {
            Object object = event.getSource();
            if (object == BankFrm.this)
                BankFrm_windowClosing(event);
        }
    }

    void BankFrm_windowClosing(WindowEvent event) {
        // to do: code goes here.

        BankFrm_windowClosing_Interaction1(event);
    }

    void BankFrm_windowClosing_Interaction1(WindowEvent event) {
        try {
            this.exitApplication();
        } catch (Exception e) {
        }
    }

    class SymAction implements java.awt.event.ActionListener{
        public void actionPerformed(ActionEvent event) {
            Object object = event.getSource();
            if (object == JButton_Exit)
                JButtonExit_actionPerformed(event);
            else if (object == JButton_PerAC)
                JButtonPerAC_actionPerformed(event);
            else if (object == JButton_CompAC)
                JButtonCompAC_actionPerformed(event);
            else if (object == JButton_Deposit)
                JButtonDeposit_actionPerformed(event);
            else if (object == JButton_Withdraw)
                JButtonWithdraw_actionPerformed(event);
            else if (object == JButton_Addinterest)
                JButtonAddinterest_actionPerformed(event);

        }
    }

    //When the Exit button is pressed this code gets executed
    //this will exit from the system
    void JButtonExit_actionPerformed(ActionEvent event) {
        System.exit(0);
    }

    void JButtonPerAC_actionPerformed(ActionEvent event) {
        /*
         JDialog_AddPAcc type object is for adding personal information
		 construct a JDialog_AddPAcc type object 
		 set the boundaries and show it 
		*/

        JDialog_AddPAcc pac = new JDialog_AddPAcc(myframe);
        pac.setBounds(450, 20, 300, 330);
        pac.show();

        if (newaccount) {
//            addPersonalAccount();
            // add row to table
            rowdata[0] = accountnr;
            rowdata[1] = clientName;
            rowdata[2] = city;
            rowdata[3] = "P";
            rowdata[4] = accountType;
            rowdata[5] = "0";

            model.addRow(rowdata);
            JTable1.getSelectionModel().setAnchorSelectionIndex(-1);
            newaccount = false;
        }
    }

<<<<<<< HEAD
//    private void addPersonalAccount() {
//        // TODO parameters checking
//        Address address = new Address(street, city, state, zip);
//        Individual individual = new Individual(clientName, email, birthDate, address);
//
//        Account account = new Account(accountnr);
//        account.setCustomer(individual);
//        account.setAccountType("Ch".equals(accountType) ? new CheckingAccount() : new SavingAccount());
//        account.setInterestStrategy("Ch".equals(accountType) ? new CheckingInterest() : new SavingInterest());
//
////        PersonalAccountCreationCommand pcCommand = new PersonalAccountCreationCommand(accountService,account);
////        commandInvoker.setCommand(pcCommand);
////        commandInvoker.execute();
//    }
=======
    private void addPersonalAccount() {
        // TODO parameters checking
        //        AccounTypeEnum accounType, String accountNumber,
        //                String name, String street, String city, String state,
        //                String zip, String email, int numOfEmployees, ClientType clientType
        DataMap dataMap = new DataMap("Ch".equals(accountType) ? AccounTypeEnum.CHECKING : AccounTypeEnum.SAVING,
                accountnr, clientName, street, city, state, zip, email, null, framework.ClientType.INDIVIDUAL);

        PersonalAccountCreationCommand pcCommand = new PersonalAccountCreationCommand(accountService, dataMap);
        commandInvoker.execute(pcCommand);
    }
>>>>>>> 977afb3ddf07185e8c314a3ee7870e3aa96d4aeb

    void JButtonCompAC_actionPerformed(ActionEvent event) {
		/*
		 construct a JDialog_AddCompAcc type object 
		 set the boundaries and 
		 show it 
		*/

        JDialog_AddCompAcc pac = new JDialog_AddCompAcc(myframe);
        pac.setBounds(450, 20, 300, 330);
        pac.show();

        if (newaccount) {
            addCompanyAccount();
            // add row to table
            rowdata[0] = accountnr;
            rowdata[1] = clientName;
            rowdata[2] = city;
            rowdata[3] = "C";
            rowdata[4] = accountType;
            rowdata[5] = "0";
            model.addRow(rowdata);
            JTable1.getSelectionModel().setAnchorSelectionIndex(-1);
            newaccount = false;
        }

    }

    private void addCompanyAccount() {
<<<<<<< HEAD
        // TODO parameters checking
//        Address address = new Address(street, city, state, zip);
//        Company company = new Company(clientName, email, Integer.parseInt(noOfEmployee), address);
//
//        Account account = new Account(accountnr);
//        account.setCustomer(company);
//        account.setAccountType("Ch".equals(accountType) ? new CheckingAccount() : new SavingAccount());
//        account.setInterestStrategy("Ch".equals(accountType) ? new CheckingInterest() : new SavingInterest());
//
//        CompanyAccountCreationCommand pcCommand = new CompanyAccountCreationCommand(accountService,account);
//
//        commandInvoker.setCommand(pcCommand);
//        commandInvoker.execute();
=======
        // TODO parameters validation

        DataMap dataMap = new DataMap("Ch".equals(accountType) ? AccounTypeEnum.CHECKING : AccounTypeEnum.SAVING,
                accountnr, clientName, street, city, state, zip, email, Integer.parseInt(noOfEmployee), framework
                .ClientType.INDIVIDUAL);
        CompanyAccountCreationCommand cCommand = new CompanyAccountCreationCommand(accountService, dataMap);

        commandInvoker.execute(cCommand);
>>>>>>> 977afb3ddf07185e8c314a3ee7870e3aa96d4aeb
    }

    void JButtonDeposit_actionPerformed(ActionEvent event) {
        // get selected name
        int selection = JTable1.getSelectionModel().getMinSelectionIndex();
        if (selection >= 0) {
            String accnr = (String)model.getValueAt(selection, 0);

            //Show the dialog for adding deposit amount for the current mane
            JDialog_Deposit dep = new JDialog_Deposit(myframe, accnr);
            dep.setBounds(430, 15, 275, 140);
            dep.show();

            // compute new amount
            // TODO amountDeposit validate
            double deposit = Double.parseDouble(amount);

            Command dCommand = new DepositCommand(accountService, accnr, deposit);
            commandInvoker.execute(dCommand);

            String samount = (String)model.getValueAt(selection, 5);
            double currentamount = Double.parseDouble(samount);
            double newamount = currentamount + deposit;
            model.setValueAt(String.valueOf(newamount), selection, 5);
        }


    }

    void JButtonWithdraw_actionPerformed(ActionEvent event) {
        // get selected name
        int selection = JTable1.getSelectionModel().getMinSelectionIndex();
        if (selection >= 0) {
            String accnr = (String)model.getValueAt(selection, 0);

            //Show the dialog for adding withdraw amount for the current mane
            JDialog_Withdraw wd = new JDialog_Withdraw(myframe, accnr);
            wd.setBounds(430, 15, 275, 140);
            wd.show();

            // compute new amount
            //TODO validate amount
            double withdraw = Long.parseLong(amount);
            String samount = (String)model.getValueAt(selection, 5);
            double currentamount = Long.parseLong(samount);
            double newamount = currentamount - withdraw;
            if (newamount < 0) {
                JOptionPane.showMessageDialog(JButton_Withdraw, " Account " + accnr + " : balance is negative: $" +
                        String.valueOf(newamount) + " !", "Warning: negative balance", JOptionPane.WARNING_MESSAGE);
            }

            Command wCommand = new WithdrawCommand(accountService, accnr, withdraw);
            commandInvoker.execute(wCommand);

            model.setValueAt(String.valueOf(newamount), selection, 5);
        }


    }

    void JButtonAddinterest_actionPerformed(ActionEvent event) {
        Command aiCommand = new AddInterstCommand(accountService);
        commandInvoker.execute(aiCommand);
        JOptionPane.showMessageDialog(JButton_Addinterest, "Add interest to all accounts", "Add interest to all " +
                "accounts", JOptionPane.WARNING_MESSAGE);

    }
}
