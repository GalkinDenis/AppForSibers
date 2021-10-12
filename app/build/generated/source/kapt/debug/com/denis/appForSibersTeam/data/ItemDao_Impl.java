package com.denis.appForSibersTeam.data;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItemDao_Impl implements ItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Pokes> __insertionAdapterOfPokes;

  private final SharedSQLiteStatement __preparedStmtOfClearTable;

  public ItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokes = new EntityInsertionAdapter<Pokes>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Pokes` (`id`,`avatar`,`name`,`ability`,`weight`,`height`,`types`,`hp`,`attack`,`defence`,`speed`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pokes value) {
        stmt.bindLong(1, value.getId());
        if (value.getAvatar() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAvatar());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getAbility() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAbility());
        }
        stmt.bindLong(5, value.getWeight());
        stmt.bindLong(6, value.getHeight());
        if (value.getTypes() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getTypes());
        }
        stmt.bindLong(8, value.getHp());
        stmt.bindLong(9, value.getAttack());
        stmt.bindLong(10, value.getDefence());
        stmt.bindLong(11, value.getSpeed());
      }
    };
    this.__preparedStmtOfClearTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM Pokes";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final Pokes item, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPokes.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearTable(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearTable.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearTable.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<Pokes>> getListOfPokes() {
    final String _sql = "SELECT * from Pokes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Pokes"}, new Callable<List<Pokes>>() {
      @Override
      public List<Pokes> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfAvatar = CursorUtil.getColumnIndexOrThrow(_cursor, "avatar");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfAbility = CursorUtil.getColumnIndexOrThrow(_cursor, "ability");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfHeight = CursorUtil.getColumnIndexOrThrow(_cursor, "height");
          final int _cursorIndexOfTypes = CursorUtil.getColumnIndexOrThrow(_cursor, "types");
          final int _cursorIndexOfHp = CursorUtil.getColumnIndexOrThrow(_cursor, "hp");
          final int _cursorIndexOfAttack = CursorUtil.getColumnIndexOrThrow(_cursor, "attack");
          final int _cursorIndexOfDefence = CursorUtil.getColumnIndexOrThrow(_cursor, "defence");
          final int _cursorIndexOfSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "speed");
          final List<Pokes> _result = new ArrayList<Pokes>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Pokes _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpAvatar;
            if (_cursor.isNull(_cursorIndexOfAvatar)) {
              _tmpAvatar = null;
            } else {
              _tmpAvatar = _cursor.getString(_cursorIndexOfAvatar);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpAbility;
            if (_cursor.isNull(_cursorIndexOfAbility)) {
              _tmpAbility = null;
            } else {
              _tmpAbility = _cursor.getString(_cursorIndexOfAbility);
            }
            final long _tmpWeight;
            _tmpWeight = _cursor.getLong(_cursorIndexOfWeight);
            final long _tmpHeight;
            _tmpHeight = _cursor.getLong(_cursorIndexOfHeight);
            final String _tmpTypes;
            if (_cursor.isNull(_cursorIndexOfTypes)) {
              _tmpTypes = null;
            } else {
              _tmpTypes = _cursor.getString(_cursorIndexOfTypes);
            }
            final long _tmpHp;
            _tmpHp = _cursor.getLong(_cursorIndexOfHp);
            final long _tmpAttack;
            _tmpAttack = _cursor.getLong(_cursorIndexOfAttack);
            final long _tmpDefence;
            _tmpDefence = _cursor.getLong(_cursorIndexOfDefence);
            final long _tmpSpeed;
            _tmpSpeed = _cursor.getLong(_cursorIndexOfSpeed);
            _item = new Pokes(_tmpId,_tmpAvatar,_tmpName,_tmpAbility,_tmpWeight,_tmpHeight,_tmpTypes,_tmpHp,_tmpAttack,_tmpDefence,_tmpSpeed);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
