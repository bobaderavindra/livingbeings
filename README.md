# livingbeings - java example

This is the Java repository.

## Instructions

Clone the repo:

Git:
```
$ git clone https://github.com/bobaderavindra/livingbeings.git
```

Or download a ZIP of master [manually](https://github.com/bobaderavindra/livingbeings.git) and expand the contents someplace on your system

## Prerequisites

* Have a JDK installed
* Have Maven installed and available on your PATH or IDE
* Have Firefox / CHROME installed

## Verify installation

You can verify the project builds correctly from your IDE or from the command
line.

### CLI

Open a command prompt and verify that all needed bins are on your path and up to date:

```
$ java -version
# ^ should be at least 1.8
$ mvn -v
# ^ should be at least 3.0.0
```

Finally, verify that `mvn install` succeeds.

You should see output like the following:

```
$ cd livingbeings
$ mvn install
# ...

[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< com.livingbeings:livingbeings >--------------------
[INFO] Building livingbeings 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:resources (default-resources) @ livingbeings ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:compile (default-compile) @ livingbeings ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:3.1.0:testResources (default-testResources) @ livingbeings ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory E:\DEVELOPMENT\livingbeings\livingbeings\src\test\resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.6.1:testCompile (default-testCompile) @ livingbeings ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.22.1:test (default-test) @ livingbeings ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.livingbeings.livingbeings.LivingbeingsApplicationTests
09:36:43.474 [main] DEBUG org.springframework.test.context.junit4.SpringJUnit4ClassRunner - SpringJUnit4ClassRunner constructor called with [class com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:43.493 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating CacheAwareContextLoaderDelegate from class [org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate]
09:36:43.519 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating BootstrapContext using constructor [public org.springframework.test.context.support.DefaultBootstrapContext(java.lang.Class,org.springframework.test.context.CacheAwareContextLoaderDelegate)]
09:36:43.571 [main] DEBUG org.springframework.test.context.BootstrapUtils - Instantiating TestContextBootstrapper for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests] from class [org.springframework.boot.test.context.SpringBootTestContextBootstrapper]
09:36:43.620 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Neither @ContextConfiguration nor @ContextHierarchy found for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests], using SpringBootContextLoader
09:36:43.638 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]: class path resource [com/livingbeings/livingbeings/LivingbeingsApplicationTests-context.xml] does not exist
09:36:43.639 [main] DEBUG org.springframework.test.context.support.AbstractContextLoader - Did not detect default resource location for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]: class path resource [com/livingbeings/livingbeings/LivingbeingsApplicationTestsContext.groovy] does not exist
09:36:43.640 [main] INFO org.springframework.test.context.support.AbstractContextLoader - Could not detect default resource locations for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]: no resource found for suffixes {-context.xml, Context.groovy}.
09:36:43.648 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils - Could not detect default configuration classes for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]: LivingbeingsApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
09:36:43.764 [main] DEBUG org.springframework.test.context.support.ActiveProfilesUtils - Could not find an 'annotation declaring class' for annotation type [org.springframework.test.context.ActiveProfiles] and class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:43.990 [main] DEBUG org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider - Identified candidate component class: file [E:\DEVELOPMENT\livingbeings\livingbeings\target\classes\com\livingbeings\livingbeings\LivingbeingsApplication.class]
09:36:43.993 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Found @SpringBootConfiguration com.livingbeings.livingbeings.LivingbeingsApplication for test class com.livingbeings.livingbeings.LivingbeingsApplicationTests
09:36:44.207 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - @TestExecutionListeners is not present for class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]: using defaults.
09:36:44.208 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Loaded default TestExecutionListener class names from location [META-INF/spring.factories]: [org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener, org.springframework.test.context.web.ServletTestExecutionListener, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener, org.springframework.test.context.support.DependencyInjectionTestExecutionListener, org.springframework.test.context.support.DirtiesContextTestExecutionListener, org.springframework.test.context.transaction.TransactionalTestExecutionListener, org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener]
09:36:44.246 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.transaction.TransactionalTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttributeSource]
09:36:44.253 [main] DEBUG org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Skipping candidate TestExecutionListener [org.springframework.test.context.jdbc.SqlScriptsTestExecutionListener] due to a missing dependency. Specify custom listener classes or make the default listener classes and their required dependencies available. Offending class: [org/springframework/transaction/interceptor/TransactionAttribute]
09:36:44.255 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper - Using TestExecutionListeners: [org.springframework.test.context.web.ServletTestExecutionListener@49139829, org.springframework.test.context.support.DirtiesContextBeforeModesTestExecutionListener@9597028, org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener@6069db50, org.springframework.boot.test.autoconfigure.SpringBootDependencyInjectionTestExecutionListener@4efbca5a, org.springframework.test.context.support.DirtiesContextTestExecutionListener@1b7cc17c, org.springframework.boot.test.mock.mockito.ResetMocksTestExecutionListener@59662a0b, org.springframework.boot.test.autoconfigure.restdocs.RestDocsTestExecutionListener@77fbd92c, org.springframework.boot.test.autoconfigure.web.client.MockRestServiceServerResetTestExecutionListener@67c27493, org.springframework.boot.test.autoconfigure.web.servlet.MockMvcPrintOnlyOnFailureTestExecutionListener@1a482e36, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverTestExecutionListener@72967906]
09:36:44.265 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.268 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.271 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.271 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.273 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.273 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.291 [main] DEBUG org.springframework.test.context.support.AbstractDirtiesContextTestExecutionListener - Before test class: context [DefaultTestContext@34a3d150 testClass = LivingbeingsApplicationTests, testInstance = [null], testMethod = [null], testException = [null], mergedContextConfiguration = [WebMergedContextConfiguration@2a4fb17b testClass = LivingbeingsApplicationTests, locations = '{}', classes = '{class com.livingbeings.livingbeings.LivingbeingsApplication}', contextInitializerClasses = '[]', activeProfiles = '{}', propertySourceLocations = '{}', propertySourceProperties = '{org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true}', contextCustomizers = set[org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@87f383f, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@612fc6eb, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@74a10858, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizerFactory$Customizer@42607a4f], resourceBasePath = 'src/main/webapp', contextLoader = 'org.springframework.boot.test.context.SpringBootContextLoader', parent = [null]], attributes = map['org.springframework.test.context.web.ServletTestExecutionListener.activateListener' -> true]], class annotated with @DirtiesContext [false] with mode [null].
09:36:44.294 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved @ProfileValueSourceConfiguration [null] for test class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.295 [main] DEBUG org.springframework.test.annotation.ProfileValueUtils - Retrieved ProfileValueSource type [class org.springframework.test.annotation.SystemProfileValueSource] for class [com.livingbeings.livingbeings.LivingbeingsApplicationTests]
09:36:44.373 [main] DEBUG org.springframework.test.context.support.TestPropertySourceUtils - Adding inlined properties to environment: {spring.jmx.enabled=false, org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true, server.port=-1}

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.1.3.RELEASE)

2019-03-14 09:36:45.012  INFO 13124 --- [           main] c.l.l.LivingbeingsApplicationTests       : Starting LivingbeingsApplicationTests on DESKTOP-KBDSSSF with PID 13124 (started by S in E:\DEVELOPMENT\livingbeings\livingbeings)
2019-03-14 09:36:45.014  INFO 13124 --- [           main] c.l.l.LivingbeingsApplicationTests       : No active profile set, falling back to default profiles: default
2019-03-14 09:36:49.788  INFO 13124 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2019-03-14 09:36:51.577  INFO 13124 --- [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 2 endpoint(s) beneath base path '/actuator'
2019-03-14 09:36:51.760  INFO 13124 --- [           main] c.l.l.LivingbeingsApplicationTests       : Started LivingbeingsApplicationTests in 7.363 seconds (JVM running for 9.369)
I am swiming

Leave on land


BIRD

I am walking

Leave on land


BIRD

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.163 s - in com.livingbeings.livingbeings.LivingbeingsApplicationTests
2019-03-14 09:36:52.338  INFO 13124 --- [       Thread-5] o.s.s.concurrent.ThreadPoolTaskExecutor  : Shutting down ExecutorService 'applicationTaskExecutor'
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] 
[INFO] --- maven-jar-plugin:3.1.1:jar (default-jar) @ livingbeings ---
[INFO] Building jar: E:\DEVELOPMENT\livingbeings\livingbeings\target\livingbeings-0.0.1-SNAPSHOT.jar
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.1.3.RELEASE:repackage (repackage) @ livingbeings ---
[INFO] Replacing main artifact with repackaged archive
[INFO] 
[INFO] --- maven-install-plugin:2.5.2:install (default-install) @ livingbeings ---
[INFO] Installing E:\DEVELOPMENT\livingbeings\livingbeings\target\livingbeings-0.0.1-SNAPSHOT.jar to C:\Users\S\.m2\repository\com\livingbeings\livingbeings\0.0.1-SNAPSHOT\livingbeings-0.0.1-SNAPSHOT.jar
[INFO] Installing E:\DEVELOPMENT\livingbeings\livingbeings\pom.xml to C:\Users\S\.m2\repository\com\livingbeings\livingbeings\0.0.1-SNAPSHOT\livingbeings-0.0.1-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 19.392 s
[INFO] Finished at: 2019-03-14T09:36:56+08:00
[INFO] ------------------------------------------------------------------------
```

