import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

final class dfu
  extends dgi
{
  public final dhw a(dfh paramdfh, dhg paramdhg)
  {
    if (paramdfh.f != null) {}
    for (paramdfh = new dhu(paramdhg, paramdfh.f);; paramdfh = new dhk(paramdhg, paramdfh.e)) {
      return paramdfh;
    }
  }
  
  public final s a(dft paramdft)
  {
    return paramdft.j;
  }
  
  public final void a(dfh paramdfh, dfx paramdfx)
  {
    if (paramdfx == null) {
      throw new IllegalArgumentException("protocol == null");
    }
    paramdfh.g = paramdfx;
  }
  
  public final void a(dfh paramdfh, Object paramObject)
  {
    if (paramdfh.e()) {
      throw new IllegalStateException();
    }
    synchronized (paramdfh.a)
    {
      if (paramdfh.k != paramObject) {
        return;
      }
      paramdfh.k = null;
      paramdfh.c.close();
    }
  }
  
  public final void a(dfi paramdfi, dfh paramdfh)
  {
    if ((!paramdfh.e()) && (paramdfh.a()))
    {
      if (paramdfh.b()) {
        break label29;
      }
      dgs.a(paramdfh.c);
    }
    for (;;)
    {
      return;
      try
      {
        label29:
        dgn.a().b(paramdfh.c);
        try
        {
          paramdfi.a(paramdfh);
          paramdfh.j += 1;
          if (paramdfh.f != null)
          {
            paramdfh = new java/lang/IllegalStateException;
            paramdfh.<init>("spdyConnection != null");
            throw paramdfh;
          }
        }
        finally {}
      }
      catch (SocketException paramdfi)
      {
        dgn.a();
        dgn.a("Unable to untagSocket(): " + paramdfi);
        dgs.a(paramdfh.c);
      }
      paramdfh.h = System.nanoTime();
    }
  }
  
  public final void a(dfk paramdfk, SSLSocket paramSSLSocket, boolean paramBoolean)
  {
    Object localObject = null;
    if (paramdfk.e != null)
    {
      localObject = paramSSLSocket.getEnabledCipherSuites();
      localObject = (String[])dgs.a(String.class, paramdfk.e, (Object[])localObject);
    }
    String[] arrayOfString;
    if ((paramBoolean) && (Arrays.asList(paramSSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV"))) {
      if (localObject != null)
      {
        arrayOfString = new String[localObject.length + 1];
        System.arraycopy(localObject, 0, arrayOfString, 0, localObject.length);
        arrayOfString[(arrayOfString.length - 1)] = "TLS_FALLBACK_SCSV";
        localObject = arrayOfString;
      }
    }
    for (;;)
    {
      arrayOfString = paramSSLSocket.getEnabledProtocols();
      arrayOfString = (String[])dgs.a(String.class, paramdfk.f, arrayOfString);
      paramdfk = new dfl(paramdfk).a((String[])localObject).b(arrayOfString).a();
      paramSSLSocket.setEnabledProtocols(paramdfk.f);
      paramdfk = paramdfk.e;
      if (paramdfk != null) {
        paramSSLSocket.setEnabledCipherSuites(paramdfk);
      }
      return;
      localObject = paramSSLSocket.getEnabledCipherSuites();
      break;
    }
  }
  
  public final void a(dfp paramdfp, String paramString)
  {
    int i = paramString.indexOf(":", 1);
    if (i != -1) {
      paramdfp.b(paramString.substring(0, i), paramString.substring(i + 1));
    }
    for (;;)
    {
      return;
      if (paramString.startsWith(":")) {
        paramdfp.b("", paramString.substring(1));
      } else {
        paramdfp.b("", paramString);
      }
    }
  }
  
  public final void a(dft paramdft, dfh paramdfh, dhg paramdhg, dfy paramdfy)
  {
    paramdfh.a(paramdhg);
    int j;
    int i;
    if (!paramdfh.d)
    {
      paramdhg = paramdfh.b.a.j;
      int k = paramdft.v;
      j = paramdft.w;
      i = paramdft.x;
      boolean bool = paramdft.u;
      if (paramdfh.d) {
        throw new IllegalStateException("already connected");
      }
      dhs localdhs = new dhs(paramdfh, paramdfh.a);
      if (paramdfh.b.a.e != null) {
        paramdhg = localdhs.a(k, j, i, paramdfy, paramdfh.b, paramdhg, bool);
      }
      for (;;)
      {
        paramdfh.c = paramdhg.a;
        paramdfh.i = paramdhg.c;
        if (paramdhg.b == null)
        {
          paramdhg = dfx.b;
          label139:
          paramdfh.g = paramdhg;
        }
        try
        {
          if ((paramdfh.g == dfx.c) || (paramdfh.g == dfx.d))
          {
            paramdfh.c.setSoTimeout(0);
            paramdhg = new djj;
            paramdhg.<init>(paramdfh.b.a.b, true, paramdfh.c);
            paramdhg.d = paramdfh.g;
            paramdfy = new djb;
            paramdfy.<init>(paramdhg);
            paramdfh.f = paramdfy;
            paramdhg = paramdfh.f;
            paramdhg.i.a();
            paramdhg.i.b(paramdhg.e);
            i = paramdhg.e.c(65536);
            if (i != 65536) {
              paramdhg.i.a(0, i - 65536);
            }
          }
          for (;;)
          {
            paramdfh.d = true;
            if (!paramdfh.e()) {
              break label444;
            }
            paramdhg = paramdft.q;
            if (paramdfh.e()) {
              break label428;
            }
            throw new IllegalArgumentException();
            if (!paramdhg.contains(dfk.c)) {
              throw new dhq(new UnknownServiceException("CLEARTEXT communication not supported: " + paramdhg));
            }
            paramdhg = paramdfh.b;
            paramdhg = new dht(paramdhg, dhs.a(j, k, paramdhg));
            break;
            paramdhg = paramdhg.b;
            break label139;
            paramdhg = new dgx;
            paramdhg.<init>(paramdfh.a, paramdfh, paramdfh.c);
            paramdfh.e = paramdhg;
          }
          if (!paramdfh.b()) {
            break label444;
          }
        }
        catch (IOException paramdft)
        {
          throw new dhq(paramdft);
        }
      }
    }
    try
    {
      label428:
      paramdhg.a(paramdfh);
      label444:
      paramdft.c.b(paramdfh.b);
      j = paramdft.w;
      i = paramdft.x;
      if (!paramdfh.d) {
        throw new IllegalStateException("setTimeouts - not connected");
      }
    }
    finally {}
    if (paramdfh.e != null) {}
    try
    {
      paramdfh.c.setSoTimeout(j);
      paramdfh.e.a(j, i);
      return;
    }
    catch (IOException paramdft)
    {
      throw new dhq(paramdft);
    }
  }
  
  public final boolean a(dfh paramdfh)
  {
    return paramdfh.a();
  }
  
  public final int b(dfh paramdfh)
  {
    return paramdfh.j;
  }
  
  public final dgr b(dft paramdft)
  {
    return paramdft.c;
  }
  
  public final void b(dfh paramdfh, dhg paramdhg)
  {
    paramdfh.a(paramdhg);
  }
  
  public final dgk c(dft paramdft)
  {
    return dft.a(paramdft);
  }
  
  public final boolean c(dfh paramdfh)
  {
    if (paramdfh.e != null) {}
    for (boolean bool = paramdfh.e.b();; bool = true) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */