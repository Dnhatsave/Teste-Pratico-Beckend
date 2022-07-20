package com.tecnholus.testepraticobeckend.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cambio implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private Integer time_last_update_unix;
    private String time_last_update_utc;
    private Integer time_next_update_unix;
    private String time_next_update_utc;
    private Integer time_eol_unix;
    private String name;
    
    
    // Gerar uma table na BD sem classe
    @ElementCollection
    @CollectionTable(name = "rates")
    private Set<String> rates = new HashSet<>();


    public Cambio() {

    }


	public Cambio(Integer id,Integer time_last_update_unix, String time_last_update_utc, Integer time_next_update_unix,
			String time_next_update_utc, Integer time_eol_unix, String base_code) {
		super();
		this.id = id;
		this.time_last_update_unix = time_last_update_unix;
		this.time_last_update_utc = time_last_update_utc;
		this.time_next_update_unix = time_next_update_unix;
		this.time_next_update_utc = time_next_update_utc;
		this.time_eol_unix = time_eol_unix;
		this.name = base_code;
	}


	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getTime_last_update_unix() {
		return time_last_update_unix;
	}


	public void setTime_last_update_unix(Integer time_last_update_unix) {
		this.time_last_update_unix = time_last_update_unix;
	}


	public String getTime_last_update_utc() {
		return time_last_update_utc;
	}


	public void setTime_last_update_utc(String time_last_update_utc) {
		this.time_last_update_utc = time_last_update_utc;
	}


	public Integer getTime_next_update_unix() {
		return time_next_update_unix;
	}


	public void setTime_next_update_unix(Integer time_next_update_unix) {
		this.time_next_update_unix = time_next_update_unix;
	}


	public String getTime_next_update_utc() {
		return time_next_update_utc;
	}


	public void setTime_next_update_utc(String time_next_update_utc) {
		this.time_next_update_utc = time_next_update_utc;
	}


	public Integer getTime_eol_unix() {
		return time_eol_unix;
	}


	public void setTime_eol_unix(Integer time_eol_unix) {
		this.time_eol_unix = time_eol_unix;
	}


	public String getBase_code() {
		return name;
	}


	public void setBase_code(String base_code) {
		this.name = base_code;
	}


	public Set<String> getRates() {
		return rates;
	}


	public void setRates(Set<String> rates) {
		this.rates = rates;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cambio other = (Cambio) obj;
		return Objects.equals(id, other.id);
	}
    
    



}