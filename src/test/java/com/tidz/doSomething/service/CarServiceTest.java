package com.tidz.doSomething.service;

import com.tidz.doSomething.exceptions.NoResourceProvided;
import com.tidz.doSomething.repository.CarRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class CarServiceTest {

    @InjectMocks
    private CarService service;

    @Mock
    private CarRepository repository;

    @BeforeEach
    public void setMock() {
        MockMvcBuilders.standaloneSetup(this);
    }

    @Test
    void shouldThrowAnErrorIfNoCarIsProvided() {
        Assertions.assertThrows(NoResourceProvided.class, () -> {
            service.add(null);
        });
    }
}
