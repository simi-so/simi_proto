alter table SIMI_PRODUCT_SET add column DELETED_BY varchar(50) ;
alter table SIMI_PRODUCT_SET add column TITLE varchar(255) ;
alter table SIMI_PRODUCT_SET add column REMARKS text ;
alter table SIMI_PRODUCT_SET add column IN_WGC boolean ^
update SIMI_PRODUCT_SET set IN_WGC = false where IN_WGC is null ;
alter table SIMI_PRODUCT_SET alter column IN_WGC set not null ;
alter table SIMI_PRODUCT_SET add column UPDATE_TS timestamp ;
alter table SIMI_PRODUCT_SET add column DELETE_TS timestamp ;
alter table SIMI_PRODUCT_SET add column UPDATED_BY varchar(50) ;
alter table SIMI_PRODUCT_SET add column CREATED_BY varchar(50) ;
alter table SIMI_PRODUCT_SET add column CREATE_TS timestamp ;
alter table SIMI_PRODUCT_SET add column VERSION integer ^
update SIMI_PRODUCT_SET set VERSION = 0 where VERSION is null ;
alter table SIMI_PRODUCT_SET alter column VERSION set not null ;
