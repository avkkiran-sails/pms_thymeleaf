package com.sails.pms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Goal {
    private String title;
    private String description;
    private String deadline;
    private String status;
}
