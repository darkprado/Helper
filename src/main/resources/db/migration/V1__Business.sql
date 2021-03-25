create table if not exists business
(
    id              varchar not null primary key,
    description     varchar (255) not null,
    created         timestamp,
    modified        timestamp,
    completed       boolean
);