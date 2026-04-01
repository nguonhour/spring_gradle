create table
    users (
        id BIGINT primary key auto_increment,
        username varchar(200) not null unique,
        email varchar(100) not null unique,
        password varchar(255) not null,
        role varchar(50) not null default 'USER',
        created_at timestamp default current_timestamp,
        updated_at timestamp default current_timestamp on update current_timestamp
    );