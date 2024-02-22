create schema demo;

use demo;

create table user
(
    id   bigint primary key,
    name varchar(32) not null
)