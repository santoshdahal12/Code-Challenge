Its a Spring Boot App.

It has Controller, Service.

It has the test classes in src/test/java

the classes can be found in src/main/resources.

The view pages in src/main/webapp/WEB-INF/jsp



The controller is throwing json data.

The ajax call is handled RESTfully by controller.

Please run it as Spring Boot App and get the index page by hitting the url localhost:8080

give the input to check if there are  tensubstring below that number. It return empty json list, if there is no tensubstring , while it returns whole list and its displayed if there are any.

It also checks the double cotted "212" or"abc213" type of strings and uses regular expression to match them. If it gets the pure number inside double cott, it checks and return the same number if its tensubstring otherwise it returns empty json list.

It fulfils all the given example

"0"--->return empty list
"91"---> returns 91
"4567ASc"---> returns empty list
100---> returns the list with all tensubstring less than 100.

