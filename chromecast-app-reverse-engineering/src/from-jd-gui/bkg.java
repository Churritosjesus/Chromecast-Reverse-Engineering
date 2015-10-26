import android.content.Context;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class bkg
{
  private static final String a = bkg.class.getSimpleName();
  private final Context b;
  private final CertificateFactory c;
  private CertPathValidator d;
  private final X509Certificate e;
  private final X509Certificate f;
  private final X509Certificate g;
  private final blp h = new blp(a);
  
  public bkg(Context paramContext)
  {
    this.b = paramContext;
    this.c = CertificateFactory.getInstance("X.509");
    try
    {
      this.d = CertPathValidator.getInstance("PKIX");
      this.e = a("certs/chromecast_ca.crt");
      this.f = a("certs/cast_root_ca.crt");
      this.g = a("certs/chromecast_gen1_ica.crt");
      return;
    }
    catch (NoSuchAlgorithmException paramContext)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  private X509Certificate a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: getfield 44	bkg:b	Landroid/content/Context;
    //   8: invokevirtual 86	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   11: aload_1
    //   12: invokevirtual 92	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   15: astore 4
    //   17: aload 4
    //   19: astore_3
    //   20: aload 4
    //   22: astore_2
    //   23: aload_0
    //   24: getfield 54	bkg:c	Ljava/security/cert/CertificateFactory;
    //   27: aload 4
    //   29: invokevirtual 96	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   32: checkcast 98	java/security/cert/X509Certificate
    //   35: astore 5
    //   37: aload 4
    //   39: ifnull +8 -> 47
    //   42: aload 4
    //   44: invokevirtual 103	java/io/InputStream:close	()V
    //   47: aload 5
    //   49: areturn
    //   50: astore 4
    //   52: aload_3
    //   53: astore_2
    //   54: aload_0
    //   55: getfield 42	bkg:h	Lblp;
    //   58: aload 4
    //   60: ldc 105
    //   62: iconst_1
    //   63: anewarray 4	java/lang/Object
    //   66: dup
    //   67: iconst_0
    //   68: aload_1
    //   69: aastore
    //   70: invokevirtual 108	blp:b	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: aload_3
    //   74: astore_2
    //   75: aload 4
    //   77: athrow
    //   78: astore_1
    //   79: aload_2
    //   80: ifnull +7 -> 87
    //   83: aload_2
    //   84: invokevirtual 103	java/io/InputStream:close	()V
    //   87: aload_1
    //   88: athrow
    //   89: astore_1
    //   90: goto -43 -> 47
    //   93: astore_2
    //   94: goto -7 -> 87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	bkg
    //   0	97	1	paramString	String
    //   1	83	2	localObject1	Object
    //   93	1	2	localIOException1	java.io.IOException
    //   3	71	3	localObject2	Object
    //   15	28	4	localInputStream	java.io.InputStream
    //   50	26	4	localIOException2	java.io.IOException
    //   35	13	5	localX509Certificate	X509Certificate
    // Exception table:
    //   from	to	target	type
    //   4	17	50	java/io/IOException
    //   23	37	50	java/io/IOException
    //   4	17	78	finally
    //   23	37	78	finally
    //   54	73	78	finally
    //   75	78	78	finally
    //   42	47	89	java/io/IOException
    //   83	87	93	java/io/IOException
  }
  
  /* Error */
  private X509Certificate b(String paramString)
  {
    // Byte code:
    //   0: new 114	java/io/ByteArrayInputStream
    //   3: astore_2
    //   4: aload_2
    //   5: aload_1
    //   6: ldc 116
    //   8: invokevirtual 122	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   11: invokespecial 125	java/io/ByteArrayInputStream:<init>	([B)V
    //   14: aload_2
    //   15: astore_1
    //   16: aload_0
    //   17: getfield 54	bkg:c	Ljava/security/cert/CertificateFactory;
    //   20: aload_2
    //   21: invokevirtual 96	java/security/cert/CertificateFactory:generateCertificate	(Ljava/io/InputStream;)Ljava/security/cert/Certificate;
    //   24: checkcast 98	java/security/cert/X509Certificate
    //   27: astore_3
    //   28: aload_2
    //   29: invokevirtual 103	java/io/InputStream:close	()V
    //   32: aload_3
    //   33: astore_1
    //   34: aload_1
    //   35: areturn
    //   36: astore_1
    //   37: aconst_null
    //   38: astore_2
    //   39: aload_2
    //   40: ifnull +7 -> 47
    //   43: aload_2
    //   44: invokevirtual 103	java/io/InputStream:close	()V
    //   47: aconst_null
    //   48: astore_1
    //   49: goto -15 -> 34
    //   52: astore_3
    //   53: aconst_null
    //   54: astore_2
    //   55: aload_2
    //   56: astore_1
    //   57: aload_0
    //   58: getfield 42	bkg:h	Lblp;
    //   61: aload_3
    //   62: ldc 127
    //   64: iconst_0
    //   65: anewarray 4	java/lang/Object
    //   68: invokevirtual 108	blp:b	(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   71: aload_2
    //   72: ifnull +7 -> 79
    //   75: aload_2
    //   76: invokevirtual 103	java/io/InputStream:close	()V
    //   79: aconst_null
    //   80: astore_1
    //   81: goto -47 -> 34
    //   84: astore_2
    //   85: aconst_null
    //   86: astore_1
    //   87: aload_1
    //   88: ifnull +7 -> 95
    //   91: aload_1
    //   92: invokevirtual 103	java/io/InputStream:close	()V
    //   95: aload_2
    //   96: athrow
    //   97: astore_1
    //   98: aload_3
    //   99: astore_1
    //   100: goto -66 -> 34
    //   103: astore_1
    //   104: goto -57 -> 47
    //   107: astore_1
    //   108: goto -29 -> 79
    //   111: astore_1
    //   112: goto -17 -> 95
    //   115: astore_2
    //   116: goto -29 -> 87
    //   119: astore_3
    //   120: goto -65 -> 55
    //   123: astore_1
    //   124: goto -85 -> 39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	bkg
    //   0	127	1	paramString	String
    //   3	73	2	localByteArrayInputStream	java.io.ByteArrayInputStream
    //   84	12	2	localObject1	Object
    //   115	1	2	localObject2	Object
    //   27	6	3	localX509Certificate	X509Certificate
    //   52	47	3	localCertificateException1	java.security.cert.CertificateException
    //   119	1	3	localCertificateException2	java.security.cert.CertificateException
    // Exception table:
    //   from	to	target	type
    //   0	14	36	java/io/UnsupportedEncodingException
    //   0	14	52	java/security/cert/CertificateException
    //   0	14	84	finally
    //   28	32	97	java/io/IOException
    //   43	47	103	java/io/IOException
    //   75	79	107	java/io/IOException
    //   91	95	111	java/io/IOException
    //   16	28	115	finally
    //   57	71	115	finally
    //   16	28	119	java/security/cert/CertificateException
    //   16	28	123	java/io/UnsupportedEncodingException
  }
  
  public final X509Certificate a(String paramString, String[] paramArrayOfString)
  {
    paramString = b(paramString);
    try
    {
      Object localObject2 = new java/util/HashSet;
      ((HashSet)localObject2).<init>();
      Object localObject1 = new java/security/cert/TrustAnchor;
      ((TrustAnchor)localObject1).<init>(this.e, null);
      ((Set)localObject2).add(localObject1);
      localObject1 = new java/security/cert/TrustAnchor;
      ((TrustAnchor)localObject1).<init>(this.f, null);
      ((Set)localObject2).add(localObject1);
      localObject1 = new java/security/cert/PKIXParameters;
      ((PKIXParameters)localObject1).<init>((Set)localObject2);
      ((PKIXParameters)localObject1).setRevocationEnabled(false);
      ((PKIXParameters)localObject1).setPolicyQualifiersRejected(false);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      ((List)localObject2).add(paramString);
      int j;
      int i;
      if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      {
        j = paramArrayOfString.length;
        i = 0;
      }
      while (i < j)
      {
        ((List)localObject2).add(b(paramArrayOfString[i]));
        i++;
        continue;
        ((List)localObject2).add(this.g);
      }
      paramArrayOfString = this.c.generateCertPath((List)localObject2);
      this.d.validate(paramArrayOfString, (CertPathParameters)localObject1);
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        this.h.b(paramString, "exception while validating", new Object[0]);
        paramString = null;
      }
    }
    return paramString;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */