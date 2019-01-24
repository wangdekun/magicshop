package com.friends.itour.util;



import com.friends.itour.util.exception.ListNotFoundException;

import java.util.*;

/**
 * 集合操作类
 * 提供通过求list的交集，和去重的操作
 * @author andy.niu
 *
 */
public class ArrayListUtils {

	
	/**
	 * 两个map集合去重复
	 * 
	 * @param saveMap	需要去重的map集合
	 * @param referMap	参照的map集合
	 * @return
	 * @throws ListNotFoundException
	 */
	public static Map<String,Object> deEmphasisByMap(Map<String,Object> saveMap,
                                                     Map<String,Object> referMap) throws ListNotFoundException{
		
		Map<String,Object> reValueMap = new HashMap<String, Object>();
		
		/* 判读传入集合是否为空值 */
		if(saveMap == null || referMap == null){
			throw new ListNotFoundException(UtilsMsg.LIST_NOT_FOUND);
		}else{
			for(Map.Entry<String, Object> entry : saveMap.entrySet()) {
				/* 如果值不存在于referMap中 */
	            if(!(referMap.get(entry.getKey()) != null)){
	            	reValueMap.put(entry.getKey(), entry.getValue());
	            }
	        }
			saveMap.clear();	//释放map集合所暂用的内存空间
			referMap.clear();
		}
		return reValueMap;
	}
	
	/**
	 * 取得两个Map集合的交集
	 * @param saveMap
	 * @param referMap
	 * @return
	 * @throws ListNotFoundException
	 */
	public static Map<String,Object> sectionByMap(Map<String,Object> saveMap,
                                                  Map<String,Object> referMap) throws ListNotFoundException{
		Map<String,Object> reValueMap = new HashMap<String, Object>();
		/* 判读传入集合是否为空值 */
		if(saveMap == null || referMap == null){
			throw new ListNotFoundException(UtilsMsg.LIST_NOT_FOUND);
		}else{
			/* 取得长度较小的map值 */
			if(saveMap.size() <=  referMap.size()){
				for(Map.Entry<String, Object> entry : saveMap.entrySet()) {
					/* 如果值不存在于referMap中 */
		            if(referMap.get(entry.getKey()) != null){
		            	reValueMap.put(entry.getKey(), entry.getValue());
		            }
		        }
			}else{
				for(Map.Entry<String, Object> entry : referMap.entrySet()) {
					/* 如果值不存在于referMap中 */
		            if(saveMap.get(entry.getKey()) != null){
		            	reValueMap.put(entry.getKey(), entry.getValue());
		            }
		        }
			}
		}
		return reValueMap;
	}
	
	/**
	 * 将字符串list生成为字符串
	 * @param strList
	 * @return
	 */
	public static String createStrForList(List<String> strList){
		if(strList == null || strList.isEmpty()){
			return null;
		}else{
			String str = "";
			for(int i = 0; i < strList.size(); i++){
				if(i == strList.size() - 1){
					str = str + strList.get(i);
				}else{
					str = str + strList.get(i) + ",";
				}
			}
			return str;
		}
	}
	
	public static List<String> createListForStr (String listStr){
		List<String> list = new ArrayList<String>();
		if(listStr != null && listStr != ""){
			list = java.util.Arrays.asList(listStr);
		}
		return list;
	}

	public static boolean isEmpty(Collection collection){
		if(collection==null||collection.size()==0){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	public static void main(String args[]) throws ListNotFoundException{
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("1q", 1);
		map.put("2w", 2);
		map.put("3e", 3);
		map.put("4r", 4);
		map.put("5t", 5);
		
		Map<String,Object> map1 = new HashMap<String, Object>();
		map1.put("1q", 1);
		map1.put("2w", 2);
		
		Map<String,Object> map2 = sectionByMap(map, map1);
		
		for(String dataKey : map2.keySet()){
			System.out.println(dataKey );
		}  
		
		System.out.println("------------------");
		
		String aa = "1,2,3,4,5,6,7,8";
		List<String> lists = createListForStr(aa);
		System.out.println(lists);

	}
	
}
