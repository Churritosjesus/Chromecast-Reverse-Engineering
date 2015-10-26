import android.net.Uri;
import android.os.AsyncTask;

final class abh
  extends AsyncTask
{
  abh(abg paramabg, Uri paramUri, acx paramacx, abs paramabs) {}
  
  /* Error */
  private byte[] a()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: getfield 16	abh:d	Labg;
    //   6: getfield 34	abg:a	Landroid/content/ContentResolver;
    //   9: aload_0
    //   10: getfield 18	abh:a	Landroid/net/Uri;
    //   13: getstatic 39	abi:a	[Ljava/lang/String;
    //   16: aconst_null
    //   17: aconst_null
    //   18: aconst_null
    //   19: invokevirtual 45	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   22: astore_3
    //   23: aload_3
    //   24: ifnull +48 -> 72
    //   27: aload_3
    //   28: invokeinterface 51 1 0
    //   33: ifeq +19 -> 52
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 55 2 0
    //   43: astore_1
    //   44: aload_3
    //   45: invokeinterface 58 1 0
    //   50: aload_1
    //   51: areturn
    //   52: aload_3
    //   53: invokeinterface 58 1 0
    //   58: aload_2
    //   59: astore_1
    //   60: goto -10 -> 50
    //   63: astore_1
    //   64: aload_3
    //   65: invokeinterface 58 1 0
    //   70: aload_1
    //   71: athrow
    //   72: aload_0
    //   73: getfield 16	abh:d	Labg;
    //   76: getfield 34	abg:a	Landroid/content/ContentResolver;
    //   79: aload_0
    //   80: getfield 18	abh:a	Landroid/net/Uri;
    //   83: invokevirtual 62	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   86: astore_3
    //   87: aload_2
    //   88: astore_1
    //   89: aload_3
    //   90: ifnull -40 -> 50
    //   93: sipush 16384
    //   96: newarray <illegal type>
    //   98: astore_1
    //   99: new 64	java/io/ByteArrayOutputStream
    //   102: astore 4
    //   104: aload 4
    //   106: invokespecial 65	java/io/ByteArrayOutputStream:<init>	()V
    //   109: aload_3
    //   110: aload_1
    //   111: invokevirtual 71	java/io/InputStream:read	([B)I
    //   114: istore 5
    //   116: iload 5
    //   118: iconst_m1
    //   119: if_icmpeq +28 -> 147
    //   122: aload 4
    //   124: aload_1
    //   125: iconst_0
    //   126: iload 5
    //   128: invokevirtual 75	java/io/ByteArrayOutputStream:write	([BII)V
    //   131: goto -22 -> 109
    //   134: astore_1
    //   135: aload_3
    //   136: invokevirtual 76	java/io/InputStream:close	()V
    //   139: aload_1
    //   140: athrow
    //   141: astore_1
    //   142: aload_2
    //   143: astore_1
    //   144: goto -94 -> 50
    //   147: aload_3
    //   148: invokevirtual 76	java/io/InputStream:close	()V
    //   151: aload 4
    //   153: invokevirtual 79	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   156: astore_1
    //   157: goto -107 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	abh
    //   43	17	1	localObject1	Object
    //   63	8	1	localObject2	Object
    //   88	37	1	localObject3	Object
    //   134	6	1	localObject4	Object
    //   141	1	1	localIOException	java.io.IOException
    //   143	14	1	localObject5	Object
    //   1	142	2	localObject6	Object
    //   22	126	3	localObject7	Object
    //   102	50	4	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   114	13	5	i	int
    // Exception table:
    //   from	to	target	type
    //   27	44	63	finally
    //   109	116	134	finally
    //   122	131	134	finally
    //   72	87	141	java/io/IOException
    //   93	109	141	java/io/IOException
    //   135	141	141	java/io/IOException
    //   147	157	141	java/io/IOException
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */