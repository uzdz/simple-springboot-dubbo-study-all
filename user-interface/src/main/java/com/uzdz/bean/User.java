package com.uzdz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 用户地址
 * @author lfy
 *
 */
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
	
	private Integer id;

	private String name;
}
