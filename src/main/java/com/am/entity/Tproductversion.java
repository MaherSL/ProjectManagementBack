package com.am.entity;
// Generated 20 nov. 2018 18:53:33 by Hibernate Tools 5.1.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Tproductversion generated by hbm2java
 */
@Entity
@Table(name = "tproductversion", catalog = "projectmanagement")
public class Tproductversion implements java.io.Serializable {

	private int idproductversion;
	private String nameversion;
	private Date cdateversion;
	private int numberversion;
	private int enabledversion;
	private int idproduct;
	@JsonIgnore
	private Set<Tticket> ttickets = new HashSet<Tticket>(0);
	@JsonIgnore
	private Set<Ttickoprodversresol> ttickoprodversresols = new HashSet<Ttickoprodversresol>(0);

	public Tproductversion() {
	}

	public Tproductversion(int idproductversion, String nameversion, Date cdateversion, int numberversion,
			int enabledversion, int idproduct) {
		this.idproductversion = idproductversion;
		this.nameversion = nameversion;
		this.cdateversion = cdateversion;
		this.numberversion = numberversion;
		this.enabledversion = enabledversion;
		this.idproduct = idproduct;
	}

	public Tproductversion(int idproductversion, String nameversion, Date cdateversion, int numberversion,
			int enabledversion, int idproduct, Set<Tticket> ttickets, Set<Ttickoprodversresol> ttickoprodversresols) {
		this.idproductversion = idproductversion;
		this.nameversion = nameversion;
		this.cdateversion = cdateversion;
		this.numberversion = numberversion;
		this.enabledversion = enabledversion;
		this.idproduct = idproduct;
		this.ttickets = ttickets;
		this.ttickoprodversresols = ttickoprodversresols;
	}

	@Id

	@Column(name = "idproductversion", unique = true, nullable = false)
	public int getIdproductversion() {
		return this.idproductversion;
	}

	public void setIdproductversion(int idproductversion) {
		this.idproductversion = idproductversion;
	}

	@Column(name = "nameversion", nullable = false, length = 30)
	public String getNameversion() {
		return this.nameversion;
	}

	public void setNameversion(String nameversion) {
		this.nameversion = nameversion;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "cdateversion", nullable = false, length = 10)
	public Date getCdateversion() {
		return this.cdateversion;
	}

	public void setCdateversion(Date cdateversion) {
		this.cdateversion = cdateversion;
	}

	@Column(name = "numberversion", nullable = false)
	public int getNumberversion() {
		return this.numberversion;
	}

	public void setNumberversion(int numberversion) {
		this.numberversion = numberversion;
	}

	@Column(name = "enabledversion", nullable = false)
	public int getEnabledversion() {
		return this.enabledversion;
	}

	public void setEnabledversion(int enabledversion) {
		this.enabledversion = enabledversion;
	}

	@Column(name = "idproduct", nullable = false)
	public int getIdproduct() {
		return this.idproduct;
	}

	public void setIdproduct(int idproduct) {
		this.idproduct = idproduct;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tproductversion")
	public Set<Tticket> getTtickets() {
		return this.ttickets;
	}

	public void setTtickets(Set<Tticket> ttickets) {
		this.ttickets = ttickets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tproductversion")
	public Set<Ttickoprodversresol> getTtickoprodversresols() {
		return this.ttickoprodversresols;
	}

	public void setTtickoprodversresols(Set<Ttickoprodversresol> ttickoprodversresols) {
		this.ttickoprodversresols = ttickoprodversresols;
	}

}
