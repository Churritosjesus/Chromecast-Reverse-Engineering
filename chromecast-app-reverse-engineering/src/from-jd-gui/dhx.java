import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

abstract class dhx
  extends HttpsURLConnection
{
  private final HttpURLConnection a;
  
  public dhx(HttpURLConnection paramHttpURLConnection)
  {
    super(paramHttpURLConnection.getURL());
    this.a = paramHttpURLConnection;
  }
  
  protected abstract dfn a();
  
  public void addRequestProperty(String paramString1, String paramString2)
  {
    this.a.addRequestProperty(paramString1, paramString2);
  }
  
  public void connect()
  {
    this.connected = true;
    this.a.connect();
  }
  
  public void disconnect()
  {
    this.a.disconnect();
  }
  
  public boolean getAllowUserInteraction()
  {
    return this.a.getAllowUserInteraction();
  }
  
  public String getCipherSuite()
  {
    Object localObject = a();
    if (localObject != null) {}
    for (localObject = ((dfn)localObject).a;; localObject = null) {
      return (String)localObject;
    }
  }
  
  public int getConnectTimeout()
  {
    return this.a.getConnectTimeout();
  }
  
  public Object getContent()
  {
    return this.a.getContent();
  }
  
  public Object getContent(Class[] paramArrayOfClass)
  {
    return this.a.getContent(paramArrayOfClass);
  }
  
  public String getContentEncoding()
  {
    return this.a.getContentEncoding();
  }
  
  public int getContentLength()
  {
    return this.a.getContentLength();
  }
  
  public String getContentType()
  {
    return this.a.getContentType();
  }
  
  public long getDate()
  {
    return this.a.getDate();
  }
  
  public boolean getDefaultUseCaches()
  {
    return this.a.getDefaultUseCaches();
  }
  
  public boolean getDoInput()
  {
    return this.a.getDoInput();
  }
  
  public boolean getDoOutput()
  {
    return this.a.getDoOutput();
  }
  
  public InputStream getErrorStream()
  {
    return this.a.getErrorStream();
  }
  
  public long getExpiration()
  {
    return this.a.getExpiration();
  }
  
  public String getHeaderField(int paramInt)
  {
    return this.a.getHeaderField(paramInt);
  }
  
  public String getHeaderField(String paramString)
  {
    return this.a.getHeaderField(paramString);
  }
  
  public long getHeaderFieldDate(String paramString, long paramLong)
  {
    return this.a.getHeaderFieldDate(paramString, paramLong);
  }
  
  public int getHeaderFieldInt(String paramString, int paramInt)
  {
    return this.a.getHeaderFieldInt(paramString, paramInt);
  }
  
  public String getHeaderFieldKey(int paramInt)
  {
    return this.a.getHeaderFieldKey(paramInt);
  }
  
  public Map getHeaderFields()
  {
    return this.a.getHeaderFields();
  }
  
  public long getIfModifiedSince()
  {
    return this.a.getIfModifiedSince();
  }
  
  public InputStream getInputStream()
  {
    return this.a.getInputStream();
  }
  
  public boolean getInstanceFollowRedirects()
  {
    return this.a.getInstanceFollowRedirects();
  }
  
  public long getLastModified()
  {
    return this.a.getLastModified();
  }
  
  public Certificate[] getLocalCertificates()
  {
    Certificate[] arrayOfCertificate = null;
    Object localObject = a();
    if (localObject == null) {}
    for (;;)
    {
      return arrayOfCertificate;
      localObject = ((dfn)localObject).c;
      if (!((List)localObject).isEmpty()) {
        arrayOfCertificate = (Certificate[])((List)localObject).toArray(new Certificate[((List)localObject).size()]);
      }
    }
  }
  
  public Principal getLocalPrincipal()
  {
    Object localObject2 = null;
    dfn localdfn = a();
    Object localObject1 = localObject2;
    if (localdfn != null)
    {
      localObject1 = localObject2;
      if (!localdfn.c.isEmpty()) {
        localObject1 = ((X509Certificate)localdfn.c.get(0)).getSubjectX500Principal();
      }
    }
    return (Principal)localObject1;
  }
  
  public OutputStream getOutputStream()
  {
    return this.a.getOutputStream();
  }
  
  public Principal getPeerPrincipal()
  {
    Object localObject2 = null;
    dfn localdfn = a();
    Object localObject1 = localObject2;
    if (localdfn != null)
    {
      localObject1 = localObject2;
      if (!localdfn.b.isEmpty()) {
        localObject1 = ((X509Certificate)localdfn.b.get(0)).getSubjectX500Principal();
      }
    }
    return (Principal)localObject1;
  }
  
  public Permission getPermission()
  {
    return this.a.getPermission();
  }
  
  public int getReadTimeout()
  {
    return this.a.getReadTimeout();
  }
  
  public String getRequestMethod()
  {
    return this.a.getRequestMethod();
  }
  
  public Map getRequestProperties()
  {
    return this.a.getRequestProperties();
  }
  
  public String getRequestProperty(String paramString)
  {
    return this.a.getRequestProperty(paramString);
  }
  
  public int getResponseCode()
  {
    return this.a.getResponseCode();
  }
  
  public String getResponseMessage()
  {
    return this.a.getResponseMessage();
  }
  
  public Certificate[] getServerCertificates()
  {
    Certificate[] arrayOfCertificate = null;
    Object localObject = a();
    if (localObject == null) {}
    for (;;)
    {
      return arrayOfCertificate;
      localObject = ((dfn)localObject).b;
      if (!((List)localObject).isEmpty()) {
        arrayOfCertificate = (Certificate[])((List)localObject).toArray(new Certificate[((List)localObject).size()]);
      }
    }
  }
  
  public URL getURL()
  {
    return this.a.getURL();
  }
  
  public boolean getUseCaches()
  {
    return this.a.getUseCaches();
  }
  
  public void setAllowUserInteraction(boolean paramBoolean)
  {
    this.a.setAllowUserInteraction(paramBoolean);
  }
  
  public void setChunkedStreamingMode(int paramInt)
  {
    this.a.setChunkedStreamingMode(paramInt);
  }
  
  public void setConnectTimeout(int paramInt)
  {
    this.a.setConnectTimeout(paramInt);
  }
  
  public void setDefaultUseCaches(boolean paramBoolean)
  {
    this.a.setDefaultUseCaches(paramBoolean);
  }
  
  public void setDoInput(boolean paramBoolean)
  {
    this.a.setDoInput(paramBoolean);
  }
  
  public void setDoOutput(boolean paramBoolean)
  {
    this.a.setDoOutput(paramBoolean);
  }
  
  public void setFixedLengthStreamingMode(int paramInt)
  {
    this.a.setFixedLengthStreamingMode(paramInt);
  }
  
  public void setIfModifiedSince(long paramLong)
  {
    this.a.setIfModifiedSince(paramLong);
  }
  
  public void setInstanceFollowRedirects(boolean paramBoolean)
  {
    this.a.setInstanceFollowRedirects(paramBoolean);
  }
  
  public void setReadTimeout(int paramInt)
  {
    this.a.setReadTimeout(paramInt);
  }
  
  public void setRequestMethod(String paramString)
  {
    this.a.setRequestMethod(paramString);
  }
  
  public void setRequestProperty(String paramString1, String paramString2)
  {
    this.a.setRequestProperty(paramString1, paramString2);
  }
  
  public void setUseCaches(boolean paramBoolean)
  {
    this.a.setUseCaches(paramBoolean);
  }
  
  public String toString()
  {
    return this.a.toString();
  }
  
  public boolean usingProxy()
  {
    return this.a.usingProxy();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dhx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */