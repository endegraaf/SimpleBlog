/*
	Set the initial state: remove existing
	
	from the CLI:
	flyway -baselineOnMigrate=true -url=jdbc:mysql://localhost/ -schemas=blog -user=bloguser -password=blogpassword migrate
	
	extra possible argument: -locations=filesystem:/path/to/scrips/
	
	DROP SCHEMA IF EXISTS `blog` ;
	CREATE SCHEMA IF NOT EXISTS `blog` COLLATE utf8_general_ci ;*/
/* 
	Create the contacts table  
*/
DROP TABLE IF EXISTS Blog;

CREATE TABLE Blog (
    blog_id            bigint(20) not null auto_increment,
    blog_content_lable varchar(255) not null,
    blog_content       varchar(255) not null,
    created_date       date not null,
    modified_date      date,
    constraint  pk_blog primary key (blog_id)
);


create table Role (
 role_id bigint(20) not null auto_increment,
 name varchar(255) not null,
 constraint pk_role primary key (role_id)
);

create table Person (
 person_id bigint(20) not null auto_increment,
 role_id bigint(20) not null,
 username varchar(255),
 password varchar(255),
 constraint pk_person primary key (person_id)
);



alter table Person add(constraint fk_person_role_id
foreign key (role_id)
references Role(role_id));

insert into Role( name) values( 'ROLE_ADMIN');
insert into Role( name) values( 'ROLE_USER');

 /* password=admin  */
insert into Person( role_id,username,password) values( '1','admin', '0DPiKuNIrrVmD8IUCuw1hQxNqZc=');

/* password=user  */
insert into Person( role_id,username,password) values( '2','user', 'Et6pb+wgWTVmq3VpLJlJWWgzrck=');

