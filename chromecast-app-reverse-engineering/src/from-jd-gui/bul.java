import java.util.Map;

final class bul
  implements Runnable
{
  bul(buh parambuh, bue parambue, String paramString1, String paramString2) {}
  
  public final void run()
  {
    for (;;)
    {
      synchronized (bue.e(this.a))
      {
        btd localbtd = (btd)bue.e(this.a).get(this.b);
        if (localbtd != null)
        {
          bue.f(this.a);
          localbtd.a(this.b, this.c);
          return;
        }
      }
      bue.g().b("Discarded message for unknown namespace '%s'", new Object[] { this.b });
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bul.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */