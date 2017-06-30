package com.jk.areaService;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jk.dao.RegionMapper;
import com.jk.model.Region;

@Service
public class RegionServiceImpl implements RegionService {
	
	@Autowired
	private RegionMapper regionMapper;

	@Override
	public int addRegion(List areaList) {
		return regionMapper.addRegion(areaList);
	}

	@Override
	public List<Region> queryS() {
		return regionMapper.queryS();
	}

	@Override
	public List<Region> queryShi(Integer id) {
		return regionMapper.queryShi(id);
	}
}
