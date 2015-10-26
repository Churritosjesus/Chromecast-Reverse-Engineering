import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public final class cmg
  implements cmh
{
  private HttpURLConnection a;
  
  public final InputStream a(String paramString)
  {
    paramString = (HttpURLConnection)new URL(paramString).openConnection();
    paramString.setReadTimeout(20000);
    paramString.setConnectTimeout(20000);
    this.a = paramString;
    paramString = this.a;
    int i = paramString.getResponseCode();
    if (i == 200) {
      return paramString.getInputStream();
    }
    paramString = "Bad response: " + i;
    if (i == 404) {
      throw new FileNotFoundException(paramString);
    }
    throw new IOException(paramString);
  }
  
  public final void a()
  {
    HttpURLConnection localHttpURLConnection = this.a;
    if (localHttpURLConnection != null) {
      localHttpURLConnection.disconnect();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cmg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */