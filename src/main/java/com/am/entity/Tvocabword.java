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
 * Tvocabword generated by hbm2java
 */
@Entity
@Table(name = "tvocabword", catalog = "projectmanagement")
public class Tvocabword implements java.io.Serializable {

	private int idvocabword;
	private Tvocab tvocab;
	private String codeword;
	private String icodeword;
	private String nameword;
	private int isinternal;
	private int enabledvocab;
	private Integer rownumber;
	@JsonIgnore
	private Set<Tticket> tticketsForVocticketstatus = new HashSet<Tticket>(0);
	@JsonIgnore
	private Set<Tticket> tticketsForVocticketresol = new HashSet<Tticket>(0);
	@JsonIgnore
	private Set<Ttickoprodversresol> ttickoprodversresols = new HashSet<Ttickoprodversresol>(0);

	public Tvocabword() {
	}

	public Tvocabword(int idvocabword, Tvocab tvocab, String codeword, String icodeword, String nameword,
			int isinternal, int enabledvocab) {
		this.idvocabword = idvocabword;
		this.tvocab = tvocab;
		this.codeword = codeword;
		this.icodeword = icodeword;
		this.nameword = nameword;
		this.isinternal = isinternal;
		this.enabledvocab = enabledvocab;
	}

	public Tvocabword(int idvocabword, Tvocab tvocab, String codeword, String icodeword, String nameword,
			int isinternal, int enabledvocab, Integer rownumber, Set<Tticket> tticketsForVocticketstatus,
			Set<Tticket> tticketsForVocticketresol, Set<Ttickoprodversresol> ttickoprodversresols) {
		this.idvocabword = idvocabword;
		this.tvocab = tvocab;
		this.codeword = codeword;
		this.icodeword = icodeword;
		this.nameword = nameword;
		this.isinternal = isinternal;
		this.enabledvocab = enabledvocab;
		this.rownumber = rownumber;
		this.tticketsForVocticketstatus = tticketsForVocticketstatus;
		this.tticketsForVocticketresol = tticketsForVocticketresol;
		this.ttickoprodversresols = ttickoprodversresols;
	}

	@Id

	@Column(name = "idvocabword", unique = true, nullable = false)
	public int getIdvocabword() {
		return this.idvocabword;
	}

	public void setIdvocabword(int idvocabword) {
		this.idvocabword = idvocabword;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idvocab", nullable = false)
	public Tvocab getTvocab() {
		return this.tvocab;
	}

	public void setTvocab(Tvocab tvocab) {
		this.tvocab = tvocab;
	}

	@Column(name = "codeword", nullable = false, length = 30)
	public String getCodeword() {
		return this.codeword;
	}

	public void setCodeword(String codeword) {
		this.codeword = codeword;
	}

	@Column(name = "icodeword", nullable = false, length = 30)
	public String getIcodeword() {
		return this.icodeword;
	}

	public void setIcodeword(String icodeword) {
		this.icodeword = icodeword;
	}

	@Column(name = "nameword", nullable = false, length = 60)
	public String getNameword() {
		return this.nameword;
	}

	public void setNameword(String nameword) {
		this.nameword = nameword;
	}

	@Column(name = "isinternal", nullable = false)
	public int getIsinternal() {
		return this.isinternal;
	}

	public void setIsinternal(int isinternal) {
		this.isinternal = isinternal;
	}

	@Column(name = "enabledvocab", nullable = false)
	public int getEnabledvocab() {
		return this.enabledvocab;
	}

	public void setEnabledvocab(int enabledvocab) {
		this.enabledvocab = enabledvocab;
	}

	@Column(name = "rownumber")
	public Integer getRownumber() {
		return this.rownumber;
	}

	public void setRownumber(Integer rownumber) {
		this.rownumber = rownumber;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tvocabwordByVocticketstatus")
	public Set<Tticket> getTticketsForVocticketstatus() {
		return this.tticketsForVocticketstatus;
	}

	public void setTticketsForVocticketstatus(Set<Tticket> tticketsForVocticketstatus) {
		this.tticketsForVocticketstatus = tticketsForVocticketstatus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tvocabwordByVocticketresol")
	public Set<Tticket> getTticketsForVocticketresol() {
		return this.tticketsForVocticketresol;
	}

	public void setTticketsForVocticketresol(Set<Tticket> tticketsForVocticketresol) {
		this.tticketsForVocticketresol = tticketsForVocticketresol;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tvocabword")
	public Set<Ttickoprodversresol> getTtickoprodversresols() {
		return this.ttickoprodversresols;
	}

	public void setTtickoprodversresols(Set<Ttickoprodversresol> ttickoprodversresols) {
		this.ttickoprodversresols = ttickoprodversresols;
	}

}
