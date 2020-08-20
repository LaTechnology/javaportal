package erp.ladera.portal.vo;

import java.io.Serializable;

public class EducationDetailsVo implements Serializable{

	
	private static final long serialVersionUID = 3237951087670055085L;
	private Integer id;
	private String course;
	private String institution;
	private String yearOfPassing;
	private Double percentage;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "EducationDetailsVo [id=" + id + ", course=" + course + ", institution=" + institution
				+ ", yearOfPassing=" + yearOfPassing + ", percentage=" + percentage + ", getCourse()=" + getCourse()
				+ ", getInstitution()=" + getInstitution() + ", getYearOfPassing()=" + getYearOfPassing()
				+ ", getPercentage()=" + getPercentage() + "]";
	}

}
