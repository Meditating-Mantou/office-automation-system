package com.entity.vo;

import com.entity.GongzixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 工资信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-29 15:08:04
 */
public class GongzixinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 发薪月份
	 */
	
	private String faxinyuefen;
		
	/**
	 * 基本工资
	 */
	
	private String jibengongzi;
		
	/**
	 * 奖金提成
	 */
	
	private String jiangjinticheng;
		
	/**
	 * 补贴费用
	 */
	
	private String butiefeiyong;
		
	/**
	 * 考勤扣款
	 */
	
	private String kaoqinkoukuan;
		
	/**
	 * 五险一金
	 */
	
	private String wuxianyijin;
		
	/**
	 * 实发工资
	 */
	
	private String shifagongzi;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：发薪月份
	 */
	 
	public void setFaxinyuefen(String faxinyuefen) {
		this.faxinyuefen = faxinyuefen;
	}
	
	/**
	 * 获取：发薪月份
	 */
	public String getFaxinyuefen() {
		return faxinyuefen;
	}
				
	
	/**
	 * 设置：基本工资
	 */
	 
	public void setJibengongzi(String jibengongzi) {
		this.jibengongzi = jibengongzi;
	}
	
	/**
	 * 获取：基本工资
	 */
	public String getJibengongzi() {
		return jibengongzi;
	}
				
	
	/**
	 * 设置：奖金提成
	 */
	 
	public void setJiangjinticheng(String jiangjinticheng) {
		this.jiangjinticheng = jiangjinticheng;
	}
	
	/**
	 * 获取：奖金提成
	 */
	public String getJiangjinticheng() {
		return jiangjinticheng;
	}
				
	
	/**
	 * 设置：补贴费用
	 */
	 
	public void setButiefeiyong(String butiefeiyong) {
		this.butiefeiyong = butiefeiyong;
	}
	
	/**
	 * 获取：补贴费用
	 */
	public String getButiefeiyong() {
		return butiefeiyong;
	}
				
	
	/**
	 * 设置：考勤扣款
	 */
	 
	public void setKaoqinkoukuan(String kaoqinkoukuan) {
		this.kaoqinkoukuan = kaoqinkoukuan;
	}
	
	/**
	 * 获取：考勤扣款
	 */
	public String getKaoqinkoukuan() {
		return kaoqinkoukuan;
	}
				
	
	/**
	 * 设置：五险一金
	 */
	 
	public void setWuxianyijin(String wuxianyijin) {
		this.wuxianyijin = wuxianyijin;
	}
	
	/**
	 * 获取：五险一金
	 */
	public String getWuxianyijin() {
		return wuxianyijin;
	}
				
	
	/**
	 * 设置：实发工资
	 */
	 
	public void setShifagongzi(String shifagongzi) {
		this.shifagongzi = shifagongzi;
	}
	
	/**
	 * 获取：实发工资
	 */
	public String getShifagongzi() {
		return shifagongzi;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
