## Hello World project

This hello world application is a very simple Spring app that displays a Hello World message.

However, upon deploying in Wildfly, the following stacktrace is thrown:

```
23:50:12,125 ERROR [org.jboss.msc.service.fail] (MSC service thread 1-6) MSC000001: Failed to start service jboss.undertow.deployment.default-host."/hello-world-1.0.0-SNAPSHOT": org.jboss.msc.service.StartException in service jboss.undertow.deployment.default-host."/hello-world-1.0.0-SNAPSHOT": Failed to start service
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.run(ServiceControllerImpl.java:1900) [jboss-msc-1.2.0.Beta2.jar:1.2.0.Beta2]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145) [rt.jar:1.7.0_21]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615) [rt.jar:1.7.0_21]
	at java.lang.Thread.run(Thread.java:722) [rt.jar:1.7.0_21]
Caused by: java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:819) [rt.jar:1.7.0_21]
	at java.util.ArrayList$Itr.next(ArrayList.java:791) [rt.jar:1.7.0_21]
	at java.util.Collections$UnmodifiableCollection$1.next(Collections.java:1067) [rt.jar:1.7.0_21]
	at io.undertow.servlet.core.DeploymentManagerImpl.start(DeploymentManagerImpl.java:414)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentService.startContext(UndertowDeploymentService.java:87)
	at org.wildfly.extension.undertow.deployment.UndertowDeploymentService.start(UndertowDeploymentService.java:71)
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.startService(ServiceControllerImpl.java:1944) [jboss-msc-1.2.0.Beta2.jar:1.2.0.Beta2]
	at org.jboss.msc.service.ServiceControllerImpl$StartTask.run(ServiceControllerImpl.java:1877) [jboss-msc-1.2.0.Beta2.jar:1.2.0.Beta2]
	... 3 more
```


