import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import org.apache.http.impl.client.DefaultHttpClient;

final class cwl
  implements cvo
{
  private static final String a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL,'%s' INTEGER NOT NULL);", new Object[] { "gtm_hits", "hit_id", "hit_time", "hit_url", "hit_first_send_time" });
  private final cwn b;
  private volatile cuz c;
  private final cvp d;
  private final Context e;
  private final String f;
  private long g;
  private cac h;
  private final int i;
  
  cwl(cvp paramcvp, Context paramContext)
  {
    this(paramcvp, paramContext, "gtm_urls.db", 2000);
  }
  
  private cwl(cvp paramcvp, Context paramContext, String paramString, int paramInt)
  {
    this.e = paramContext.getApplicationContext();
    this.f = paramString;
    this.d = paramcvp;
    this.h = cad.c();
    this.b = new cwn(this, this.e, this.f);
    this.c = new cxw(new DefaultHttpClient(), this.e, new cwm(this));
    this.g = 0L;
    this.i = 2000;
  }
  
  private SQLiteDatabase a(String paramString)
  {
    try
    {
      SQLiteDatabase localSQLiteDatabase = this.b.getWritableDatabase();
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
  
  /* Error */
  private List a(int paramInt)
  {
    // Byte code:
    //   0: new 116	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 117	java/util/ArrayList:<init>	()V
    //   7: astore 5
    //   9: iload_1
    //   10: ifgt +11 -> 21
    //   13: ldc 119
    //   15: invokestatic 112	cuh:b	(Ljava/lang/String;)V
    //   18: aload 5
    //   20: areturn
    //   21: aload_0
    //   22: ldc 121
    //   24: invokespecial 123	cwl:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   27: astore_2
    //   28: aload_2
    //   29: ifnonnull +6 -> 35
    //   32: goto -14 -> 18
    //   35: ldc 125
    //   37: iconst_1
    //   38: anewarray 4	java/lang/Object
    //   41: dup
    //   42: iconst_0
    //   43: ldc 31
    //   45: aastore
    //   46: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   49: astore 4
    //   51: iload_1
    //   52: invokestatic 131	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   55: astore_3
    //   56: aload_2
    //   57: ldc 29
    //   59: iconst_1
    //   60: anewarray 39	java/lang/String
    //   63: dup
    //   64: iconst_0
    //   65: ldc 31
    //   67: aastore
    //   68: aconst_null
    //   69: aconst_null
    //   70: aconst_null
    //   71: aconst_null
    //   72: aload 4
    //   74: aload_3
    //   75: invokevirtual 137	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   78: astore_3
    //   79: aload_3
    //   80: astore_2
    //   81: aload_3
    //   82: invokeinterface 143 1 0
    //   87: ifeq +38 -> 125
    //   90: aload_3
    //   91: astore_2
    //   92: aload 5
    //   94: aload_3
    //   95: iconst_0
    //   96: invokeinterface 147 2 0
    //   101: invokestatic 151	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   104: invokeinterface 157 2 0
    //   109: pop
    //   110: aload_3
    //   111: astore_2
    //   112: aload_3
    //   113: invokeinterface 160 1 0
    //   118: istore 7
    //   120: iload 7
    //   122: ifne -32 -> 90
    //   125: aload_3
    //   126: ifnull +9 -> 135
    //   129: aload_3
    //   130: invokeinterface 163 1 0
    //   135: goto -117 -> 18
    //   138: astore 4
    //   140: aconst_null
    //   141: astore_3
    //   142: aload_3
    //   143: astore_2
    //   144: new 165	java/lang/StringBuilder
    //   147: astore 6
    //   149: aload_3
    //   150: astore_2
    //   151: aload 6
    //   153: ldc -89
    //   155: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   158: aload_3
    //   159: astore_2
    //   160: aload 6
    //   162: aload 4
    //   164: invokevirtual 173	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   167: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   173: invokestatic 112	cuh:b	(Ljava/lang/String;)V
    //   176: aload_3
    //   177: ifnull -42 -> 135
    //   180: aload_3
    //   181: invokeinterface 163 1 0
    //   186: goto -51 -> 135
    //   189: astore_2
    //   190: aconst_null
    //   191: astore_3
    //   192: aload_2
    //   193: astore 4
    //   195: aload_3
    //   196: ifnull +9 -> 205
    //   199: aload_3
    //   200: invokeinterface 163 1 0
    //   205: aload 4
    //   207: athrow
    //   208: astore 4
    //   210: aload_2
    //   211: astore_3
    //   212: goto -17 -> 195
    //   215: astore 4
    //   217: goto -75 -> 142
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	220	0	this	cwl
    //   0	220	1	paramInt	int
    //   27	133	2	localObject1	Object
    //   189	22	2	localObject2	Object
    //   55	157	3	localObject3	Object
    //   49	24	4	str	String
    //   138	25	4	localSQLiteException1	SQLiteException
    //   193	13	4	localObject4	Object
    //   208	1	4	localObject5	Object
    //   215	1	4	localSQLiteException2	SQLiteException
    //   7	86	5	localArrayList	java.util.ArrayList
    //   147	14	6	localStringBuilder	StringBuilder
    //   118	3	7	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   35	79	138	android/database/sqlite/SQLiteException
    //   35	79	189	finally
    //   81	90	208	finally
    //   92	110	208	finally
    //   112	120	208	finally
    //   144	149	208	finally
    //   151	158	208	finally
    //   160	176	208	finally
    //   81	90	215	android/database/sqlite/SQLiteException
    //   92	110	215	android/database/sqlite/SQLiteException
    //   112	120	215	android/database/sqlite/SQLiteException
  }
  
  private void a(long paramLong)
  {
    a(new String[] { String.valueOf(paramLong) });
  }
  
  private void a(String[] paramArrayOfString)
  {
    boolean bool = true;
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {}
    SQLiteDatabase localSQLiteDatabase;
    do
    {
      return;
      localSQLiteDatabase = a("Error opening database for deleteHits.");
    } while (localSQLiteDatabase == null);
    String str = String.format("HIT_ID in (%s)", new Object[] { TextUtils.join(",", Collections.nCopies(paramArrayOfString.length, "?")) });
    for (;;)
    {
      try
      {
        localSQLiteDatabase.delete("gtm_hits", str, paramArrayOfString);
        paramArrayOfString = this.d;
        if (c() != 0) {
          break label90;
        }
        paramArrayOfString.a(bool);
      }
      catch (SQLiteException paramArrayOfString)
      {
        cuh.b("Error deleting hits");
      }
      break;
      label90:
      bool = false;
    }
  }
  
  /* Error */
  private List b(int paramInt)
  {
    // Byte code:
    //   0: new 116	java/util/ArrayList
    //   3: dup
    //   4: invokespecial 117	java/util/ArrayList:<init>	()V
    //   7: astore_3
    //   8: aload_0
    //   9: ldc -7
    //   11: invokespecial 123	cwl:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   14: astore 5
    //   16: aload 5
    //   18: ifnonnull +9 -> 27
    //   21: aload_3
    //   22: astore 4
    //   24: aload 4
    //   26: areturn
    //   27: aconst_null
    //   28: astore 4
    //   30: ldc 125
    //   32: iconst_1
    //   33: anewarray 4	java/lang/Object
    //   36: dup
    //   37: iconst_0
    //   38: ldc 31
    //   40: aastore
    //   41: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   44: astore_2
    //   45: bipush 40
    //   47: invokestatic 131	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   50: astore 6
    //   52: aload 5
    //   54: ldc 29
    //   56: iconst_3
    //   57: anewarray 39	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: ldc 31
    //   64: aastore
    //   65: dup
    //   66: iconst_1
    //   67: ldc 33
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: ldc 37
    //   74: aastore
    //   75: aconst_null
    //   76: aconst_null
    //   77: aconst_null
    //   78: aconst_null
    //   79: aload_2
    //   80: aload 6
    //   82: invokevirtual 137	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   85: astore_2
    //   86: new 116	java/util/ArrayList
    //   89: astore 4
    //   91: aload 4
    //   93: invokespecial 117	java/util/ArrayList:<init>	()V
    //   96: aload_2
    //   97: invokeinterface 143 1 0
    //   102: ifeq +54 -> 156
    //   105: new 251	cvk
    //   108: astore_3
    //   109: aload_3
    //   110: aload_2
    //   111: iconst_0
    //   112: invokeinterface 147 2 0
    //   117: aload_2
    //   118: iconst_1
    //   119: invokeinterface 147 2 0
    //   124: aload_2
    //   125: iconst_2
    //   126: invokeinterface 147 2 0
    //   131: invokespecial 254	cvk:<init>	(JJJ)V
    //   134: aload 4
    //   136: aload_3
    //   137: invokeinterface 157 2 0
    //   142: pop
    //   143: aload_2
    //   144: invokeinterface 160 1 0
    //   149: istore 9
    //   151: iload 9
    //   153: ifne -48 -> 105
    //   156: aload_2
    //   157: ifnull +9 -> 166
    //   160: aload_2
    //   161: invokeinterface 163 1 0
    //   166: aload_2
    //   167: astore_3
    //   168: ldc 125
    //   170: iconst_1
    //   171: anewarray 4	java/lang/Object
    //   174: dup
    //   175: iconst_0
    //   176: ldc 31
    //   178: aastore
    //   179: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   182: astore 6
    //   184: aload_2
    //   185: astore_3
    //   186: bipush 40
    //   188: invokestatic 131	java/lang/Integer:toString	(I)Ljava/lang/String;
    //   191: astore 7
    //   193: aload_2
    //   194: astore_3
    //   195: aload 5
    //   197: ldc 29
    //   199: iconst_2
    //   200: anewarray 39	java/lang/String
    //   203: dup
    //   204: iconst_0
    //   205: ldc 31
    //   207: aastore
    //   208: dup
    //   209: iconst_1
    //   210: ldc 35
    //   212: aastore
    //   213: aconst_null
    //   214: aconst_null
    //   215: aconst_null
    //   216: aconst_null
    //   217: aload 6
    //   219: aload 7
    //   221: invokevirtual 137	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   224: astore 5
    //   226: aload 5
    //   228: invokeinterface 143 1 0
    //   233: ifeq +68 -> 301
    //   236: iconst_0
    //   237: istore_1
    //   238: aload 5
    //   240: checkcast 256	android/database/sqlite/SQLiteCursor
    //   243: invokevirtual 260	android/database/sqlite/SQLiteCursor:getWindow	()Landroid/database/CursorWindow;
    //   246: invokevirtual 265	android/database/CursorWindow:getNumRows	()I
    //   249: ifle +297 -> 546
    //   252: aload 4
    //   254: iload_1
    //   255: invokeinterface 269 2 0
    //   260: checkcast 251	cvk
    //   263: astore_2
    //   264: aload 5
    //   266: iconst_1
    //   267: invokeinterface 272 2 0
    //   272: astore_3
    //   273: aload_3
    //   274: ifnull +13 -> 287
    //   277: aload_3
    //   278: invokevirtual 275	java/lang/String:trim	()Ljava/lang/String;
    //   281: invokestatic 279	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   284: ifeq +105 -> 389
    //   287: aload 5
    //   289: invokeinterface 160 1 0
    //   294: istore 9
    //   296: iload 9
    //   298: ifne +356 -> 654
    //   301: aload 5
    //   303: ifnull +10 -> 313
    //   306: aload 5
    //   308: invokeinterface 163 1 0
    //   313: goto -289 -> 24
    //   316: astore 4
    //   318: aconst_null
    //   319: astore 5
    //   321: aload_3
    //   322: astore_2
    //   323: aload 5
    //   325: astore_3
    //   326: new 165	java/lang/StringBuilder
    //   329: astore 5
    //   331: aload 5
    //   333: ldc -89
    //   335: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   338: aload 5
    //   340: aload 4
    //   342: invokevirtual 173	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   345: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   351: invokestatic 112	cuh:b	(Ljava/lang/String;)V
    //   354: aload_2
    //   355: astore 4
    //   357: aload_3
    //   358: ifnull -334 -> 24
    //   361: aload_3
    //   362: invokeinterface 163 1 0
    //   367: aload_2
    //   368: astore 4
    //   370: goto -346 -> 24
    //   373: astore_2
    //   374: aload 4
    //   376: astore_3
    //   377: aload_3
    //   378: ifnull +9 -> 387
    //   381: aload_3
    //   382: invokeinterface 163 1 0
    //   387: aload_2
    //   388: athrow
    //   389: aload_2
    //   390: aload_3
    //   391: putfield 281	cvk:c	Ljava/lang/String;
    //   394: goto -107 -> 287
    //   397: astore_3
    //   398: aload 5
    //   400: astore_2
    //   401: aload_3
    //   402: astore 5
    //   404: aload_2
    //   405: astore_3
    //   406: new 165	java/lang/StringBuilder
    //   409: astore 6
    //   411: aload_2
    //   412: astore_3
    //   413: aload 6
    //   415: ldc_w 283
    //   418: invokespecial 169	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   421: aload_2
    //   422: astore_3
    //   423: aload 6
    //   425: aload 5
    //   427: invokevirtual 173	android/database/sqlite/SQLiteException:getMessage	()Ljava/lang/String;
    //   430: invokevirtual 177	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   436: invokestatic 112	cuh:b	(Ljava/lang/String;)V
    //   439: aload_2
    //   440: astore_3
    //   441: new 116	java/util/ArrayList
    //   444: astore 5
    //   446: aload_2
    //   447: astore_3
    //   448: aload 5
    //   450: invokespecial 117	java/util/ArrayList:<init>	()V
    //   453: iconst_0
    //   454: istore_1
    //   455: aload_2
    //   456: astore_3
    //   457: aload 4
    //   459: invokeinterface 287 1 0
    //   464: astore 4
    //   466: aload_2
    //   467: astore_3
    //   468: aload 4
    //   470: invokeinterface 292 1 0
    //   475: ifeq +114 -> 589
    //   478: aload_2
    //   479: astore_3
    //   480: aload 4
    //   482: invokeinterface 296 1 0
    //   487: checkcast 251	cvk
    //   490: astore 6
    //   492: iload_1
    //   493: istore 8
    //   495: aload_2
    //   496: astore_3
    //   497: aload 6
    //   499: getfield 281	cvk:c	Ljava/lang/String;
    //   502: invokestatic 279	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   505: ifeq +10 -> 515
    //   508: iload_1
    //   509: ifne +80 -> 589
    //   512: iconst_1
    //   513: istore 8
    //   515: aload_2
    //   516: astore_3
    //   517: aload 5
    //   519: aload 6
    //   521: invokeinterface 157 2 0
    //   526: pop
    //   527: iload 8
    //   529: istore_1
    //   530: goto -64 -> 466
    //   533: astore_2
    //   534: aload_3
    //   535: ifnull +9 -> 544
    //   538: aload_3
    //   539: invokeinterface 163 1 0
    //   544: aload_2
    //   545: athrow
    //   546: ldc_w 298
    //   549: iconst_1
    //   550: anewarray 4	java/lang/Object
    //   553: dup
    //   554: iconst_0
    //   555: aload 4
    //   557: iload_1
    //   558: invokeinterface 269 2 0
    //   563: checkcast 251	cvk
    //   566: getfield 300	cvk:a	J
    //   569: invokestatic 197	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   572: aastore
    //   573: invokestatic 43	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   576: invokestatic 112	cuh:b	(Ljava/lang/String;)V
    //   579: goto -292 -> 287
    //   582: astore_2
    //   583: aload 5
    //   585: astore_3
    //   586: goto -52 -> 534
    //   589: aload_2
    //   590: ifnull +9 -> 599
    //   593: aload_2
    //   594: invokeinterface 163 1 0
    //   599: aload 5
    //   601: astore 4
    //   603: goto -579 -> 24
    //   606: astore 5
    //   608: goto -204 -> 404
    //   611: astore_3
    //   612: aload_2
    //   613: astore 4
    //   615: aload_3
    //   616: astore_2
    //   617: aload 4
    //   619: astore_3
    //   620: goto -243 -> 377
    //   623: astore_2
    //   624: goto -247 -> 377
    //   627: astore 4
    //   629: aload_2
    //   630: astore 5
    //   632: aload_3
    //   633: astore_2
    //   634: aload 5
    //   636: astore_3
    //   637: goto -311 -> 326
    //   640: astore 5
    //   642: aload_2
    //   643: astore_3
    //   644: aload 4
    //   646: astore_2
    //   647: aload 5
    //   649: astore 4
    //   651: goto -325 -> 326
    //   654: iinc 1 1
    //   657: goto -419 -> 238
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	660	0	this	cwl
    //   0	660	1	paramInt	int
    //   44	324	2	localObject1	Object
    //   373	17	2	localObject2	Object
    //   400	116	2	localObject3	Object
    //   533	12	2	localObject4	Object
    //   582	31	2	localObject5	Object
    //   616	1	2	localObject6	Object
    //   623	7	2	localObject7	Object
    //   633	14	2	localObject8	Object
    //   7	384	3	localObject9	Object
    //   397	5	3	localSQLiteException1	SQLiteException
    //   405	181	3	localObject10	Object
    //   611	5	3	localObject11	Object
    //   619	25	3	localObject12	Object
    //   22	231	4	localObject13	Object
    //   316	25	4	localSQLiteException2	SQLiteException
    //   355	263	4	localObject14	Object
    //   627	18	4	localSQLiteException3	SQLiteException
    //   649	1	4	localSQLiteException4	SQLiteException
    //   14	586	5	localObject15	Object
    //   606	1	5	localSQLiteException5	SQLiteException
    //   630	5	5	localObject16	Object
    //   640	8	5	localSQLiteException6	SQLiteException
    //   50	470	6	localObject17	Object
    //   191	29	7	str	String
    //   493	35	8	j	int
    //   149	148	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   30	86	316	android/database/sqlite/SQLiteException
    //   30	86	373	finally
    //   226	236	397	android/database/sqlite/SQLiteException
    //   238	273	397	android/database/sqlite/SQLiteException
    //   277	287	397	android/database/sqlite/SQLiteException
    //   287	296	397	android/database/sqlite/SQLiteException
    //   389	394	397	android/database/sqlite/SQLiteException
    //   546	579	397	android/database/sqlite/SQLiteException
    //   168	184	533	finally
    //   186	193	533	finally
    //   195	226	533	finally
    //   406	411	533	finally
    //   413	421	533	finally
    //   423	439	533	finally
    //   441	446	533	finally
    //   448	453	533	finally
    //   457	466	533	finally
    //   468	478	533	finally
    //   480	492	533	finally
    //   497	508	533	finally
    //   517	527	533	finally
    //   226	236	582	finally
    //   238	273	582	finally
    //   277	287	582	finally
    //   287	296	582	finally
    //   389	394	582	finally
    //   546	579	582	finally
    //   168	184	606	android/database/sqlite/SQLiteException
    //   186	193	606	android/database/sqlite/SQLiteException
    //   195	226	606	android/database/sqlite/SQLiteException
    //   86	96	611	finally
    //   96	105	611	finally
    //   105	151	611	finally
    //   326	354	623	finally
    //   86	96	627	android/database/sqlite/SQLiteException
    //   96	105	640	android/database/sqlite/SQLiteException
    //   105	151	640	android/database/sqlite/SQLiteException
  }
  
  private int c()
  {
    Object localObject3 = null;
    Object localObject1 = null;
    int j = 0;
    int m = 0;
    Object localObject5 = a("Error opening database for getNumStoredHits.");
    int k;
    if (localObject5 == null) {
      k = m;
    }
    for (;;)
    {
      return k;
      try
      {
        localObject5 = ((SQLiteDatabase)localObject5).rawQuery("SELECT COUNT(*) from gtm_hits", null);
        localObject1 = localObject5;
        localObject3 = localObject5;
        if (((Cursor)localObject5).moveToFirst())
        {
          localObject1 = localObject5;
          localObject3 = localObject5;
          long l = ((Cursor)localObject5).getLong(0);
          j = (int)l;
        }
        k = j;
        if (localObject5 == null) {
          continue;
        }
        ((Cursor)localObject5).close();
        k = j;
      }
      catch (SQLiteException localSQLiteException)
      {
        localObject4 = localObject1;
        cuh.b("Error getting numStoredHits");
        k = m;
        if (localObject1 == null) {
          continue;
        }
        ((Cursor)localObject1).close();
        k = m;
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
  
  /* Error */
  private int d()
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_0
    //   6: ldc -67
    //   8: invokespecial 123	cwl:a	(Ljava/lang/String;)Landroid/database/sqlite/SQLiteDatabase;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnonnull +6 -> 19
    //   16: iload 4
    //   18: ireturn
    //   19: aload_1
    //   20: ldc 29
    //   22: iconst_2
    //   23: anewarray 39	java/lang/String
    //   26: dup
    //   27: iconst_0
    //   28: ldc 31
    //   30: aastore
    //   31: dup
    //   32: iconst_1
    //   33: ldc 37
    //   35: aastore
    //   36: ldc_w 311
    //   39: aconst_null
    //   40: aconst_null
    //   41: aconst_null
    //   42: aconst_null
    //   43: invokevirtual 314	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   46: astore_1
    //   47: aload_1
    //   48: invokeinterface 317 1 0
    //   53: istore 5
    //   55: iload 5
    //   57: istore 4
    //   59: aload_1
    //   60: ifnull +13 -> 73
    //   63: aload_1
    //   64: invokeinterface 163 1 0
    //   69: iload 5
    //   71: istore 4
    //   73: goto -57 -> 16
    //   76: astore_1
    //   77: aconst_null
    //   78: astore_1
    //   79: ldc_w 319
    //   82: invokestatic 112	cuh:b	(Ljava/lang/String;)V
    //   85: aload_1
    //   86: ifnull +48 -> 134
    //   89: aload_1
    //   90: invokeinterface 163 1 0
    //   95: iconst_0
    //   96: istore 4
    //   98: goto -25 -> 73
    //   101: astore_1
    //   102: aload_2
    //   103: ifnull +9 -> 112
    //   106: aload_2
    //   107: invokeinterface 163 1 0
    //   112: aload_1
    //   113: athrow
    //   114: astore_3
    //   115: aload_1
    //   116: astore_2
    //   117: aload_3
    //   118: astore_1
    //   119: goto -17 -> 102
    //   122: astore_3
    //   123: aload_1
    //   124: astore_2
    //   125: aload_3
    //   126: astore_1
    //   127: goto -25 -> 102
    //   130: astore_2
    //   131: goto -52 -> 79
    //   134: iconst_0
    //   135: istore 4
    //   137: goto -64 -> 73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	this	cwl
    //   11	53	1	localObject1	Object
    //   76	1	1	localSQLiteException1	SQLiteException
    //   78	12	1	localObject2	Object
    //   101	15	1	localObject3	Object
    //   118	9	1	localObject4	Object
    //   4	121	2	localObject5	Object
    //   130	1	2	localSQLiteException2	SQLiteException
    //   114	4	3	localObject6	Object
    //   122	4	3	localObject7	Object
    //   1	135	4	j	int
    //   53	17	5	k	int
    // Exception table:
    //   from	to	target	type
    //   19	47	76	android/database/sqlite/SQLiteException
    //   19	47	101	finally
    //   47	55	114	finally
    //   79	85	122	finally
    //   47	55	130	android/database/sqlite/SQLiteException
  }
  
  public final void a()
  {
    cuh.e("GTM Dispatch running...");
    if (!this.c.a()) {}
    for (;;)
    {
      return;
      List localList = b(40);
      if (localList.isEmpty())
      {
        cuh.e("...nothing to dispatch");
        this.d.a(true);
      }
      else
      {
        this.c.a(localList);
        if (d() > 0) {
          cum.a().c();
        }
      }
    }
  }
  
  public final void a(long paramLong, String paramString)
  {
    boolean bool = true;
    long l = this.h.a();
    if (l <= this.g + 86400000L) {}
    for (;;)
    {
      int j = c() - this.i + 1;
      if (j > 0)
      {
        localObject = a(j);
        cuh.e("Store full, deleting " + ((List)localObject).size() + " hits to make room.");
        a((String[])((List)localObject).toArray(new String[0]));
      }
      Object localObject = a("Error opening database for putHit");
      ContentValues localContentValues;
      if (localObject != null)
      {
        localContentValues = new ContentValues();
        localContentValues.put("hit_time", Long.valueOf(paramLong));
        localContentValues.put("hit_url", paramString);
        localContentValues.put("hit_first_send_time", Integer.valueOf(0));
      }
      try
      {
        ((SQLiteDatabase)localObject).insert("gtm_hits", null, localContentValues);
        this.d.a(false);
        return;
        this.g = l;
        localObject = a("Error opening database for deleteStaleHits.");
        if (localObject == null) {
          continue;
        }
        ((SQLiteDatabase)localObject).delete("gtm_hits", "HIT_TIME < ?", new String[] { Long.toString(this.h.a() - 2592000000L) });
        localObject = this.d;
        if (c() == 0) {}
        for (;;)
        {
          ((cvp)localObject).a(bool);
          break;
          bool = false;
        }
      }
      catch (SQLiteException paramString)
      {
        for (;;)
        {
          cuh.b("Error storing hit");
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */