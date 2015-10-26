import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class brl
  extends SQLiteOpenHelper
{
  brl(brk parambrk, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  private void a(SQLiteDatabase paramSQLiteDatabase)
  {
    int i = 0;
    Set localSet = b(paramSQLiteDatabase, "properties");
    while (i < 6)
    {
      paramSQLiteDatabase = new String[] { "app_uid", "cid", "tid", "params", "adid", "hits_count" }[i];
      if (!localSet.remove(paramSQLiteDatabase)) {
        throw new SQLiteException("Database properties is missing required column: " + paramSQLiteDatabase);
      }
      i++;
    }
    if (!localSet.isEmpty()) {
      throw new SQLiteException("Database properties table has extra columns");
    }
  }
  
  /* Error */
  private boolean a(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_1
    //   3: ldc 68
    //   5: iconst_1
    //   6: anewarray 23	java/lang/String
    //   9: dup
    //   10: iconst_0
    //   11: ldc 70
    //   13: aastore
    //   14: ldc 72
    //   16: iconst_1
    //   17: anewarray 23	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_2
    //   23: aastore
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 78	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_1
    //   31: aload_1
    //   32: astore_3
    //   33: aload_3
    //   34: astore_1
    //   35: aload_3
    //   36: invokeinterface 83 1 0
    //   41: istore 5
    //   43: iload 5
    //   45: istore 6
    //   47: aload_3
    //   48: ifnull +13 -> 61
    //   51: aload_3
    //   52: invokeinterface 87 1 0
    //   57: iload 5
    //   59: istore 6
    //   61: iload 6
    //   63: ireturn
    //   64: astore 4
    //   66: aconst_null
    //   67: astore_3
    //   68: aload_3
    //   69: astore_1
    //   70: aload_0
    //   71: getfield 10	brl:a	Lbrk;
    //   74: ldc 89
    //   76: aload_2
    //   77: aload 4
    //   79: invokevirtual 95	brk:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   82: aload_3
    //   83: ifnull +9 -> 92
    //   86: aload_3
    //   87: invokeinterface 87 1 0
    //   92: iconst_0
    //   93: istore 6
    //   95: goto -34 -> 61
    //   98: astore_2
    //   99: aload_3
    //   100: astore_1
    //   101: aload_1
    //   102: ifnull +9 -> 111
    //   105: aload_1
    //   106: invokeinterface 87 1 0
    //   111: aload_2
    //   112: athrow
    //   113: astore_2
    //   114: goto -13 -> 101
    //   117: astore 4
    //   119: goto -51 -> 68
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	brl
    //   0	122	1	paramSQLiteDatabase	SQLiteDatabase
    //   0	122	2	paramString	String
    //   1	99	3	localSQLiteDatabase	SQLiteDatabase
    //   64	14	4	localSQLiteException1	SQLiteException
    //   117	1	4	localSQLiteException2	SQLiteException
    //   41	17	5	bool1	boolean
    //   45	49	6	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	31	64	android/database/sqlite/SQLiteException
    //   2	31	98	finally
    //   35	43	113	finally
    //   70	82	113	finally
    //   35	43	117	android/database/sqlite/SQLiteException
  }
  
  private static Set b(SQLiteDatabase paramSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    paramSQLiteDatabase = paramSQLiteDatabase.rawQuery("SELECT * FROM " + paramString + " LIMIT 0", null);
    try
    {
      paramString = paramSQLiteDatabase.getColumnNames();
      for (int i = 0; i < paramString.length; i++) {
        localHashSet.add(paramString[i]);
      }
      return localHashSet;
    }
    finally
    {
      paramSQLiteDatabase.close();
    }
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    if (!brk.a(this.a).a(3600000L)) {
      throw new SQLiteException("Database open failed");
    }
    try
    {
      SQLiteDatabase localSQLiteDatabase = super.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException1)
    {
      for (;;)
      {
        brk.a(this.a).a();
        this.a.f("Opening the database failed, dropping the table and recreating it");
        Object localObject = brk.b(this.a);
        this.a.l().getDatabasePath((String)localObject).delete();
        try
        {
          localObject = super.getWritableDatabase();
          brk.a(this.a).a = 0L;
        }
        catch (SQLiteException localSQLiteException2)
        {
          this.a.e("Failed to open freshly created database", localSQLiteException2);
          throw localSQLiteException2;
        }
      }
    }
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    paramSQLiteDatabase = paramSQLiteDatabase.getPath();
    if (a.d() < 9) {}
    for (;;)
    {
      return;
      paramSQLiteDatabase = new File(paramSQLiteDatabase);
      paramSQLiteDatabase.setReadable(false, false);
      paramSQLiteDatabase.setWritable(false, false);
      paramSQLiteDatabase.setReadable(true, true);
      paramSQLiteDatabase.setWritable(true, true);
    }
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    int j = 1;
    Object localObject;
    if (Build.VERSION.SDK_INT < 15) {
      localObject = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    for (;;)
    {
      try
      {
        ((Cursor)localObject).moveToFirst();
        ((Cursor)localObject).close();
        if (!a(paramSQLiteDatabase, "hits2"))
        {
          paramSQLiteDatabase.execSQL(brk.h());
          if (a(paramSQLiteDatabase, "properties")) {
            break label213;
          }
          paramSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS properties ( app_uid INTEGER NOT NULL, cid TEXT NOT NULL, tid TEXT NOT NULL, params TEXT NOT NULL, adid INTEGER NOT NULL, hits_count INTEGER NOT NULL, PRIMARY KEY (app_uid, cid, tid)) ;");
          return;
        }
      }
      finally
      {
        ((Cursor)localObject).close();
      }
      localObject = b(paramSQLiteDatabase, "hits2");
      for (int i = 0; i < 4; i++)
      {
        String str = new String[] { "hit_id", "hit_string", "hit_time", "hit_url" }[i];
        if (!((Set)localObject).remove(str)) {
          throw new SQLiteException("Database hits2 is missing required column: " + str);
        }
      }
      if (!((Set)localObject).remove("hit_app_id")) {}
      for (i = j; !((Set)localObject).isEmpty(); i = 0) {
        throw new SQLiteException("Database hits2 has extra columns");
      }
      if (i != 0)
      {
        paramSQLiteDatabase.execSQL("ALTER TABLE hits2 ADD COLUMN hit_app_id INTEGER");
        continue;
        label213:
        a(paramSQLiteDatabase);
      }
    }
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */