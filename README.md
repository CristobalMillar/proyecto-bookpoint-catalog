  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.4)

2026-07-01T15:01:18.472-04:00  INFO 10952 --- [           main] c.bookpint.catalog.CatalogApplication    : Starting CatalogApplication using Java 21.0.10 with PID 10952 (C:\Users\co-alumno\Downloads\proyecto bookpoint\catalog\target\classes started by CO-Alumno in C:\Users\co-alumno\Downloads\proyecto bookpoint)
2026-07-01T15:01:18.474-04:00  INFO 10952 --- [           main] c.bookpint.catalog.CatalogApplication    : No active profile set, falling back to 1 default profile: "default"
2026-07-01T15:01:18.972-04:00  WARN 10952 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: java.lang.IllegalArgumentException: @FeignClient can only be specified on an interface
2026-07-01T15:01:18.979-04:00  INFO 10952 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-07-01T15:01:18.998-04:00 ERROR 10952 --- [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalArgumentException: @FeignClient can only be specified on an interface
        at org.springframework.util.Assert.isTrue(Assert.java:111) ~[spring-core-6.1.13.jar:6.1.13]
        at org.springframework.cloud.openfeign.FeignClientsRegistrar.registerFeignClients(FeignClientsRegistrar.java:192) ~[spring-cloud-openfeign-core-4.1.3.jar:4.1.3]
        at org.springframework.cloud.openfeign.FeignClientsRegistrar.registerBeanDefinitions(FeignClientsRegistrar.java:151) ~[spring-cloud-openfeign-core-4.1.3.jar:4.1.3]
        at org.springframework.context.annotation.ImportBeanDefinitionRegistrar.registerBeanDefinitions(ImportBeanDefinitionRegistrar.java:86) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.lambda$loadBeanDefinitionsFromRegistrars$1(ConfigurationClassBeanDefinitionReader.java:376) ~[spring-context-6.1.13.jar:6.1.13]
        at java.base/java.util.LinkedHashMap.forEach(Unknown Source) ~[na:na]
        at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsFromRegistrars(ConfigurationClassBeanDefinitionReader.java:375) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitionsForConfigurationClass(ConfigurationClassBeanDefinitionReader.java:148) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.annotation.ConfigurationClassBeanDefinitionReader.loadBeanDefinitions(ConfigurationClassBeanDefinitionReader.java:120) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.annotation.ConfigurationClassPostProcessor.processConfigBeanDefinitions(ConfigurationClassPostProcessor.java:429) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.annotation.ConfigurationClassPostProcessor.postProcessBeanDefinitionRegistry(ConfigurationClassPostProcessor.java:290) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanDefinitionRegistryPostProcessors(PostProcessorRegistrationDelegate.java:349) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.support.PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(PostProcessorRegistrationDelegate.java:118) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.support.AbstractApplicationContext.invokeBeanFactoryPostProcessors(AbstractApplicationContext.java:789) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:607) ~[spring-context-6.1.13.jar:6.1.13]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.3.4.jar:3.3.4]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754) ~[spring-boot-3.3.4.jar:3.3.4]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456) ~[spring-boot-3.3.4.jar:3.3.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:335) ~[spring-boot-3.3.4.jar:3.3.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1363) ~[spring-boot-3.3.4.jar:3.3.4]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1352) ~[spring-boot-3.3.4.jar:3.3.4]
        at com.bookpint.catalog.CatalogApplication.main(CatalogApplication.java:20) ~[classes/:na]

        #BOOKPOINT
        
        ## Descripcion
        Microservicio encargado de:
        ## Tecnologias
        -Java 25
        -Spring Boot
        -Maven
        -MySQL

        ##
