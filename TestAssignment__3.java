package com.org.gen.day6;

class Bank {

   int getBalance() {

      return 0;
   }
}

class BankA extends Bank {

   int getBalance(int balance) {

      return balance;
   }

}

class BankB extends Bank {

   int getBalance(int balance) {

      return balance;

   }

}

class BankC extends Bank {

   int getBalance(int balance) {

      return balance;

   }

}

public class TestAssignment__3 {

   public static void main(String args[]) {
      // TODO Auto-generated method stub

      BankA a = new BankA();

      BankB b = new BankB();

      BankC c = new BankC();

      System.out.println("Bank A " + "$" + a.getBalance(1000));

      System.out.println("Bank B " + "$" + b.getBalance(1500));

      System.out.println("Bank C " + "$" + c.getBalance(2000));

   }

}
