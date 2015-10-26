import com.google.android.apps.chromecast.app.setup.DeviceSetupActivity;

public final class bim
  implements Runnable
{
  public bim(DeviceSetupActivity paramDeviceSetupActivity) {}
  
  public final void run()
  {
    if (!DeviceSetupActivity.g(this.a)) {
      DeviceSetupActivity.m(this.a);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bim.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */