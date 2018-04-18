package com.ivwk.common.service;

import org.springframework.stereotype.Service;

import com.ivwk.common.domain.LogDO;
import com.ivwk.common.domain.PageDO;
import com.ivwk.common.utils.Query;
@Service
public interface LogService {
	void save(LogDO logDO);
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
