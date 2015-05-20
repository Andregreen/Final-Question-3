package mortgageest;


import javafx.fxml.FXML;

public class formula {
	
		@FXML 
		private double income;
		@FXML
		private double debt;
		@FXML
		private float interest;
		@FXML
		private int term;
		@FXML
		private double payment;
		
	
		public double getIncome(){
			return income;
		}
		public void setIncome(double income ){
			this.income = income;
		}
		
		public double getDebt(){
			return debt;
		}
		public void setDebt(double debt){
			this.debt=debt;
		}
		
		public float getInterest(){
			return interest;
		}
		public void setInterest(float interest){
			this.interest=interest;
		}
		
		public int getTerm(){
			return term;
		}
		public void setTerm(int term){
			this.term=term;
		}
		
		public double getPayment(){
			return payment;
		}
		public void setPayment(double payment){
				this.payment=payment;
		}
		
		public double Housepayment(){
			double house_payment=.18*income;
			return house_payment;
		}
		
		public double Obligations(){
			double obligations=.36*income;
			return obligations;
		}
		double obligations=Obligations();
		double housepayment=Housepayment();
		
		
		public double Max_payment(double housepayment, double obligations){
			double a = 0;
			if(housepayment<obligations){
				a=housepayment;
			}
			else if(obligations<housepayment){
				a= obligations;
			}
			return a;			
		}
		
		@FXML
		double mortgage=(debt*interest*Math.pow(1+interest, term*12))/(Math.pow(1+interest, term*12)-1);
}
