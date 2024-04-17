package com.entity.view;

import com.entity.YunshushoufeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 运输收费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-11-02 18:40:15
 */
@TableName("yunshushoufei")
public class YunshushoufeiView  extends YunshushoufeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YunshushoufeiView(){
	}
 
 	public YunshushoufeiView(YunshushoufeiEntity yunshushoufeiEntity){
 	try {
			BeanUtils.copyProperties(this, yunshushoufeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
