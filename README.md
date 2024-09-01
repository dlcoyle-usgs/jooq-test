# jOOQ demo forked from main project for personal use 

This is a jOOQ demo forked from main project for personal use and learning. 

This work is "non-contributing" in that I do not intend to contribute to or otherwise influence the main project.

This jOOQ demo should work with the [Sakila database](https://www.jooq.org/sakila).

The intention is to try it out with both the PostgreSQL and MySQL databases. 

This is *not* running in a [testcontainers](https://www.testcontainers.org) database instance, nor in docker.

It depends on the latest released version of jOOQ. A branch is available that works with a `SNAPSHOT` build of the dev version, which is available from:

- https://www.jooq.org/download/versions (prebuilt, if you're licensed)
- https://github.com/jOOQ/jOOQ (build yourself)

It includes a variety of feature combinations including:

- jOOQ features
  - of the jOOQ Professional and Enterprise Editions (in `jOOQ-demo-pro`)
  - of the jOOQ Open Source Edition (in `jOOQ-demo-oss`)
- Language support
  - Java (e.g. in `jOOQ-demo-java`)
 - Build support
  - Maven
  - Gradle (soon)
- Database change management integration
  - Flyway
  - Liquibase (soon)
- RDBMS support for any RDBMS currently supported in the [Sakila database](https://www.jooq.org/sakila). Currently:
  - PostgreSQL
  - MySQL

For more details, see https://github.com/dlcoyle-usgs/jooq-demo/issues/1

### Why Flyway / Liquibase?

Proper database change management is important, and jOOQ urges you to do it right up front in every new project. It will lead to:

- A cleaner database schema
- A more streamlined jOOQ code generation process (always 1. migrate, 2. generate, 3. integration test)
- Higher confidence when upgrading your production database, as that has already been tested (ideally, again, with testcontainers)

### Why not [XYZ]?

You might want to see an example of using [XYZ] in action, including

- Your favourite connection pool (e.g. Hikari)
- Your favourite application framework (e.g. Spring Boot, Quarkus, Micronaut, Dropwizard, etc.)
- Your favourite architecture style (e.g. monolith webapp, microservices, REST API, rich clients, etc.)

Below are some comments by the original author:

- All of these are interesting use-cases for jOOQ and trust us, jOOQ works everywhere. 
- All jOOQ needs is a JDBC `Connection` or `DataSource`, or an R2DBC `Connection` or `ConnectionFactory`. 
- That's it. That's all jOOQ needs to work. 
- And these things already work *everywhere*. 
- jOOQ doesn't make any assumptions about your architecture, nor does it have an opinion. 
- As such, these examples are *unnecessary*. 
- They are also very hard to maintain, because those third parties evolve constantly, making example code outdated. 
- Besides, there's a combinatorial explosion of using e.g. (Spring Boot with Hikari with Vaadin).

This demo project focuses only on jOOQ functionality.
