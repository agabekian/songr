# songR
git 


To run it locally with posgre db update
applicatio.properties paste the following: 

    spring.datasource.url=jdbc:postgresql://localhost:5432/songr
    spring.jpa.hibernate.dll-auto=update
    spring.jpa.generate-ddl=true

5432 is the default port used by postgre, followed by a name for db.

The app stores albums and songs information in postrgresql db.