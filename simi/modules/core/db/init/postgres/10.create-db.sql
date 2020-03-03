-- begin SIMI_DATASET_LIST_PROPERTIES
create table SIMI_DATASET_LIST_PROPERTIES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VISIBLE boolean not null,
    FACADELAYER_ID uuid not null,
    DATASET_ID uuid not null,
    SORT integer not null,
    TRANSPARENCY integer,
    --
    primary key (ID)
)^
-- end SIMI_DATASET_LIST_PROPERTIES
-- begin SIMI_DATA_PRODUCT
create table SIMI_DATA_PRODUCT (
    ID uuid,
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
    REMARKS text,
    --
    primary key (ID)
)^
-- end SIMI_DATA_PRODUCT
-- begin SIMI_SINGLE_ACTOR_LIST_PROPERTIES
create table SIMI_SINGLE_ACTOR_LIST_PROPERTIES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VISIBLE boolean not null,
    PRODUCTSET_ID uuid not null,
    SINGLEACTOR_ID uuid not null,
    SORT integer not null,
    TRANSPARENCY integer,
    --
    primary key (ID)
)^
-- end SIMI_SINGLE_ACTOR_LIST_PROPERTIES
-- begin SIMI_SINGLE_ACTOR
create table SIMI_SINGLE_ACTOR (
    ID uuid,
    --
    IDENTIFIER text not null,
    --
    primary key (ID)
)^
-- end SIMI_SINGLE_ACTOR
-- begin SIMI_PRODUCT_SET
create table SIMI_PRODUCT_SET (
    ID uuid,
    --
    IDENTIFIER varchar(255) not null,
    --
    primary key (ID)
)^
-- end SIMI_PRODUCT_SET
-- begin SIMI_FACADE_LAYER
create table SIMI_FACADE_LAYER (
    ID uuid,
    --
    primary key (ID)
)^
-- end SIMI_FACADE_LAYER
-- begin SIMI_POSTGRES_DS
create table SIMI_POSTGRES_DS (
    ID uuid,
    --
    TABLENAME varchar(255) not null,
    IN_DATA_SERVICES boolean not null,
    DEF_TRANSPARENCY integer not null,
    --
    primary key (ID)
)^
-- end SIMI_POSTGRES_DS
