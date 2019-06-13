package com.bankTransfer.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class JsonWeather {
	/** 天气温度 */
	private String temperature;
	/** 天气情况 */
	private String weather;
	/** 天气图片 */
	private String weather_pic;
}
