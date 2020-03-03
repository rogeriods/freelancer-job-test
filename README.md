# Copy to Clipboard
This is a sample from a project that I saw on freelancer.com where the user want a app that show a list of data in jquery datatable UI and when you click the current row send to clipboard in a JSON format.

In this project I used the JavaScript to transfer the current row to clipboard.

To run this app you must need to have a postgresql database.
The table to create it is just below.

```bash
-- public.ptl_message definition
-- Drop table
-- DROP TABLE public.ptl_message;

CREATE TABLE public.ptl_message (
	id serial NOT NULL,
	entity_type varchar(255) NULL,
	entity_nbr varchar(255) NULL,
	stat_code int2 NULL,
	outgoing_message text NULL,
	incoming_message text NULL,
	start_messaging_date_time timestamp NULL,
	end_messaging_date_time timestamp NULL,
	CONSTRAINT ptl_message_pkey PRIMARY KEY (id)
);
```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/maven-plugin/)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.5.RELEASE/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
