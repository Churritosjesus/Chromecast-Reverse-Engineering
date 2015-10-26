import android.net.Uri;
import android.net.http.AndroidHttpClient;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

final class bfr
  implements bfq
{
  private final AndroidHttpClient a;
  private final int b;
  private final int c;
  private Uri d;
  private int e;
  private HttpRequestBase f;
  private final HashMap g;
  private bfc h;
  private Header[] i;
  private final blp j;
  
  static
  {
    TimeUnit.SECONDS.toMillis(3L);
    TimeUnit.SECONDS.toMillis(10L);
  }
  
  public bfr(AndroidHttpClient paramAndroidHttpClient, int paramInt1, int paramInt2)
  {
    this.a = paramAndroidHttpClient;
    this.b = paramInt1;
    this.c = paramInt2;
    this.g = new HashMap();
    this.j = new blp("SimpleHttpRequestImpl", false);
  }
  
  private void a(HttpRequestBase paramHttpRequestBase)
  {
    this.f = paramHttpRequestBase;
    paramHttpRequestBase = this.g.entrySet().iterator();
    while (paramHttpRequestBase.hasNext())
    {
      localObject1 = (Map.Entry)paramHttpRequestBase.next();
      this.f.addHeader((String)((Map.Entry)localObject1).getKey(), (String)((Map.Entry)localObject1).getValue());
    }
    Object localObject3 = new BasicHttpContext();
    HttpConnectionParams.setConnectionTimeout(this.a.getParams(), this.b);
    HttpConnectionParams.setSoTimeout(this.a.getParams(), this.c);
    SystemClock.elapsedRealtime();
    int k = 0;
    Object localObject1 = null;
    if (k < 5) {}
    for (;;)
    {
      Object localObject2;
      try
      {
        paramHttpRequestBase = this.a.execute(this.f, (HttpContext)localObject3);
        m = paramHttpRequestBase.getStatusLine().getStatusCode();
        if (m != 302)
        {
          localObject1 = paramHttpRequestBase;
          if (m != 301) {
            break label551;
          }
        }
        localObject4 = paramHttpRequestBase.getHeaders("Location");
        localObject1 = paramHttpRequestBase;
        if (localObject4 == null) {
          break label551;
        }
        m = localObject4.length;
        localObject1 = paramHttpRequestBase;
        if (m == 0) {
          break label551;
        }
      }
      catch (ClientProtocolException paramHttpRequestBase)
      {
        try
        {
          localObject1 = this.f;
          URI localURI = new java/net/URI;
          localURI.<init>(localObject4[(localObject4.length - 1)].getValue());
          ((HttpRequestBase)localObject1).setURI(localURI);
          int m = k + 1;
          localObject4 = paramHttpRequestBase.getEntity();
          localObject1 = paramHttpRequestBase;
          k = m;
          if (localObject4 == null) {
            break;
          }
          ((HttpEntity)localObject4).consumeContent();
          localObject1 = paramHttpRequestBase;
          k = m;
        }
        catch (URISyntaxException localURISyntaxException)
        {
          this.j.a("Redirect failed. Unable to parse Location header into an URI", new Object[0]);
        }
        paramHttpRequestBase = paramHttpRequestBase;
        throw new IOException("client protocol error");
        Object localObject4 = (HttpUriRequest)((HttpContext)localObject3).getAttribute("http.request");
        localObject2 = (HttpHost)((HttpContext)localObject3).getAttribute("http.target_host");
        if (((HttpUriRequest)localObject4).getURI().isAbsolute())
        {
          localObject2 = localObject4.toString();
          Uri.parse((String)localObject2);
          if (paramHttpRequestBase == null) {
            break label546;
          }
          this.i = paramHttpRequestBase.getAllHeaders();
          this.e = paramHttpRequestBase.getStatusLine().getStatusCode();
          localObject2 = paramHttpRequestBase.getEntity();
          if (localObject2 == null) {
            break label546;
          }
          paramHttpRequestBase = ((HttpEntity)localObject2).getContentType();
          if (paramHttpRequestBase != null)
          {
            paramHttpRequestBase = paramHttpRequestBase.getValue();
            if (!TextUtils.isEmpty(paramHttpRequestBase)) {
              break label543;
            }
            paramHttpRequestBase = "application/octet-stream";
            localObject3 = new java/io/ByteArrayOutputStream;
            ((ByteArrayOutputStream)localObject3).<init>();
            ((HttpEntity)localObject2).writeTo((OutputStream)localObject3);
            ((HttpEntity)localObject2).consumeContent();
            ((ByteArrayOutputStream)localObject3).close();
            localObject2 = new bfc;
            ((bfc)localObject2).<init>(((ByteArrayOutputStream)localObject3).toByteArray(), paramHttpRequestBase);
            paramHttpRequestBase = (HttpRequestBase)localObject2;
            this.f = null;
            this.h = paramHttpRequestBase;
          }
        }
        else
        {
          localObject2 = String.valueOf(((HttpHost)localObject2).toURI());
          localObject3 = String.valueOf(((HttpUriRequest)localObject4).getURI());
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>(String.valueOf(localObject2).length() + 0 + String.valueOf(localObject3).length());
          localObject2 = (String)localObject2 + (String)localObject3;
          continue;
        }
        paramHttpRequestBase = null;
        continue;
      }
      catch (SocketTimeoutException paramHttpRequestBase)
      {
        throw new TimeoutException();
      }
      catch (IllegalStateException paramHttpRequestBase)
      {
        throw new MalformedURLException();
      }
      label543:
      continue;
      label546:
      paramHttpRequestBase = null;
      continue;
      label551:
      paramHttpRequestBase = (HttpRequestBase)localObject2;
    }
  }
  
  public final String a(String paramString)
  {
    Header[] arrayOfHeader = this.i;
    int m = arrayOfHeader.length;
    int k = 0;
    Header localHeader;
    if (k < m)
    {
      localHeader = arrayOfHeader[k];
      if (!localHeader.getName().equalsIgnoreCase(paramString)) {}
    }
    for (paramString = localHeader.getValue();; paramString = null)
    {
      return paramString;
      k++;
      break;
    }
  }
  
  public final void a()
  {
    HttpRequestBase localHttpRequestBase = this.f;
    if (localHttpRequestBase != null) {}
    try
    {
      this.j.a("aborting the HTTP request", new Object[0]);
      localHttpRequestBase.abort();
      return;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      for (;;) {}
    }
  }
  
  public final void a(Uri paramUri)
  {
    this.d = paramUri;
    a(new HttpGet(this.d.toString()));
  }
  
  public final void a(Uri paramUri, bfc parambfc)
  {
    this.d = paramUri;
    HttpPost localHttpPost = new HttpPost(this.d.toString());
    if (parambfc != null)
    {
      paramUri = new ByteArrayEntity(parambfc.a);
      paramUri.setContentType(parambfc.b);
      localHttpPost.setEntity(paramUri);
    }
    a(localHttpPost);
  }
  
  public final void a(String paramString1, String paramString2)
  {
    this.g.put(paramString1, paramString2);
  }
  
  public final int b()
  {
    return this.e;
  }
  
  public final bfc c()
  {
    return this.h;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */