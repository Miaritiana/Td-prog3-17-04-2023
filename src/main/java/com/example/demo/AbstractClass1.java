package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public abstract class AbstractClass1 {
    private ConcreteDependance1 dependance1;
    private ConcreteDependance2 dependance2;
}
