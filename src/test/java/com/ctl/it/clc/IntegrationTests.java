package com.ctl.it.clc;

import com.ctl.it.clc.model.LoginResponse;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@Category(IntegrationTest.class)
@SpringApplicationConfiguration(classes = ClcClientApplication.class)
public abstract class IntegrationTests {

    @Value("#{systemEnvironment['--clc.username']}")
    protected String clcUsername;

    @Value("#{systemEnvironment['--clc.password']}")
    protected String clcPassword;


}
