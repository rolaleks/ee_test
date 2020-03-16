------------------
Установка сервера
------------------

D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\bin>standalone.bat
Calling "D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\bin\standalone.conf.bat"
Setting JAVA property to "C:\Program Files\Java\jdk-12.0.2\bin\java"
===============================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: "D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3"

  JAVA: "C:\Program Files\Java\jdk-12.0.2\bin\java"

  JAVA_OPTS: "-Dprogram.name=standalone.bat -Xms64M -Xmx512M -XX:MetaspaceSize=96M -XX:MaxMetaspaceSize=256m -Djava.net.preferIPv4Stack=true -Djboss.modules.system.pkgs=org.jboss.byteman  --add-exports=java.base/sun.nio.ch=ALL-UNNAMED --add-exports=jdk.unsupported/sun.misc=ALL-UNNAMED --add-exports=jdk.unsupported/sun.reflect=ALL-UNNAMED"

===============================================================================

21:17:10,311 INFO  [org.jboss.modules] (main) JBoss Modules version 1.10.0.Final
21:17:13,256 INFO  [org.jboss.msc] (main) JBoss MSC version 1.4.11.Final
21:17:13,268 INFO  [org.jboss.threads] (main) JBoss Threads version 2.3.3.Final
21:17:13,420 INFO  [org.jboss.as] (MSC service thread 1-2) WFLYSRV0049: WildFly Full 19.0.0.Beta3 (WildFly Core 11.0.0.Beta10) starting
21:17:14,681 INFO  [org.wildfly.security] (ServerService Thread Pool -- 28) ELY00001: WildFly Elytron version 1.11.2.Final
21:17:19,554 INFO  [org.jboss.as.controller.management-deprecated] (Controller Boot Thread) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/core-service=management/management-interface=http-interface' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
21:17:19,600 INFO  [org.jboss.as.controller.management-deprecated] (ServerService Thread Pool -- 32) WFLYCTL0028: Attribute 'security-realm' in the resource at address '/subsystem=undertow/server=default-server/https-listener=https' is deprecated, and may be removed in a future version. See the attribute description in the output of the read-resource-description operation to learn more about the deprecation.
21:17:19,710 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0039: Creating http management service using socket-binding (management-http)
21:17:19,769 INFO  [org.xnio] (MSC service thread 1-1) XNIO version 3.7.7.Final
21:17:19,777 INFO  [org.xnio.nio] (MSC service thread 1-1) XNIO NIO Implementation Version 3.7.7.Final
21:17:19,861 INFO  [org.jboss.remoting] (MSC service thread 1-6) JBoss Remoting version 5.0.17.Final
21:17:19,943 INFO  [org.jboss.as.security] (ServerService Thread Pool -- 72) WFLYSEC0002: Activating Security Subsystem
21:17:19,948 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 52) WFLYCLINF0001: Activating Infinispan subsystem.
21:17:19,943 INFO  [org.wildfly.extension.microprofile.config.smallrye._private] (ServerService Thread Pool -- 61) WFLYCONF0001: Activating WildFly MicroProfile Config Subsystem
21:17:19,984 INFO  [org.jboss.as.naming] (ServerService Thread Pool -- 66) WFLYNAM0001: Activating Naming Subsystem
21:17:20,023 INFO  [org.wildfly.extension.microprofile.opentracing] (ServerService Thread Pool -- 65) WFLYTRACEXT0001: Activating MicroProfile OpenTracing Subsystem
21:17:20,019 INFO  [org.jboss.as.webservices] (ServerService Thread Pool -- 76) WFLYWS0002: Activating WebServices Extension
21:17:20,017 INFO  [org.jboss.as.connector] (MSC service thread 1-7) WFLYJCA0009: Starting JCA Subsystem (WildFly/IronJacamar 1.4.20.Final)
21:17:20,000 WARN  [org.jboss.as.txn] (ServerService Thread Pool -- 74) WFLYTX0013: The node-identifier attribute on the /subsystem=transactions is set to the default value. This is a danger for environments running multiple servers. Please make sure the attribute value is unique.
21:17:19,966 INFO  [org.jboss.as.jsf] (ServerService Thread Pool -- 59) WFLYJSF0007: Activated the following JSF Implementations: [main]
21:17:19,988 INFO  [org.wildfly.extension.microprofile.jwt.smallrye._private] (ServerService Thread Pool -- 63) WFLYJWT0001: Activating WildFly MicroProfile JWT Subsystem
21:17:19,988 INFO  [org.wildfly.extension.microprofile.metrics.smallrye] (ServerService Thread Pool -- 64) WFLYMETRICS0001: Activating Eclipse MicroProfile Metrics Subsystem
21:17:19,958 INFO  [org.jboss.as.security] (MSC service thread 1-1) WFLYSEC0001: Current PicketBox version=5.0.3.Final
21:17:19,986 INFO  [org.wildfly.extension.microprofile.health.smallrye] (ServerService Thread Pool -- 62) WFLYHEALTH0001: Activating Eclipse MicroProfile Health Subsystem
21:17:20,030 INFO  [org.wildfly.extension.io] (ServerService Thread Pool -- 53) WFLYIO001: Worker 'default' has auto-configured to 8 IO threads with 64 max task threads based on your 4 available processors
21:17:20,262 INFO  [org.jboss.as.connector.subsystems.datasources] (ServerService Thread Pool -- 44) WFLYJCA0004: Deploying JDBC-compliant driver class org.h2.Driver (version 1.4)
21:17:20,338 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0003: Undertow 2.0.29.Final starting
21:17:20,362 INFO  [org.jboss.as.connector.deployers.jdbc] (MSC service thread 1-1) WFLYJCA0018: Started Driver service with driver-name = h2
21:17:20,566 INFO  [org.jboss.as.naming] (MSC service thread 1-3) WFLYNAM0003: Starting Naming Service
21:17:20,694 INFO  [org.jboss.as.mail.extension] (MSC service thread 1-1) WFLYMAIL0001: Bound mail session [java:jboss/mail/Default]
21:17:20,503 INFO  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0481: Strict pool slsb-strict-max-pool is using a max instance size of 64 (per class), which is derived from thread worker pool sizing.
21:17:20,502 INFO  [org.jboss.as.ejb3] (MSC service thread 1-5) WFLYEJB0482: Strict pool mdb-strict-max-pool is using a max instance size of 16 (per class), which is derived from the number of CPUs on this host.
21:17:20,778 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0012: Started server default-server.
21:17:20,434 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 75) WFLYUT0014: Creating file handler for path 'D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3/welcome-content' with options [directory-listing: 'false', follow-symlink: 'false', case-sensitive: 'true', safe-symlink-paths: '[]']
21:17:20,810 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-5) WFLYUT0018: Host default-host starting
21:17:20,950 INFO  [org.jboss.as.jaxrs] (ServerService Thread Pool -- 54) WFLYRS0016: RESTEasy version 3.11.0.Final
21:17:21,033 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0006: Undertow HTTP listener default listening on 127.0.0.1:8080
21:17:21,096 INFO  [org.jboss.as.ejb3] (MSC service thread 1-8) WFLYEJB0493: EJB subsystem suspension complete
21:17:21,159 INFO  [org.jboss.as.connector.subsystems.datasources] (MSC service thread 1-4) WFLYJCA0001: Bound data source [java:jboss/datasources/ExampleDS]
21:17:24,360 INFO  [org.jboss.as.patching] (MSC service thread 1-1) WFLYPAT0050: WildFly Full cumulative patch ID is: base, one-off patches include: none
21:17:24,381 WARN  [org.jboss.as.domain.management.security] (MSC service thread 1-1) WFLYDM0111: Keystore D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\standalone\configuration\application.keystore not found, it will be auto generated on first use with a self signed certificate for host localhost
21:17:24,426 INFO  [org.jboss.as.server.deployment.scanner] (MSC service thread 1-7) WFLYDS0013: Started FileSystemDeploymentService for directory D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\standalone\deployments
21:17:24,569 INFO  [org.wildfly.extension.undertow] (MSC service thread 1-7) WFLYUT0006: Undertow HTTPS listener https listening on 127.0.0.1:8443
21:17:25,452 INFO  [org.jboss.ws.common.management] (MSC service thread 1-7) JBWS022052: Starting JBossWS 5.4.1.Final (Apache CXF 3.3.5)
21:17:25,656 INFO  [org.jboss.as.server] (Controller Boot Thread) WFLYSRV0212: Resuming server
21:17:25,660 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0060: Http management interface listening on http://127.0.0.1:9990/management
21:17:25,661 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0051: Admin console listening on http://127.0.0.1:9990
21:17:25,662 INFO  [org.jboss.as] (Controller Boot Thread) WFLYSRV0025: WildFly Full 19.0.0.Beta3 (WildFly Core 11.0.0.Beta10) started in 20526ms - Started 316 of 582 services (374 services are lazy, passive or on-demand)


------------------
Добавление админа
------------------


D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\bin>add-user.bat

What type of user do you wish to add?
 a) Management User (mgmt-users.properties)
 b) Application User (application-users.properties)
(a): a

Enter the details of the new user to add.
Using realm 'ManagementRealm' as discovered from the existing property files.
Username : admin
User 'admin' already exists and is disabled, would you like to...
 a) Update the existing user password and roles
 b) Enable the existing user
 c) Type a new username
(a): a
Password recommendations are listed below. To modify these restrictions edit the add-user.properties configuration file.
 - The password should be different from the username
 - The password should not be one of the following restricted values {root, admin, administrator}
 - The password should contain at least 8 characters, 1 alphabetic character(s), 1 digit(s), 1 non-alphanumeric symbol(s)
Password :
WFLYDM0099: Password should have at least 8 characters!
Are you sure you want to use the password entered yes/no? y
Re-enter Password :
What groups do you want this user to belong to? (Please enter a comma separated list, or leave blank for none)[  ]: admin
Updated user 'admin' to file 'D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\standalone\configuration\mgmt-users.properties'
Updated user 'admin' to file 'D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\domain\configuration\mgmt-users.properties'
Updated user 'admin' with groups admin to file 'D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\standalone\configuration\mgmt-groups.properties'
Updated user 'admin' with groups admin to file 'D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\domain\configuration\mgmt-groups.properties'
Is this new user going to be used for one AS process to connect to another AS process?
e.g. for a slave host controller connecting to the master or for a Remoting connection for server to server EJB calls.
yes/no? yes
To represent the user add the following to the server-identities definition <secret value="MTIz" />
Для продолжения нажмите любую клавишу . . .

D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\bin>



------------------
Деплой проекта
------------------


21:32:42,731 INFO  [org.jboss.as.repository] (management-handler-thread - 1) WFLYDR0001: Content added at location D:\geekbrains\Java EE\wildfly-19.0.0.Beta3\wildfly-19.0.0.Beta3\standalone\data\content\84\9cac70c7699ab6075268a3f8e4fb02864cb998\content
21:32:42,812 INFO  [org.jboss.as.server.deployment] (MSC service thread 1-6) WFLYSRV0027: Starting deployment of "javaee.war" (runtime-name: "javaee.war")
21:32:45,703 INFO  [org.infinispan.factories.GlobalComponentRegistry] (MSC service thread 1-7) ISPN000128: Infinispan version: Infinispan 'Infinity Minus ONE +2' 9.4.18.Final
21:32:46,332 INFO  [org.jboss.as.clustering.infinispan] (ServerService Thread Pool -- 39) WFLYCLINF0002: Started client-mappings cache from ejb container
21:32:46,527 INFO  [org.wildfly.extension.undertow] (ServerService Thread Pool -- 81) WFLYUT0021: Registered web context: '/javaee' for server 'default-server'
21:32:46,649 INFO  [org.jboss.as.server] (management-handler-thread - 1) WFLYSRV0010: Deployed "javaee.war" (runtime-name : "javaee.war")

