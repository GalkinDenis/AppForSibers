package com.denis.appForSibersTeam.data;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItemRoomDatabase_Impl extends ItemRoomDatabase {
  private volatile ItemDao _itemDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Pokes` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `avatar` TEXT NOT NULL, `name` TEXT NOT NULL, `ability` TEXT NOT NULL, `weight` INTEGER NOT NULL, `height` INTEGER NOT NULL, `types` TEXT NOT NULL, `hp` INTEGER NOT NULL, `attack` INTEGER NOT NULL, `defence` INTEGER NOT NULL, `speed` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3a40acfa972757aa20716946946239c1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Pokes`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPokes = new HashMap<String, TableInfo.Column>(11);
        _columnsPokes.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("avatar", new TableInfo.Column("avatar", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("ability", new TableInfo.Column("ability", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("weight", new TableInfo.Column("weight", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("height", new TableInfo.Column("height", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("types", new TableInfo.Column("types", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("hp", new TableInfo.Column("hp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("attack", new TableInfo.Column("attack", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("defence", new TableInfo.Column("defence", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPokes.put("speed", new TableInfo.Column("speed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPokes = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPokes = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPokes = new TableInfo("Pokes", _columnsPokes, _foreignKeysPokes, _indicesPokes);
        final TableInfo _existingPokes = TableInfo.read(_db, "Pokes");
        if (! _infoPokes.equals(_existingPokes)) {
          return new RoomOpenHelper.ValidationResult(false, "Pokes(com.denis.appForSibersTeam.data.Pokes).\n"
                  + " Expected:\n" + _infoPokes + "\n"
                  + " Found:\n" + _existingPokes);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3a40acfa972757aa20716946946239c1", "f0ec4e28687c6a128693ea350259c754");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Pokes");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Pokes`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(ItemDao.class, ItemDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public ItemDao itemDao() {
    if (_itemDao != null) {
      return _itemDao;
    } else {
      synchronized(this) {
        if(_itemDao == null) {
          _itemDao = new ItemDao_Impl(this);
        }
        return _itemDao;
      }
    }
  }
}
