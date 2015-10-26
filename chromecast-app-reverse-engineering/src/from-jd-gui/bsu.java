import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.GoogleApiClient;
import java.io.IOException;

public class bsu
{
  public bwj a(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new bsy(this, paramGoogleApiClient));
  }
  
  public bwj a(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new bsw(this, paramGoogleApiClient, paramString));
  }
  
  public bwj a(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.b(new bsv(this, paramGoogleApiClient, paramString1, paramString2));
  }
  
  public void a(GoogleApiClient paramGoogleApiClient, double paramDouble)
  {
    try
    {
      paramGoogleApiClient = (bue)paramGoogleApiClient.a(but.a);
      if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble)))
      {
        IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
        paramGoogleApiClient = new java/lang/StringBuilder;
        paramGoogleApiClient.<init>("Volume cannot be ");
        localIllegalArgumentException.<init>(paramDouble);
        throw localIllegalArgumentException;
      }
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new IOException("service error");
    }
    ((buo)paramGoogleApiClient.o()).a(paramDouble, paramGoogleApiClient.d, paramGoogleApiClient.c);
  }
  
  /* Error */
  public void a(GoogleApiClient arg1, String paramString, btd parambtd)
  {
    // Byte code:
    //   0: aload_1
    //   1: getstatic 42	but:a	Lbwe;
    //   4: invokeinterface 45 2 0
    //   9: checkcast 47	bue
    //   12: astore 4
    //   14: aload_2
    //   15: invokestatic 100	a:d	(Ljava/lang/String;)V
    //   18: aload 4
    //   20: aload_2
    //   21: invokevirtual 102	bue:a	(Ljava/lang/String;)V
    //   24: aload_3
    //   25: ifnull +40 -> 65
    //   28: aload 4
    //   30: getfield 105	bue:b	Ljava/util/Map;
    //   33: astore_1
    //   34: aload_1
    //   35: monitorenter
    //   36: aload 4
    //   38: getfield 105	bue:b	Ljava/util/Map;
    //   41: aload_2
    //   42: aload_3
    //   43: invokeinterface 111 3 0
    //   48: pop
    //   49: aload_1
    //   50: monitorexit
    //   51: aload 4
    //   53: invokevirtual 83	bue:o	()Landroid/os/IInterface;
    //   56: checkcast 85	buo
    //   59: aload_2
    //   60: invokeinterface 113 2 0
    //   65: return
    //   66: astore_2
    //   67: aload_1
    //   68: monitorexit
    //   69: aload_2
    //   70: athrow
    //   71: astore_1
    //   72: new 76	java/io/IOException
    //   75: dup
    //   76: ldc 78
    //   78: invokespecial 79	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	bsu
    //   0	82	2	paramString	String
    //   0	82	3	parambtd	btd
    //   12	40	4	localbue	bue
    // Exception table:
    //   from	to	target	type
    //   36	51	66	finally
    //   67	69	66	finally
    //   0	24	71	android/os/RemoteException
    //   28	36	71	android/os/RemoteException
    //   51	65	71	android/os/RemoteException
    //   69	71	71	android/os/RemoteException
  }
  
  public bwj b(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new bsz(this, paramGoogleApiClient));
  }
  
  public bwj b(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new bsx(this, paramGoogleApiClient, paramString));
  }
  
  public double c(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = (bue)paramGoogleApiClient.a(but.a);
    paramGoogleApiClient.f();
    return paramGoogleApiClient.d;
  }
  
  public void c(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    try
    {
      ((bue)paramGoogleApiClient.a(but.a)).a(paramString);
      return;
    }
    catch (RemoteException paramGoogleApiClient)
    {
      throw new IOException("service error");
    }
  }
  
  public ApplicationMetadata d(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = (bue)paramGoogleApiClient.a(but.a);
    paramGoogleApiClient.f();
    return paramGoogleApiClient.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bsu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */