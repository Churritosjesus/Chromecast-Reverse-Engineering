import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

final class brk
  extends bra
  implements Closeable
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", new Object[] { "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id" });
  private static final String b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", new Object[] { "hit_time", "hits2" });
  private final brl c;
  private final bqr e = new bqr(k());
  private final bqr f = new bqr(k());
  
  brk(brb parambrb)
  {
    super(parambrb);
    String str = u();
    this.c = new brl(this, parambrb.a, str);
  }
  
  private long a(String paramString, String[] paramArrayOfString)
  {
    paramArrayOfString = null;
    Object localObject1 = null;
    Object localObject2 = t();
    try
    {
      localObject2 = ((SQLiteDatabase)localObject2).rawQuery(paramString, null);
      localObject1 = localObject2;
      paramArrayOfString = (String[])localObject2;
      if (((Cursor)localObject2).moveToFirst())
      {
        localObject1 = localObject2;
        paramArrayOfString = (String[])localObject2;
        long l = ((Cursor)localObject2).getLong(0);
        if (localObject2 != null) {
          ((Cursor)localObject2).close();
        }
        return l;
      }
      localObject1 = localObject2;
      paramArrayOfString = (String[])localObject2;
      SQLiteException localSQLiteException2 = new android/database/sqlite/SQLiteException;
      localObject1 = localObject2;
      paramArrayOfString = (String[])localObject2;
      localSQLiteException2.<init>("Database returned empty set");
      localObject1 = localObject2;
      paramArrayOfString = (String[])localObject2;
      throw localSQLiteException2;
    }
    catch (SQLiteException localSQLiteException1)
    {
      paramArrayOfString = (String[])localObject1;
      d("Database error", paramString, localSQLiteException1);
      paramArrayOfString = (String[])localObject1;
      throw localSQLiteException1;
    }
    finally
    {
      if (paramArrayOfString != null) {
        paramArrayOfString.close();
      }
    }
  }
  
  /* Error */
  private long a(String paramString, String[] paramArrayOfString, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 85	brk:t	()Landroid/database/sqlite/SQLiteDatabase;
    //   4: astore 6
    //   6: aconst_null
    //   7: astore 5
    //   9: aconst_null
    //   10: astore 7
    //   12: aload 6
    //   14: aload_1
    //   15: aload_2
    //   16: invokevirtual 91	android/database/sqlite/SQLiteDatabase:rawQuery	(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
    //   19: astore_2
    //   20: aload_2
    //   21: invokeinterface 97 1 0
    //   26: ifeq +30 -> 56
    //   29: aload_2
    //   30: iconst_0
    //   31: invokeinterface 101 2 0
    //   36: lstore 8
    //   38: lload 8
    //   40: lstore_3
    //   41: aload_2
    //   42: ifnull +12 -> 54
    //   45: aload_2
    //   46: invokeinterface 104 1 0
    //   51: lload 8
    //   53: lstore_3
    //   54: lload_3
    //   55: lreturn
    //   56: aload_2
    //   57: ifnull +9 -> 66
    //   60: aload_2
    //   61: invokeinterface 104 1 0
    //   66: lconst_0
    //   67: lstore_3
    //   68: goto -14 -> 54
    //   71: astore 6
    //   73: aload 7
    //   75: astore_2
    //   76: aload_2
    //   77: astore 5
    //   79: aload_0
    //   80: ldc 111
    //   82: aload_1
    //   83: aload 6
    //   85: invokevirtual 115	brk:d	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   88: aload_2
    //   89: astore 5
    //   91: aload 6
    //   93: athrow
    //   94: astore_1
    //   95: aload 5
    //   97: astore_2
    //   98: aload_2
    //   99: ifnull +9 -> 108
    //   102: aload_2
    //   103: invokeinterface 104 1 0
    //   108: aload_1
    //   109: athrow
    //   110: astore_1
    //   111: goto -13 -> 98
    //   114: astore 6
    //   116: goto -40 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	119	0	this	brk
    //   0	119	1	paramString	String
    //   0	119	2	paramArrayOfString	String[]
    //   0	119	3	paramLong	long
    //   7	89	5	arrayOfString	String[]
    //   4	9	6	localSQLiteDatabase	SQLiteDatabase
    //   71	21	6	localSQLiteException1	SQLiteException
    //   114	1	6	localSQLiteException2	SQLiteException
    //   10	64	7	localObject	Object
    //   36	16	8	l	long
    // Exception table:
    //   from	to	target	type
    //   12	20	71	android/database/sqlite/SQLiteException
    //   12	20	94	finally
    //   79	88	94	finally
    //   91	94	94	finally
    //   20	38	110	finally
    //   20	38	114	android/database/sqlite/SQLiteException
  }
  
  private Map a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = new HashMap(0);
    }
    label147:
    for (;;)
    {
      return paramString;
      for (;;)
      {
        try
        {
          if (paramString.startsWith("?"))
          {
            localObject = new java/net/URI;
            ((URI)localObject).<init>(paramString);
            localObject = URLEncodedUtils.parse((URI)localObject, "UTF-8");
            paramString = new java/util/HashMap;
            paramString.<init>(((List)localObject).size());
            Iterator localIterator = ((List)localObject).iterator();
            if (!localIterator.hasNext()) {
              break label147;
            }
            localObject = (NameValuePair)localIterator.next();
            paramString.put(((NameValuePair)localObject).getName(), ((NameValuePair)localObject).getValue());
            continue;
          }
        }
        catch (URISyntaxException paramString)
        {
          e("Error parsing hit parameters", paramString);
          paramString = new HashMap(0);
        }
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("?");
        paramString = paramString;
      }
    }
  }
  
  /* Error */
  private List d(long paramLong)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: invokestatic 201	brb:i	()V
    //   5: aload_0
    //   6: invokevirtual 204	brk:r	()V
    //   9: lload_1
    //   10: lconst_0
    //   11: lcmp
    //   12: ifgt +9 -> 21
    //   15: invokestatic 210	java/util/Collections:emptyList	()Ljava/util/List;
    //   18: astore_3
    //   19: aload_3
    //   20: areturn
    //   21: aload_0
    //   22: invokespecial 85	brk:t	()Landroid/database/sqlite/SQLiteDatabase;
    //   25: astore 4
    //   27: new 212	java/util/ArrayList
    //   30: dup
    //   31: invokespecial 214	java/util/ArrayList:<init>	()V
    //   34: astore 6
    //   36: ldc -40
    //   38: iconst_1
    //   39: anewarray 20	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: ldc 24
    //   46: aastore
    //   47: invokestatic 38	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   50: astore 7
    //   52: lload_1
    //   53: invokestatic 221	java/lang/Long:toString	(J)Ljava/lang/String;
    //   56: astore 5
    //   58: aload 4
    //   60: ldc 22
    //   62: iconst_1
    //   63: anewarray 34	java/lang/String
    //   66: dup
    //   67: iconst_0
    //   68: ldc 24
    //   70: aastore
    //   71: aconst_null
    //   72: aconst_null
    //   73: aconst_null
    //   74: aconst_null
    //   75: aload 7
    //   77: aload 5
    //   79: invokevirtual 225	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   82: astore 4
    //   84: aload 4
    //   86: astore_3
    //   87: aload 4
    //   89: invokeinterface 97 1 0
    //   94: ifeq +42 -> 136
    //   97: aload 4
    //   99: astore_3
    //   100: aload 6
    //   102: aload 4
    //   104: iconst_0
    //   105: invokeinterface 101 2 0
    //   110: invokestatic 229	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   113: invokeinterface 233 2 0
    //   118: pop
    //   119: aload 4
    //   121: astore_3
    //   122: aload 4
    //   124: invokeinterface 236 1 0
    //   129: istore 8
    //   131: iload 8
    //   133: ifne -36 -> 97
    //   136: aload 4
    //   138: ifnull +10 -> 148
    //   141: aload 4
    //   143: invokeinterface 104 1 0
    //   148: aload 6
    //   150: astore_3
    //   151: goto -132 -> 19
    //   154: astore 5
    //   156: aconst_null
    //   157: astore 4
    //   159: aload 4
    //   161: astore_3
    //   162: aload_0
    //   163: ldc -18
    //   165: aload 5
    //   167: invokevirtual 240	brk:d	(Ljava/lang/String;Ljava/lang/Object;)V
    //   170: aload 4
    //   172: ifnull -24 -> 148
    //   175: aload 4
    //   177: invokeinterface 104 1 0
    //   182: goto -34 -> 148
    //   185: astore 4
    //   187: aload_3
    //   188: ifnull +9 -> 197
    //   191: aload_3
    //   192: invokeinterface 104 1 0
    //   197: aload 4
    //   199: athrow
    //   200: astore 4
    //   202: goto -15 -> 187
    //   205: astore 5
    //   207: goto -48 -> 159
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	this	brk
    //   0	210	1	paramLong	long
    //   1	191	3	localObject1	Object
    //   25	151	4	localObject2	Object
    //   185	13	4	localObject3	Object
    //   200	1	4	localObject4	Object
    //   56	22	5	str1	String
    //   154	12	5	localSQLiteException1	SQLiteException
    //   205	1	5	localSQLiteException2	SQLiteException
    //   34	115	6	localArrayList	ArrayList
    //   50	26	7	str2	String
    //   129	3	8	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   36	84	154	android/database/sqlite/SQLiteException
    //   36	84	185	finally
    //   87	97	200	finally
    //   100	119	200	finally
    //   122	131	200	finally
    //   162	170	200	finally
    //   87	97	205	android/database/sqlite/SQLiteException
    //   100	119	205	android/database/sqlite/SQLiteException
    //   122	131	205	android/database/sqlite/SQLiteException
  }
  
  private Map g(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      paramString = new HashMap(0);
    }
    for (;;)
    {
      return paramString;
      try
      {
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("?");
        paramString = paramString;
        localObject = new java/net/URI;
        ((URI)localObject).<init>(paramString);
        localObject = URLEncodedUtils.parse((URI)localObject, "UTF-8");
        paramString = new java/util/HashMap;
        paramString.<init>(((List)localObject).size());
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (NameValuePair)localIterator.next();
          paramString.put(((NameValuePair)localObject).getName(), ((NameValuePair)localObject).getValue());
        }
      }
      catch (URISyntaxException paramString)
      {
        e("Error parsing property parameters", paramString);
        paramString = new HashMap(0);
      }
    }
  }
  
  private long i()
  {
    brb.i();
    r();
    return a("SELECT COUNT(*) FROM hits2", null);
  }
  
  private SQLiteDatabase t()
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.c.getWritableDatabase();
      return localSQLiteDatabase;
    }
    catch (SQLiteException localSQLiteException)
    {
      d("Error opening database", localSQLiteException);
      throw localSQLiteException;
    }
  }
  
  private String u()
  {
    String str;
    if (!byk.a) {
      str = "google_analytics_v4.db";
    }
    for (;;)
    {
      return str;
      if (m().a()) {
        str = "google_analytics_v4.db";
      } else {
        str = "google_analytics2_v4.db";
      }
    }
  }
  
  public final long a(long paramLong, String paramString1, String paramString2)
  {
    a.f(paramString1);
    a.f(paramString2);
    r();
    brb.i();
    return a("SELECT hits_count FROM properties WHERE app_uid=? AND cid=? AND tid=?", new String[] { String.valueOf(paramLong), paramString1, paramString2 }, 0L);
  }
  
  public final List a(long paramLong)
  {
    boolean bool = true;
    Cursor localCursor = null;
    if (paramLong >= 0L) {}
    for (;;)
    {
      a.b(bool);
      brb.i();
      r();
      Object localObject5 = t();
      localObject1 = localCursor;
      for (;;)
      {
        try
        {
          localObject6 = String.format("%s ASC", new Object[] { "hit_id" });
          localObject1 = localCursor;
          localObject7 = Long.toString(paramLong);
          localObject1 = localCursor;
          localCursor = ((SQLiteDatabase)localObject5).query("hits2", new String[] { "hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id" }, null, null, null, null, (String)localObject6, (String)localObject7);
          localObject1 = localCursor;
        }
        catch (SQLiteException localSQLiteException1)
        {
          Object localObject6;
          Object localObject7;
          localObject1 = null;
          try
          {
            e("Error loading hits from the database", localSQLiteException1);
            throw localSQLiteException1;
          }
          finally
          {
            if (localObject1 != null) {
              ((Cursor)localObject1).close();
            }
          }
        }
        finally
        {
          continue;
        }
        try
        {
          localObject5 = new java/util/ArrayList;
          localObject1 = localCursor;
          ((ArrayList)localObject5).<init>();
          localObject1 = localCursor;
          if (localCursor.moveToFirst())
          {
            localObject1 = localCursor;
            long l = localCursor.getLong(0);
            localObject1 = localCursor;
            paramLong = localCursor.getLong(1);
            localObject1 = localCursor;
            localObject7 = localCursor.getString(2);
            localObject1 = localCursor;
            localObject6 = localCursor.getString(3);
            localObject1 = localCursor;
            int i = localCursor.getInt(4);
            localObject1 = localCursor;
            localObject7 = a((String)localObject7);
            localObject1 = localCursor;
            bool = bqs.c((String)localObject6);
            localObject1 = localCursor;
            localObject6 = new bsi;
            localObject1 = localCursor;
            ((bsi)localObject6).<init>(this, (Map)localObject7, paramLong, bool, l, i);
            localObject1 = localCursor;
            ((List)localObject5).add(localObject6);
            localObject1 = localCursor;
            bool = localCursor.moveToNext();
            if (bool) {
              continue;
            }
          }
          if (localCursor != null) {
            localCursor.close();
          }
          return (List)localObject5;
        }
        catch (SQLiteException localSQLiteException2)
        {
          localObject1 = localObject3;
          Object localObject4 = localSQLiteException2;
        }
      }
      bool = false;
    }
  }
  
  protected final void a() {}
  
  public final void a(long paramLong, String paramString)
  {
    a.f(paramString);
    r();
    brb.i();
    int i = t().delete("properties", "app_uid=? AND cid<>?", new String[] { String.valueOf(paramLong), paramString });
    if (i > 0) {
      a("Deleted property records", Integer.valueOf(i));
    }
  }
  
  public final void a(bre parambre)
  {
    a.c(parambre);
    r();
    brb.i();
    SQLiteDatabase localSQLiteDatabase = t();
    Object localObject2 = parambre.f;
    a.c(localObject2);
    Object localObject1 = new Uri.Builder();
    Iterator localIterator = ((Map)localObject2).entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (Map.Entry)localIterator.next();
      ((Uri.Builder)localObject1).appendQueryParameter((String)((Map.Entry)localObject2).getKey(), (String)((Map.Entry)localObject2).getValue());
    }
    localObject2 = ((Uri.Builder)localObject1).build().getEncodedQuery();
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = "";
    }
    localObject2 = new ContentValues();
    ((ContentValues)localObject2).put("app_uid", Long.valueOf(parambre.a));
    ((ContentValues)localObject2).put("cid", parambre.b);
    ((ContentValues)localObject2).put("tid", parambre.c);
    int i;
    if (parambre.d) {
      i = 1;
    }
    for (;;)
    {
      ((ContentValues)localObject2).put("adid", Integer.valueOf(i));
      ((ContentValues)localObject2).put("hits_count", Long.valueOf(parambre.e));
      ((ContentValues)localObject2).put("params", (String)localObject1);
      try
      {
        if (localSQLiteDatabase.insertWithOnConflict("properties", null, (ContentValues)localObject2, 5) == -1L) {
          f("Failed to insert/update a property (got -1)");
        }
        return;
        i = 0;
      }
      catch (SQLiteException parambre)
      {
        for (;;)
        {
          e("Error storing a property", parambre);
        }
      }
    }
  }
  
  public final void a(bsi parambsi)
  {
    a.c(parambsi);
    brb.i();
    r();
    a.c(parambsi);
    Object localObject3 = new Uri.Builder();
    Object localObject2 = parambsi.a.entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      String str = (String)((Map.Entry)localObject1).getKey();
      if ((!"ht".equals(str)) && (!"qt".equals(str)) && (!"AppUID".equals(str))) {
        ((Uri.Builder)localObject3).appendQueryParameter(str, (String)((Map.Entry)localObject1).getValue());
      }
    }
    Object localObject1 = ((Uri.Builder)localObject3).build().getEncodedQuery();
    if (localObject1 == null)
    {
      localObject1 = "";
      if (((String)localObject1).length() <= 8192) {
        break label169;
      }
      this.d.a().a(parambsi, "Hit length exceeds the maximum allowed size");
    }
    for (;;)
    {
      return;
      break;
      label169:
      int i = ((Integer)bqd.c.a()).intValue();
      long l = i();
      if (l > i - 1)
      {
        localObject2 = d(l - i + 1L);
        d("Store full, deleting hits to make room, count", Integer.valueOf(((List)localObject2).size()));
        a((List)localObject2);
      }
      localObject3 = t();
      localObject2 = new ContentValues();
      ((ContentValues)localObject2).put("hit_string", (String)localObject1);
      ((ContentValues)localObject2).put("hit_time", Long.valueOf(parambsi.d));
      ((ContentValues)localObject2).put("hit_app_id", Integer.valueOf(parambsi.e));
      if (parambsi.f) {}
      for (localObject1 = brz.h();; localObject1 = brz.i())
      {
        ((ContentValues)localObject2).put("hit_url", (String)localObject1);
        try
        {
          l = ((SQLiteDatabase)localObject3).insert("hits2", null, (ContentValues)localObject2);
          if (l != -1L) {
            break label348;
          }
          f("Failed to insert a hit (got -1)");
        }
        catch (SQLiteException parambsi)
        {
          e("Error storing a hit", parambsi);
        }
        break;
      }
      label348:
      b("Hit saved to database. db-id, hit", Long.valueOf(l), parambsi);
    }
  }
  
  public final void a(List paramList)
  {
    a.c(paramList);
    brb.i();
    r();
    if (paramList.isEmpty()) {}
    for (;;)
    {
      return;
      Object localObject2 = new StringBuilder("hit_id");
      ((StringBuilder)localObject2).append(" in (");
      Object localObject1;
      for (int i = 0; i < paramList.size(); i++)
      {
        localObject1 = (Long)paramList.get(i);
        if ((localObject1 == null) || (((Long)localObject1).longValue() == 0L)) {
          throw new SQLiteException("Invalid hit id");
        }
        if (i > 0) {
          ((StringBuilder)localObject2).append(",");
        }
        ((StringBuilder)localObject2).append(localObject1);
      }
      ((StringBuilder)localObject2).append(")");
      localObject2 = ((StringBuilder)localObject2).toString();
      try
      {
        localObject1 = t();
        a("Deleting dispatched hits. count", Integer.valueOf(paramList.size()));
        i = ((SQLiteDatabase)localObject1).delete("hits2", (String)localObject2, null);
        if (i == paramList.size()) {
          continue;
        }
        b("Deleted fewer hits then expected", Integer.valueOf(paramList.size()), Integer.valueOf(i), localObject2);
      }
      catch (SQLiteException paramList)
      {
        e("Error deleting hits", paramList);
        throw paramList;
      }
    }
  }
  
  public final void b()
  {
    r();
    t().beginTransaction();
  }
  
  public final void b(long paramLong)
  {
    brb.i();
    r();
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(Long.valueOf(paramLong));
    a("Deleting hit, id", Long.valueOf(paramLong));
    a(localArrayList);
  }
  
  /* Error */
  public final List c(long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 204	brk:r	()V
    //   4: invokestatic 201	brb:i	()V
    //   7: aload_0
    //   8: invokespecial 85	brk:t	()Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore 5
    //   13: aconst_null
    //   14: astore 4
    //   16: aload 4
    //   18: astore_3
    //   19: getstatic 523	bqd:d	Lbqe;
    //   22: invokevirtual 450	bqe:a	()Ljava/lang/Object;
    //   25: checkcast 319	java/lang/Integer
    //   28: invokevirtual 453	java/lang/Integer:intValue	()I
    //   31: istore 10
    //   33: aload 4
    //   35: astore_3
    //   36: aload 5
    //   38: ldc_w 309
    //   41: iconst_5
    //   42: anewarray 34	java/lang/String
    //   45: dup
    //   46: iconst_0
    //   47: ldc_w 378
    //   50: aastore
    //   51: dup
    //   52: iconst_1
    //   53: ldc_w 384
    //   56: aastore
    //   57: dup
    //   58: iconst_2
    //   59: ldc_w 390
    //   62: aastore
    //   63: dup
    //   64: iconst_3
    //   65: ldc_w 395
    //   68: aastore
    //   69: dup
    //   70: iconst_4
    //   71: ldc_w 399
    //   74: aastore
    //   75: ldc_w 525
    //   78: iconst_1
    //   79: anewarray 34	java/lang/String
    //   82: dup
    //   83: iconst_0
    //   84: ldc_w 527
    //   87: aastore
    //   88: aconst_null
    //   89: aconst_null
    //   90: aconst_null
    //   91: iload 10
    //   93: invokestatic 529	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   96: invokevirtual 225	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   99: astore 4
    //   101: aload 4
    //   103: astore_3
    //   104: new 212	java/util/ArrayList
    //   107: astore 9
    //   109: aload 4
    //   111: astore_3
    //   112: aload 9
    //   114: invokespecial 214	java/util/ArrayList:<init>	()V
    //   117: aload 4
    //   119: astore_3
    //   120: aload 4
    //   122: invokeinterface 97 1 0
    //   127: ifeq +125 -> 252
    //   130: aload 4
    //   132: astore_3
    //   133: aload 4
    //   135: iconst_0
    //   136: invokeinterface 289 2 0
    //   141: astore 5
    //   143: aload 4
    //   145: astore_3
    //   146: aload 4
    //   148: iconst_1
    //   149: invokeinterface 289 2 0
    //   154: astore 7
    //   156: aload 4
    //   158: astore_3
    //   159: aload 4
    //   161: iconst_2
    //   162: invokeinterface 293 2 0
    //   167: ifeq +125 -> 292
    //   170: iconst_1
    //   171: istore 11
    //   173: aload 4
    //   175: astore_3
    //   176: aload 4
    //   178: iconst_3
    //   179: invokeinterface 293 2 0
    //   184: i2l
    //   185: lstore_1
    //   186: aload 4
    //   188: astore_3
    //   189: aload_0
    //   190: aload 4
    //   192: iconst_4
    //   193: invokeinterface 289 2 0
    //   198: invokespecial 531	brk:g	(Ljava/lang/String;)Ljava/util/Map;
    //   201: astore 6
    //   203: aload 4
    //   205: astore_3
    //   206: aload 5
    //   208: invokestatic 126	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   211: ifne +14 -> 225
    //   214: aload 4
    //   216: astore_3
    //   217: aload 7
    //   219: invokestatic 126	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   222: ifeq +76 -> 298
    //   225: aload 4
    //   227: astore_3
    //   228: aload_0
    //   229: ldc_w 533
    //   232: aload 5
    //   234: aload 7
    //   236: invokevirtual 535	brk:c	(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   239: aload 4
    //   241: astore_3
    //   242: aload 4
    //   244: invokeinterface 236 1 0
    //   249: ifne -119 -> 130
    //   252: aload 4
    //   254: astore_3
    //   255: aload 9
    //   257: invokeinterface 154 1 0
    //   262: iload 10
    //   264: if_icmplt +13 -> 277
    //   267: aload 4
    //   269: astore_3
    //   270: aload_0
    //   271: ldc_w 537
    //   274: invokevirtual 539	brk:e	(Ljava/lang/String;)V
    //   277: aload 4
    //   279: ifnull +10 -> 289
    //   282: aload 4
    //   284: invokeinterface 104 1 0
    //   289: aload 9
    //   291: areturn
    //   292: iconst_0
    //   293: istore 11
    //   295: goto -122 -> 173
    //   298: aload 4
    //   300: astore_3
    //   301: new 330	bre
    //   304: astore 8
    //   306: aload 4
    //   308: astore_3
    //   309: aload 8
    //   311: lconst_0
    //   312: aload 5
    //   314: aload 7
    //   316: iload 11
    //   318: lload_1
    //   319: aload 6
    //   321: invokespecial 542	bre:<init>	(JLjava/lang/String;Ljava/lang/String;ZJLjava/util/Map;)V
    //   324: aload 4
    //   326: astore_3
    //   327: aload 9
    //   329: aload 8
    //   331: invokeinterface 233 2 0
    //   336: pop
    //   337: goto -98 -> 239
    //   340: astore 5
    //   342: aload 4
    //   344: astore_3
    //   345: aload_0
    //   346: ldc_w 306
    //   349: aload 5
    //   351: invokevirtual 186	brk:e	(Ljava/lang/String;Ljava/lang/Object;)V
    //   354: aload 5
    //   356: athrow
    //   357: astore 4
    //   359: aload_3
    //   360: ifnull +9 -> 369
    //   363: aload_3
    //   364: invokeinterface 104 1 0
    //   369: aload 4
    //   371: athrow
    //   372: astore 4
    //   374: goto -15 -> 359
    //   377: astore 5
    //   379: aconst_null
    //   380: astore_3
    //   381: goto -36 -> 345
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	384	0	this	brk
    //   0	384	1	paramLong	long
    //   18	363	3	localCursor1	Cursor
    //   14	329	4	localCursor2	Cursor
    //   357	13	4	localObject1	Object
    //   372	1	4	localObject2	Object
    //   11	302	5	localObject3	Object
    //   340	15	5	localSQLiteException1	SQLiteException
    //   377	1	5	localSQLiteException2	SQLiteException
    //   201	119	6	localMap	Map
    //   154	161	7	str	String
    //   304	26	8	localbre	bre
    //   107	221	9	localArrayList	ArrayList
    //   31	234	10	i	int
    //   171	146	11	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   104	109	340	android/database/sqlite/SQLiteException
    //   112	117	340	android/database/sqlite/SQLiteException
    //   120	130	340	android/database/sqlite/SQLiteException
    //   133	143	340	android/database/sqlite/SQLiteException
    //   146	156	340	android/database/sqlite/SQLiteException
    //   159	170	340	android/database/sqlite/SQLiteException
    //   176	186	340	android/database/sqlite/SQLiteException
    //   189	203	340	android/database/sqlite/SQLiteException
    //   206	214	340	android/database/sqlite/SQLiteException
    //   217	225	340	android/database/sqlite/SQLiteException
    //   228	239	340	android/database/sqlite/SQLiteException
    //   242	252	340	android/database/sqlite/SQLiteException
    //   255	267	340	android/database/sqlite/SQLiteException
    //   270	277	340	android/database/sqlite/SQLiteException
    //   301	306	340	android/database/sqlite/SQLiteException
    //   309	324	340	android/database/sqlite/SQLiteException
    //   327	337	340	android/database/sqlite/SQLiteException
    //   345	357	357	finally
    //   19	33	372	finally
    //   36	101	372	finally
    //   104	109	372	finally
    //   112	117	372	finally
    //   120	130	372	finally
    //   133	143	372	finally
    //   146	156	372	finally
    //   159	170	372	finally
    //   176	186	372	finally
    //   189	203	372	finally
    //   206	214	372	finally
    //   217	225	372	finally
    //   228	239	372	finally
    //   242	252	372	finally
    //   255	267	372	finally
    //   270	277	372	finally
    //   301	306	372	finally
    //   309	324	372	finally
    //   327	337	372	finally
    //   19	33	377	android/database/sqlite/SQLiteException
    //   36	101	377	android/database/sqlite/SQLiteException
  }
  
  public final void c()
  {
    r();
    t().setTransactionSuccessful();
  }
  
  public final void close()
  {
    try
    {
      this.c.close();
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        e("Sql error closing database", localSQLiteException);
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        e("Error closing database", localIllegalStateException);
      }
    }
  }
  
  public final void d()
  {
    r();
    t().endTransaction();
  }
  
  final boolean e()
  {
    if (i() == 0L) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final int f()
  {
    int i = 0;
    brb.i();
    r();
    if (!this.e.a(86400000L)) {}
    for (;;)
    {
      return i;
      this.e.a();
      b("Deleting stale hits (if any)");
      i = t().delete("hits2", "hit_time < ?", new String[] { Long.toString(k().a() - 2592000000L) });
      a("Deleted stale hits, count", Integer.valueOf(i));
    }
  }
  
  public final long g()
  {
    brb.i();
    r();
    return a(b, null, 0L);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\brk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */