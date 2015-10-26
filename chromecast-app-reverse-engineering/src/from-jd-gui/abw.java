import android.content.res.Resources;
import android.net.Uri;

abstract class abw
{
  final String[] a;
  final Uri b;
  final Uri c;
  
  public abw(String[] paramArrayOfString, Uri paramUri1, Uri paramUri2)
  {
    this.a = paramArrayOfString;
    this.b = paramUri1;
    this.c = paramUri2;
  }
  
  public abstract CharSequence a(Resources paramResources, int paramInt, CharSequence paramCharSequence);
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */