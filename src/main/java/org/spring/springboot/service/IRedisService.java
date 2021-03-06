package org.spring.springboot.service;

import java.util.Map;

import org.spring.springboot.base.BusinessException;
import org.spring.springboot.domain.City;
/**
 * Redis操作Service接口
 *
 * @author yuxuan.han
 */
public interface IRedisService {

	/**
	 * redis连接的测试接口
	 * @return
	 */
	String getUsername();
	
	/**
	 * 根据Id获取缓存中的值
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	City getCityById(String id);
	
	/**
	 * 添加缓存
	 * @param city
	 * @throws Exception 
	 */
	void setCity(City city);
	
	/**
	 * 删除缓存
	 * @param key
	 */
	void deleteByKey(String key);
	
	/**
	 * 获取指定key的String值
	 * @param key
	 * @return
	 */
	String getString(String key);
	
	/**
	 * 设置指定key的String值
	 * @param key	key for redis string
	 * @param value value for redis string
	 */
	void setString(String key, String value);
	
	/**
	 * 获取指定key的Hash值
	 * @param key 
	 * @return
	 * @throws BusinessException 
	 */
	Map<String, String> getHash(String key);
	
	/**
	 * 设置redis中Hash结构的值
	 * @param key
	 * @param map
	 * @throws BusinessException 
	 */
	void setHash(String key, Map<String, Object> map) throws BusinessException;

}
