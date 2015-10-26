import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class aby
  extends CursorAdapter
{
  private static final Map g = new HashMap();
  private final long a;
  private int b;
  private abz c;
  private final Long d;
  private abj e;
  private final StateListDrawable f;
  
  public aby(Context paramContext, long paramLong1, Long paramLong, String paramString, long paramLong2, int paramInt, abz paramabz, abj paramabj, StateListDrawable paramStateListDrawable, s params) {}
  
  static acx a(acx paramacx1, acx paramacx2)
  {
    acx localacx;
    if (paramacx2 == null) {
      localacx = paramacx1;
    }
    for (;;)
    {
      return localacx;
      localacx = paramacx2;
      if (paramacx1 != null) {
        if ((!TextUtils.isEmpty(paramacx1.c)) && (TextUtils.isEmpty(paramacx2.c)))
        {
          localacx = paramacx1;
        }
        else if (!TextUtils.isEmpty(paramacx2.c))
        {
          localacx = paramacx2;
          if (TextUtils.isEmpty(paramacx1.c)) {}
        }
        else if ((!TextUtils.equals(paramacx1.c, paramacx1.d)) && (TextUtils.equals(paramacx2.c, paramacx2.d)))
        {
          localacx = paramacx1;
        }
        else if (!TextUtils.equals(paramacx2.c, paramacx2.d))
        {
          localacx = paramacx2;
          if (TextUtils.equals(paramacx1.c, paramacx1.d)) {}
        }
        else if (((paramacx1.j != null) || (paramacx1.a() != null)) && (paramacx2.j == null) && (paramacx2.a() == null))
        {
          localacx = paramacx1;
        }
        else if (paramacx2.j == null)
        {
          localacx = paramacx2;
          if (paramacx2.a() == null) {}
        }
        else
        {
          localacx = paramacx2;
          if (paramacx1.j == null)
          {
            localacx = paramacx2;
            if (paramacx1.a() == null) {
              localacx = paramacx2;
            }
          }
        }
      }
    }
  }
  
  private static Cursor a(Cursor paramCursor, String paramString1, String paramString2)
  {
    MatrixCursor localMatrixCursor = new MatrixCursor(paramCursor.getColumnNames(), paramCursor.getCount());
    HashSet localHashSet = new HashSet();
    paramCursor.moveToPosition(-1);
    String str2;
    String str1;
    while (paramCursor.moveToNext()) {
      if ("vnd.android.cursor.item/name".equals(paramCursor.getString(9)))
      {
        str2 = paramCursor.getString(0);
        str1 = paramCursor.getString(6);
      }
    }
    for (int i = paramCursor.getInt(7);; i = 0)
    {
      paramCursor.moveToPosition(-1);
      while (paramCursor.moveToNext()) {
        if ((paramString1 == null) || (paramString1.equals(paramCursor.getString(9))))
        {
          Object localObject1 = paramCursor.getString(1);
          if (!localHashSet.contains(localObject1))
          {
            localHashSet.add(localObject1);
            localObject1 = new Object[10];
            localObject1[0] = paramCursor.getString(0);
            localObject1[1] = paramCursor.getString(1);
            localObject1[2] = Integer.valueOf(paramCursor.getInt(2));
            localObject1[3] = paramCursor.getString(3);
            localObject1[4] = Long.valueOf(paramCursor.getLong(4));
            localObject1[5] = Long.valueOf(paramCursor.getLong(5));
            localObject1[6] = paramCursor.getString(6);
            localObject1[7] = Integer.valueOf(paramCursor.getInt(7));
            localObject1[8] = paramCursor.getString(8);
            localObject1[9] = paramCursor.getString(9);
            if (localObject1[0] == null) {
              localObject1[0] = str2;
            }
            if (localObject1[6] == null) {
              localObject1[6] = str1;
            }
            if (((Integer)localObject1[7]).intValue() == 0) {
              localObject1[7] = Integer.valueOf(i);
            }
            if (localObject1[8] == null) {
              localObject1[8] = paramString2;
            }
            String str3 = (String)localObject1[6];
            if (str3 != null)
            {
              if (!g.containsKey(str3)) {
                break label409;
              }
              localObject1[6] = g.get(str3);
            }
            for (;;)
            {
              localMatrixCursor.addRow((Object[])localObject1);
              break;
              label409:
              if (str3.indexOf('?') != str3.lastIndexOf('?'))
              {
                Object localObject2 = str3.split("\\?");
                StringBuilder localStringBuilder = new StringBuilder();
                int j = 0;
                if (j < localObject2.length)
                {
                  if (j == 1) {
                    localStringBuilder.append("?");
                  }
                  for (;;)
                  {
                    localStringBuilder.append(localObject2[j]);
                    j++;
                    break;
                    if (j > 1) {
                      localStringBuilder.append("&");
                    }
                  }
                }
                localObject2 = localStringBuilder.toString();
                g.put(str3, localObject2);
                localObject1[6] = localObject2;
              }
            }
          }
        }
      }
      return localMatrixCursor;
      str2 = null;
      str1 = null;
    }
  }
  
  private static HashMap a(Cursor paramCursor, Long paramLong)
  {
    HashMap localHashMap = new HashMap();
    if ((paramCursor != null) && (paramCursor.moveToFirst())) {
      do
      {
        String str1 = paramCursor.getString(1);
        Object localObject = acx.a(paramCursor.getString(0), paramCursor.getInt(7), paramCursor.getString(1), paramCursor.getInt(2), paramCursor.getString(3), paramCursor.getLong(4), paramLong, paramCursor.getLong(5), paramCursor.getString(6), true, paramCursor.getString(8));
        localHashMap.put(str1, a((acx)localHashMap.get(str1), (acx)localObject));
        if (Log.isLoggable("RecipAlternates", 3))
        {
          localObject = String.valueOf(paramCursor.getString(0));
          long l = paramCursor.getLong(4);
          String str2 = String.valueOf(paramCursor.getString(1));
          new StringBuilder(String.valueOf(str1).length() + 103 + String.valueOf(localObject).length() + String.valueOf(str2).length()).append("Received reverse look up information for ").append(str1).append(" RESULTS:  NAME : ").append((String)localObject).append(" CONTACT ID : ").append(l).append(" ADDRESS :").append(str2);
        }
      } while (paramCursor.moveToNext());
    }
    return localHashMap;
  }
  
  public static void a(Context paramContext, aav paramaav, ArrayList paramArrayList, Account paramAccount, aca paramaca, s params)
  {
    abw localabw = abt.b;
    int j = Math.min(50, paramArrayList.size());
    HashSet localHashSet = new HashSet();
    Object localObject = new StringBuilder();
    int i = 0;
    if (i < j)
    {
      paramaav = Rfc822Tokenizer.tokenize(((String)paramArrayList.get(i)).toLowerCase());
      if (paramaav.length > 0) {}
      for (paramaav = paramaav[0].getAddress();; paramaav = (String)paramArrayList.get(i))
      {
        localHashSet.add(paramaav);
        ((StringBuilder)localObject).append("?");
        if (i < j - 1) {
          ((StringBuilder)localObject).append(",");
        }
        i++;
        break;
      }
    }
    String[] arrayOfString2;
    if (Log.isLoggable("RecipAlternates", 3))
    {
      paramaav = String.valueOf(localHashSet.toString());
      if (paramaav.length() != 0) {
        "Doing reverse lookup for ".concat(paramaav);
      }
    }
    else
    {
      arrayOfString2 = new String[localHashSet.size()];
      localHashSet.toArray(arrayOfString2);
    }
    for (;;)
    {
      try
      {
        if (abe.a(paramContext, params))
        {
          paramaav = paramContext.getContentResolver();
          Uri localUri = localabw.c;
          String[] arrayOfString1 = localabw.a;
          paramArrayList = localabw.a[1];
          localObject = String.valueOf(((StringBuilder)localObject).toString());
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>(String.valueOf(paramArrayList).length() + 6 + String.valueOf(localObject).length());
          paramaav = paramaav.query(localUri, arrayOfString1, paramArrayList + " IN (" + (String)localObject + ")", arrayOfString2, null);
        }
      }
      finally
      {
        paramaav = null;
        if (paramaav != null) {
          paramaav.close();
        }
      }
      try
      {
        paramArrayList = a(paramaav, null);
        paramaca.a(paramArrayList);
        if (paramaav != null) {
          paramaav.close();
        }
        paramaav = new HashSet();
        a(paramContext, paramArrayList, localHashSet, paramAccount, paramaav, localabw, paramaca, params);
        paramaca.a(paramaav);
        return;
      }
      finally {}
      new String("Doing reverse lookup for ");
      break;
    }
  }
  
  /* Error */
  private static void a(Context paramContext, Map paramMap, java.util.Set paramSet1, Account paramAccount, java.util.Set paramSet2, abw paramabw, aca paramaca, s params)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 362 1 0
    //   6: aload_2
    //   7: invokeinterface 365 1 0
    //   12: if_icmpge +111 -> 123
    //   15: new 182	java/util/HashSet
    //   18: dup
    //   19: invokespecial 183	java/util/HashSet:<init>	()V
    //   22: astore 9
    //   24: aload_2
    //   25: invokeinterface 369 1 0
    //   30: astore 8
    //   32: aload 8
    //   34: invokeinterface 374 1 0
    //   39: ifeq +34 -> 73
    //   42: aload 8
    //   44: invokeinterface 378 1 0
    //   49: checkcast 68	java/lang/String
    //   52: astore_2
    //   53: aload_1
    //   54: aload_2
    //   55: invokeinterface 234 2 0
    //   60: ifne -28 -> 32
    //   63: aload 9
    //   65: aload_2
    //   66: invokevirtual 210	java/util/HashSet:add	(Ljava/lang/Object;)Z
    //   69: pop
    //   70: goto -38 -> 32
    //   73: aload 4
    //   75: aload 9
    //   77: invokeinterface 382 2 0
    //   82: pop
    //   83: aload_0
    //   84: aload 7
    //   86: invokestatic 60	abe:a	(Landroid/content/Context;Ls;)Z
    //   89: ifeq +392 -> 481
    //   92: aload_0
    //   93: invokevirtual 66	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   96: getstatic 386	aba:a	Landroid/net/Uri;
    //   99: getstatic 388	aba:b	[Ljava/lang/String;
    //   102: aconst_null
    //   103: aconst_null
    //   104: aconst_null
    //   105: invokevirtual 78	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   108: astore_1
    //   109: aload_1
    //   110: ifnonnull +14 -> 124
    //   113: aload_1
    //   114: ifnull +9 -> 123
    //   117: aload_1
    //   118: invokeinterface 86 1 0
    //   123: return
    //   124: aload_0
    //   125: aload_1
    //   126: aload_3
    //   127: invokestatic 393	aav:a	(Landroid/content/Context;Landroid/database/Cursor;Landroid/accounts/Account;)Ljava/util/List;
    //   130: astore 8
    //   132: aload_1
    //   133: ifnull +9 -> 142
    //   136: aload_1
    //   137: invokeinterface 86 1 0
    //   142: aconst_null
    //   143: astore_2
    //   144: aload 9
    //   146: invokevirtual 394	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   149: astore 9
    //   151: aload 9
    //   153: invokeinterface 374 1 0
    //   158: ifeq -35 -> 123
    //   161: aload 9
    //   163: invokeinterface 378 1 0
    //   168: checkcast 68	java/lang/String
    //   171: astore 10
    //   173: iconst_0
    //   174: istore 12
    //   176: aload_2
    //   177: astore_1
    //   178: iload 12
    //   180: aload 8
    //   182: invokeinterface 397 1 0
    //   187: if_icmpge +286 -> 473
    //   190: aload 8
    //   192: iload 12
    //   194: invokeinterface 398 2 0
    //   199: checkcast 400	abb
    //   202: getfield 401	abb:a	J
    //   205: lstore 13
    //   207: lload 13
    //   209: invokestatic 226	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   212: astore 11
    //   214: aload_0
    //   215: aload 7
    //   217: invokestatic 60	abe:a	(Landroid/content/Context;Ls;)Z
    //   220: istore 15
    //   222: iload 15
    //   224: ifne +100 -> 324
    //   227: aconst_null
    //   228: astore_1
    //   229: aload_1
    //   230: ifnull +217 -> 447
    //   233: aload_1
    //   234: invokeinterface 177 1 0
    //   239: ifeq +208 -> 447
    //   242: aload_1
    //   243: lload 13
    //   245: invokestatic 226	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   248: invokestatic 347	aby:a	(Landroid/database/Cursor;Ljava/lang/Long;)Ljava/util/HashMap;
    //   251: astore_2
    //   252: aload_2
    //   253: invokeinterface 405 1 0
    //   258: invokeinterface 369 1 0
    //   263: astore 10
    //   265: aload 10
    //   267: invokeinterface 374 1 0
    //   272: ifeq +150 -> 422
    //   275: aload 4
    //   277: aload 10
    //   279: invokeinterface 378 1 0
    //   284: checkcast 68	java/lang/String
    //   287: invokeinterface 408 2 0
    //   292: pop
    //   293: goto -28 -> 265
    //   296: astore_0
    //   297: aload_1
    //   298: ifnull +9 -> 307
    //   301: aload_1
    //   302: invokeinterface 86 1 0
    //   307: aload_0
    //   308: athrow
    //   309: astore_0
    //   310: aconst_null
    //   311: astore_1
    //   312: aload_1
    //   313: ifnull +9 -> 322
    //   316: aload_1
    //   317: invokeinterface 86 1 0
    //   322: aload_0
    //   323: athrow
    //   324: aload 5
    //   326: getfield 410	abw:b	Landroid/net/Uri;
    //   329: invokevirtual 113	android/net/Uri:buildUpon	()Landroid/net/Uri$Builder;
    //   332: aload 10
    //   334: invokeinterface 413 1 0
    //   339: invokevirtual 121	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   342: ldc_w 415
    //   345: ldc_w 417
    //   348: invokevirtual 130	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   351: astore_2
    //   352: aload 11
    //   354: ifnull +15 -> 369
    //   357: aload_2
    //   358: ldc 123
    //   360: aload 11
    //   362: invokestatic 126	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   365: invokevirtual 130	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   368: pop
    //   369: aload_3
    //   370: ifnull +27 -> 397
    //   373: aload_2
    //   374: ldc_w 419
    //   377: aload_3
    //   378: getfield 424	android/accounts/Account:name	Ljava/lang/String;
    //   381: invokevirtual 130	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   384: pop
    //   385: aload_2
    //   386: ldc_w 426
    //   389: aload_3
    //   390: getfield 429	android/accounts/Account:type	Ljava/lang/String;
    //   393: invokevirtual 130	android/net/Uri$Builder:appendQueryParameter	(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   396: pop
    //   397: aload_0
    //   398: invokevirtual 66	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   401: aload_2
    //   402: invokevirtual 134	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   405: aload 5
    //   407: getfield 39	abw:a	[Ljava/lang/String;
    //   410: aconst_null
    //   411: aconst_null
    //   412: aconst_null
    //   413: invokevirtual 78	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   416: astore_2
    //   417: aload_2
    //   418: astore_1
    //   419: goto -190 -> 229
    //   422: aload 6
    //   424: aload_2
    //   425: invokeinterface 352 2 0
    //   430: aload_1
    //   431: astore_2
    //   432: aload_1
    //   433: ifnull -282 -> 151
    //   436: aload_1
    //   437: invokeinterface 86 1 0
    //   442: aconst_null
    //   443: astore_2
    //   444: goto -293 -> 151
    //   447: aload_1
    //   448: ifnull +30 -> 478
    //   451: aload_1
    //   452: invokeinterface 86 1 0
    //   457: aconst_null
    //   458: astore_1
    //   459: iinc 12 1
    //   462: goto -284 -> 178
    //   465: astore_0
    //   466: goto -169 -> 297
    //   469: astore_0
    //   470: goto -158 -> 312
    //   473: aload_1
    //   474: astore_2
    //   475: goto -324 -> 151
    //   478: goto -19 -> 459
    //   481: aconst_null
    //   482: astore_1
    //   483: goto -374 -> 109
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	486	0	paramContext	Context
    //   0	486	1	paramMap	Map
    //   0	486	2	paramSet1	java.util.Set
    //   0	486	3	paramAccount	Account
    //   0	486	4	paramSet2	java.util.Set
    //   0	486	5	paramabw	abw
    //   0	486	6	paramaca	aca
    //   0	486	7	params	s
    //   30	161	8	localObject1	Object
    //   22	140	9	localObject2	Object
    //   171	162	10	localObject3	Object
    //   212	149	11	localLong	Long
    //   174	286	12	i	int
    //   205	39	13	l	long
    //   220	3	15	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   233	265	296	finally
    //   265	293	296	finally
    //   422	430	296	finally
    //   83	109	309	finally
    //   207	222	465	finally
    //   324	352	465	finally
    //   357	369	465	finally
    //   373	397	465	finally
    //   397	417	465	finally
    //   124	132	469	finally
  }
  
  public final acx a(int paramInt)
  {
    Cursor localCursor = getCursor();
    localCursor.moveToPosition(paramInt);
    return acx.a(localCursor.getString(0), localCursor.getInt(7), localCursor.getString(1), localCursor.getInt(2), localCursor.getString(3), localCursor.getLong(4), this.d, localCursor.getLong(5), localCursor.getString(6), true, localCursor.getString(8));
  }
  
  public final void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = paramCursor.getPosition();
    paramContext = a(i);
    this.e.a(paramView, null, paramContext, i, abn.b, null, this.f);
  }
  
  public final long getItemId(int paramInt)
  {
    Cursor localCursor = getCursor();
    if (localCursor.moveToPosition(paramInt)) {
      localCursor.getLong(5);
    }
    return -1L;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Cursor localCursor = getCursor();
    localCursor.moveToPosition(paramInt);
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = this.e.a(abn.b);
    }
    if (localCursor.getLong(5) == this.a)
    {
      this.b = paramInt;
      if (this.c != null) {
        this.c.a(this.b);
      }
    }
    bindView(paramViewGroup, paramViewGroup.getContext(), localCursor);
    return paramViewGroup;
  }
  
  public final View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.e.a(abn.b);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aby.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */