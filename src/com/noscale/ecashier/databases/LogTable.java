package com.noscale.ecashier.databases;

import com.noscale.ecashier.utilities.connector.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by rizkikurniawan on 05/04/17.
 */
public class LogTable extends Database {

    @Override
    public long insertNewEntry(Object object) throws SQLException {
        return 0;
    }

    @Override
    public List<?> getAllEntries() {
        return null;
    }

    @Override
    public Object getObject(ResultSet result) {
        return null;
    }

}
