package beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HomeBean implements Serializable {	
	private static final long serialVersionUID = 2650502996555155562L;
	private String nome;

	public HomeBean() {
		nome = "Marcos";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}