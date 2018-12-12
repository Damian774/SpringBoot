package workshop.sb.config.controller.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;


@Service
public class GreetServiceFirstImplementation implements GreetService {
    public static String FIRST_IMPL = " from the first implementation.";
    @Override
    public String getMsg() {
        return GreetService.MSG+FIRST_IMPL;
    }
}
