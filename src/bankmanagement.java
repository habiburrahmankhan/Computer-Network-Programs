import java.util.ArrayList;
import java.util.Scanner;

public class bankmanagement {

    private String name;
    private int account;
    private int balance;
    private char type;
    public static int total_account = 0;
    public static  long total_money_inbank =0;

    public bankmanagement(String name, char type) {
        this.name = name;
        this.account = 12345123 + total_account;
        total_account++;
        this.type = type;
        this.balance=1000;
        total_money_inbank+=1000;
        System.out.println("Account is created balance is " + this.balance + "      account no is " + this.account);
    }


    public static void main(String[] args) {
        ArrayList<bankmanagement> ar = new ArrayList<>();
        bankmanagement b1 = new bankmanagement("hrkhan", 'S');
        bankmanagement b2 = new bankmanagement("saman", 'S');
        bankmanagement b3 = new bankmanagement("adnan", 'S');
        ar.add(b1);
        ar.add(b2);
        ar.add(b3);
        deposite(ar ,12345123 ,1000);
        withdraw(ar ,12345125,500);
        deposite(ar , 12345123 , 1000);
        transfer(ar , 12345123 ,12345124,500);
        showdata(ar,12345123);
        deleteaccount(ar,12345124);
        showdataall(ar);

    }

    public static void deposite(ArrayList<bankmanagement> ar, int account, int value) {
        for (int i = 0; i < ar.size(); i++) {
            bankmanagement b = ar.get(i);
            if (b.account == account) {
                b.balance += value;
                total_money_inbank+=value;
                System.out.println("balance :-   " + b.balance);
                break;
            }
        }

    }

    public static void withdraw(ArrayList<bankmanagement> ar, int account, int value) {
        for (int i = 0; i < ar.size(); i++) {
            bankmanagement b = ar.get(i);
            if (b.account == account) {
                if (b.balance < value) {
                    System.out.println("Insufficient balance ");
                    return;
                }
                b.balance -= value;
                total_money_inbank-=value;
                System.out.println("balance :-   " + b.balance);
                return;
            }
        }
    }

    public static void transfer(ArrayList<bankmanagement> ar, int account1 ,int account2, int value) {
        for (int i = 0; i < ar.size(); i++) {
            bankmanagement b = ar.get(i);
            if (b.account == account1) {
                if (b.balance < value) {
                    System.out.println("Insufficient balance to transfer  ");
                    return;
                }
                b.balance -= value;
                break;
            }
        }
        for (int i = 0; i < ar.size(); i++) {
            bankmanagement b = ar.get(i);
            if (b.account == account2) {
                b.balance += value;
                return;
            }
        }
    }


    public static void showdata(ArrayList<bankmanagement> ar, int account) {
        System.out.println("account no " + "\t" + "name " + "\t" + "type " + "\t" + "balance");
        for (int i = 0; i < ar.size(); i++) {
            bankmanagement b = ar.get(i);
            if (b.account == account) {
                System.out.println(b.account + "\t" + b.name + "\t" + b.type + "\t" + b.balance);
                return;
            }
        }
    }

    public static void showdataall(ArrayList<bankmanagement> ar) {
        System.out.println("account no " + "\t" + "name " + "\t" + "type " + "\t" + "balance");
        for (int i = 0; i < ar.size(); i++) {
            bankmanagement b = ar.get(i);
            System.out.println(b.account + "\t" + b.name + "\t" + b.type + "\t" + b.balance);
        }


        System.out.println("total money in bank " + total_money_inbank + "       total account      " + total_account);
    }
    public static void deleteaccount(ArrayList<bankmanagement> ar , int account)
    {
        int i=0;
        for ( i = 0; i <ar.size() ; i++) {
            bankmanagement b =ar.get(i);
            if (b.account==account)
            {
                total_money_inbank-=b.balance;
                break;
            }
        }
        bankmanagement b =ar.get(i);
        System.out.println(b.account + "\t" + b.name + "\t" + b.type + "\t" + b.balance);
        ar.remove(i);
        total_account--;

    }


}

