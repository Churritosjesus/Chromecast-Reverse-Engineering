import android.widget.Toast;
import com.google.android.apps.chromecast.app.DeviceSettingsActivity;
import com.google.android.apps.chromecast.app.SetupApplication;

public final class alv
  implements aop
{
  public alv(DeviceSettingsActivity paramDeviceSettingsActivity, String paramString) {}
  
  public final void a()
  {
    Object localObject = this.b;
    String str = this.a;
    ((and)localObject).i.b = str;
    localObject = SetupApplication.a().b().c(((and)localObject).h);
    if (localObject != null)
    {
      ((aow)localObject).c.b = str;
      ((aow)localObject).p();
    }
    Toast.makeText(this.b, b.do, 0).show();
  }
  
  public final void b()
  {
    if (DeviceSettingsActivity.a(this.b)) {
      DeviceSettingsActivity.b(this.b).a(this.b.i.b);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */