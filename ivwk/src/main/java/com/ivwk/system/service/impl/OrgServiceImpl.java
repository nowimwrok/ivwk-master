package com.ivwk.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.ivwk.system.dao.OrgDao;
import com.ivwk.system.domain.OrgDO;
import com.ivwk.system.service.OrgService;



@Service
public class OrgServiceImpl implements OrgService {
	@Autowired
	private OrgDao orgDao;
	
	@Override
	public OrgDO get(Long orgId){
		return orgDao.get(orgId);
	}
	
	@Override
	public List<OrgDO> list(Map<String, Object> map){
		return orgDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return orgDao.count(map);
	}
	
	@Override
	public int save(OrgDO org){
		return orgDao.save(org);
	}
	
	@Override
	public int update(OrgDO org){
		return orgDao.update(org);
	}
	
	@Override
	public int remove(Long orgId){
		return orgDao.remove(orgId);
	}
	
	@Override
	public int batchRemove(Long[] orgIds){
		return orgDao.batchRemove(orgIds);
	}
	
}
