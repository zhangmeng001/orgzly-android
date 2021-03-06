package com.orgzly.android.provider.models;

import android.provider.BaseColumns;

/**
 *
 */
public class DbVersionedRook implements DbVersionedRookColumns, BaseColumns {
    public static final String TABLE = "versioned_rooks";

    public static final String[] CREATE_SQL = new String[] {
            "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
            _ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            ROOK_ID + " INTEGER," +
            ROOK_MTIME + " INTEGER," +
            ROOK_REVISION + ")"
    };

    public static final String DROP_SQL = "DROP TABLE IF EXISTS " + TABLE;
}
