package com.nt.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerVo implements Serializable {

	private String cname;
	private String cadd;
	private String pamt;
	private String rate;
	private String time;
	
	
}
