package com.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.micky.www.filedownlibrary.DownloadInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "DOWNLOAD_INFO".
*/
public class DownloadInfoDao extends AbstractDao<DownloadInfo, Long> {

    public static final String TABLENAME = "DOWNLOAD_INFO";

    /**
     * Properties of entity DownloadInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property LocalPath = new Property(1, String.class, "localPath", false, "local_path");
        public final static Property ContentLength = new Property(2, long.class, "contentLength", false, "content_length");
        public final static Property ReadLength = new Property(3, long.class, "readLength", false, "read_length");
        public final static Property Url = new Property(4, String.class, "url", false, "url");
        public final static Property IsComplete = new Property(5, boolean.class, "isComplete", false, "is_complete");
    }


    public DownloadInfoDao(DaoConfig config) {
        super(config);
    }
    
    public DownloadInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"DOWNLOAD_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"local_path\" TEXT," + // 1: localPath
                "\"content_length\" INTEGER NOT NULL ," + // 2: contentLength
                "\"read_length\" INTEGER NOT NULL ," + // 3: readLength
                "\"url\" TEXT," + // 4: url
                "\"is_complete\" INTEGER NOT NULL );"); // 5: isComplete
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"DOWNLOAD_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownloadInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String localPath = entity.getLocalPath();
        if (localPath != null) {
            stmt.bindString(2, localPath);
        }
        stmt.bindLong(3, entity.getContentLength());
        stmt.bindLong(4, entity.getReadLength());
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(5, url);
        }
        stmt.bindLong(6, entity.getIsComplete() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownloadInfo entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String localPath = entity.getLocalPath();
        if (localPath != null) {
            stmt.bindString(2, localPath);
        }
        stmt.bindLong(3, entity.getContentLength());
        stmt.bindLong(4, entity.getReadLength());
 
        String url = entity.getUrl();
        if (url != null) {
            stmt.bindString(5, url);
        }
        stmt.bindLong(6, entity.getIsComplete() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public DownloadInfo readEntity(Cursor cursor, int offset) {
        DownloadInfo entity = new DownloadInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // localPath
            cursor.getLong(offset + 2), // contentLength
            cursor.getLong(offset + 3), // readLength
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // url
            cursor.getShort(offset + 5) != 0 // isComplete
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownloadInfo entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLocalPath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setContentLength(cursor.getLong(offset + 2));
        entity.setReadLength(cursor.getLong(offset + 3));
        entity.setUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setIsComplete(cursor.getShort(offset + 5) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(DownloadInfo entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(DownloadInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DownloadInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}