package com.telran.jpaunihometask.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class EmployeeRequest {

    private Long companyId;

    private String firstName;

    private String lastName;
}
