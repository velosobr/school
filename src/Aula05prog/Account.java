package Aula05prog;


public class Account {
	
	private int number;
	private int balance;
	private int limit;
	
	public Account(int num, int bal, int lim) {
		setNumber(num);
		balance = bal;
		limit = lim;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void calcularLimite() {
		if (balance > limit) 
			System.out.println("Limite de crédito excedido!");
	}

	public void calcularNovoSaldo(int debit, int credit) {
		balance += debit - credit; 
	}
	
}
