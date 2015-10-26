import android.widget.Toast;
import com.google.android.apps.chromecast.app.mirror.CastScreenActivity;

public final class bbf
  implements Runnable
{
  public bbf(CastScreenActivity paramCastScreenActivity, String paramString, int paramInt) {}
  
  public final void run()
  {
    CastScreenActivity.a(this.c, Toast.makeText(this.c, this.a, this.b));
    CastScreenActivity.e(this.c).show();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */