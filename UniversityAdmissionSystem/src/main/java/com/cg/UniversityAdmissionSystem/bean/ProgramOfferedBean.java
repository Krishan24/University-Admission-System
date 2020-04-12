package com.cg.UniversityAdmissionSystem.bean;

public class ProgramOfferedBean 
{
	private String programName;
	private String description;
	private String applicantEligibility;
	private int duration;
	private String degreeCertificateOffered;

	public ProgramOfferedBean() {

	}

	public ProgramOfferedBean(String programName, String description, String applicantEligibility, int duration,
			String degreeCertificateOffered) {
		super();
		this.programName = programName;
		this.description = description;
		this.applicantEligibility = applicantEligibility;
		this.duration = duration;
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplicantEligibility() {
		return applicantEligibility;
	}

	public void setApplicantEligibility(String applicantEligibility) {
		this.applicantEligibility = applicantEligibility;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}

	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}

	@Override
	public String toString() {
		return "programName = " + programName + ", description = " + description + ", applicantEligibility = "
				+ applicantEligibility + ", duration = " + duration + ", degreeCertificateOffered = "
				+ degreeCertificateOffered;
	}

	public void setApplicantEligiblity(String eligible) {
		// TODO Auto-generated method stub
		
	}

	public void setDegreeCertificate(String next) {
		// TODO Auto-generated method stub
		
	}

}
