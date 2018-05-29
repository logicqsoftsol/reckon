package com.logicq.reckon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPANY_DETAILS")
public class CompanyDetails {
	
	@Id
	@Column(name = "COMPANY_ID")
	private String companyId;
	
	@Column(name = "COMP_NAME")
	private String compname;

	@Column(name = "TAG_LINE")
	private String tagline;

	@Column(name = "ABOUTCOMP", columnDefinition = "TEXT")
	private String aboutcomp;

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompname() {
		return compname;
	}

	public void setCompname(String compname) {
		this.compname = compname;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getAboutcomp() {
		return aboutcomp;
	}

	public void setAboutcomp(String aboutcomp) {
		this.aboutcomp = aboutcomp;
	}

	@Override
	public String toString() {
		return "CompanyDetails [companyId=" + companyId + ", compname=" + compname + ", tagline=" + tagline
				+ ", aboutcomp=" + aboutcomp + "]";
	}


}
