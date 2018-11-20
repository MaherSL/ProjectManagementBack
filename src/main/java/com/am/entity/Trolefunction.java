package com.am.entity;
// Generated 20 nov. 2018 18:53:33 by Hibernate Tools 5.1.7.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Trolefunction generated by hbm2java
 */
@Entity
@Table(name = "trolefunction", catalog = "projectmanagement")
public class Trolefunction implements java.io.Serializable {

	private int idrolefunction;
	private Tfunction tfunction;
	private Trole trole;
	private int cfunction;
	private int rfunction;
	private int ufunction;
	private int dfunction;

	public Trolefunction() {
	}

	public Trolefunction(int idrolefunction, Tfunction tfunction, Trole trole, int cfunction, int rfunction,
			int ufunction, int dfunction) {
		this.idrolefunction = idrolefunction;
		this.tfunction = tfunction;
		this.trole = trole;
		this.cfunction = cfunction;
		this.rfunction = rfunction;
		this.ufunction = ufunction;
		this.dfunction = dfunction;
	}

	@Id

	@Column(name = "idrolefunction", unique = true, nullable = false)
	public int getIdrolefunction() {
		return this.idrolefunction;
	}

	public void setIdrolefunction(int idrolefunction) {
		this.idrolefunction = idrolefunction;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idfunction", nullable = false)
	public Tfunction getTfunction() {
		return this.tfunction;
	}

	public void setTfunction(Tfunction tfunction) {
		this.tfunction = tfunction;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idrole", nullable = false)
	public Trole getTrole() {
		return this.trole;
	}

	public void setTrole(Trole trole) {
		this.trole = trole;
	}

	@Column(name = "cfunction", nullable = false)
	public int getCfunction() {
		return this.cfunction;
	}

	public void setCfunction(int cfunction) {
		this.cfunction = cfunction;
	}

	@Column(name = "rfunction", nullable = false)
	public int getRfunction() {
		return this.rfunction;
	}

	public void setRfunction(int rfunction) {
		this.rfunction = rfunction;
	}

	@Column(name = "ufunction", nullable = false)
	public int getUfunction() {
		return this.ufunction;
	}

	public void setUfunction(int ufunction) {
		this.ufunction = ufunction;
	}

	@Column(name = "dfunction", nullable = false)
	public int getDfunction() {
		return this.dfunction;
	}

	public void setDfunction(int dfunction) {
		this.dfunction = dfunction;
	}

}
