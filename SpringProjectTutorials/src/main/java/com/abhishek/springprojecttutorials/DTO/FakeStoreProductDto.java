package com.abhishek.springprojecttutorials.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.*;

@Getter
@Setter

public class FakeStoreProductDto {
    Long id;
    Long userId;
    LocalDate date;
}
