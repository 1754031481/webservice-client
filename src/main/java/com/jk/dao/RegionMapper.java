package com.jk.dao;

import java.util.List;

import com.jk.model.Region;



public interface RegionMapper {

	int addRegion(List areaList);

	List<Region> queryS();

	List<Region> queryShi(Integer id);
  
}