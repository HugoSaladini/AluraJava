
public class Gerente extends Funcionario{
	
	
	private int senha;
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true; 
		} else {
			return false;
		}
	}
	
	 public void setSenha(int senha) {
	        this.senha = senha;
	    }
	 
	public double getBonificacao() {
		System.out.println("Chando metodo de bonificação do Gerente");
		return super.getSalario();
	}
	
}
