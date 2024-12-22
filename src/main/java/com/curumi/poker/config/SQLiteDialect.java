package com.curumi.poker.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

public class SQLiteDialect extends Dialect {
    public SQLiteDialect() {
        registerColumnType(java.sql.Types.INTEGER, "integer");
        registerColumnType(java.sql.Types.VARCHAR, "text");
        registerColumnType(java.sql.Types.BLOB, "blob");

        registerFunction("lower", new StandardSQLFunction("lower", StandardBasicTypes.STRING));
    }

    @Override
    public boolean dropConstraints() {
        return false;
    }

    @Override
    public boolean hasAlterTable() {
        return false;
    }

    @Override
    public boolean supportsSequences() {
        return false;
    }

    @Override
    public boolean supportsLimitOffset() {
        return true;
    }

    @Override
    public boolean supportsLimit() {
        return true;
    }
}

