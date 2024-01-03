CREATE TABLE consulta {
    id int auto_increment primary key,
    id_paciente int,
    id_medico int,
    FOREIGN KEY (id_paciente) REFERENCES paciente (id),
    FOREIGN KEY (id_medico) REFERENCES medico (id),
    data_consulta datetime not null, 
    diagnostico varchar(150) not null,
    prescricao varchar(150) not null   
}