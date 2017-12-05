# dyn.orange
Вот лог что выводит :

.   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.5.9.RELEASE)

2017-12-06 00:09:42.822  INFO 29129 --- [           main] com.dyn.dyn.orange.Application           : Starting Application on Wobila with PID 29129 (/home/lordtemich/IdeaProjects/startproject/target/classes started by lordtemich in /home/lordtemich/IdeaProjects/startproject)
2017-12-06 00:09:42.826  INFO 29129 --- [           main] com.dyn.dyn.orange.Application           : No active profile set, falling back to default profiles: default
2017-12-06 00:09:42.992  INFO 29129 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@76b10754: startup date [Wed Dec 06 00:09:42 ALMT 2017]; root of context hierarchy
2017-12-06 00:09:44.470  INFO 29129 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration' of type [org.springframework.amqp.rabbit.annotation.RabbitBootstrapConfiguration$$EnhancerBySpringCGLIB$$6f60ccbc] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2017-12-06 00:09:45.228  INFO 29129 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2017-12-06 00:09:45.237  INFO 29129 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Bean with name 'rabbitConnectionFactory' has been autodetected for JMX exposure
2017-12-06 00:09:45.240  INFO 29129 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Located managed bean 'rabbitConnectionFactory': registering with JMX server as MBean [org.springframework.amqp.rabbit.connection:name=rabbitConnectionFactory,type=CachingConnectionFactory]
2017-12-06 00:09:45.349  INFO 29129 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Starting beans in phase 2147483647
2017-12-06 00:09:45.374 ERROR 29129 --- [    container-1] o.s.a.r.l.SimpleMessageListenerContainer : Failed to check/redeclare auto-delete queue(s).

org.springframework.amqp.AmqpConnectException: java.net.ConnectException: В соединении отказано (Connection refused)
	at org.springframework.amqp.rabbit.support.RabbitExceptionTranslator.convertRabbitAccessException(RabbitExceptionTranslator.java:62) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.connection.AbstractConnectionFactory.createBareConnection(AbstractConnectionFactory.java:368) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.connection.CachingConnectionFactory.createConnection(CachingConnectionFactory.java:573) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.doExecute(RabbitTemplate.java:1430) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.execute(RabbitTemplate.java:1411) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.execute(RabbitTemplate.java:1387) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitAdmin.getQueueProperties(RabbitAdmin.java:336) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer.redeclareElementsIfNecessary(SimpleMessageListenerContainer.java:1171) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer$AsyncMessageProcessingConsumer.run(SimpleMessageListenerContainer.java:1422) [spring-rabbit-1.7.4.RELEASE.jar:na]
	at java.lang.Thread.run(Thread.java:745) [na:1.8.0_121]
Caused by: java.net.ConnectException: В соединении отказано (Connection refused)
	at java.net.PlainSocketImpl.socketConnect(Native Method) ~[na:1.8.0_121]
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350) ~[na:1.8.0_121]
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206) ~[na:1.8.0_121]
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188) ~[na:1.8.0_121]
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_121]
	at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_121]
	at com.rabbitmq.client.impl.SocketFrameHandlerFactory.create(SocketFrameHandlerFactory.java:50) ~[amqp-client-4.0.3.jar:4.0.3]
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:907) ~[amqp-client-4.0.3.jar:4.0.3]
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:859) ~[amqp-client-4.0.3.jar:4.0.3]
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:799) ~[amqp-client-4.0.3.jar:4.0.3]
	at org.springframework.amqp.rabbit.connection.AbstractConnectionFactory.createBareConnection(AbstractConnectionFactory.java:352) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	... 8 common frames omitted

Sending message...
2017-12-06 00:09:45.404  INFO 29129 --- [           main] utoConfigurationReportLoggingInitializer : 

Error starting ApplicationContext. To display the auto-configuration report re-run your application with 'debug' enabled.
2017-12-06 00:09:45.408 ERROR 29129 --- [           main] o.s.boot.SpringApplication               : Application startup failed

java.lang.IllegalStateException: Failed to execute CommandLineRunner
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:735) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:716) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.afterRefresh(SpringApplication.java:703) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:304) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1118) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1107) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	at com.dyn.dyn.orange.Application.main(Application.java:51) [classes/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_121]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_121]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_121]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_121]
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147) [idea_rt.jar:na]
Caused by: org.springframework.amqp.AmqpConnectException: java.net.ConnectException: В соединении отказано (Connection refused)
	at org.springframework.amqp.rabbit.support.RabbitExceptionTranslator.convertRabbitAccessException(RabbitExceptionTranslator.java:62) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.connection.AbstractConnectionFactory.createBareConnection(AbstractConnectionFactory.java:368) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.connection.CachingConnectionFactory.createConnection(CachingConnectionFactory.java:573) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.doExecute(RabbitTemplate.java:1430) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.execute(RabbitTemplate.java:1411) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.send(RabbitTemplate.java:712) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.convertAndSend(RabbitTemplate.java:780) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at org.springframework.amqp.rabbit.core.RabbitTemplate.convertAndSend(RabbitTemplate.java:767) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	at com.dyn.dyn.orange.Runner.Runner.run(Runner.java:32) ~[classes/:na]
	at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:732) [spring-boot-1.5.9.RELEASE.jar:1.5.9.RELEASE]
	... 11 common frames omitted
Caused by: java.net.ConnectException: В соединении отказано (Connection refused)
	at java.net.PlainSocketImpl.socketConnect(Native Method) ~[na:1.8.0_121]
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350) ~[na:1.8.0_121]
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206) ~[na:1.8.0_121]
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188) ~[na:1.8.0_121]
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_121]
	at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_121]
	at com.rabbitmq.client.impl.SocketFrameHandlerFactory.create(SocketFrameHandlerFactory.java:50) ~[amqp-client-4.0.3.jar:4.0.3]
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:907) ~[amqp-client-4.0.3.jar:4.0.3]
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:859) ~[amqp-client-4.0.3.jar:4.0.3]
	at com.rabbitmq.client.ConnectionFactory.newConnection(ConnectionFactory.java:799) ~[amqp-client-4.0.3.jar:4.0.3]
	at org.springframework.amqp.rabbit.connection.AbstractConnectionFactory.createBareConnection(AbstractConnectionFactory.java:352) ~[spring-rabbit-1.7.4.RELEASE.jar:na]
	... 19 common frames omitted

2017-12-06 00:09:45.410  INFO 29129 --- [           main] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@76b10754: startup date [Wed Dec 06 00:09:42 ALMT 2017]; root of context hierarchy
2017-12-06 00:09:45.413  INFO 29129 --- [           main] o.s.c.support.DefaultLifecycleProcessor  : Stopping beans in phase 2147483647
2017-12-06 00:09:45.413  INFO 29129 --- [           main] o.s.a.r.l.SimpleMessageListenerContainer : Waiting for workers to finish.
2017-12-06 00:09:45.414  INFO 29129 --- [           main] o.s.a.r.l.SimpleMessageListenerContainer : Successfully waited for workers to finish.
2017-12-06 00:09:45.414  INFO 29129 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
2017-12-06 00:09:45.414  INFO 29129 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans

Process finished with exit code 1
