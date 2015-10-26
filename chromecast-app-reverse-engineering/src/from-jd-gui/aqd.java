import android.content.Context;
import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.gms.cast.CastDevice;
import java.net.Inet4Address;

public final class aqd
{
  final blp a;
  final Context b;
  final String c;
  final String d;
  aqf e;
  tz f;
  ua g;
  apk h;
  boolean i;
  boolean j;
  
  public aqd(Context paramContext, String paramString1, String paramString2, blp paramblp)
  {
    this.b = paramContext;
    this.c = paramString1;
    this.d = paramString2;
    this.a = paramblp;
  }
  
  void a()
  {
    if ((this.f != null) && (this.g != null))
    {
      this.f.a(this.g);
      this.g = null;
    }
  }
  
  void a(boolean paramBoolean)
  {
    if (!this.i)
    {
      this.i = true;
      a();
      if (this.h != null) {
        this.h.c();
      }
      if ((paramBoolean) && (this.e != null)) {
        this.e.b();
      }
    }
  }
  
  boolean a(uh paramuh, String paramString, boolean paramBoolean)
  {
    if (CastDevice.a(paramuh.m).d.getHostAddress().equals(paramString)) {
      this.h = apk.a(paramuh, SetupApplication.a(), new aqg(this, paramBoolean));
    }
    for (paramBoolean = true;; paramBoolean = false) {
      return paramBoolean;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */