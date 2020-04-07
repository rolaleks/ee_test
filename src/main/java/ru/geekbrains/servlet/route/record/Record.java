package ru.geekbrains.servlet.route.record;

import javax.enterprise.inject.spi.CDI;



public abstract class Record {

    protected boolean isNewRecord = true;


    public boolean save() {
        if (this.isNewRecord) {
            return insert();
        } else {
            return update();
        }
    }

    protected abstract boolean insert();

    protected abstract boolean update();



    public static DbConnection getDbConnection() {


        return CDI.current().select(DbConnection.class).get();
    }


    public boolean isNewRecord() {
        return isNewRecord;
    }


}
