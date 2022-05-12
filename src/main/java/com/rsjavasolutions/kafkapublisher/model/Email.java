package com.rsjavasolutions.kafkapublisher.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    @NotEmpty
    private String content;

    @Size(min = 1)
    private Set<String> addresses;

}
