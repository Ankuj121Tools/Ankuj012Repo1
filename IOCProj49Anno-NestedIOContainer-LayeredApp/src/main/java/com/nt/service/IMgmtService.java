package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDto;

public interface IMgmtService {
  public List<EmployeeDto> fetchEmpsByDesgs(String desg1,String desg2,String Desg3)throws Exception;
}
