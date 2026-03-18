package ex_24_Exceptions;

public class Lab_114_Custom_Exceptions {
    static void main(String[] args) throws CurrencyMismatch {

        Bank icici = new Bank("INR", 100);
        Bank HDFC = new Bank("INR", 200);

        System.out.println(icici.add(HDFC));
        System.out.println(HDFC.add(icici));

        Bank jp_chase = new Bank("USD", 150);
        System.out.println(icici.add(jp_chase));
    }
}

class Bank {

    private String currency;
    private  int amount;

    public Bank(String currency, int amount)
    {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency()
    {
        return currency;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int add(Bank bankname) throws CurrencyMismatch
    {
        if(bankname.currency.equals("INR")) {
            return this.amount + bankname.amount;
        }
        else {
            throw new CurrencyMismatch("Currency mismatch!!");
        }
    }
}

class CurrencyMismatch extends Exception
{
    public CurrencyMismatch(String msg)
    {
        super(msg);
    }
}



