package br.com.fiap.location.entity;

import br.com.fiap.location.enumerations.RegionEnum;

public class State {

	private String name;
	private String uf;
	private RegionEnum region;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public RegionEnum getRegion() {
		return region;
	}
	public void setRegion(RegionEnum region) {
		this.region = region;
	}
	
}
