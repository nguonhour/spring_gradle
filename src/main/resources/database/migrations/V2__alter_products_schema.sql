alter table products
add column image_path text;

alter table products
add updated_at timestamp default current_timestamp on update current_timestamp;