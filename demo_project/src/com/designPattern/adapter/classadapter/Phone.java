/**
 * 
 */
package com.designPattern.adapter.classadapter;

/**
 * @author lilongheng
 * @date 2020年1月21日
 * Description:
 */
public class Phone {
	
	//充电
	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("电压为5V, 可以充电~~");
		}else {
			System.out.println("电压大于5V, 不能充电~~");
		}
	}

}
