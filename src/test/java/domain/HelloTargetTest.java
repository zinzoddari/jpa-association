package domain;

import static org.junit.jupiter.api.Assertions.*;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloTargetTest {
    @Test
    @DisplayName("")
    void dd() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloTarget.class);
        enhancer.setCallback(NoOp.INSTANCE);
        Object object = enhancer.create();

        HelloTarget helloTarget = (HelloTarget) object;
        helloTarget.sayHello("zz");
    }
}