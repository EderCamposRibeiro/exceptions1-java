package model.exceptions;

public class DomainException extends RuntimeException {
	//A classe Exception � serializable:
	private static final long serialVersionUID = 1L;
	
	//Construtor que recebe String como argumento
	//Permite estanciar a exce��o personalizada passando uma mensagem
	public DomainException(String msg) {
		super(msg);
	}
	

}
