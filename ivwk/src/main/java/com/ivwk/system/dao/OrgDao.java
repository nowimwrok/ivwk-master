package com.ivwk.system.dao;

import com.ivwk.system.domain.OrgDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 系统组织
 * @author Vayne
 * @email nowimwork@foxmail.com
 * @date 2018-02-24 17:02:39
 */
@Mapper
public interface OrgDao {

	OrgDO get(Long orgId);
	
	List<OrgDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrgDO org);
	
	int update(OrgDO org);
	
	int remove(Long org_id);
	
	int batchRemove(Long[] orgIds);
}
