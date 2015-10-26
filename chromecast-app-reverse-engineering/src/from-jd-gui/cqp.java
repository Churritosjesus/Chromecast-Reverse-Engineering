import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.widget.ImageView;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class cqp
{
  private static volatile Executor c = null;
  private static boolean k;
  public final Context a;
  public final GoogleApiClient b;
  private final ConcurrentHashMap d = new ConcurrentHashMap();
  private boolean e;
  private cqq f;
  private final LinkedList g = new LinkedList();
  private boolean h;
  private float i;
  private float j;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 11) {
      c = AsyncTask.THREAD_POOL_EXECUTOR;
    }
  }
  
  public cqp(Context paramContext, GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    this.a = paramContext;
    this.b = paramGoogleApiClient;
    this.h = paramBoolean;
    paramGoogleApiClient = paramContext.getResources();
    this.j = paramGoogleApiClient.getInteger(a.io);
    this.i = paramGoogleApiClient.getInteger(a.in);
    k = a.a((ActivityManager)paramContext.getSystemService("activity"));
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int m;
    if (k) {
      m = 2;
    }
    int n;
    do
    {
      return m;
      n = 1;
      m = 1;
    } while ((paramInt1 <= paramInt4) && (paramInt2 <= paramInt3));
    int i1 = paramInt1 / 2;
    paramInt2 /= 2;
    paramInt1 = n;
    for (;;)
    {
      m = paramInt1;
      if (i1 / paramInt1 < paramInt4) {
        break;
      }
      m = paramInt1;
      if (paramInt2 / paramInt1 < paramInt3) {
        break;
      }
      paramInt1 <<= 1;
    }
  }
  
  public static Bitmap a(Bitmap paramBitmap, int paramInt, float paramFloat)
  {
    int i1 = (int)(paramInt * paramFloat);
    int m = paramBitmap.getWidth();
    int n = paramBitmap.getHeight();
    if ((paramInt == m) && (i1 == n)) {}
    for (;;)
    {
      return paramBitmap;
      Matrix localMatrix = new Matrix();
      paramFloat = Math.max(paramInt / m, i1 / n);
      localMatrix.setScale(paramFloat, paramFloat);
      paramInt = Math.round(paramInt / paramFloat);
      i1 = Math.round(i1 / paramFloat);
      int i2 = (int)(m * 0.5F - paramInt / 2);
      int i3 = (int)(n * 0.5F - i1 / 2);
      paramBitmap = Bitmap.createBitmap(paramBitmap, Math.max(Math.min(i2, m - paramInt), 0), Math.max(Math.min(i3, n - i1), 0), paramInt, i1, localMatrix, true);
    }
  }
  
  public static Bitmap a(ParcelFileDescriptor paramParcelFileDescriptor, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    BitmapFactory.Options localOptions = null;
    if (paramParcelFileDescriptor == null)
    {
      paramParcelFileDescriptor = localOptions;
      label10:
      return paramParcelFileDescriptor;
    }
    localOptions = new BitmapFactory.Options();
    localOptions.inSampleSize = a(paramInt1, paramInt2, paramInt3, paramInt4);
    localOptions.inJustDecodeBounds = false;
    localOptions.outWidth = paramInt1;
    localOptions.outHeight = paramInt2;
    if (k) {
      localOptions.inPreferredConfig = Bitmap.Config.RGB_565;
    }
    try
    {
      localFileInputStream = new java/io/FileInputStream;
      localFileInputStream.<init>(paramParcelFileDescriptor.getFileDescriptor());
    }
    finally
    {
      try
      {
        paramParcelFileDescriptor = BitmapFactory.decodeStream(localFileInputStream, null, localOptions);
        a(localFileInputStream);
        break label10;
      }
      finally
      {
        FileInputStream localFileInputStream;
        paramParcelFileDescriptor = localFileInputStream;
      }
      localObject1 = finally;
      paramParcelFileDescriptor = null;
      if (paramParcelFileDescriptor != null) {
        a(paramParcelFileDescriptor);
      }
      throw ((Throwable)localObject1);
    }
  }
  
  private void a()
  {
    if (this.g.isEmpty()) {}
    for (;;)
    {
      return;
      if (this.f == null)
      {
        this.f = ((cqq)this.g.remove());
        this.f.a();
      }
    }
  }
  
  private static void a(InputStream paramInputStream)
  {
    try
    {
      paramInputStream.close();
      return;
    }
    catch (IOException paramInputStream)
    {
      for (;;) {}
    }
  }
  
  public final void a(ImageView paramImageView)
  {
    paramImageView.setTag(null);
    int m = 0;
    while (m < this.g.size()) {
      if (((cqq)this.g.get(m)).e == paramImageView) {
        this.g.remove(m);
      } else {
        m++;
      }
    }
    if ((this.f != null) && (this.f.e == paramImageView)) {
      this.f.d = true;
    }
  }
  
  /* Error */
  public final void a(com.google.android.gms.common.api.Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt1, int paramInt2, int paramInt3, cqq paramcqq)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 187	cqp:f	Lcqq;
    //   4: aload 6
    //   6: if_acmpeq +31 -> 37
    //   9: ldc -27
    //   11: ldc -25
    //   13: invokestatic 237	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   16: pop
    //   17: aload_0
    //   18: getfield 239	cqp:e	Z
    //   21: ifne +7 -> 28
    //   24: aload_0
    //   25: invokespecial 240	cqp:a	()V
    //   28: aload_2
    //   29: ifnull +7 -> 36
    //   32: aload_2
    //   33: invokevirtual 241	android/os/ParcelFileDescriptor:close	()V
    //   36: return
    //   37: aload_0
    //   38: aconst_null
    //   39: putfield 187	cqp:f	Lcqq;
    //   42: aload_0
    //   43: getfield 239	cqp:e	Z
    //   46: istore 9
    //   48: iload 9
    //   50: ifeq +29 -> 79
    //   53: aload_0
    //   54: getfield 239	cqp:e	Z
    //   57: ifne +7 -> 64
    //   60: aload_0
    //   61: invokespecial 240	cqp:a	()V
    //   64: aload_2
    //   65: ifnull -29 -> 36
    //   68: aload_2
    //   69: invokevirtual 241	android/os/ParcelFileDescriptor:close	()V
    //   72: goto -36 -> 36
    //   75: astore_1
    //   76: goto -40 -> 36
    //   79: aload 6
    //   81: getfield 222	cqq:e	Landroid/widget/ImageView;
    //   84: invokevirtual 244	android/widget/ImageView:getTag	()Ljava/lang/Object;
    //   87: aload 6
    //   89: if_acmpne +15 -> 104
    //   92: aload 6
    //   94: getfield 226	cqq:d	Z
    //   97: istore 9
    //   99: iload 9
    //   101: ifeq +29 -> 130
    //   104: aload_0
    //   105: getfield 239	cqp:e	Z
    //   108: ifne +7 -> 115
    //   111: aload_0
    //   112: invokespecial 240	cqp:a	()V
    //   115: aload_2
    //   116: ifnull -80 -> 36
    //   119: aload_2
    //   120: invokevirtual 241	android/os/ParcelFileDescriptor:close	()V
    //   123: goto -87 -> 36
    //   126: astore_1
    //   127: goto -91 -> 36
    //   130: aload_1
    //   131: invokevirtual 248	com/google/android/gms/common/api/Status:a	()Z
    //   134: ifeq +7 -> 141
    //   137: aload_2
    //   138: ifnonnull +67 -> 205
    //   141: aload_1
    //   142: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   145: astore 8
    //   147: aload_2
    //   148: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   151: astore 7
    //   153: new 256	java/lang/StringBuilder
    //   156: astore_1
    //   157: aload_1
    //   158: aload 8
    //   160: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   163: invokevirtual 259	java/lang/String:length	()I
    //   166: bipush 28
    //   168: iadd
    //   169: aload 7
    //   171: invokestatic 254	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   174: invokevirtual 259	java/lang/String:length	()I
    //   177: iadd
    //   178: invokespecial 262	java/lang/StringBuilder:<init>	(I)V
    //   181: aload_1
    //   182: ldc_w 264
    //   185: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   188: aload 8
    //   190: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   193: ldc_w 270
    //   196: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload 7
    //   201: invokevirtual 268	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: pop
    //   205: aload_2
    //   206: astore_1
    //   207: aload_2
    //   208: ifnull +42 -> 250
    //   211: new 272	cqr
    //   214: astore_1
    //   215: aload_1
    //   216: aload_0
    //   217: aload 6
    //   219: aload_2
    //   220: iload_3
    //   221: iload 4
    //   223: iload 5
    //   225: invokespecial 275	cqr:<init>	(Lcqp;Lcqq;Landroid/os/ParcelFileDescriptor;III)V
    //   228: getstatic 33	android/os/Build$VERSION:SDK_INT	I
    //   231: bipush 11
    //   233: if_icmplt +43 -> 276
    //   236: aload_1
    //   237: getstatic 27	cqp:c	Ljava/util/concurrent/Executor;
    //   240: iconst_0
    //   241: anewarray 277	java/lang/Void
    //   244: invokevirtual 281	cqr:executeOnExecutor	(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   247: pop
    //   248: aconst_null
    //   249: astore_1
    //   250: aload_0
    //   251: getfield 239	cqp:e	Z
    //   254: ifne +7 -> 261
    //   257: aload_0
    //   258: invokespecial 240	cqp:a	()V
    //   261: aload_1
    //   262: ifnull -226 -> 36
    //   265: aload_1
    //   266: invokevirtual 241	android/os/ParcelFileDescriptor:close	()V
    //   269: goto -233 -> 36
    //   272: astore_1
    //   273: goto -237 -> 36
    //   276: aload_1
    //   277: aconst_null
    //   278: invokevirtual 285	cqr:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   281: pop
    //   282: goto -34 -> 248
    //   285: astore_1
    //   286: aload_0
    //   287: getfield 239	cqp:e	Z
    //   290: ifne +7 -> 297
    //   293: aload_0
    //   294: invokespecial 240	cqp:a	()V
    //   297: aload_2
    //   298: ifnull +7 -> 305
    //   301: aload_2
    //   302: invokevirtual 241	android/os/ParcelFileDescriptor:close	()V
    //   305: aload_1
    //   306: athrow
    //   307: astore_1
    //   308: goto -272 -> 36
    //   311: astore_2
    //   312: goto -7 -> 305
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	315	0	this	cqp
    //   0	315	1	paramStatus	com.google.android.gms.common.api.Status
    //   0	315	2	paramParcelFileDescriptor	ParcelFileDescriptor
    //   0	315	3	paramInt1	int
    //   0	315	4	paramInt2	int
    //   0	315	5	paramInt3	int
    //   0	315	6	paramcqq	cqq
    //   151	49	7	str1	String
    //   145	44	8	str2	String
    //   46	54	9	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   68	72	75	java/io/IOException
    //   119	123	126	java/io/IOException
    //   265	269	272	java/io/IOException
    //   0	17	285	finally
    //   37	48	285	finally
    //   79	99	285	finally
    //   130	137	285	finally
    //   141	205	285	finally
    //   211	248	285	finally
    //   276	282	285	finally
    //   32	36	307	java/io/IOException
    //   301	305	311	java/io/IOException
  }
  
  public final void a(cqq paramcqq)
  {
    if (this.d.containsKey(paramcqq.f))
    {
      paramcqq.e.setImageBitmap((Bitmap)this.d.get(paramcqq.f));
      a(paramcqq.e);
    }
    for (;;)
    {
      return;
      ImageView localImageView = paramcqq.e;
      a(localImageView);
      if (this.b.d())
      {
        localImageView.setTag(paramcqq);
        this.g.add(paramcqq);
        a();
      }
    }
  }
  
  protected void a(cqq paramcqq, Bitmap paramBitmap)
  {
    if (paramBitmap != null) {
      paramcqq.e.setImageBitmap(paramBitmap);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cqp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */