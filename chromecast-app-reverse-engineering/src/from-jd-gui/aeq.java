import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class aeq
  implements aep
{
  private final s a;
  private final SSLSocketFactory b;
  
  public aeq()
  {
    this(null);
  }
  
  private aeq(s params)
  {
    this(null, null);
  }
  
  private aeq(s params, SSLSocketFactory paramSSLSocketFactory)
  {
    this.a = params;
    this.b = null;
  }
  
  private static HttpEntity a(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new BasicHttpEntity();
    try
    {
      InputStream localInputStream1 = paramHttpURLConnection.getInputStream();
      localBasicHttpEntity.setContent(localInputStream1);
      localBasicHttpEntity.setContentLength(paramHttpURLConnection.getContentLength());
      localBasicHttpEntity.setContentEncoding(paramHttpURLConnection.getContentEncoding());
      localBasicHttpEntity.setContentType(paramHttpURLConnection.getContentType());
      return localBasicHttpEntity;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        InputStream localInputStream2 = paramHttpURLConnection.getErrorStream();
      }
    }
  }
  
  private static void a(HttpURLConnection paramHttpURLConnection, ads paramads)
  {
    byte[] arrayOfByte = paramads.d();
    if (arrayOfByte != null)
    {
      paramHttpURLConnection.setDoOutput(true);
      paramHttpURLConnection.addRequestProperty("Content-Type", paramads.c());
      paramHttpURLConnection = new DataOutputStream(paramHttpURLConnection.getOutputStream());
      paramHttpURLConnection.write(arrayOfByte);
      paramHttpURLConnection.close();
    }
  }
  
  public HttpURLConnection a(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  public final HttpResponse a(ads paramads, Map paramMap)
  {
    Object localObject = paramads.b;
    HashMap localHashMap = new HashMap();
    localHashMap.putAll(paramads.a());
    localHashMap.putAll(paramMap);
    String str;
    if (this.a != null)
    {
      str = this.a.b();
      paramMap = str;
      if (str == null) {
        throw new IOException("URL blocked by rewriter: " + (String)localObject);
      }
    }
    else
    {
      paramMap = (Map)localObject;
    }
    localObject = new URL(paramMap);
    paramMap = a((URL)localObject);
    int i = paramads.f();
    paramMap.setConnectTimeout(i);
    paramMap.setReadTimeout(i);
    paramMap.setUseCaches(false);
    paramMap.setDoInput(true);
    if (("https".equals(((URL)localObject).getProtocol())) && (this.b != null)) {
      ((HttpsURLConnection)paramMap).setSSLSocketFactory(this.b);
    }
    localObject = localHashMap.keySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      str = (String)((Iterator)localObject).next();
      paramMap.addRequestProperty(str, (String)localHashMap.get(str));
    }
    switch (paramads.a)
    {
    default: 
      throw new IllegalStateException("Unknown method type.");
    case -1: 
      localObject = paramads.b();
      if (localObject != null)
      {
        paramMap.setDoOutput(true);
        paramMap.setRequestMethod("POST");
        paramMap.addRequestProperty("Content-Type", paramads.c());
        paramads = new DataOutputStream(paramMap.getOutputStream());
        paramads.write((byte[])localObject);
        paramads.close();
      }
      break;
    }
    for (;;)
    {
      paramads = new ProtocolVersion("HTTP", 1, 1);
      if (paramMap.getResponseCode() != -1) {
        break;
      }
      throw new IOException("Could not retrieve response code from HttpUrlConnection.");
      paramMap.setRequestMethod("GET");
      continue;
      paramMap.setRequestMethod("DELETE");
      continue;
      paramMap.setRequestMethod("POST");
      a(paramMap, paramads);
      continue;
      paramMap.setRequestMethod("PUT");
      a(paramMap, paramads);
      continue;
      paramMap.setRequestMethod("HEAD");
      continue;
      paramMap.setRequestMethod("OPTIONS");
      continue;
      paramMap.setRequestMethod("TRACE");
      continue;
      paramMap.setRequestMethod("PATCH");
      a(paramMap, paramads);
    }
    paramads = new BasicHttpResponse(new BasicStatusLine(paramads, paramMap.getResponseCode(), paramMap.getResponseMessage()));
    paramads.setEntity(a(paramMap));
    paramMap = paramMap.getHeaderFields().entrySet().iterator();
    while (paramMap.hasNext())
    {
      localObject = (Map.Entry)paramMap.next();
      if (((Map.Entry)localObject).getKey() != null) {
        paramads.addHeader(new BasicHeader((String)((Map.Entry)localObject).getKey(), (String)((List)((Map.Entry)localObject).getValue()).get(0)));
      }
    }
    return paramads;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aeq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */