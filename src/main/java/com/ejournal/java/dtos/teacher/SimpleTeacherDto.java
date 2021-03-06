package com.ejournal.java.dtos.teacher;

import com.ejournal.java.dtos.school.SchoolDto;
import lombok.Data;

/**
 * Created by kristiyan.parvanov on 30.12.19 г.
 */
@Data
public class SimpleTeacherDto {

    private String id;
    private String firstName;
    private String lastName;
    private Boolean isDirector;
    private SchoolDto school;
}
