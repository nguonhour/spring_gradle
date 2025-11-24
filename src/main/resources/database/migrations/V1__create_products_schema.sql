create table
    products (
        id bigint auto_increment primary key,
        name varchar(255) not null,
        description text,
        price decimal(10, 2) not null,
        created_at timestamp default current_timestamp
    );