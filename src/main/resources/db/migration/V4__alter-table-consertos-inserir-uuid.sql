alter table consertos
add column uuid varchar(36) not null default random_uuid();

update consertos
set uuid = random_uuid()
where uuid is null;

alter table consertos
add constraint uk_consertos_uuid unique (uuid);