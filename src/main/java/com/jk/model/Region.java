package com.jk.model;

import java.io.Serializable;
import java.util.Date;

public class Region implements Serializable{
    private static final long serialVersionUID = 6674233912971425085L;

	private Integer id;

    private Integer orders;

    private String name;

    private String treePath;

    private Integer parent;

    private String fullName;

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", orders=" + orders + ", name=" + name + ", treePath=" + treePath + ", parent="
				+ parent + ", fullName=" + fullName + "]";
	}

	public Integer getOrders() {
		return orders;
	}

	public void setOrders(Integer orders) {
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTreePath() {
		return treePath;
	}

	public void setTreePath(String treePath) {
		this.treePath = treePath;
	}

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}


	

    
}