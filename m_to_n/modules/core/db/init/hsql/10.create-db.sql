-- begin MTON_PET
create table MTON_PET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end MTON_PET
-- begin MTON_INSURANCE_COMPANY
create table MTON_INSURANCE_COMPANY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end MTON_INSURANCE_COMPANY
-- begin MTON_INSURANCE_MEMBERSHIP
create table MTON_INSURANCE_MEMBERSHIP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    VALID_FROM timestamp not null,
    VALID_UNTIL timestamp,
    PET_ID varchar(36),
    INSURANCE_COMPANY_ID varchar(36),
    --
    primary key (ID)
)^
-- end MTON_INSURANCE_MEMBERSHIP
