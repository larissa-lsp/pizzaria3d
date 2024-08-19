package br.com.projeto.pizzaria3d.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Mensagem")
public class Mensagem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	private String emissorMensagem;
	private String email;
	private String texto;
	private String telefone;
	private String statusMensagem;
	private LocalDateTime dataMensagem;

	public long getId() {
		return id;
	}

	public LocalDateTime getDataMensagem() {
		return dataMensagem;
	}

	public String getEmail() {
		return email;
	}

	public String getTexto() {
		return texto;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getStatusMensagem() {
		return statusMensagem;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setDataMensagem(LocalDateTime dataMensagem) {
		this.dataMensagem = dataMensagem;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setStatusMensagem(String statusMensagem) {
		this.statusMensagem = statusMensagem;
	}

	public String getEmissorMensagem() {
		return emissorMensagem;
	}

	public void setEmissorMensagem(String emissorMensagem) {
		this.emissorMensagem = emissorMensagem;
	}
	

}