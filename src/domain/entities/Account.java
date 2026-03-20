package domain.entities;

import enuns.AccountType;
import services.GenerateServices;

import javax.annotation.processing.Generated;
import java.math.BigDecimal;
import java.util.UUID;

public class Account {
    private UUID id;
    private  UUID client_id;
    private  int accountNumber;
    private BigDecimal balance;
    private AccountType type;


    public Account(int accountNumber, BigDecimal balance,  AccountType type){
        this.id = new GenerateServices().generate();
        this.accountNumber
    }

    public  String deposit(BigDecimal value){
        this.balance.add(value);
        return "Foi depositado o valor: " + value;
    }

    public String withdraw (Double value){
        if (!(balance.compareTo(BigDecimal.valueOf(value))  > 0)){
            return "Saldo Insuficiente" ;
        }
        balance.subtract(BigDecimal.valueOf(value));
        return  "Valor do Saque: " + value+" | " + "Saldo Atual: "+ balance;
    }
    public BigDecimal getBalance(){
        return balance;
    }
}
