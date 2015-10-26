import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

class ctv
  implements bwl
{
  final Context a;
  final String b;
  final ExecutorService c;
  cwb d;
  
  ctv(Context paramContext, String paramString)
  {
    this.a = paramContext;
    this.b = paramString;
    this.c = Executors.newSingleThreadExecutor();
  }
  
  static clz a(ByteArrayOutputStream paramByteArrayOutputStream)
  {
    localObject1 = null;
    try
    {
      Object localObject2 = paramByteArrayOutputStream.toString("UTF-8");
      paramByteArrayOutputStream = new org/json/JSONObject;
      paramByteArrayOutputStream.<init>((String)localObject2);
      paramByteArrayOutputStream = cyh.a(a.d(paramByteArrayOutputStream));
      localObject2 = clz.a();
      for (int i = 0; i < paramByteArrayOutputStream.d.length; i++) {
        ((cma)localObject2).a(clx.a().a(cit.u.toString(), paramByteArrayOutputStream.d[i]).a(cit.p.toString(), cyh.a(cyx.d())).a(cyx.e(), paramByteArrayOutputStream.e[i]).a());
      }
      paramByteArrayOutputStream = ((cma)localObject2).a();
    }
    catch (UnsupportedEncodingException paramByteArrayOutputStream)
    {
      for (;;)
      {
        cuh.d("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
        paramByteArrayOutputStream = (ByteArrayOutputStream)localObject1;
      }
    }
    catch (JSONException paramByteArrayOutputStream)
    {
      for (;;)
      {
        cuh.b("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
        paramByteArrayOutputStream = (ByteArrayOutputStream)localObject1;
      }
    }
    return paramByteArrayOutputStream;
  }
  
  static clz a(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = new ciz;
      ((ciz)localObject).<init>();
      localObject = a.a((ciz)cms.a((cms)localObject, paramArrayOfByte));
      paramArrayOfByte = (byte[])localObject;
      if (localObject != null)
      {
        cuh.e("The container was successfully loaded from the resource (using binary file)");
        paramArrayOfByte = (byte[])localObject;
      }
    }
    catch (cmr paramArrayOfByte)
    {
      for (;;)
      {
        cuh.a("The resource file is corrupted. The container cannot be extracted from the binary file");
        paramArrayOfByte = null;
      }
    }
    catch (cmd paramArrayOfByte)
    {
      for (;;)
      {
        cuh.b("The resource file is invalid. The container from the binary file is invalid");
        paramArrayOfByte = null;
      }
    }
    return paramArrayOfByte;
  }
  
  public clz a(int paramInt)
  {
    for (;;)
    {
      try
      {
        localObject1 = this.a.getResources().openRawResource(paramInt);
        cuh.e("Attempting to load a container from the resource ID " + paramInt + " (" + this.a.getResources().getResourceName(paramInt) + ")");
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        Object localObject1;
        ByteArrayOutputStream localByteArrayOutputStream;
        cuh.b("Failed to load the container. No default container resource found with the resource ID " + paramInt);
        clz localclz = null;
        continue;
        localclz = a(localByteArrayOutputStream.toByteArray());
        continue;
      }
      try
      {
        localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        a.a((InputStream)localObject1, localByteArrayOutputStream);
        localObject1 = a(localByteArrayOutputStream);
        if (localObject1 == null) {
          continue;
        }
        cuh.e("The container was successfully loaded from the resource (using JSON file format)");
      }
      catch (IOException localIOException)
      {
        cuh.b("Error reading the default container with resource ID " + paramInt + " (" + this.a.getResources().getResourceName(paramInt) + ")");
        Object localObject2 = null;
      }
    }
    return (clz)localObject1;
  }
  
  public void a()
  {
    try
    {
      this.c.shutdown();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(clv paramclv)
  {
    this.c.execute(new cxg(this, paramclv));
  }
  
  public void a(cwb paramcwb)
  {
    this.d = paramcwb;
  }
  
  public void b()
  {
    this.c.execute(new cxf(this));
  }
  
  boolean b(clv paramclv)
  {
    boolean bool = false;
    localFile = d();
    try
    {
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>(localFile);
      try
      {
        localFileOutputStream.close();
        throw paramclv;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          cuh.b("error closing stream for writing resource to disk");
        }
      }
    }
    catch (FileNotFoundException paramclv)
    {
      for (;;)
      {
        try
        {
          localFileOutputStream.write(cms.a(paramclv));
        }
        catch (IOException paramclv)
        {
          paramclv = paramclv;
          cuh.b("Error writing resource to disk. Removing resource from disk.");
          localFile.delete();
          try
          {
            localFileOutputStream.close();
          }
          catch (IOException paramclv)
          {
            cuh.b("error closing stream for writing resource to disk");
          }
          continue;
        }
        finally {}
        try
        {
          localFileOutputStream.close();
          bool = true;
          return bool;
          paramclv = paramclv;
          cuh.a("Error opening resource file for writing");
        }
        catch (IOException paramclv)
        {
          cuh.b("error closing stream for writing resource to disk");
        }
      }
    }
  }
  
  /* Error */
  void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 224	ctv:d	Lcwb;
    //   4: ifnonnull +14 -> 18
    //   7: new 266	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc_w 268
    //   14: invokespecial 269	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   17: athrow
    //   18: ldc_w 271
    //   21: invokestatic 144	cuh:e	(Ljava/lang/String;)V
    //   24: invokestatic 276	cuk:a	()Lcuk;
    //   27: getfield 279	cuk:a	Lcul;
    //   30: getstatic 283	cul:b	Lcul;
    //   33: if_acmpeq +15 -> 48
    //   36: invokestatic 276	cuk:a	()Lcuk;
    //   39: getfield 279	cuk:a	Lcul;
    //   42: getstatic 285	cul:c	Lcul;
    //   45: if_acmpne +36 -> 81
    //   48: aload_0
    //   49: getfield 23	ctv:b	Ljava/lang/String;
    //   52: invokestatic 276	cuk:a	()Lcuk;
    //   55: getfield 286	cuk:b	Ljava/lang/String;
    //   58: invokevirtual 292	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   61: ifeq +20 -> 81
    //   64: aload_0
    //   65: getfield 224	ctv:d	Lcwb;
    //   68: astore_1
    //   69: getstatic 297	cwc:a	I
    //   72: istore 4
    //   74: aload_1
    //   75: invokeinterface 301 1 0
    //   80: return
    //   81: new 303	java/io/FileInputStream
    //   84: astore_1
    //   85: aload_1
    //   86: aload_0
    //   87: invokevirtual 235	ctv:d	()Ljava/io/File;
    //   90: invokespecial 304	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   93: new 41	java/io/ByteArrayOutputStream
    //   96: astore_2
    //   97: aload_2
    //   98: invokespecial 189	java/io/ByteArrayOutputStream:<init>	()V
    //   101: aload_1
    //   102: aload_2
    //   103: invokestatic 192	a:a	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   106: aload_2
    //   107: invokevirtual 202	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   110: astore_2
    //   111: new 306	clv
    //   114: astore_3
    //   115: aload_3
    //   116: invokespecial 307	clv:<init>	()V
    //   119: aload_3
    //   120: aload_2
    //   121: invokestatic 137	cms:a	(Lcms;[B)Lcms;
    //   124: checkcast 306	clv
    //   127: astore_2
    //   128: aload_2
    //   129: getfield 310	clv:b	Lciz;
    //   132: ifnonnull +85 -> 217
    //   135: aload_2
    //   136: getfield 313	clv:c	Lcjd;
    //   139: ifnonnull +78 -> 217
    //   142: new 264	java/lang/IllegalArgumentException
    //   145: astore_2
    //   146: aload_2
    //   147: ldc_w 315
    //   150: invokespecial 316	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   153: aload_2
    //   154: athrow
    //   155: astore_2
    //   156: aload_0
    //   157: getfield 224	ctv:d	Lcwb;
    //   160: astore_2
    //   161: getstatic 318	cwc:b	I
    //   164: istore 4
    //   166: aload_2
    //   167: invokeinterface 301 1 0
    //   172: ldc_w 320
    //   175: invokestatic 124	cuh:b	(Ljava/lang/String;)V
    //   178: aload_1
    //   179: invokevirtual 321	java/io/FileInputStream:close	()V
    //   182: ldc_w 323
    //   185: invokestatic 144	cuh:e	(Ljava/lang/String;)V
    //   188: goto -108 -> 80
    //   191: astore_1
    //   192: ldc_w 325
    //   195: invokestatic 120	cuh:d	(Ljava/lang/String;)V
    //   198: aload_0
    //   199: getfield 224	ctv:d	Lcwb;
    //   202: astore_1
    //   203: getstatic 297	cwc:a	I
    //   206: istore 4
    //   208: aload_1
    //   209: invokeinterface 301 1 0
    //   214: goto -134 -> 80
    //   217: aload_0
    //   218: getfield 224	ctv:d	Lcwb;
    //   221: aload_2
    //   222: invokeinterface 328 2 0
    //   227: aload_1
    //   228: invokevirtual 321	java/io/FileInputStream:close	()V
    //   231: goto -49 -> 182
    //   234: astore_1
    //   235: ldc_w 330
    //   238: invokestatic 124	cuh:b	(Ljava/lang/String;)V
    //   241: goto -59 -> 182
    //   244: astore_1
    //   245: ldc_w 330
    //   248: invokestatic 124	cuh:b	(Ljava/lang/String;)V
    //   251: goto -69 -> 182
    //   254: astore_2
    //   255: aload_0
    //   256: getfield 224	ctv:d	Lcwb;
    //   259: astore_2
    //   260: getstatic 318	cwc:b	I
    //   263: istore 4
    //   265: aload_2
    //   266: invokeinterface 301 1 0
    //   271: ldc_w 332
    //   274: invokestatic 124	cuh:b	(Ljava/lang/String;)V
    //   277: aload_1
    //   278: invokevirtual 321	java/io/FileInputStream:close	()V
    //   281: goto -99 -> 182
    //   284: astore_1
    //   285: ldc_w 330
    //   288: invokestatic 124	cuh:b	(Ljava/lang/String;)V
    //   291: goto -109 -> 182
    //   294: astore_2
    //   295: aload_1
    //   296: invokevirtual 321	java/io/FileInputStream:close	()V
    //   299: aload_2
    //   300: athrow
    //   301: astore_1
    //   302: ldc_w 330
    //   305: invokestatic 124	cuh:b	(Ljava/lang/String;)V
    //   308: goto -9 -> 299
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	311	0	this	ctv
    //   68	111	1	localObject1	Object
    //   191	1	1	localFileNotFoundException	FileNotFoundException
    //   202	26	1	localcwb1	cwb
    //   234	1	1	localIOException1	IOException
    //   244	34	1	localIOException2	IOException
    //   284	12	1	localIOException3	IOException
    //   301	1	1	localIOException4	IOException
    //   96	58	2	localObject2	Object
    //   155	1	2	localIOException5	IOException
    //   160	62	2	localcwb2	cwb
    //   254	1	2	localIllegalArgumentException	IllegalArgumentException
    //   259	7	2	localcwb3	cwb
    //   294	6	2	localObject3	Object
    //   114	6	3	localclv	clv
    //   72	192	4	i	int
    // Exception table:
    //   from	to	target	type
    //   93	155	155	java/io/IOException
    //   217	227	155	java/io/IOException
    //   81	93	191	java/io/FileNotFoundException
    //   227	231	234	java/io/IOException
    //   178	182	244	java/io/IOException
    //   93	155	254	java/lang/IllegalArgumentException
    //   217	227	254	java/lang/IllegalArgumentException
    //   277	281	284	java/io/IOException
    //   93	155	294	finally
    //   156	178	294	finally
    //   217	227	294	finally
    //   255	277	294	finally
    //   295	299	301	java/io/IOException
  }
  
  File d()
  {
    String str = "resource_" + this.b;
    return new File(this.a.getDir("google_tagmanager", 0), str);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */