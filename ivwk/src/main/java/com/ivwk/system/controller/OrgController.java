package com.ivwk.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ivwk.system.domain.OrgDO;
import com.ivwk.system.service.OrgService;
import com.ivwk.common.utils.PageUtils;
import com.ivwk.common.utils.Query;
import com.ivwk.common.utils.R;

/**
 * 系统组织
 * 
 * @author Vayne
 * @email nowimwork@foxmail.com
 * @date 2018-02-24 17:02:39
 */
 
@Controller
@RequestMapping("/system/org")
public class OrgController {
	@Autowired
	private OrgService orgService;
	
	@GetMapping()
	@RequiresPermissions("system:org:org")
	String Org(){
	    return "system/org/org";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:org:org")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<OrgDO> orgList = orgService.list(query);
		int total = orgService.count(query);
		PageUtils pageUtils = new PageUtils(orgList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:org:add")
	String add(){
	    return "system/org/add";
	}

	@GetMapping("/edit/{orgId}")
	@RequiresPermissions("system:org:edit")
	String edit(@PathVariable("orgId") Long orgId,Model model){
		OrgDO org = orgService.get(orgId);
		model.addAttribute("org", org);
	    return "system/org/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:org:add")
	public R save( OrgDO org){
		if(orgService.save(org)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:org:edit")
	public R update( OrgDO org){
		orgService.update(org);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:org:remove")
	public R remove( Long orgId){
		if(orgService.remove(orgId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:org:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] orgIds){
		orgService.batchRemove(orgIds);
		return R.ok();
	}
	
}
