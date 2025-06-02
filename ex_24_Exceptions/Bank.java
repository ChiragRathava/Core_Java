package ex_24_Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bank_name){
        if(!bank_name.currency.equalsIgnoreCase("INR"))
        { return bank_name.amount + this.amount; }
        else {
            try
            { throw new Exception("Currency Mismatch, can't Proceed!"); }
            catch (Exception e)
            { System.out.println(e.getMessage()); }
             }
        return 0;
    }

}
