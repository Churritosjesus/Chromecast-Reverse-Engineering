import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;

public final class bcl
  implements wg
{
  public bcl(bch parambch, bcd parambcd, bcm parambcm, int paramInt) {}
  
  public final boolean a(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == f.dl)
    {
      paramMenuItem = apg.a(144);
      paramMenuItem.b = this.a.a.a;
      paramMenuItem.b();
      this.b.a(this.a);
    }
    for (;;)
    {
      return false;
      if (paramMenuItem.getItemId() == f.eh)
      {
        paramMenuItem = apg.a(146);
        paramMenuItem.b = this.a.a.a;
        paramMenuItem.b();
        paramMenuItem = this.d.a.getContext();
        paramMenuItem.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(blf.f(paramMenuItem))));
      }
      else if (paramMenuItem.getItemId() == f.bt)
      {
        paramMenuItem = apg.a(145);
        paramMenuItem.b = this.a.a.a;
        paramMenuItem.b();
        this.b.a(this.a, this.c);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bcl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */