create
database projeto_individual;

use
projeto_individual;

create table metricas
(
    id    int primary key auto_increment,
    opcao varchar(100)
);

create table usuario
(
    id         int primary key auto_increment,
    nickname   varchar(100),
    jaAssistiu varchar(100)
);

create table resultados
(
    id            int primary key auto_increment,
    personalidade varchar(50),
    descricao     varchar(200)
);

insert into metricas (opcao)
values ("Sim"),
       ("Já ouvi falar"),
       ("Nunca Assisti");

insert into resultados (personalidade, descricao)
values ("Pingu pescador",
        "Aventureiro e paciente, você gosta de explorar, enfrentar desafios e aproveitar cada momento no seu próprio ritmo."),
       ("Pingu maluco",
        "Criativo, divertido e imprevisível, você transforma qualquer situação em uma aventura e nunca deixa a rotina dominar."),
       ("Pinga Sonequinha",
        "Tranquilo e confortável, você valoriza o descanso, os momentos de paz e uma boa soneca sempre que pode."),
       ("Pingu familiar",
        "Carinhoso e companheiro, você valoriza estar perto de quem ama e acredita que os melhores momentos são compartilhados."),
       ("Pingu musical",
        "Sensível e expressivo, você encontra na música uma forma de se divertir, relaxar e dar ritmo aos seus momentos.");