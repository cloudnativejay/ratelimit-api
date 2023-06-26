package com.microsoft.gbb.ratelimitapi.domain;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Person {
    String id;
    String lastName;
    String firstName;
    String emailId;
}
