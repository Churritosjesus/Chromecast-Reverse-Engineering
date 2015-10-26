import android.text.TextUtils;
import java.nio.charset.Charset;
import org.json.JSONObject;

public final class bfc
{
  private static final Charset c = Charset.forName("UTF-8");
  byte[] a;
  public String b;
  
  private bfc(String paramString1, String paramString2)
  {
    a(paramString2);
    if (paramString1 == null) {
      throw new IllegalArgumentException("data cannot be null");
    }
    this.a = paramString1.getBytes(c);
    this.b = paramString2;
  }
  
  public bfc(byte[] paramArrayOfByte, String paramString)
  {
    a(paramString);
    if (paramArrayOfByte == null) {
      throw new IllegalArgumentException("data cannot be null");
    }
    this.a = paramArrayOfByte;
    this.b = paramString;
  }
  
  public static bfc a(JSONObject paramJSONObject)
  {
    return new bfc(paramJSONObject.toString(), "application/json");
  }
  
  private static void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("mime type cannot be null or empty");
    }
  }
  
  public final String a()
  {
    if (this.a != null) {}
    for (String str = new String(this.a, c);; str = null) {
      return str;
    }
  }
  
  public final String toString()
  {
    return "[MimeData; type: " + this.b + ", length: " + this.a.length + "]";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bfc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */