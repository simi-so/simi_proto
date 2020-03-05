alter table SIMI_SINGLE_ACTOR add column TITLE varchar(255) ;
alter table SIMI_SINGLE_ACTOR add column DELETED_BY varchar(50) ;
alter table SIMI_SINGLE_ACTOR add column REMARKS text ;
alter table SIMI_SINGLE_ACTOR add column IN_WGC boolean ^
update SIMI_SINGLE_ACTOR set IN_WGC = false where IN_WGC is null ;
alter table SIMI_SINGLE_ACTOR alter column IN_WGC set not null ;
alter table SIMI_SINGLE_ACTOR add column UPDATE_TS timestamp ;
alter table SIMI_SINGLE_ACTOR add column VERSION integer ^
update SIMI_SINGLE_ACTOR set VERSION = 0 where VERSION is null ;
alter table SIMI_SINGLE_ACTOR alter column VERSION set not null ;
alter table SIMI_SINGLE_ACTOR add column CREATE_TS timestamp ;
alter table SIMI_SINGLE_ACTOR add column IDENTIFIER varchar(255) ^
update SIMI_SINGLE_ACTOR set IDENTIFIER = '' where IDENTIFIER is null ;
alter table SIMI_SINGLE_ACTOR alter column IDENTIFIER set not null ;
alter table SIMI_SINGLE_ACTOR add column UPDATED_BY varchar(50) ;
alter table SIMI_SINGLE_ACTOR add column DELETE_TS timestamp ;
alter table SIMI_SINGLE_ACTOR add column DTYPE varchar(31) ;
alter table SIMI_SINGLE_ACTOR add column CREATED_BY varchar(50) ;
