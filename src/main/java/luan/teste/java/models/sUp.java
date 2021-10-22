package luan.teste.java.models;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_SUP")
public class sUp implements Serializable {
	private static final long serialVersionVID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String DocumentTitle;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDocumentTitle() {
		return DocumentTitle;
	}

	public void setDocumentTitle(String documentTitle) {
		DocumentTitle = documentTitle;
	}





}
