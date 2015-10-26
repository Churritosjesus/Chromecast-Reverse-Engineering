import android.app.PendingIntent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.apps.chromecast.app.mirror.CastScreenActivity;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.GoogleApiClient;

public final class bbk
  extends ua
{
  public bbk(CastScreenActivity paramCastScreenActivity) {}
  
  public final void a()
  {
    this.a.disconnectMirroring(null);
  }
  
  public final void a(tz paramtz, uh paramuh) {}
  
  public final void a(uh paramuh)
  {
    CastScreenActivity.b(this.a);
    CastScreenActivity.a(this.a, this.a.getString(b.ao), 0);
    Object localObject = CastScreenActivity.d(this.a);
    paramuh = CastDevice.a(paramuh.m);
    PendingIntent localPendingIntent = CastScreenActivity.c(this.a);
    if ((((bbn)localObject).c != null) && (((bbn)localObject).c.d())) {
      bvc.c.startMirroring(((bbn)localObject).c, paramuh.b, localPendingIntent).a(new bbq((bbn)localObject, paramuh));
    }
    localObject = SetupApplication.a();
    if (true != ((SetupApplication)localObject).d)
    {
      ((SetupApplication)localObject).d = true;
      paramuh = ((SetupApplication)localObject).a.edit();
      paramuh.putBoolean("CAST_SCREEN_LAUNCHED", ((SetupApplication)localObject).d);
      paramuh.apply();
    }
  }
  
  public final void b(tz paramtz, uh paramuh) {}
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bbk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */