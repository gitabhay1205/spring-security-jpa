# spring-security-jpa
This is sample project for spring boot having securtiy with authentication and authorization based on role based access using JPA repository.

hit the endpoint in browser, login page will appear provided by spring-starter-security by default.

With /admin endpoint you can access both user and admin information
with /user endpoint you can access only user info not admin
with / endpoint does not need any login info.

CREATE TABLE `my_users_jpa2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `active` varchar(45) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `roles` varchar(45) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
)

columns(id	active password	roles	user_name) Values (1	TRUE	pass	ROLE_USER	user) and (2	TRUE	pass	ROLE_ADMIN	admin)






