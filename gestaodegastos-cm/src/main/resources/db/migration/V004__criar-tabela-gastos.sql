CREATE TABLE IF NOT EXISTS gastos (
  id BIGINT NOT NULL AUTO_INCREMENT,
  descricao VARCHAR(70) NOT NULL,
  valor DECIMAL(10,2) NOT NULL,
  data DATETIME NOT NULL,
  usuario_id BIGINT NOT NULL,
  sistema_id BIGINT NOT NULL,
  categoria_id BIGINT,
  PRIMARY KEY (id)
)
ENGINE = InnoDB default charset=utf8;

alter table gastos add constraint fk_gastos_usuarios
foreign key (usuario_id) references usuarios (id);

alter table gastos add constraint fk_gastos_sistemas
foreign key (sistema_id) references sistemas (id);

alter table gastos add constraint fk_gastos_categorias
foreign key (categoria_id) references categorias (id);


