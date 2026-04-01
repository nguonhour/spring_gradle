alter table products
add column user_id BIGINT null,
add constraint fk_user foreign key (user_id) references users (id) on delete set null;