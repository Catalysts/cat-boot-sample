package cc.catalysts.boot.sample;

import cc.catalysts.boot.i18n.service.ClientEnumRegistry;
import cc.catalysts.boot.sample.dto.Operation;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Klaus Lehner
 */
@SpringBootApplication
public class CatBootSampleServer implements InitializingBean {

    @Autowired
    ClientEnumRegistry clientEnumRegistry;

    public static void main(String[] args) {
        SpringApplication.run(CatBootSampleServer.class, args);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // Register the enum with cat-boot-i18n:
        clientEnumRegistry.registerClientEnum(Operation.class);
    }
}
