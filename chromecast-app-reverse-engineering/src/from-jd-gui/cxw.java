import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;

final class cxw
  implements cuz
{
  private final String a;
  private final HttpClient b;
  private final Context c;
  private cxx d;
  
  cxw(HttpClient paramHttpClient, Context paramContext, cxx paramcxx)
  {
    this.c = paramContext.getApplicationContext();
    String str = Build.VERSION.RELEASE;
    Locale localLocale = Locale.getDefault();
    if (localLocale == null) {
      paramContext = (Context)localObject;
    }
    for (;;)
    {
      this.a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { "GoogleTagManager", "4.00", str, paramContext, Build.MODEL, Build.ID });
      this.b = paramHttpClient;
      this.d = paramcxx;
      return;
      paramContext = (Context)localObject;
      if (localLocale.getLanguage() != null)
      {
        paramContext = (Context)localObject;
        if (localLocale.getLanguage().length() != 0)
        {
          paramContext = new StringBuilder();
          paramContext.append(localLocale.getLanguage().toLowerCase());
          if ((localLocale.getCountry() != null) && (localLocale.getCountry().length() != 0)) {
            paramContext.append("-").append(localLocale.getCountry().toLowerCase());
          }
          paramContext = paramContext.toString();
        }
      }
    }
  }
  
  private static URL a(cvk paramcvk)
  {
    String str = paramcvk.c;
    try
    {
      paramcvk = new java/net/URL;
      paramcvk.<init>(str);
      return paramcvk;
    }
    catch (MalformedURLException paramcvk)
    {
      for (;;)
      {
        cuh.a("Error trying to parse the GTM url.");
        paramcvk = null;
      }
    }
  }
  
  private HttpEntityEnclosingRequest a(URL paramURL)
  {
    for (;;)
    {
      try
      {
        BasicHttpEntityEnclosingRequest localBasicHttpEntityEnclosingRequest = new org/apache/http/message/BasicHttpEntityEnclosingRequest;
        localBasicHttpEntityEnclosingRequest.<init>("GET", paramURL.toURI().toString());
        cuh.b("Exception sending hit: " + localURISyntaxException1.getClass().getSimpleName());
      }
      catch (URISyntaxException localURISyntaxException1)
      {
        try
        {
          localBasicHttpEntityEnclosingRequest.addHeader("User-Agent", this.a);
          paramURL = localBasicHttpEntityEnclosingRequest;
          return paramURL;
        }
        catch (URISyntaxException localURISyntaxException2)
        {
          for (;;)
          {
            paramURL = localURISyntaxException1;
            Object localObject = localURISyntaxException2;
          }
        }
        localURISyntaxException1 = localURISyntaxException1;
        paramURL = null;
      }
      cuh.b(localURISyntaxException1.getMessage());
    }
  }
  
  private static void a(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Object localObject = paramHttpEntityEnclosingRequest.getAllHeaders();
    int j = localObject.length;
    for (int i = 0; i < j; i++) {
      localStringBuffer.append(localObject[i].toString()).append("\n");
    }
    localStringBuffer.append(paramHttpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
    if (paramHttpEntityEnclosingRequest.getEntity() != null) {}
    try
    {
      localObject = paramHttpEntityEnclosingRequest.getEntity().getContent();
      if (localObject != null)
      {
        i = ((InputStream)localObject).available();
        if (i > 0)
        {
          paramHttpEntityEnclosingRequest = new byte[i];
          ((InputStream)localObject).read(paramHttpEntityEnclosingRequest);
          localStringBuffer.append("POST:\n");
          localObject = new java/lang/String;
          ((String)localObject).<init>(paramHttpEntityEnclosingRequest);
          localStringBuffer.append((String)localObject).append("\n");
        }
      }
    }
    catch (IOException paramHttpEntityEnclosingRequest)
    {
      for (;;)
      {
        cuh.e("Error Writing hit to log...");
      }
    }
    cuh.e(localStringBuffer.toString());
  }
  
  public final void a(List paramList)
  {
    int n = Math.min(paramList.size(), 40);
    int i = 1;
    int m = 0;
    if (m < n)
    {
      cvk localcvk = (cvk)paramList.get(m);
      Object localObject2 = a(localcvk);
      if (localObject2 == null)
      {
        cuh.b("No destination: discarding hit.");
        this.d.b(localcvk);
      }
      for (;;)
      {
        m++;
        break;
        Object localObject1 = a((URL)localObject2);
        if (localObject1 == null)
        {
          this.d.b(localcvk);
        }
        else
        {
          localObject2 = new HttpHost(((URL)localObject2).getHost(), ((URL)localObject2).getPort(), ((URL)localObject2).getProtocol());
          ((HttpEntityEnclosingRequest)localObject1).addHeader("Host", ((HttpHost)localObject2).toHostString());
          a((HttpEntityEnclosingRequest)localObject1);
          int j = i;
          int k;
          if (i != 0) {
            k = i;
          }
          try
          {
            cwg.a(this.c);
            j = 0;
            k = j;
            i = j;
            localObject1 = this.b.execute((HttpHost)localObject2, (HttpRequest)localObject1);
            k = j;
            i = j;
            int i1 = ((HttpResponse)localObject1).getStatusLine().getStatusCode();
            k = j;
            i = j;
            localObject2 = ((HttpResponse)localObject1).getEntity();
            if (localObject2 != null)
            {
              k = j;
              i = j;
              ((HttpEntity)localObject2).consumeContent();
            }
            if (i1 != 200)
            {
              k = j;
              i = j;
              localObject2 = new java/lang/StringBuilder;
              k = j;
              i = j;
              ((StringBuilder)localObject2).<init>("Bad response: ");
              k = j;
              i = j;
              cuh.b(((HttpResponse)localObject1).getStatusLine().getStatusCode());
              k = j;
              i = j;
              this.d.c(localcvk);
              i = j;
            }
            else
            {
              k = j;
              i = j;
              this.d.a(localcvk);
              i = j;
            }
          }
          catch (ClientProtocolException localClientProtocolException)
          {
            cuh.b("ClientProtocolException sending hit; discarding hit...");
            this.d.b(localcvk);
            i = k;
          }
          catch (IOException localIOException)
          {
            cuh.b("Exception sending hit: " + localIOException.getClass().getSimpleName());
            cuh.b(localIOException.getMessage());
            this.d.c(localcvk);
          }
        }
      }
    }
  }
  
  public final boolean a()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.c.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected())) {
      cuh.e("...no network connectivity");
    }
    for (boolean bool = false;; bool = true) {
      return bool;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cxw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */