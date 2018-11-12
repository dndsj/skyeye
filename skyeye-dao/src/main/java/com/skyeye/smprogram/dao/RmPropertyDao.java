package com.skyeye.smprogram.dao;

import java.util.List;
import java.util.Map;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

public interface RmPropertyDao {

	public List<Map<String, Object>> queryRmPropertyList(Map<String, Object> map, PageBounds pageBounds) throws Exception;

	public int insertRmPropertyMation(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryRmPropertyMationByName(Map<String, Object> map) throws Exception;

	public int deleteRmPropertyMationById(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryRmPropertyMationToEditById(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryRmPropertyMationByNameAndId(Map<String, Object> map) throws Exception;

	public int editRmPropertyMationById(Map<String, Object> map) throws Exception;

}
