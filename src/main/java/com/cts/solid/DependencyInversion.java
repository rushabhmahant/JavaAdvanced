package com.cts.solid;

public class DependencyInversion {

}

interface ATM {
    void ATM_OPERATION();
}


class Bank implements ATM {
    @Override
	public void ATM_OPERATION(){
        // code to add money to ATM and increase the ATM balance
    }
}

class Customer implements ATM {
    
    @Override
    public void ATM_OPERATION(){
        // code to withdraw money from ATM and decrease the ATM balance
    }
}