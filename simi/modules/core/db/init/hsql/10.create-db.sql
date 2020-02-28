-- begin SIMI_DATA_PRODUCT
create table SIMI_DATA_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    IN_WGC boolean not null,
    TITLE varchar(255),
    REMARKS longvarchar,
    IDENTIFIER varchar(255) not null,
    --
    primary key (ID)
)^
-- end SIMI_DATA_PRODUCT
-- begin SIMI_SINGLE_ACTOR
create table SIMI_SINGLE_ACTOR (
    ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end SIMI_SINGLE_ACTOR
-- begin SIMI_FACADE_LAYER
create table SIMI_FACADE_LAYER (
    ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end SIMI_FACADE_LAYER
-- begin SIMI_POSTGRES_DS
create table SIMI_POSTGRES_DS (
    ID varchar(36) not null,
    --
    TABLENAME varchar(255) not null,
    IN_DATA_SERVICES boolean not null,
    DEF_TRANSPARENCY integer not null,
    --
    primary key (ID)
)^
-- end SIMI_POSTGRES_DS
