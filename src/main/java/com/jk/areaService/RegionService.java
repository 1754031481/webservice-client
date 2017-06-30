package com.jk.areaService;

import java.util.List;

import com.jk.model.Region;




public interface RegionService {

	int addRegion(List areaList);

	List<Region> queryS();

	List<Region> queryShi(Integer id);

}
