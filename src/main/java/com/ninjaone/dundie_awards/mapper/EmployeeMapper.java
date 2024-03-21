package com.ninjaone.dundie_awards.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ninjaone.dundie_awards.model.Employee;

public class EmployeeMapper {

    private ObjectMapper mapper = new ObjectMapper();

    public Employee dtoToEntity(EmployeeDto dto) {
        return mapper.convertValue(dto, Employee.class);
    }

    public EmployeeDto entityToDto(Employee employee) {
        return mapper.convertValue(employee, EmployeeDto.class);
    }
}