import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

final class czk
  extends SQLiteOpenHelper
{
  czk(czg paramczg, Context paramContext, String paramString)
  {
    super(paramContext, paramString, null, 1);
  }
  
  /* Error */
  private static boolean a(String paramString, SQLiteDatabase paramSQLiteDatabase)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_1
    //   3: ldc 19
    //   5: iconst_1
    //   6: anewarray 21	java/lang/String
    //   9: dup
    //   10: iconst_0
    //   11: ldc 23
    //   13: aastore
    //   14: ldc 25
    //   16: iconst_1
    //   17: anewarray 21	java/lang/String
    //   20: dup
    //   21: iconst_0
    //   22: aload_0
    //   23: aastore
    //   24: aconst_null
    //   25: aconst_null
    //   26: aconst_null
    //   27: invokevirtual 31	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   30: astore_1
    //   31: aload_1
    //   32: invokeinterface 37 1 0
    //   37: istore_3
    //   38: iload_3
    //   39: istore 4
    //   41: aload_1
    //   42: ifnull +12 -> 54
    //   45: aload_1
    //   46: invokeinterface 41 1 0
    //   51: iload_3
    //   52: istore 4
    //   54: iload 4
    //   56: ireturn
    //   57: astore_1
    //   58: aconst_null
    //   59: astore_1
    //   60: new 43	java/lang/StringBuilder
    //   63: astore_2
    //   64: aload_2
    //   65: ldc 45
    //   67: invokespecial 48	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   70: aload_2
    //   71: aload_0
    //   72: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: invokevirtual 56	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   78: invokestatic 61	cuh:b	(Ljava/lang/String;)V
    //   81: aload_1
    //   82: ifnull +9 -> 91
    //   85: aload_1
    //   86: invokeinterface 41 1 0
    //   91: iconst_0
    //   92: istore 4
    //   94: goto -40 -> 54
    //   97: astore_0
    //   98: aload_2
    //   99: astore_1
    //   100: aload_1
    //   101: ifnull +9 -> 110
    //   104: aload_1
    //   105: invokeinterface 41 1 0
    //   110: aload_0
    //   111: athrow
    //   112: astore_0
    //   113: goto -13 -> 100
    //   116: astore_0
    //   117: goto -17 -> 100
    //   120: astore_2
    //   121: goto -61 -> 60
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	paramString	String
    //   0	124	1	paramSQLiteDatabase	SQLiteDatabase
    //   1	98	2	localStringBuilder	StringBuilder
    //   120	1	2	localSQLiteException	SQLiteException
    //   37	15	3	bool1	boolean
    //   39	54	4	bool2	boolean
    // Exception table:
    //   from	to	target	type
    //   2	31	57	android/database/sqlite/SQLiteException
    //   2	31	97	finally
    //   31	38	112	finally
    //   60	81	116	finally
    //   31	38	120	android/database/sqlite/SQLiteException
  }
  
  public final SQLiteDatabase getWritableDatabase()
  {
    Object localObject1 = null;
    try
    {
      localObject2 = super.getWritableDatabase();
      localObject1 = localObject2;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        Object localObject2;
        czg.b(this.a).getDatabasePath("google_tagmanager.db").delete();
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = super.getWritableDatabase();
    }
    return (SQLiteDatabase)localObject2;
  }
  
  public final void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    b.a(paramSQLiteDatabase.getPath());
  }
  
  public final void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    Object localObject1;
    if (Build.VERSION.SDK_INT < 15) {
      localObject1 = paramSQLiteDatabase.rawQuery("PRAGMA journal_mode=memory", null);
    }
    HashSet localHashSet;
    do
    {
      try
      {
        ((Cursor)localObject1).moveToFirst();
        ((Cursor)localObject1).close();
        if (!a("datalayer", paramSQLiteDatabase))
        {
          paramSQLiteDatabase.execSQL(czg.a());
          return;
        }
      }
      finally
      {
        ((Cursor)localObject1).close();
      }
      paramSQLiteDatabase = paramSQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
      localHashSet = new HashSet();
      try
      {
        localObject1 = paramSQLiteDatabase.getColumnNames();
        for (int i = 0; i < localObject1.length; i++) {
          localHashSet.add(localObject1[i]);
        }
        paramSQLiteDatabase.close();
        if ((!localHashSet.remove("key")) || (!localHashSet.remove("value")) || (!localHashSet.remove("ID")) || (!localHashSet.remove("expires"))) {
          throw new SQLiteException("Database column missing");
        }
      }
      finally
      {
        paramSQLiteDatabase.close();
      }
    } while (localHashSet.isEmpty());
    throw new SQLiteException("Database has extra columns");
  }
  
  public final void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */