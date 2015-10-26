import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class atw
  extends aun
{
  public final List a = new ArrayList();
  public boolean b = false;
  private String c;
  
  public atw(Context paramContext)
  {
    this.c = blf.z(paramContext);
  }
  
  public final void a(Bundle paramBundle)
  {
    try
    {
      dbs localdbs = new dbs;
      localdbs.<init>();
      localdbs.a = new dbr[this.a.size()];
      for (int i = 0; i < this.a.size(); i++)
      {
        localObject = localdbs.a;
        ast localast = (ast)this.a.get(i);
        dbr localdbr = new dbr;
        localdbr.<init>();
        localdbr.a = localast.a;
        localdbr.b = localast.b;
        localdbr.c = localast.c;
        if (localast.d > 0L) {
          localdbr.d = Long.valueOf(localast.d);
        }
        localObject[i] = localdbr;
      }
      Object localObject = new byte[localdbs.d()];
      localdbs.a(dep.a((byte[])localObject, 0, localObject.length));
      paramBundle.putString("user_devices", Base64.encodeToString((byte[])localObject, 0));
      return;
    }
    catch (IOException paramBundle)
    {
      for (;;)
      {
        this.h.a("Could not serialize device data for savedInstanceState: %s", new Object[] { paramBundle });
      }
    }
  }
  
  public final void a(atf paramatf, auo paramauo)
  {
    paramatf.a(new auk(this.c, new atx(this, paramauo), new aty(this, paramauo)));
  }
  
  public final void a(dbs paramdbs)
  {
    this.a.clear();
    for (int i = 0; i < paramdbs.a.length; i++)
    {
      ast localast = new ast(paramdbs.a[i]);
      this.a.add(localast);
    }
  }
  
  public final void b(Bundle paramBundle)
  {
    paramBundle = paramBundle.getString("user_devices");
    if (paramBundle != null) {}
    try
    {
      a(dbs.a(Base64.decode(paramBundle, 0)));
      this.a.size();
      return;
    }
    catch (dev paramBundle)
    {
      for (;;)
      {
        this.h.a("Could not load user device list from savedInstanceState: %s", new Object[] { paramBundle });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\atw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */