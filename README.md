# SpringBoot-FakeStoreApi-CartService
Building a Spring Boot Application for a Cart Service

## Requirements
- [JDK >= 8](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org)

## Running the application locally
- Fork this repository
- Clone this repository
```shell
git clone https://github.com/harshit4311/SpringBoot-FakeStoreApi-CartService.git
```
- Now, run:
```shell
mvn spring-boot:run
```
## After calling the necessary API's, paste the following in your URL Tab:

- **To view all products in the cart**
```shell
http://localhost:1111/carts/
```


- **To view a specific product of the cart:**
```shell
http://localhost:1111/carts/id

-Example (to view the 1st product):
http://localhost:1111/carts/1

-Example (to view the 2nd product):
http://localhost:1111/carts/2
```
