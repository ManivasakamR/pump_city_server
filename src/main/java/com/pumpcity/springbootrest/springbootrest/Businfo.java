package com.pumpcity.springbootrest.springbootrest;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Businfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id; 
	
	@Column
	private String name; 
	
	@Column
	private String routeid; 
	
	@Column
	private Integer basic; 
	
	@Column
	private Integer extchrg;
	
	@Column
	private String sdtime; 
	
	@Column
	private String dstime; 	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRouteid() {
		return routeid;
	}

	public void setRouteid(String routeid) {
		this.routeid = routeid;
	}

	public Integer getBasic() {
		return basic;
	}

	public void setBasic(Integer basic) {
		this.basic = basic;
	}
	
	public Integer getExtchrg() {
		return extchrg;
	}

	public void setExtchrg(Integer extchrg) {
		this.extchrg = extchrg;
	}

	public String getSdtime() {
		return sdtime;
	}

	public void setSdtime(String sdtime) {
		this.sdtime = sdtime;
	}	

	public String getDstime() {
		return dstime;
	}

	public void setDstime(String dstime) {
		this.dstime = dstime;
	}	

}