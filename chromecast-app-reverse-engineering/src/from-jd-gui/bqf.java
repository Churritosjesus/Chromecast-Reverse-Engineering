import android.content.Context;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

public final class bqf
  extends bra
{
  private static boolean a;
  private bpb b;
  private final bqr c;
  private String e;
  private boolean f = false;
  private Object g = new Object();
  
  bqf(brb parambrb)
  {
    super(parambrb);
    this.c = new bqr(parambrb.c);
  }
  
  private static String a(String paramString)
  {
    MessageDigest localMessageDigest = bqs.b("MD5");
    if (localMessageDigest == null) {}
    for (paramString = null;; paramString = String.format(Locale.US, "%032X", new Object[] { new BigInteger(1, localMessageDigest.digest(paramString.getBytes())) })) {
      return paramString;
    }
  }
  
  private boolean a(bpb parambpb1, bpb parambpb2)
  {
    StringBuilder localStringBuilder = null;
    boolean bool;
    if (parambpb2 == null)
    {
      parambpb2 = null;
      if (!TextUtils.isEmpty(parambpb2)) {
        break label30;
      }
      bool = true;
    }
    label30:
    Object localObject1;
    for (;;)
    {
      return bool;
      parambpb2 = parambpb2.a;
      break;
      localObject1 = this.d.g().b();
      for (;;)
      {
        synchronized (this.g)
        {
          if (!this.f)
          {
            this.e = f();
            this.f = true;
            parambpb1 = new java/lang/StringBuilder;
            parambpb1.<init>();
            parambpb1 = a(parambpb2 + (String)localObject1);
            if (!TextUtils.isEmpty(parambpb1)) {
              break label210;
            }
            bool = false;
          }
        }
        if (TextUtils.isEmpty(this.e))
        {
          if (parambpb1 == null) {}
          for (parambpb1 = localStringBuilder;; parambpb1 = parambpb1.a)
          {
            if (parambpb1 != null) {
              break label177;
            }
            parambpb1 = new java/lang/StringBuilder;
            parambpb1.<init>();
            bool = g(parambpb2 + (String)localObject1);
            break;
          }
          label177:
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          this.e = a(parambpb1 + (String)localObject1);
        }
      }
      label210:
      if (!parambpb1.equals(this.e)) {
        break label230;
      }
      bool = true;
    }
    label230:
    if (!TextUtils.isEmpty(this.e))
    {
      b("Resetting the client id because Advertising Id changed.");
      parambpb1 = this.d.g().c();
      a("New client Id", parambpb1);
    }
    for (;;)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      bool = g(parambpb2 + parambpb1);
      break;
      parambpb1 = (bpb)localObject1;
    }
  }
  
  /* Error */
  private bpb d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	bqf:c	Lbqr;
    //   6: ldc2_w 140
    //   9: invokevirtual 144	bqr:a	(J)Z
    //   12: ifeq +32 -> 44
    //   15: aload_0
    //   16: getfield 40	bqf:c	Lbqr;
    //   19: invokevirtual 146	bqr:a	()V
    //   22: aload_0
    //   23: invokespecial 148	bqf:e	()Lbpb;
    //   26: astore_1
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 150	bqf:b	Lbpb;
    //   32: aload_1
    //   33: invokespecial 152	bqf:a	(Lbpb;Lbpb;)Z
    //   36: ifeq +17 -> 53
    //   39: aload_0
    //   40: aload_1
    //   41: putfield 150	bqf:b	Lbpb;
    //   44: aload_0
    //   45: getfield 150	bqf:b	Lbpb;
    //   48: astore_1
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_1
    //   52: areturn
    //   53: aload_0
    //   54: ldc -102
    //   56: invokevirtual 156	bqf:f	(Ljava/lang/String;)V
    //   59: new 87	bpb
    //   62: astore_1
    //   63: aload_1
    //   64: ldc -98
    //   66: iconst_0
    //   67: invokespecial 161	bpb:<init>	(Ljava/lang/String;Z)V
    //   70: aload_0
    //   71: aload_1
    //   72: putfield 150	bqf:b	Lbpb;
    //   75: goto -31 -> 44
    //   78: astore_1
    //   79: aload_0
    //   80: monitorexit
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	bqf
    //   26	46	1	localbpb	bpb
    //   78	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	44	78	finally
    //   44	49	78	finally
    //   53	75	78	finally
  }
  
  private bpb e()
  {
    Object localObject2 = null;
    try
    {
      bpb localbpb = bpa.a(this.d.a);
      return localbpb;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        e("IllegalStateException getting Ad Id Info. If you would like to see Audience reports, please ensure that you have added '<meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />' to your application manifest file. See http://goo.gl/naFqQk for details.");
        localObject1 = localObject2;
      }
    }
    catch (Throwable localThrowable)
    {
      for (;;)
      {
        Object localObject1 = localObject2;
        if (!a)
        {
          a = true;
          d("Error getting advertiser id", localThrowable);
          localObject1 = localObject2;
        }
      }
    }
  }
  
  private String f()
  {
    localObject4 = null;
    localObject3 = null;
    for (;;)
    {
      try
      {
        localFileInputStream = this.d.a.openFileInput("gaClientIdData");
        localObject1 = new byte[''];
        i = localFileInputStream.read((byte[])localObject1, 0, 128);
        if (localFileInputStream.available() <= 0) {
          continue;
        }
        e("Hash file seems corrupted, deleting it.");
        localFileInputStream.close();
        this.d.a.deleteFile("gaClientIdData");
        localObject1 = localObject3;
      }
      catch (FileNotFoundException localFileNotFoundException1)
      {
        Object localObject1;
        int i;
        localObject2 = localObject3;
        continue;
        localObject2 = new String((byte[])localObject2, 0, i);
      }
      catch (IOException localIOException1)
      {
        try
        {
          FileInputStream localFileInputStream;
          localFileInputStream.close();
        }
        catch (IOException localIOException2)
        {
          Object localObject2;
          continue;
        }
        catch (FileNotFoundException localFileNotFoundException2) {}
        localIOException1 = localIOException1;
        localObject2 = localObject4;
        d("Error reading Hash file, deleting it", localIOException1);
        this.d.a.deleteFile("gaClientIdData");
        continue;
        continue;
      }
      return (String)localObject1;
      if (i > 0) {
        continue;
      }
      b("Hash file is empty.");
      localFileInputStream.close();
      localObject1 = localObject3;
    }
  }
  
  private boolean g(String paramString)
  {
    boolean bool = false;
    try
    {
      paramString = a(paramString);
      b("Storing hashed adid.");
      FileOutputStream localFileOutputStream = this.d.a.openFileOutput("gaClientIdData", 0);
      localFileOutputStream.write(paramString.getBytes());
      localFileOutputStream.close();
      this.e = paramString;
      bool = true;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        e("Error creating hash file", paramString);
      }
    }
    return bool;
  }
  
  protected final void a() {}
  
  public final boolean b()
  {
    boolean bool2 = false;
    r();
    bpb localbpb = d();
    boolean bool1 = bool2;
    if (localbpb != null)
    {
      bool1 = bool2;
      if (!localbpb.b) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public final String c()
  {
    Object localObject2 = null;
    r();
    Object localObject1 = d();
    if (localObject1 != null) {}
    for (localObject1 = ((bpb)localObject1).a;; localObject1 = null)
    {
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        localObject1 = localObject2;
      }
      for (;;)
      {
        return (String)localObject1;
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */