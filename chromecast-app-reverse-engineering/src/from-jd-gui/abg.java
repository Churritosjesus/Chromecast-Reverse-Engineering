import android.content.ContentResolver;
import android.net.Uri;
import android.os.AsyncTask;

public final class abg
  implements abr
{
  final ContentResolver a;
  final eh b;
  
  public abg(ContentResolver paramContentResolver)
  {
    this.a = paramContentResolver;
    this.b = new eh(20);
  }
  
  public final void a(acx paramacx, abs paramabs)
  {
    Uri localUri = paramacx.j;
    if (localUri != null)
    {
      byte[] arrayOfByte = (byte[])this.b.a(localUri);
      if (arrayOfByte != null)
      {
        paramacx.a(arrayOfByte);
        if (paramabs != null) {
          paramabs.b();
        }
      }
    }
    for (;;)
    {
      return;
      new abh(this, localUri, paramacx, paramabs).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
      continue;
      if (paramabs != null) {
        paramabs.d();
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\abg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */