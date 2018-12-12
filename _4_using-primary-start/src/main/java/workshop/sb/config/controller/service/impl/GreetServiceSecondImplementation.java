package workshop.sb.config.controller.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;

@Service
@Primary
public class GreetServiceSecondImplementation implements GreetService {

    public static String SECOND_IMPL = " from the second implementation.";

    @Override
    public String getMsg() {
        return MSG + SECOND_IMPL;
    }
}
