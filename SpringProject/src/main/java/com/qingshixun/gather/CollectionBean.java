package com.qingshixun.gather;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {

	
@SuppressWarnings("rawtypes")
private List list;
	
	@SuppressWarnings("rawtypes")
	private Set set;
	
	@SuppressWarnings("rawtypes")
	private Map map;
	
	private Properties props;
	
	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}
	@SuppressWarnings("rawtypes")
	public void setList(List list) {
		this.list = list;
	}
	@SuppressWarnings("rawtypes")
	public Set getSet() {
		return set;
	}
	@SuppressWarnings("rawtypes")
	public void setSet(Set set) {
		this.set = set;
	}
	@SuppressWarnings("rawtypes")
	public Map getMap() {
		return map;
	}
	@SuppressWarnings("rawtypes")
	public void setMap(Map map) {
		this.map = map;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	@Override
	public String toString() {
		return "CollectionBean [list=" + list + ", set=" + set + ", map=" + map + ", props=" + props + "]";
	}
}
