package com.ejournal.java.dtos.schedule;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ejournal.java.enums.Term;
import lombok.Data;

/**
 * Created by kristiyan.parvanov on 18.02.20 г.
 */
@Data
public class CreateScheduleDto {

    @NotNull
    private Term term;

    @NotBlank
    private String groupId;
}
