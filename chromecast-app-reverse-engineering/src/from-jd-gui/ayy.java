import com.google.android.gms.cast.CastDevice;

public final class ayy
  implements ayw
{
  private static final String[] a = { "Chromecast", "Chromecast Audio", "Chromekey", "Eureka Dongle" };
  private ayw b;
  private final blp c = new blp("SetupDeviceFilteringListener");
  
  public ayy(ayw paramayw)
  {
    this.b = paramayw;
  }
  
  public static boolean a(CastDevice paramCastDevice)
  {
    boolean bool2 = false;
    String[] arrayOfString = a;
    int j = arrayOfString.length;
    for (int i = 0;; i++)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (arrayOfString[i].equals(paramCastDevice.f)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
    }
  }
  
  private static boolean c(aym paramaym)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramaym.e == null)
    {
      bool1 = bool2;
      return bool1;
    }
    String[] arrayOfString = a;
    int j = arrayOfString.length;
    for (int i = 0;; i++)
    {
      bool1 = bool2;
      if (i >= j) {
        break;
      }
      if (arrayOfString[i].equals(paramaym.d))
      {
        bool1 = true;
        break;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    this.b.a(paramInt);
  }
  
  public final void a(aym paramaym)
  {
    if (c(paramaym)) {
      this.b.a(paramaym);
    }
    for (;;)
    {
      return;
      paramaym = paramaym.d;
    }
  }
  
  public final void b(aym paramaym)
  {
    if (c(paramaym)) {
      this.b.b(paramaym);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ayy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */