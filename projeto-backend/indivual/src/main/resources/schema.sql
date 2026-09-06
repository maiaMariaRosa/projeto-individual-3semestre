create table metricas
(
    idMetrica int primary key auto_increment,
    opcao      varchar(100)
);

create table usuario
(
    idUsuario  int primary key auto_increment,
    nickname   varchar(100),
    fk_metrica int,
    constraint fk_metrica
        foreign key(fk_metrica)
            references metricas(idMetrica)
);


create table resultados
(
    idResultado   int primary key auto_increment,
    personalidade varchar(50),
    descricao     varchar(200)
);

insert into metricas
values (1,'#'),
       (2,'Sim'),
       (3,'Já ouvi falar'),
       (4,'Nunca Assisti');

insert into resultados (personalidade, descricao)
values ('Pingu pescador',
        'Aventureiro e paciente, você gosta de explorar, enfrentar desafios e aproveitar cada momento no seu próprio ritmo.'),
       ('Pingu maluco',
        'Criativo, divertido e imprevisível, você transforma qualquer situação em uma aventura e nunca deixa a rotina dominar.'),
       ('Pinga Sonequinha',
        'Tranquilo e confortável, você valoriza o descanso, os momentos de paz e uma boa soneca sempre que pode.'),
       ('Pingu familiar',
        'Carinhoso e companheiro, você valoriza estar perto de quem ama e acredita que os melhores momentos são compartilhados.'),
       ('Pingu musical',
        'Sensível e expressivo, você encontra na música uma forma de se divertir, relaxar e dar ritmo aos seus momentos.');