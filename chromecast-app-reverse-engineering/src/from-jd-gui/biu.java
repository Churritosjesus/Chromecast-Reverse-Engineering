import com.google.android.apps.chromecast.app.SetupApplication;
import com.google.android.apps.chromecast.app.setup.DeviceSetupActivity;

public final class biu
  implements Runnable
{
  public biu(DeviceSetupActivity paramDeviceSetupActivity) {}
  
  public final void run()
  {
    if ((SetupApplication.g()) || (this.a.i.w)) {
      DeviceSetupActivity.k(this.a);
    }
    for (;;)
    {
      return;
      DeviceSetupActivity.l(this.a);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\biu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */