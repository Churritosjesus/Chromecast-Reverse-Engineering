import android.content.ContentResolver;
import android.os.Handler;
import android.os.Looper;

final class czq
  extends Thread
{
  czq(String paramString, ContentResolver paramContentResolver)
  {
    super(paramString);
  }
  
  public final void run()
  {
    Looper.prepare();
    this.a.registerContentObserver(czp.a, true, new czr(this, new Handler(Looper.myLooper())));
    Looper.loop();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\czq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */