package com.am.entity;
// Generated 20 nov. 2018 18:53:33 by Hibernate Tools 5.1.7.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Treporter generated by hbm2java
 */
@Entity
@Table(name = "treporter", catalog = "projectmanagement")
public class Treporter implements java.io.Serializable {

	private int idreporter;
	private Tperson tperson;
	private int enabledreporter;
	private int isinternal;
	@JsonIgnore
	private Set<Tticket> ttickets = new HashSet<Tticket>(0);

	public Treporter() {
	}

	public Treporter(int idreporter, Tperson tperson, int enabledreporter, int isinternal) {
		this.idreporter = idreporter;
		this.tperson = tperson;
		this.enabledreporter = enabledreporter;
		this.isinternal = isinternal;
	}

	public Treporter(int idreporter, Tperson tperson, int enabledreporter, int isinternal, Set<Tticket> ttickets) {
		this.idreporter = idreporter;
		this.tperson = tperson;
		this.enabledreporter = enabledreporter;
		this.isinternal = isinternal;
		this.ttickets = ttickets;
	}

	@Id

	@Column(name = "idreporter", unique = true, nullable = false)
	public int getIdreporter() {
		return this.idreporter;
	}

	public void setIdreporter(int idreporter) {
		this.idreporter = idreporter;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idperson", nullable = false)
	public Tperson getTperson() {
		return this.tperson;
	}

	public void setTperson(Tperson tperson) {
		this.tperson = tperson;
	}

	@Column(name = "enabledreporter", nullable = false)
	public int getEnabledreporter() {
		return this.enabledreporter;
	}

	public void setEnabledreporter(int enabledreporter) {
		this.enabledreporter = enabledreporter;
	}

	@Column(name = "isinternal", nullable = false)
	public int getIsinternal() {
		return this.isinternal;
	}

	public void setIsinternal(int isinternal) {
		this.isinternal = isinternal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "treporter")
	public Set<Tticket> getTtickets() {
		return this.ttickets;
	}

	public void setTtickets(Set<Tticket> ttickets) {
		this.ttickets = ttickets;
	}

}
