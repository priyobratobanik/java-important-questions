package com.masai.ev3.q3;

public abstract class Evaluation {
	
	private final int numberOfQuestions;
	abstract void evaluationTiming();
	
	void printNoOfQuestions() { 
		System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions); 
		
	}

	public Evaluation(int numberOfQuestions) {
		super();
		this.numberOfQuestions = numberOfQuestions;
	}
	

}
class CodingEvaluation extends Evaluation{

	public CodingEvaluation(int numberOfQuestions) {
		super(numberOfQuestions);
		
	}

	@Override
	void evaluationTiming() {
		System.out.println("Evaluation timing is 9.30 to 11.00 ");
		
	}
	
}
class DsaEvaluation extends Evaluation{

	public DsaEvaluation(int numberOfQuestions) {
		super(numberOfQuestions);
		
	}

	@Override
	void evaluationTiming() {
		System.out.println("Evaluation timing is 2.00 to 3.30");
		
	}
	
}
class Main{ 
	
	void messageToStudents(Evaluation evaluation){
		if(evaluation instanceof DsaEvaluation) {
			System.out.println("its a Dsa Evaluation");
			evaluation.printNoOfQuestions();
			evaluation.evaluationTiming();
			
		}
		else if (evaluation instanceof CodingEvaluation){
				System.err.println("its coding Evaluation");
				evaluation.evaluationTiming();
				evaluation.printNoOfQuestions();
		} 
		
		}
		
		public static void main(String[] args) {
			
		Main main=new Main();
		main.messageToStudents(new DsaEvaluation(4));
		main.messageToStudents(new CodingEvaluation(5));
			
		}
		
	

}

	






