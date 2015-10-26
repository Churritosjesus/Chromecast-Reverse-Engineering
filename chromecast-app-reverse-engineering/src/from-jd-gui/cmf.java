import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public final class cmf
  implements cmh
{
  private HttpClient a;
  
  public final InputStream a(String paramString)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 20000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 20000);
    this.a = new DefaultHttpClient(localBasicHttpParams);
    paramString = this.a.execute(new HttpGet(paramString));
    int i = paramString.getStatusLine().getStatusCode();
    if (i == 200)
    {
      cuh.e("Success response");
      return paramString.getEntity().getContent();
    }
    paramString = "Bad response: " + i;
    if (i == 404) {
      throw new FileNotFoundException(paramString);
    }
    throw new IOException(paramString);
  }
  
  public final void a()
  {
    HttpClient localHttpClient = this.a;
    if ((localHttpClient != null) && (localHttpClient.getConnectionManager() != null)) {
      localHttpClient.getConnectionManager().shutdown();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */