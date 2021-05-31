package com.nt.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerBo implements Serializable {
    
	
	private String cname;
	private String cadd;
	private float pamt;
	private float rate;
	private float time;
	private float Interest;
		
	
}
