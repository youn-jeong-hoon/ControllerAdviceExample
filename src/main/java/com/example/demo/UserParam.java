package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@ToString
public class UserParam {
  @Size(min = 4, max = 100)
  private String userId;

  @NotNull(message = "{test.notnull.message}")
  private String userName;

  @Min(0)
  @Max(100)
  private int age;
}
