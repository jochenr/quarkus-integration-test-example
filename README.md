# quarkus-integration-test-example Project


## this works (with IT, because \<skipITs\>false\</skipITs\>):
mvn clean install


## this does not work:

1st terminal window  
mvn quarkus:dev

2nd terminal window  
mvn verify -Dquarkus.http.test-host=localhost -Dquarkus.http.test-port=8080

