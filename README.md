# library
Проект, библиотека, написан на Spring Framework, с использованием базы MySql

Данный проект использует

java jdk1.6.0_45
apache-tomcat-6.0.9
MySQL Server 5.5
apache-maven-3.2.3

При первом запуске проекта в модуле model в папке resources в файле datasource.properties
для того чтобы создались таблицы, нужно настройку указать
hibernate.hbm2ddl.auto=create, потом перевести в update, сейчас в настройках указана update.
