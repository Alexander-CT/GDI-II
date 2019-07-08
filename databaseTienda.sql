
/*
  Creacion de Tablas para el sistema
*/
create table usuario(
cod_usu char(5) not null primary key,
cod_emp char(5) not null,
nom_usu varchar(20) null,
password varchar(20) null
)


go
create table categoria(
cod_cate char (5) not null primary key ,
nom_cate varchar(30) not null
)
go


create table producto(
cod_pro char(5) not null primary key,
nom_pro varchar(30) not null,
precio decimal(10,2) ,
stock int not null,
cod_cate char(5) not null,
cod_prov char(5) not null
)




go

create table proveedor(
cod_prov char(5) not null primary key,
nom_prov varchar(30)not null,
contacto varchar(15)null
)
go

create table cliente(
cod_cli char(5) not null primary key,
pat_cli varchar(20)not null,
mat_cli varchar(20)not null,
nom_cli varchar(20)not null,
dir_cli varchar(40)null,
sexo char(1)not null,
dni_ruc varchar(11)not null,
contacto varchar(15)null
)

go
create table empleado(
cod_emp char(5) not null primary key,
pat_emp varchar(20)not null,
mat_emp varchar(20)not null,
nom_emp varchar(20)not null,
dir_emp varchar(40)null,
contacto varchar(15)null,
fecha_nac date null
)


go
create table comprobante_pago(
cod_comprobante char(5) not null primary key,
tipo char(1)not null,
cod_cli char(5)null,
cod_emp char(5)null,
fecha date not null,
total decimal(10,2) not null
)
go



create table detalle_comprobante(
cod_comprobante char(5) not null,
cod_pro char(5) not null,
precio decimal(10,2) not null,
cant int not null
)

go


/*
	Agregando Relaciones entre tablas
*/
alter table usuario add constraint fk_empleado_usuario foreign key(cod_emp) references empleado(cod_emp)
alter table producto add constraint fk_categoria_producto foreign key(cod_cate) references categoria(cod_cate)
alter table producto add constraint fk_proveedor_producto foreign key(cod_prov) references proveedor(cod_prov)
alter table comprobante_pago add constraint fk_cliente_comprobantepago foreign key(cod_cli) references cliente(cod_cli)
alter table comprobante_pago add constraint fk_empleado_comprobantepago foreign key(cod_emp) references empleado(cod_emp)
alter table detalle_comprobante add constraint fk_comprobante_detalle foreign key(cod_comprobante) references comprobante_pago(cod_comprobante)
alter table detalle_comprobante add constraint fk_producto_detalle foreign key(cod_pro) references producto(cod_pro)
go



select*from detalle_comprobante

select*from producto
select*from comprobante_pago
select*from detalle_comprobante
select*from empleado
select*from categoria



delete from categoria where cod_cate='CAT09'
