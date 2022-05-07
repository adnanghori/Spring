package com.spring.Collection;

import java.util.List;

public class Collection {
	private List data;

	public List getData() {
		return data;
	}

	public void setData(List data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Collection [data=" + data + "]";
	}
	
}
