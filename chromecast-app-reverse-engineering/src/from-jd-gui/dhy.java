import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class dhy
  extends HttpURLConnection
{
  private static final Set d = new LinkedHashSet(Arrays.asList(new String[] { "OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH" }));
  private static final dga e;
  final dft a;
  public dhg b;
  dfn c;
  private dfp f = new dfp();
  private long g = -1L;
  private int h;
  private IOException i;
  private dfo j;
  private dgf k;
  
  static
  {
    byte[] arrayOfByte = new byte[0];
    if (arrayOfByte == null) {
      throw new NullPointerException("content == null");
    }
    dgs.a(arrayOfByte.length, 0L, 0);
    e = new dgb(null, 0, arrayOfByte, 0);
  }
  
  public dhy(URL paramURL, dft paramdft)
  {
    super(paramURL);
    this.a = paramdft;
  }
  
  private dfo a()
  {
    Object localObject1;
    dfp localdfp;
    Object localObject2;
    if (this.j == null)
    {
      localObject1 = c().f();
      localdfp = ((dgc)localObject1).f.a();
      localObject2 = new StringBuilder();
      dgn.a();
      localObject2 = dgn.b() + "-Response-Source";
      if (((dgc)localObject1).h != null) {
        break label109;
      }
      if (((dgc)localObject1).i != null) {
        break label86;
      }
      localObject1 = "NONE";
    }
    for (;;)
    {
      this.j = localdfp.a((String)localObject2, (String)localObject1).a();
      return this.j;
      label86:
      localObject1 = "CACHE " + ((dgc)localObject1).c;
      continue;
      label109:
      if (((dgc)localObject1).i == null) {
        localObject1 = "NETWORK " + ((dgc)localObject1).c;
      } else {
        localObject1 = "CONDITIONAL_CACHE " + ((dgc)localObject1).h.c;
      }
    }
  }
  
  private dhg a(String paramString, dfh paramdfh, dhp paramdhp, dgc paramdgc)
  {
    if (a.p(paramString)) {}
    Object localObject2;
    for (Object localObject1 = e;; localObject1 = null)
    {
      localObject1 = new dfz().a(getURL()).a(paramString, (dga)localObject1);
      localObject2 = this.f.a();
      int m = 0;
      int n = ((dfo)localObject2).a.length / 2;
      while (m < n)
      {
        ((dfz)localObject1).b(((dfo)localObject2).a(m), ((dfo)localObject2).b(m));
        m++;
      }
    }
    boolean bool2 = false;
    boolean bool1 = false;
    if (a.q(paramString))
    {
      if (this.g == -1L) {
        break label266;
      }
      ((dfz)localObject1).a("Content-Length", Long.toString(this.g));
      bool2 = bool1;
      if (((dfo)localObject2).a("Content-Type") == null)
      {
        ((dfz)localObject1).a("Content-Type", "application/x-www-form-urlencoded");
        bool2 = bool1;
      }
    }
    if (((dfo)localObject2).a("User-Agent") == null)
    {
      paramString = System.getProperty("http.agent");
      if (paramString == null) {
        break label292;
      }
    }
    for (;;)
    {
      ((dfz)localObject1).a("User-Agent", paramString);
      localObject2 = ((dfz)localObject1).a();
      localObject1 = this.a;
      paramString = (String)localObject1;
      if (dgi.b.a((dft)localObject1) != null)
      {
        paramString = (String)localObject1;
        if (!getUseCaches())
        {
          paramString = this.a.b();
          paramString.k = null;
          paramString.j = null;
        }
      }
      return new dhg(paramString, (dfy)localObject2, bool2, true, false, paramdfh, null, paramdhp, paramdgc);
      label266:
      if (this.chunkLength > 0)
      {
        ((dfz)localObject1).a("Transfer-Encoding", "chunked");
        break;
      }
      bool1 = true;
      break;
      label292:
      paramString = "Java" + System.getProperty("java.version");
    }
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    Object localObject = new ArrayList();
    if (paramBoolean) {
      ((List)localObject).addAll(this.a.e);
    }
    String[] arrayOfString = paramString.split(",", -1);
    int n = arrayOfString.length;
    int m = 0;
    while (m < n)
    {
      paramString = arrayOfString[m];
      try
      {
        ((List)localObject).add(dfx.a(paramString));
        m++;
      }
      catch (IOException paramString)
      {
        throw new IllegalStateException(paramString);
      }
    }
    paramString = this.a;
    localObject = dgs.a((List)localObject);
    if (!((List)localObject).contains(dfx.b)) {
      throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + localObject);
    }
    if (((List)localObject).contains(dfx.a)) {
      throw new IllegalArgumentException("protocols must not contain http/1.0: " + localObject);
    }
    if (((List)localObject).contains(null)) {
      throw new IllegalArgumentException("protocols must not contain null");
    }
    paramString.e = dgs.a((List)localObject);
  }
  
  private boolean a(boolean paramBoolean)
  {
    Object localObject7;
    Object localObject1;
    Object localObject8;
    Object localObject6;
    long l1;
    Object localObject9;
    int m;
    label490:
    label497:
    label608:
    int n;
    for (;;)
    {
      try
      {
        localObject7 = this.b;
        if (((dhg)localObject7).u != null) {
          break label1780;
        }
        if (((dhg)localObject7).h != null)
        {
          IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
          localIllegalStateException.<init>();
          throw localIllegalStateException;
        }
      }
      catch (dho localdho)
      {
        localObject1 = localdho.a();
        this.i = ((IOException)localObject1);
        throw ((Throwable)localObject1);
        localObject8 = ((dhg)localObject7).l;
        localObject1 = ((dfy)localObject8).c();
        if (((dfy)localObject8).a("Host") == null) {
          ((dfz)localObject1).a("Host", dhg.a(((dfy)localObject8).a()));
        }
        if (((((dhg)localObject7).c == null) || (((dhg)localObject7).c.g != dfx.a)) && (((dfy)localObject8).a("Connection") == null)) {
          ((dfz)localObject1).a("Connection", "Keep-Alive");
        }
        if (((dfy)localObject8).a("Accept-Encoding") == null)
        {
          ((dhg)localObject7).j = true;
          ((dfz)localObject1).a("Accept-Encoding", "gzip");
        }
        Object localObject2 = ((dhg)localObject7).b.i;
        if (localObject2 != null)
        {
          localObject6 = dhl.a(((dfz)localObject1).a().c, null);
          dhl.a((dfz)localObject1, ((CookieHandler)localObject2).get(((dfy)localObject8).b(), (Map)localObject6));
        }
        if (((dfy)localObject8).a("User-Agent") == null) {
          ((dfz)localObject1).a("User-Agent", "okhttp/2.4.0");
        }
        localObject8 = ((dfz)localObject1).a();
        localObject1 = dgi.b.a(((dhg)localObject7).b);
        if (localObject1 != null)
        {
          localObject2 = ((s)localObject1).l();
          l1 = System.currentTimeMillis();
          localObject9 = new dgw;
          ((dgw)localObject9).<init>(l1, (dfy)localObject8, (dgc)localObject2);
          if (((dgw)localObject9).c != null) {
            continue;
          }
          localObject1 = new dgv;
          ((dgv)localObject1).<init>(((dgw)localObject9).b, null);
          localObject6 = localObject1;
          if (((dgv)localObject1).a != null)
          {
            localObject6 = localObject1;
            if (((dgw)localObject9).b.d().i)
            {
              localObject6 = new dgv;
              ((dgv)localObject6).<init>(null, null);
            }
          }
          ((dhg)localObject7).u = ((dgv)localObject6);
          ((dhg)localObject7).m = ((dhg)localObject7).u.a;
          ((dhg)localObject7).n = ((dhg)localObject7).u.b;
          if ((localObject2 != null) && (((dhg)localObject7).n == null)) {
            dgs.a(((dgc)localObject2).g);
          }
          if (((dhg)localObject7).m == null) {
            break label1921;
          }
          if (((dhg)localObject7).c != null) {
            break label1648;
          }
          if (((dhg)localObject7).c == null) {
            break label1395;
          }
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>();
          throw ((Throwable)localObject1);
        }
      }
      catch (dhq localdhq)
      {
        localObject1 = this.b;
        if ((((dhg)localObject1).e != null) && (((dhg)localObject1).c != null)) {
          ((dhg)localObject1).a(((dhg)localObject1).e, localdhq.b);
        }
        if (((((dhg)localObject1).e != null) || (((dhg)localObject1).c != null)) && ((((dhg)localObject1).e == null) || (((dhg)localObject1).e.a())))
        {
          if (((dhg)localObject1).b.u) {
            break label3265;
          }
          m = 0;
          if (m != 0) {
            break label3344;
          }
        }
        localObject1 = null;
        if (localObject1 == null) {
          break label3398;
        }
        this.b = ((dhg)localObject1);
        paramBoolean = false;
        return paramBoolean;
        Object localObject3 = null;
        continue;
        if ((!((dgw)localObject9).b.e()) || (((dgw)localObject9).c.e != null)) {
          break label686;
        }
        localObject1 = new dgv(((dgw)localObject9).b, null);
        continue;
      }
      catch (IOException localIOException1)
      {
        localObject6 = this.b;
        localObject7 = ((dhg)localObject6).p;
        if ((((dhg)localObject6).e != null) && (((dhg)localObject6).c != null)) {
          ((dhg)localObject6).a(((dhg)localObject6).e, localIOException1);
        }
        if (localObject7 == null) {
          break label608;
        }
      }
      if (!(localObject7 instanceof dhp)) {
        break label3410;
      }
      n = 1;
      label611:
      if (((((dhg)localObject6).e != null) || (((dhg)localObject6).c != null)) && ((((dhg)localObject6).e == null) || (((dhg)localObject6).e.a())))
      {
        if (((dhg)localObject6).b.u) {
          break label3416;
        }
        m = 0;
        label660:
        if ((m != 0) && (n != 0)) {
          break label3448;
        }
      }
      localObject1 = null;
      label672:
      if (localObject1 == null) {
        break label3506;
      }
      this.b = ((dhg)localObject1);
      paramBoolean = false;
      continue;
      label686:
      if (!dgv.a(((dgw)localObject9).c, ((dgw)localObject9).b))
      {
        localObject1 = new dgv(((dgw)localObject9).b, null);
      }
      else
      {
        localObject1 = ((dgw)localObject9).b.d();
        if ((!((dfb)localObject1).a) && (!dgw.a(((dgw)localObject9).b))) {
          break;
        }
        localObject1 = new dgv(((dgw)localObject9).b, null);
      }
    }
    label791:
    long l2;
    long l5;
    if (((dgw)localObject9).d != null)
    {
      l1 = Math.max(0L, ((dgw)localObject9).j - ((dgw)localObject9).d.getTime());
      l2 = l1;
      if (((dgw)localObject9).l != -1) {
        l2 = Math.max(l1, TimeUnit.SECONDS.toMillis(((dgw)localObject9).l));
      }
      l5 = l2 + (((dgw)localObject9).j - ((dgw)localObject9).i) + (((dgw)localObject9).a - ((dgw)localObject9).j);
      localObject6 = ((dgw)localObject9).c.c();
      if (((dfb)localObject6).c == -1) {
        break label1107;
      }
      l1 = TimeUnit.SECONDS.toMillis(((dfb)localObject6).c);
      label884:
      if (((dfb)localObject1).c == -1) {
        break label3519;
      }
      l1 = Math.min(l1, TimeUnit.SECONDS.toMillis(((dfb)localObject1).c));
    }
    label1107:
    label1257:
    label1269:
    label1382:
    label1395:
    label1648:
    label1780:
    label1881:
    label1921:
    label2099:
    label2104:
    label2135:
    label2177:
    label2306:
    label2311:
    label2756:
    label3020:
    label3022:
    label3079:
    label3090:
    label3265:
    label3344:
    label3398:
    label3410:
    label3416:
    label3448:
    label3506:
    label3519:
    for (;;)
    {
      if (((dfb)localObject1).h != -1) {}
      for (l2 = TimeUnit.SECONDS.toMillis(((dfb)localObject1).h);; l2 = 0L)
      {
        long l4 = 0L;
        localObject6 = ((dgw)localObject9).c.c();
        long l3 = l4;
        if (!((dfb)localObject6).f)
        {
          l3 = l4;
          if (((dfb)localObject1).g != -1) {
            l3 = TimeUnit.SECONDS.toMillis(((dfb)localObject1).g);
          }
        }
        if ((!((dfb)localObject6).a) && (l5 + l2 < l3 + l1))
        {
          localObject1 = ((dgw)localObject9).c.a();
          if (l2 + l5 >= l1) {
            ((dgd)localObject1).b("Warning", "110 HttpURLConnection \"Response is stale\"");
          }
          if (l5 > 86400000L) {
            if ((((dgw)localObject9).c.c().c != -1) || (((dgw)localObject9).h != null)) {
              break label1269;
            }
          }
          for (m = 1;; m = 0)
          {
            if (m != 0) {
              ((dgd)localObject1).b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
            }
            localObject1 = new dgv(null, ((dgd)localObject1).a());
            break;
            l1 = 0L;
            break label791;
            if (((dgw)localObject9).h != null)
            {
              if (((dgw)localObject9).d != null) {}
              for (l1 = ((dgw)localObject9).d.getTime();; l1 = ((dgw)localObject9).j)
              {
                l2 = ((dgw)localObject9).h.getTime() - l1;
                l1 = l2;
                if (l2 > 0L) {
                  break;
                }
                l1 = 0L;
                break;
              }
            }
            if ((((dgw)localObject9).f != null) && (((dgw)localObject9).c.a.a().getQuery() == null))
            {
              if (((dgw)localObject9).d != null) {}
              for (l1 = ((dgw)localObject9).d.getTime();; l1 = ((dgw)localObject9).i)
              {
                l1 -= ((dgw)localObject9).f.getTime();
                if (l1 <= 0L) {
                  break label1257;
                }
                l1 /= 10L;
                break;
              }
              l1 = 0L;
              break label884;
            }
            l1 = 0L;
            break label884;
          }
        }
        localObject1 = ((dgw)localObject9).b.c();
        if (((dgw)localObject9).k != null) {
          ((dfz)localObject1).a("If-None-Match", ((dgw)localObject9).k);
        }
        for (;;)
        {
          localObject1 = ((dfz)localObject1).a();
          if (!dgw.a((dfy)localObject1)) {
            break label1382;
          }
          localObject1 = new dgv((dfy)localObject1, ((dgw)localObject9).c);
          break;
          if (((dgw)localObject9).f != null) {
            ((dfz)localObject1).a("If-Modified-Since", ((dgw)localObject9).g);
          } else if (((dgw)localObject9).d != null) {
            ((dfz)localObject1).a("If-Modified-Since", ((dgw)localObject9).e);
          }
        }
        localObject1 = new dgv((dfy)localObject1, null);
        break;
        Object localObject4;
        if (((dhg)localObject7).e == null)
        {
          dft localdft = ((dhg)localObject7).b;
          localObject9 = ((dhg)localObject7).m;
          String str = ((dfy)localObject9).a().getHost();
          if ((str == null) || (str.length() == 0))
          {
            localObject4 = new dho;
            localObject1 = new java/net/UnknownHostException;
            ((UnknownHostException)localObject1).<init>(((dfy)localObject9).a().toString());
            ((dho)localObject4).<init>((IOException)localObject1);
            throw ((Throwable)localObject4);
          }
          localObject6 = null;
          localObject1 = null;
          localObject4 = null;
          if (((dfy)localObject9).e())
          {
            localObject6 = localdft.m;
            localObject1 = localdft.n;
            localObject4 = localdft.o;
          }
          dez localdez = new dez;
          localdez.<init>(str, dgs.a(((dfy)localObject9).a()), localdft.l, (SSLSocketFactory)localObject6, (HostnameVerifier)localObject1, (dfd)localObject4, localdft.p, localdft.d, localdft.e, localdft.f, localdft.h);
          ((dhg)localObject7).d = localdez;
        }
        try
        {
          localObject9 = ((dhg)localObject7).d;
          localObject6 = ((dhg)localObject7).m;
          localObject1 = ((dhg)localObject7).b;
          localObject4 = new dhr;
          ((dhr)localObject4).<init>((dez)localObject9, ((dfy)localObject6).b(), (dft)localObject1);
          ((dhg)localObject7).e = ((dhr)localObject4);
          localObject1 = ((dhg)localObject7).a();
          dgi.b.a(((dhg)localObject7).b, (dfh)localObject1, (dhg)localObject7, ((dhg)localObject7).m);
          ((dhg)localObject7).c = ((dfh)localObject1);
          ((dhg)localObject7).f = ((dhg)localObject7).c.b;
          ((dhg)localObject7).h = dgi.b.a(((dhg)localObject7).c, (dhg)localObject7);
          if ((!((dhg)localObject7).r) || (!((dhg)localObject7).c()) || (((dhg)localObject7).p != null)) {
            break label1780;
          }
          l1 = dhl.a((dfy)localObject8);
          if (!((dhg)localObject7).k) {
            break label1881;
          }
          if (l1 > 2147483647L)
          {
            localObject1 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject1).<init>("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
            throw ((Throwable)localObject1);
          }
        }
        catch (IOException localIOException2)
        {
          localObject1 = new dho;
          ((dho)localObject1).<init>(localIOException2);
          throw ((Throwable)localObject1);
        }
        if (l1 != -1L)
        {
          ((dhg)localObject7).h.a(((dhg)localObject7).m);
          localObject1 = new dhp;
          ((dhp)localObject1).<init>((int)l1);
          ((dhg)localObject7).p = ((dku)localObject1);
          this.k = this.b.f;
          if (this.b.c == null) {
            break label2099;
          }
        }
        for (localObject1 = this.b.c.i;; localObject1 = null)
        {
          this.c = ((dfn)localObject1);
          if (!paramBoolean) {
            break label2306;
          }
          localObject6 = this.b;
          if (((dhg)localObject6).o != null) {
            break label2306;
          }
          if ((((dhg)localObject6).m != null) || (((dhg)localObject6).n != null)) {
            break label2104;
          }
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("call sendRequest() first!");
          throw ((Throwable)localObject1);
          localObject1 = new dhp;
          ((dhp)localObject1).<init>();
          ((dhg)localObject7).p = ((dku)localObject1);
          break;
          ((dhg)localObject7).h.a(((dhg)localObject7).m);
          ((dhg)localObject7).p = ((dhg)localObject7).h.a(((dhg)localObject7).m, l1);
          break;
          if (((dhg)localObject7).c != null)
          {
            dgi.b.a(((dhg)localObject7).b.q, ((dhg)localObject7).c);
            ((dhg)localObject7).c = null;
          }
          if (((dhg)localObject7).n != null)
          {
            localObject1 = ((dhg)localObject7).n.a();
            ((dgd)localObject1).a = ((dhg)localObject7).l;
          }
          for (((dhg)localObject7).o = ((dgd)localObject1).c(dhg.a(((dhg)localObject7).g)).b(dhg.a(((dhg)localObject7).n)).a();; ((dhg)localObject7).o = ((dgd)localObject1).a())
          {
            ((dhg)localObject7).o = ((dhg)localObject7).b(((dhg)localObject7).o);
            break;
            localObject1 = new dgd;
            ((dgd)localObject1).<init>();
            ((dgd)localObject1).a = ((dhg)localObject7).l;
            localObject1 = ((dgd)localObject1).c(dhg.a(((dhg)localObject7).g));
            ((dgd)localObject1).b = dfx.b;
            ((dgd)localObject1).c = 504;
            ((dgd)localObject1).d = "Unsatisfiable Request (only-if-cached)";
            ((dgd)localObject1).g = dhg.a;
          }
        }
        Object localObject5;
        if (((dhg)localObject6).m != null)
        {
          if (!((dhg)localObject6).s) {
            break label2311;
          }
          ((dhg)localObject6).h.a(((dhg)localObject6).m);
          localObject1 = ((dhg)localObject6).j();
          ((dhg)localObject6).a(((dgc)localObject1).f);
          if (((dhg)localObject6).n == null) {
            break label3090;
          }
          localObject5 = ((dhg)localObject6).n;
          if (((dgc)localObject1).c != 304) {
            break label3022;
          }
          m = 1;
          if (m == 0) {
            break label3079;
          }
          localObject5 = ((dhg)localObject6).n.a();
          ((dgd)localObject5).a = ((dhg)localObject6).l;
          ((dhg)localObject6).o = ((dgd)localObject5).c(dhg.a(((dhg)localObject6).g)).a(dhg.a(((dhg)localObject6).n.f, ((dgc)localObject1).f)).b(dhg.a(((dhg)localObject6).n)).a(dhg.a((dgc)localObject1)).a();
          ((dgc)localObject1).g.close();
          ((dhg)localObject6).h();
          dgi.b.a(((dhg)localObject6).b);
          dhg.a(((dhg)localObject6).o);
          localObject1 = ((dhg)localObject6).o;
        }
        for (;;)
        {
          ((dhg)localObject6).o = ((dhg)localObject6).b((dgc)localObject1);
          do
          {
            paramBoolean = true;
            break;
            if (!((dhg)localObject6).r)
            {
              localObject5 = new dhj;
              ((dhj)localObject5).<init>((dhg)localObject6, 0, ((dhg)localObject6).m);
              localObject7 = ((dhg)localObject6).m;
              ((dhj)localObject5).b += 1;
              if (((dhj)localObject5).a > 0)
              {
                localObject1 = (s)((dhj)localObject5).c.b.g.get(((dhj)localObject5).a - 1);
                localObject8 = ((dhj)localObject5).c.c.b.a;
                if ((!((dfy)localObject7).a().getHost().equals(((dez)localObject8).b)) || (dgs.a(((dfy)localObject7).a()) != ((dez)localObject8).c))
                {
                  localObject5 = new java/lang/IllegalStateException;
                  localObject6 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject6).<init>("network interceptor ");
                  ((IllegalStateException)localObject5).<init>(localObject1 + " must retain the same host and port");
                  throw ((Throwable)localObject5);
                }
                if (((dhj)localObject5).b > 1)
                {
                  localObject5 = new java/lang/IllegalStateException;
                  localObject6 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject6).<init>("network interceptor ");
                  ((IllegalStateException)localObject5).<init>(localObject1 + " must call proceed() exactly once");
                  throw ((Throwable)localObject5);
                }
              }
              if (((dhj)localObject5).a < ((dhj)localObject5).c.b.g.size())
              {
                localObject8 = new dhj;
                ((dhj)localObject8).<init>(((dhj)localObject5).c, ((dhj)localObject5).a + 1, (dfy)localObject7);
                localObject5 = (s)((dhj)localObject5).c.b.g.get(((dhj)localObject5).a);
                localObject1 = ((s)localObject5).k();
                if (((dhj)localObject8).b != 1)
                {
                  localObject6 = new java/lang/IllegalStateException;
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>("network interceptor ");
                  ((IllegalStateException)localObject6).<init>(localObject5 + " must call proceed() exactly once");
                  throw ((Throwable)localObject6);
                }
              }
              do
              {
                do
                {
                  break;
                  dhg.a(((dhj)localObject5).c).a((dfy)localObject7);
                  ((dhj)localObject5).c.m = ((dfy)localObject7);
                  if ((((dhj)localObject5).c.c()) && (((dfy)localObject7).d != null))
                  {
                    localObject1 = dkk.a(dhg.a(((dhj)localObject5).c).a((dfy)localObject7, ((dfy)localObject7).d.a()));
                    ((dfy)localObject7).d.a((dkc)localObject1);
                    ((dkc)localObject1).close();
                  }
                  localObject5 = ((dhj)localObject5).c.j();
                  m = ((dgc)localObject5).c;
                  if (m == 204) {
                    break label2756;
                  }
                  localObject1 = localObject5;
                } while (m != 205);
                localObject1 = localObject5;
              } while (((dgc)localObject5).g.a() <= 0L);
              localObject6 = new java/net/ProtocolException;
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>("HTTP ");
              ((ProtocolException)localObject6).<init>(m + " had non-zero Content-Length: " + ((dgc)localObject5).g.a());
              throw ((Throwable)localObject6);
            }
            if ((((dhg)localObject6).q != null) && (((dhg)localObject6).q.b().b > 0L)) {
              ((dhg)localObject6).q.d();
            }
            if (((dhg)localObject6).i == -1L)
            {
              if ((dhl.a(((dhg)localObject6).m) == -1L) && ((((dhg)localObject6).p instanceof dhp)))
              {
                l1 = ((dhp)((dhg)localObject6).p).a.b;
                ((dhg)localObject6).m = ((dhg)localObject6).m.c().a("Content-Length", Long.toString(l1)).a();
              }
              ((dhg)localObject6).h.a(((dhg)localObject6).m);
            }
            if (((dhg)localObject6).p == null) {
              break label2135;
            }
            if (((dhg)localObject6).q != null) {
              ((dhg)localObject6).q.close();
            }
            for (;;)
            {
              if (!(((dhg)localObject6).p instanceof dhp)) {
                break label3020;
              }
              ((dhg)localObject6).h.a((dhp)((dhg)localObject6).p);
              break;
              ((dhg)localObject6).p.close();
            }
            break label2135;
            localObject7 = ((dgc)localObject5).f.b("Last-Modified");
            if (localObject7 != null)
            {
              localObject5 = ((dgc)localObject1).f.b("Last-Modified");
              if ((localObject5 != null) && (((Date)localObject5).getTime() < ((Date)localObject7).getTime()))
              {
                m = 1;
                break label2177;
              }
            }
            m = 0;
            break label2177;
            dgs.a(((dhg)localObject6).n.g);
            localObject5 = ((dgc)localObject1).a();
            ((dgd)localObject5).a = ((dhg)localObject6).l;
            ((dhg)localObject6).o = ((dgd)localObject5).c(dhg.a(((dhg)localObject6).g)).b(dhg.a(((dhg)localObject6).n)).a(dhg.a((dgc)localObject1)).a();
          } while (!dhg.c(((dhg)localObject6).o));
          ((dhg)localObject6).g();
          localObject7 = ((dhg)localObject6).t;
          localObject1 = ((dhg)localObject6).o;
          if (localObject7 != null)
          {
            localObject5 = ((s)localObject7).n();
            if (localObject5 != null)
            {
              localObject8 = ((dgc)localObject1).g.c();
              localObject9 = dkk.a((dku)localObject5);
              localObject5 = new dhi;
              ((dhi)localObject5).<init>((dhg)localObject6, (dkd)localObject8, (s)localObject7, (dkc)localObject9);
              localObject7 = ((dgc)localObject1).a();
              localObject8 = new dhn;
              ((dhn)localObject8).<init>(((dgc)localObject1).f, dkk.a((dkv)localObject5));
              ((dgd)localObject7).g = ((dge)localObject8);
              localObject1 = ((dgd)localObject7).a();
            }
          }
        }
        localObject6 = ((dhq)localObject5).b;
        if ((localObject6 instanceof ProtocolException))
        {
          m = 0;
          break label490;
        }
        if ((localObject6 instanceof InterruptedIOException))
        {
          m = 0;
          break label490;
        }
        if (((localObject6 instanceof SSLHandshakeException)) && ((((IOException)localObject6).getCause() instanceof CertificateException)))
        {
          m = 0;
          break label490;
        }
        if ((localObject6 instanceof SSLPeerUnverifiedException))
        {
          m = 0;
          break label490;
        }
        m = 1;
        break label490;
        localObject6 = ((dhg)localObject1).i();
        localObject1 = new dhg(((dhg)localObject1).b, ((dhg)localObject1).l, ((dhg)localObject1).k, ((dhg)localObject1).r, ((dhg)localObject1).s, (dfh)localObject6, ((dhg)localObject1).e, (dhp)((dhg)localObject1).p, ((dhg)localObject1).g);
        break label497;
        localObject1 = ((dhq)localObject5).b;
        this.i = ((IOException)localObject1);
        throw ((Throwable)localObject1);
        n = 0;
        break label611;
        if ((localObject5 instanceof ProtocolException))
        {
          m = 0;
          break label660;
        }
        if ((localObject5 instanceof InterruptedIOException))
        {
          m = 0;
          break label660;
        }
        m = 1;
        break label660;
        localObject1 = ((dhg)localObject6).i();
        localObject1 = new dhg(((dhg)localObject6).b, ((dhg)localObject6).l, ((dhg)localObject6).k, ((dhg)localObject6).r, ((dhg)localObject6).s, (dfh)localObject1, ((dhg)localObject6).e, (dhp)localObject7, ((dhg)localObject6).g);
        break label672;
        this.i = ((IOException)localObject5);
        throw ((Throwable)localObject5);
      }
    }
  }
  
  private void b()
  {
    if (this.i != null) {
      throw this.i;
    }
    if (this.b != null) {
      return;
    }
    this.connected = true;
    do
    {
      try
      {
        if (this.doOutput)
        {
          if (this.method.equals("GET")) {
            this.method = "POST";
          }
        }
        else {
          this.b = a(this.method, null, null, null);
        }
      }
      catch (IOException localIOException)
      {
        this.i = localIOException;
        throw localIOException;
      }
    } while (a.q(this.method));
    ProtocolException localProtocolException = new java/net/ProtocolException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localProtocolException.<init>(this.method + " does not support writing");
    throw localProtocolException;
  }
  
  private dhg c()
  {
    b();
    Object localObject1;
    if (this.b.e())
    {
      localObject1 = this.b;
      return (dhg)localObject1;
    }
    Object localObject2;
    label121:
    label204:
    label488:
    do
    {
      if (!this.b.b(((dfy)localObject1).a())) {
        this.b.h();
      }
      Object localObject3 = this.b.i();
      this.b = a(((dfy)localObject1).b, (dfh)localObject3, (dhp)localObject2, localdgc);
      while (!a(true)) {}
      dgc localdgc = this.b.f();
      localObject2 = this.b;
      if (((dhg)localObject2).o == null) {
        throw new IllegalStateException();
      }
      if (((dhg)localObject2).f != null)
      {
        localObject1 = ((dhg)localObject2).f.b;
        switch (((dhg)localObject2).o.c)
        {
        default: 
          localObject1 = null;
        }
      }
      for (;;)
      {
        if (localObject1 != null) {
          break label488;
        }
        this.b.h();
        localObject1 = this.b;
        break;
        localObject1 = ((dhg)localObject2).b.d;
        break label121;
        if (((Proxy)localObject1).type() != Proxy.Type.HTTP) {
          throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
        }
        localObject1 = dhl.a(((dhg)localObject2).b.p, ((dhg)localObject2).o, (Proxy)localObject1);
        continue;
        if (((!((dhg)localObject2).l.b.equals("GET")) && (!((dhg)localObject2).l.b.equals("HEAD"))) || (!((dhg)localObject2).b.t)) {
          break label204;
        }
        localObject1 = ((dhg)localObject2).o.a("Location");
        if (localObject1 == null) {
          break label204;
        }
        localObject1 = new URL(((dhg)localObject2).l.a(), (String)localObject1);
        if (((!((URL)localObject1).getProtocol().equals("https")) && (!((URL)localObject1).getProtocol().equals("http"))) || ((!((URL)localObject1).getProtocol().equals(((dhg)localObject2).l.a().getProtocol())) && (!((dhg)localObject2).b.s))) {
          break label204;
        }
        localObject3 = ((dhg)localObject2).l.c();
        if (a.q(((dhg)localObject2).l.b))
        {
          ((dfz)localObject3).a("GET", null);
          ((dfz)localObject3).a("Transfer-Encoding");
          ((dfz)localObject3).a("Content-Length");
          ((dfz)localObject3).a("Content-Type");
        }
        if (!((dhg)localObject2).b((URL)localObject1)) {
          ((dfz)localObject3).a("Authorization");
        }
        localObject1 = ((dfz)localObject3).a((URL)localObject1).a();
      }
      int m = this.h + 1;
      this.h = m;
      if (m > 20) {
        throw new ProtocolException("Too many follow-up requests: " + this.h);
      }
      this.url = ((dfy)localObject1).a();
      this.f = ((dfy)localObject1).c.a();
      localObject2 = this.b.d();
      if (!((dfy)localObject1).b.equals(this.method)) {
        localObject2 = null;
      }
    } while ((localObject2 == null) || ((localObject2 instanceof dhp)));
    throw new HttpRetryException("Cannot retry streamed HTTP body", this.responseCode);
  }
  
  public final void addRequestProperty(String paramString1, String paramString2)
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot add request property after connection is made");
    }
    if (paramString1 == null) {
      throw new NullPointerException("field == null");
    }
    if (paramString2 == null)
    {
      dgn.a();
      dgn.a("Ignoring header " + paramString1 + " because its value was null.");
    }
    for (;;)
    {
      return;
      if (("X-Android-Transports".equals(paramString1)) || ("X-Android-Protocols".equals(paramString1))) {
        a(paramString2, true);
      } else {
        this.f.a(paramString1, paramString2);
      }
    }
  }
  
  public final void connect()
  {
    b();
    while (!a(false)) {}
  }
  
  public final void disconnect()
  {
    if (this.b == null) {}
    for (;;)
    {
      return;
      dhg localdhg = this.b;
      if (localdhg.h != null) {
        try
        {
          localdhg.h.a(localdhg);
        }
        catch (IOException localIOException) {}
      }
    }
  }
  
  public final int getConnectTimeout()
  {
    return this.a.v;
  }
  
  public final InputStream getErrorStream()
  {
    localObject3 = null;
    try
    {
      dhg localdhg = c();
      localObject1 = localObject3;
      if (dhg.c(localdhg.f()))
      {
        localObject1 = localObject3;
        if (localdhg.f().c >= 400) {
          localObject1 = localdhg.f().g.b();
        }
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject2 = localObject3;
      }
    }
    return (InputStream)localObject1;
  }
  
  public final String getHeaderField(int paramInt)
  {
    try
    {
      String str = a().b(paramInt);
      return str;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
  }
  
  public final String getHeaderField(String paramString)
  {
    if (paramString == null) {}
    try
    {
      for (paramString = dhv.a(c().f()).toString();; paramString = a().a(paramString)) {
        return paramString;
      }
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString = null;
      }
    }
  }
  
  public final String getHeaderFieldKey(int paramInt)
  {
    try
    {
      String str = a().a(paramInt);
      return str;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject = null;
      }
    }
  }
  
  public final Map getHeaderFields()
  {
    try
    {
      Map localMap1 = dhl.a(a(), dhv.a(c().f()).toString());
      return localMap1;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Map localMap2 = Collections.emptyMap();
      }
    }
  }
  
  public final InputStream getInputStream()
  {
    if (!this.doInput) {
      throw new ProtocolException("This protocol does not support input");
    }
    dhg localdhg = c();
    if (getResponseCode() >= 400) {
      throw new FileNotFoundException(this.url.toString());
    }
    return localdhg.f().g.b();
  }
  
  public final OutputStream getOutputStream()
  {
    connect();
    dhg localdhg = this.b;
    Object localObject = localdhg.q;
    if (localObject != null) {}
    while (localObject == null)
    {
      throw new ProtocolException("method does not support a request body: " + this.method);
      localObject = localdhg.d();
      if (localObject != null)
      {
        localObject = dkk.a((dku)localObject);
        localdhg.q = ((dkc)localObject);
      }
      else
      {
        localObject = null;
      }
    }
    if (this.b.e()) {
      throw new ProtocolException("cannot write request body after response has been read");
    }
    return ((dkc)localObject).c();
  }
  
  public final Permission getPermission()
  {
    String str = getURL().getHost();
    int m = dgs.a(getURL());
    if (usingProxy())
    {
      InetSocketAddress localInetSocketAddress = (InetSocketAddress)this.a.d.address();
      str = localInetSocketAddress.getHostName();
      m = localInetSocketAddress.getPort();
    }
    return new SocketPermission(str + ":" + m, "connect, resolve");
  }
  
  public final int getReadTimeout()
  {
    return this.a.w;
  }
  
  public final Map getRequestProperties()
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot access request header fields after connection is set");
    }
    return dhl.a(this.f.a(), null);
  }
  
  public final String getRequestProperty(String paramString)
  {
    if (paramString == null) {
      paramString = null;
    }
    for (;;)
    {
      return paramString;
      dfp localdfp = this.f;
      for (int m = localdfp.a.size() - 2;; m -= 2)
      {
        if (m < 0) {
          break label74;
        }
        if (paramString.equalsIgnoreCase((String)localdfp.a.get(m)))
        {
          paramString = (String)localdfp.a.get(m + 1);
          break;
        }
      }
      label74:
      paramString = null;
    }
  }
  
  public final int getResponseCode()
  {
    return c().f().c;
  }
  
  public final String getResponseMessage()
  {
    return c().f().d;
  }
  
  public final void setConnectTimeout(int paramInt)
  {
    dft localdft = this.a;
    long l1 = paramInt;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    if (l1 < 0L) {
      throw new IllegalArgumentException("timeout < 0");
    }
    if (localTimeUnit == null) {
      throw new IllegalArgumentException("unit == null");
    }
    long l2 = localTimeUnit.toMillis(l1);
    if (l2 > 2147483647L) {
      throw new IllegalArgumentException("Timeout too large.");
    }
    if ((l2 == 0L) && (l1 > 0L)) {
      throw new IllegalArgumentException("Timeout too small.");
    }
    localdft.v = ((int)l2);
  }
  
  public final void setFixedLengthStreamingMode(int paramInt)
  {
    setFixedLengthStreamingMode(paramInt);
  }
  
  public final void setFixedLengthStreamingMode(long paramLong)
  {
    if (this.connected) {
      throw new IllegalStateException("Already connected");
    }
    if (this.chunkLength > 0) {
      throw new IllegalStateException("Already in chunked mode");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("contentLength < 0");
    }
    this.g = paramLong;
    this.fixedContentLength = ((int)Math.min(paramLong, 2147483647L));
  }
  
  public final void setIfModifiedSince(long paramLong)
  {
    super.setIfModifiedSince(paramLong);
    if (this.ifModifiedSince != 0L) {
      this.f.c("If-Modified-Since", dhe.a(new Date(this.ifModifiedSince)));
    }
    for (;;)
    {
      return;
      this.f.a("If-Modified-Since");
    }
  }
  
  public final void setInstanceFollowRedirects(boolean paramBoolean)
  {
    this.a.t = paramBoolean;
  }
  
  public final void setReadTimeout(int paramInt)
  {
    dft localdft = this.a;
    long l2 = paramInt;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    if (l2 < 0L) {
      throw new IllegalArgumentException("timeout < 0");
    }
    if (localTimeUnit == null) {
      throw new IllegalArgumentException("unit == null");
    }
    long l1 = localTimeUnit.toMillis(l2);
    if (l1 > 2147483647L) {
      throw new IllegalArgumentException("Timeout too large.");
    }
    if ((l1 == 0L) && (l2 > 0L)) {
      throw new IllegalArgumentException("Timeout too small.");
    }
    localdft.w = ((int)l1);
  }
  
  public final void setRequestMethod(String paramString)
  {
    if (!d.contains(paramString)) {
      throw new ProtocolException("Expected one of " + d + " but was " + paramString);
    }
    this.method = paramString;
  }
  
  public final void setRequestProperty(String paramString1, String paramString2)
  {
    if (this.connected) {
      throw new IllegalStateException("Cannot set request property after connection is made");
    }
    if (paramString1 == null) {
      throw new NullPointerException("field == null");
    }
    if (paramString2 == null)
    {
      dgn.a();
      dgn.a("Ignoring header " + paramString1 + " because its value was null.");
    }
    for (;;)
    {
      return;
      if (("X-Android-Transports".equals(paramString1)) || ("X-Android-Protocols".equals(paramString1))) {
        a(paramString2, false);
      } else {
        this.f.c(paramString1, paramString2);
      }
    }
  }
  
  public final boolean usingProxy()
  {
    Proxy localProxy;
    if (this.k != null)
    {
      localProxy = this.k.b;
      if ((localProxy == null) || (localProxy.type() == Proxy.Type.DIRECT)) {
        break label44;
      }
    }
    label44:
    for (boolean bool = true;; bool = false)
    {
      return bool;
      localProxy = this.a.d;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */