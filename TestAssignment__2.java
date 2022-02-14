package com.org.gen.day6;


import java.util.Scanner;




class RBI { 
    int limit,n;
    double a,p,r;
    float t;
    long avg,total,ans;
   
    int setWithdrawalLimit() {
        Scanner sc = new Scanner(System.in);
        String AccountType=sc.nextLine();
        String branchType=sc.nextLine();
        
        if(AccountType=="SAVING" && branchType=="ABC") {
        	limit = 25000;
        }else {
            limit = 50000;
        }
    return limit;
    }
    
   
    double setInterestRate() {
        a=(p+r)/n*t;
        return a;
    }
   
    long setMAB() {
        ans=(avg*total)/31;
        return ans;
    }
}


class Customer{
    String name,address;
    int age;
}

class Account{
    String AccountType,branchType;
}



class SBI extends RBI{ 
    double setInterestRate() {
        a=p*(1+r/n)+n*t;
        return a;
    }
    long setMAB() {
        ans=(avg+total)/30;
        return ans;
    }
}

class ICICI extends RBI{
    double setInterestRate() {
        a=(p*r)/n+t;
        return a;
    }
   
    int setWithdrawalLimit() {
        limit=10000;
        return limit;
    }
}

	public class TestAssignment__2 { 
		
		public static void main(String args[]) {
			// TODO Auto-generated method stub
			
			
			SBI sbi = new SBI();
			ICICI icici = new ICICI();
			
			sbi.p=865.422;
			sbi.r=4.00;
			sbi.n=5;
			sbi.t=6;
			
			Double sbiInt=sbi.setInterestRate();
			
			System.out.println("SBI interest rate is:"+sbiInt);
			
			int iciciWL= icici.setWithdrawalLimit();
			
			System.out.println("ICICI withdraw limit is:"+iciciWL);
		}
}