package com.ejournal.java.dtos.teacher;

import javax.validation.constraints.NotBlank;

import com.ejournal.java.dtos.auhtentication.RegisterRequestDto;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by kristiyan.parvanov on 30.12.19 г.
 */
@Getter
@Setter
public class TeacherRegisterDto extends RegisterRequestDto {

    @NotBlank
    private String schoolId;
    private Boolean isDirector;
}
