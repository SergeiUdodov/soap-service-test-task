FROM quay.io/wildfly/wildfly:latest-jdk17
COPY target/quadratic-equation-soap-service.war /opt/jboss/wildfly/standalone/deployments/
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0", "-c","standalone-full.xml"]
