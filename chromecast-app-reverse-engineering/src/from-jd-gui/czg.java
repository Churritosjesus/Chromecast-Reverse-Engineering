import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class czg
  implements cub
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", new Object[] { "datalayer", "ID", "key", "value", "expires" });
  private final Executor b;
  private final Context c;
  private czk d;
  private cac e;
  private int f;
  
  public czg(Context paramContext)
  {
    this(paramContext, cad.c(), "google_tagmanager.db", 2000, Executors.newSingleThreadExecutor());
  }
  
  private czg(Context paramContext, cac paramcac, String paramString, int paramInt, Executor paramExecutor)
  {
    this.c = paramContext;
    this.e = paramcac;
    this.f = 2000;
    this.b = paramExecutor;
    this.d = new czk(this, this.c, paramString);
  }
  
  /* Error */
  private static Object a(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: new 83	java/io/ByteArrayInputStream
    //   5: dup
    //   6: aload_0
    //   7: invokespecial 86	java/io/ByteArrayInputStream:<init>	([B)V
    //   10: astore_3
    //   11: new 88	java/io/ObjectInputStream
    //   14: astore_0
    //   15: aload_0
    //   16: aload_3
    //   17: invokespecial 91	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   20: aload_0
    //   21: invokevirtual 95	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   24: astore_2
    //   25: aload_2
    //   26: astore_1
    //   27: aload_0
    //   28: invokevirtual 98	java/io/ObjectInputStream:close	()V
    //   31: aload_3
    //   32: invokevirtual 99	java/io/ByteArrayInputStream:close	()V
    //   35: aload_1
    //   36: areturn
    //   37: astore_0
    //   38: aconst_null
    //   39: astore_0
    //   40: aload_0
    //   41: ifnull +7 -> 48
    //   44: aload_0
    //   45: invokevirtual 98	java/io/ObjectInputStream:close	()V
    //   48: aload_3
    //   49: invokevirtual 99	java/io/ByteArrayInputStream:close	()V
    //   52: goto -17 -> 35
    //   55: astore_0
    //   56: goto -21 -> 35
    //   59: astore_0
    //   60: aconst_null
    //   61: astore_0
    //   62: aload_0
    //   63: ifnull +7 -> 70
    //   66: aload_0
    //   67: invokevirtual 98	java/io/ObjectInputStream:close	()V
    //   70: aload_3
    //   71: invokevirtual 99	java/io/ByteArrayInputStream:close	()V
    //   74: goto -39 -> 35
    //   77: astore_0
    //   78: goto -43 -> 35
    //   81: astore_1
    //   82: aconst_null
    //   83: astore_0
    //   84: aload_0
    //   85: ifnull +7 -> 92
    //   88: aload_0
    //   89: invokevirtual 98	java/io/ObjectInputStream:close	()V
    //   92: aload_3
    //   93: invokevirtual 99	java/io/ByteArrayInputStream:close	()V
    //   96: aload_1
    //   97: athrow
    //   98: astore_0
    //   99: goto -3 -> 96
    //   102: astore_1
    //   103: goto -19 -> 84
    //   106: astore_2
    //   107: goto -45 -> 62
    //   110: astore_2
    //   111: goto -71 -> 40
    //   114: astore_0
    //   115: goto -80 -> 35
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	118	0	paramArrayOfByte	byte[]
    //   1	35	1	localObject1	Object
    //   81	16	1	localObject2	Object
    //   102	1	1	localObject3	Object
    //   24	2	2	localObject4	Object
    //   106	1	2	localClassNotFoundException	ClassNotFoundException
    //   110	1	2	localIOException	java.io.IOException
    //   10	83	3	localByteArrayInputStream	java.io.ByteArrayInputStream
    // Exception table:
    //   from	to	target	type
    //   11	20	37	java/io/IOException
    //   44	48	55	java/io/IOException
    //   48	52	55	java/io/IOException
    //   11	20	59	java/lang/ClassNotFoundException
    //   66	70	77	java/io/IOException
    //   70	74	77	java/io/IOException
    //   11	20	81	finally
    //   88	92	98	java/io/IOException
    //   92	96	98	java/io/IOException
    //   20	25	102	finally
    //   20	25	106	java/lang/ClassNotFoundException
    //   20	25	110	java/io/IOException
    //   27	35	114	java/io/IOException
  }
  
  /* Error */
  private List a(int paramInt)
  {
    // Byte code:
    //   0: new 105	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 106	java/util/ArrayList:<init>	()V
    //   7: astore 5
    //   9: iload_1
    //   10: ifgt +11 -> 21
    //   13: ldc 108
    //   15: invokestatic 113	cuh:b	(Ljava/lang/String;)V
    //   18: aload 5
    //   20: areturn
    //   21: aload_0
    //   22: ldc 115
    //   24: invokespecial 118	czg:b	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore 4
    //   29: aload 4
    //   31: ifnonnull +6 -> 37
    //   34: goto -16 -> 18
    //   37: ldc 120
    //   39: iconst_1
    //   40: anewarray 4	java/lang/Object
    //   43: dup
    //   44: iconst_0
    //   45: ldc 26
    //   47: aastore
    //   48: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   51: astore_3
    //   52: iload_1
    //   53: invokestatic 126	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   56: astore_2
    //   57: aload 4
    //   59: ldc 24
    //   61: iconst_1
    //   62: anewarray 34	java/lang/String
    //   65: dup
    //   66: iconst_0
    //   67: ldc 26
    //   69: aastore
    //   70: aconst_null
    //   71: aconst_null
    //   72: aconst_null
    //   73: aconst_null
    //   74: aload_3
    //   75: aload_2
    //   76: invokevirtual 132	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   79: astore_3
    //   80: aload_3
    //   81: astore_2
    //   82: aload_3
    //   83: invokeinterface 138 1 0
    //   88: ifeq +38 -> 126
    //   91: aload_3
    //   92: astore_2
    //   93: aload 5
    //   95: aload_3
    //   96: iconst_0
    //   97: invokeinterface 142 2 0
    //   102: invokestatic 146	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   105: invokeinterface 152 2 0
    //   110: pop
    //   111: aload_3
    //   112: astore_2
    //   113: aload_3
    //   114: invokeinterface 155 1 0
    //   119: istore 7
    //   121: iload 7
    //   123: ifne -32 -> 91
    //   126: aload_3
    //   127: ifnull +9 -> 136
    //   130: aload_3
    //   131: invokeinterface 156 1 0
    //   136: goto -118 -> 18
    //   139: astore 4
    //   141: aconst_null
    //   142: astore_3
    //   143: aload_3
    //   144: astore_2
    //   145: new 158	java/lang/StringBuilder
    //   148: astore 6
    //   150: aload_3
    //   151: astore_2
    //   152: aload 6
    //   154: ldc -96
    //   156: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   159: aload_3
    //   160: astore_2
    //   161: aload 6
    //   163: aload 4
    //   165: invokevirtual 165	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   168: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: invokestatic 113	cuh:b	(Ljava/lang/String;)V
    //   177: aload_3
    //   178: ifnull -42 -> 136
    //   181: aload_3
    //   182: invokeinterface 156 1 0
    //   187: goto -51 -> 136
    //   190: astore_2
    //   191: aconst_null
    //   192: astore_3
    //   193: aload_2
    //   194: astore 4
    //   196: aload_3
    //   197: ifnull +9 -> 206
    //   200: aload_3
    //   201: invokeinterface 156 1 0
    //   206: aload 4
    //   208: athrow
    //   209: astore 4
    //   211: aload_2
    //   212: astore_3
    //   213: goto -17 -> 196
    //   216: astore 4
    //   218: goto -75 -> 143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	221	0	this	czg
    //   0	221	1	paramInt	int
    //   56	105	2	localObject1	Object
    //   190	22	2	localObject2	Object
    //   51	162	3	localObject3	Object
    //   27	31	4	localSQLiteDatabase	SQLiteDatabase
    //   139	25	4	localSQLiteException1	SQLiteException
    //   194	13	4	localObject4	Object
    //   209	1	4	localObject5	Object
    //   216	1	4	localSQLiteException2	SQLiteException
    //   7	87	5	localArrayList	ArrayList
    //   148	14	6	localStringBuilder	StringBuilder
    //   119	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   37	80	139	android/database/sqlite/SQLiteException
    //   37	80	190	finally
    //   82	91	209	finally
    //   93	111	209	finally
    //   113	121	209	finally
    //   145	150	209	finally
    //   152	159	209	finally
    //   161	177	209	finally
    //   82	91	216	android/database/sqlite/SQLiteException
    //   93	111	216	android/database/sqlite/SQLiteException
    //   113	121	216	android/database/sqlite/SQLiteException
  }
  
  private void a(long paramLong)
  {
    Object localObject = b("Error opening database for deleteOlderThan.");
    if (localObject == null) {}
    for (;;)
    {
      return;
      try
      {
        int i = ((SQLiteDatabase)localObject).delete("datalayer", "expires <= ?", new String[] { Long.toString(paramLong) });
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("Deleted ");
        cuh.e(i + " expired items");
      }
      catch (SQLiteException localSQLiteException)
      {
        cuh.b("Error deleting old entries.");
      }
    }
  }
  
  private void a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {}
    for (;;)
    {
      return;
      SQLiteDatabase localSQLiteDatabase = b("Error opening database for deleteEntries.");
      if (localSQLiteDatabase != null)
      {
        String str = String.format("%s in (%s)", new Object[] { "ID", TextUtils.join(",", Collections.nCopies(paramArrayOfString.length, "?")) });
        try
        {
          localSQLiteDatabase.delete("datalayer", str, paramArrayOfString);
        }
        catch (SQLiteException localSQLiteException)
        {
          cuh.b("Error deleting entries " + Arrays.toString(paramArrayOfString));
        }
      }
    }
  }
  
  /* Error */
  private static byte[] a(Object paramObject)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: new 257	java/io/ByteArrayOutputStream
    //   5: dup
    //   6: invokespecial 258	java/io/ByteArrayOutputStream:<init>	()V
    //   9: astore_3
    //   10: new 260	java/io/ObjectOutputStream
    //   13: astore_1
    //   14: aload_1
    //   15: aload_3
    //   16: invokespecial 263	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   19: aload_1
    //   20: aload_0
    //   21: invokevirtual 267	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   24: aload_3
    //   25: invokevirtual 271	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   28: astore_0
    //   29: aload_1
    //   30: invokevirtual 272	java/io/ObjectOutputStream:close	()V
    //   33: aload_3
    //   34: invokevirtual 273	java/io/ByteArrayOutputStream:close	()V
    //   37: aload_0
    //   38: areturn
    //   39: astore_0
    //   40: aconst_null
    //   41: astore_1
    //   42: aload_1
    //   43: ifnull +7 -> 50
    //   46: aload_1
    //   47: invokevirtual 272	java/io/ObjectOutputStream:close	()V
    //   50: aload_3
    //   51: invokevirtual 273	java/io/ByteArrayOutputStream:close	()V
    //   54: aload_2
    //   55: astore_0
    //   56: goto -19 -> 37
    //   59: astore_0
    //   60: aload_2
    //   61: astore_0
    //   62: goto -25 -> 37
    //   65: astore_0
    //   66: aconst_null
    //   67: astore_1
    //   68: aload_1
    //   69: ifnull +7 -> 76
    //   72: aload_1
    //   73: invokevirtual 272	java/io/ObjectOutputStream:close	()V
    //   76: aload_3
    //   77: invokevirtual 273	java/io/ByteArrayOutputStream:close	()V
    //   80: aload_0
    //   81: athrow
    //   82: astore_1
    //   83: goto -3 -> 80
    //   86: astore_0
    //   87: goto -19 -> 68
    //   90: astore_0
    //   91: goto -49 -> 42
    //   94: astore_1
    //   95: goto -58 -> 37
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	98	0	paramObject	Object
    //   13	60	1	localObjectOutputStream	java.io.ObjectOutputStream
    //   82	1	1	localIOException1	java.io.IOException
    //   94	1	1	localIOException2	java.io.IOException
    //   1	60	2	localObject	Object
    //   9	68	3	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   10	19	39	java/io/IOException
    //   46	50	59	java/io/IOException
    //   50	54	59	java/io/IOException
    //   10	19	65	finally
    //   72	76	82	java/io/IOException
    //   76	80	82	java/io/IOException
    //   19	29	86	finally
    //   19	29	90	java/io/IOException
    //   29	37	94	java/io/IOException
  }
  
  private SQLiteDatabase b(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.d.getWritableDatabase();
      paramString = localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        cuh.b(paramString);
        paramString = null;
      }
    }
    return paramString;
  }
  
  private List b()
  {
    try
    {
      a(this.e.a());
      Object localObject = c();
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (czl)localIterator.next();
        ctz localctz = new ctz;
        localctz.<init>(((czl)localObject).a, a(((czl)localObject).b));
        localArrayList.add(localctz);
      }
    }
    finally
    {
      e();
    }
    return localList;
  }
  
  /* Error */
  private void b(List paramList, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 65	czg:e	Lcac;
    //   6: invokeinterface 283 1 0
    //   11: lstore 7
    //   13: aload_0
    //   14: lload 7
    //   16: invokespecial 285	czg:a	(J)V
    //   19: aload_1
    //   20: invokeinterface 316 1 0
    //   25: aload_0
    //   26: invokespecial 318	czg:d	()I
    //   29: aload_0
    //   30: getfield 67	czg:f	I
    //   33: isub
    //   34: iadd
    //   35: istore 6
    //   37: iload 6
    //   39: ifle +66 -> 105
    //   42: aload_0
    //   43: iload 6
    //   45: invokespecial 320	czg:a	(I)Ljava/util/List;
    //   48: astore 4
    //   50: new 158	java/lang/StringBuilder
    //   53: astore 5
    //   55: aload 5
    //   57: ldc_w 322
    //   60: invokespecial 162	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   63: aload 5
    //   65: aload 4
    //   67: invokeinterface 316 1 0
    //   72: invokevirtual 193	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   75: ldc_w 324
    //   78: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 171	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokestatic 326	cuh:c	(Ljava/lang/String;)V
    //   87: aload_0
    //   88: aload 4
    //   90: iconst_0
    //   91: anewarray 34	java/lang/String
    //   94: invokeinterface 330 2 0
    //   99: checkcast 332	[Ljava/lang/String;
    //   102: invokespecial 334	czg:a	([Ljava/lang/String;)V
    //   105: aload_0
    //   106: aload_1
    //   107: lload 7
    //   109: lload_2
    //   110: ladd
    //   111: invokespecial 336	czg:c	(Ljava/util/List;J)V
    //   114: aload_0
    //   115: invokespecial 213	czg:e	()V
    //   118: aload_0
    //   119: monitorexit
    //   120: return
    //   121: astore_1
    //   122: aload_0
    //   123: invokespecial 213	czg:e	()V
    //   126: aload_1
    //   127: athrow
    //   128: astore_1
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	this	czg
    //   0	133	1	paramList	List
    //   0	133	2	paramLong	long
    //   48	41	4	localList	List
    //   53	11	5	localStringBuilder	StringBuilder
    //   35	9	6	i	int
    //   11	97	7	l	long
    // Exception table:
    //   from	to	target	type
    //   2	37	121	finally
    //   42	105	121	finally
    //   105	114	121	finally
    //   114	118	128	finally
    //   122	128	128	finally
  }
  
  /* Error */
  private List c()
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc_w 338
    //   4: invokespecial 118	czg:b	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   7: astore_1
    //   8: new 105	java/util/ArrayList
    //   11: dup
    //   12: invokespecial 106	java/util/ArrayList:<init>	()V
    //   15: astore_2
    //   16: aload_1
    //   17: ifnonnull +5 -> 22
    //   20: aload_2
    //   21: areturn
    //   22: aload_1
    //   23: ldc 24
    //   25: iconst_2
    //   26: anewarray 34	java/lang/String
    //   29: dup
    //   30: iconst_0
    //   31: ldc 28
    //   33: aastore
    //   34: dup
    //   35: iconst_1
    //   36: ldc 30
    //   38: aastore
    //   39: aconst_null
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: ldc 26
    //   45: aconst_null
    //   46: invokevirtual 132	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   49: astore_1
    //   50: aload_1
    //   51: invokeinterface 155 1 0
    //   56: ifeq +45 -> 101
    //   59: new 301	czl
    //   62: astore_3
    //   63: aload_3
    //   64: aload_1
    //   65: iconst_0
    //   66: invokeinterface 341 2 0
    //   71: aload_1
    //   72: iconst_1
    //   73: invokeinterface 345 2 0
    //   78: invokespecial 348	czl:<init>	(Ljava/lang/String;[B)V
    //   81: aload_2
    //   82: aload_3
    //   83: invokeinterface 152 2 0
    //   88: pop
    //   89: goto -39 -> 50
    //   92: astore_2
    //   93: aload_1
    //   94: invokeinterface 156 1 0
    //   99: aload_2
    //   100: athrow
    //   101: aload_1
    //   102: invokeinterface 156 1 0
    //   107: goto -87 -> 20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	czg
    //   7	95	1	localObject1	Object
    //   15	67	2	localArrayList	ArrayList
    //   92	8	2	localObject2	Object
    //   62	21	3	localczl	czl
    // Exception table:
    //   from	to	target	type
    //   50	89	92	finally
  }
  
  private void c(List paramList, long paramLong)
  {
    SQLiteDatabase localSQLiteDatabase = b("Error opening database for writeEntryToDatabase.");
    if (localSQLiteDatabase == null) {}
    for (;;)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        czl localczl = (czl)paramList.next();
        ContentValues localContentValues = new ContentValues();
        localContentValues.put("expires", Long.valueOf(paramLong));
        localContentValues.put("key", localczl.a);
        localContentValues.put("value", localczl.b);
        localSQLiteDatabase.insert("datalayer", null, localContentValues);
      }
    }
  }
  
  private int d()
  {
    Object localObject3 = null;
    Object localObject1 = null;
    int i = 0;
    int k = 0;
    Object localObject5 = b("Error opening database for getNumStoredEntries.");
    int j;
    if (localObject5 == null) {
      j = k;
    }
    for (;;)
    {
      return j;
      try
      {
        localObject5 = ((SQLiteDatabase)localObject5).rawQuery("SELECT COUNT(*) from datalayer", null);
        localObject1 = localObject5;
        localObject3 = localObject5;
        if (((Cursor)localObject5).moveToFirst())
        {
          localObject1 = localObject5;
          localObject3 = localObject5;
          long l = ((Cursor)localObject5).getLong(0);
          i = (int)l;
        }
        j = i;
        if (localObject5 == null) {
          continue;
        }
        ((Cursor)localObject5).close();
        j = i;
      }
      catch (SQLiteException localSQLiteException)
      {
        localObject4 = localObject1;
        cuh.b("Error getting numStoredEntries");
        j = k;
        if (localObject1 == null) {
          continue;
        }
        ((Cursor)localObject1).close();
        j = k;
      }
      finally
      {
        Object localObject4;
        if (localObject4 != null) {
          ((Cursor)localObject4).close();
        }
      }
    }
  }
  
  private void e()
  {
    try
    {
      this.d.close();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;) {}
    }
  }
  
  public final void a(cuc paramcuc)
  {
    this.b.execute(new czi(this, paramcuc));
  }
  
  public final void a(String paramString)
  {
    this.b.execute(new czj(this, paramString));
  }
  
  public final void a(List paramList, long paramLong)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      ctz localctz = (ctz)paramList.next();
      localArrayList.add(new czl(localctz.a, a(localctz.b)));
    }
    this.b.execute(new czh(this, localArrayList, paramLong));
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */