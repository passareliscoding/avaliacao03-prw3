create or replace table consertos(
    id bigint not null auto_increment,
    data_entrada varchar(10) not null,
    data_saida varchar(10),
    nome_mecanico varchar(100) not null,
    anos_exp int,
    marca varchar(100) not null,
    modelo varchar(100) not null,
    ano int,

    primary key (id)

);