package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    String process(Map<String, String> praramMap, Map<String, Object> model);
}
