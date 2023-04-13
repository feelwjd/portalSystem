package portal.application;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextValidation implements ApplicationListener<ContextRefreshedEvent> {
    
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // check if all required resources are loaded
        try {
            Resource[] resources = new PathMatchingResourcePatternResolver()
                .getResources("classpath*:applicationcontext-*.xml");
            if (resources.length == 0) {
                System.out.println("Error: No applicationcontext.xml found");
            } else {
                for (Resource resource : resources) {
                    System.out.println("Loaded " + resource.getFilename());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}