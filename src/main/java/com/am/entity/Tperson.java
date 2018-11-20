package com.am.entity;
// Generated 20 nov. 2018 18:53:33 by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Tperson generated by hbm2java
 */
@Entity
@Table(name = "tperson", catalog = "projectmanagement")
public class Tperson implements java.io.Serializable {

	private int idperson;
	private String nameperson;
	private String emailperson;
	@JsonIgnore
	private Set<Treporter> treporters = new HashSet<Treporter>(0);
	@JsonIgnore
	private Set<Tuser> tusers = new HashSet<Tuser>(0);

	public Tperson() {
	}

	public Tperson(int idperson) {
		this.idperson = idperson;
	}

	public Tperson(int idperson, String nameperson, String emailperson, Set<Treporter> treporters, Set<Tuser> tusers) {
		this.idperson = idperson;
		this.nameperson = nameperson;
		this.emailperson = emailperson;
		this.treporters = treporters;
		this.tusers = tusers;
	}

	@Id
	@Column(name = "idperson", unique = true, nullable = false)
	public int getIdperson() {
		return this.idperson;
	}

	public void setIdperson(int idperson) {
		this.idperson = idperson;
	}

	@Column(name = "nameperson", length = 60)
	public String getNameperson() {
		return this.nameperson;
	}

	public void setNameperson(String nameperson) {
		this.nameperson = nameperson;
	}

	@Column(name = "emailperson", length = 60)
	public String getEmailperson() {
		return this.emailperson;
	}

	public void setEmailperson(String emailperson) {
		this.emailperson = emailperson;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tperson")
	@JsonIgnore
	public Set<Treporter> getTreporters() {
		return this.treporters;
	}

	public void setTreporters(Set<Treporter> treporters) {
		this.treporters = treporters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tperson")
	@JsonIgnore
	public Set<Tuser> getTusers() {
		return this.tusers;
	}

	public void setTusers(Set<Tuser> tusers) {
		this.tusers = tusers;
	}

}
