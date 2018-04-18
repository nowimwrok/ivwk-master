package com.ivwk.system.service;

import com.ivwk.system.domain.OrgDO;

import java.util.List;
import java.util.Map;

/**
 * 系统组织
 * 
 * @author Vayne
 * @email nowimwork@foxmail.com
 * @date 2018-02-24 17:02:39
 */
public interface OrgService {
	
	OrgDO get(Long orgId);
	
	List<OrgDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrgDO org);
	
	int update(OrgDO org);
	
	int remove(Long orgId);
	
	int batchRemove(Long[] orgIds);
}
