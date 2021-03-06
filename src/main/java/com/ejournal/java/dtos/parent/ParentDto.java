package com.ejournal.java.dtos.parent;

import java.util.List;

import com.ejournal.java.dtos.student.SimpleStudentDto;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by kristiyan.parvanov on 27.12.19 г.
 */
@Getter
@Setter
public class ParentDto {

    private String id;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private List<SimpleStudentDto> students;
}
