package com.rsjavasolutions.kafkapublisher.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Email implements Serializable {

    @NotEmpty
    private String content;

    @Size(min = 1)
    private Set<String> addresses;
}
