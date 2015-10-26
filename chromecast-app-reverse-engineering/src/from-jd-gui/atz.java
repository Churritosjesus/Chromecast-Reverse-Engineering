import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import java.io.IOException;

public final class atz
  extends aun
{
  public auq a;
  public aur b;
  public long c;
  public String d;
  public String e;
  private String i;
  private String j;
  
  public atz(Context paramContext, String paramString)
  {
    this.j = blf.z(paramContext);
    this.i = paramString;
    this.a = new auq();
    this.b = new aur();
  }
  
  public final void a(Bundle paramBundle)
  {
    Object localObject = this.a;
    try
    {
      dck localdck = ((auq)localObject).a();
      arrayOfByte = new byte[localdck.d()];
      localdck.a(dep.a(arrayOfByte, 0, arrayOfByte.length));
      paramBundle.putString("user_topic_settings", Base64.encodeToString(arrayOfByte, 0));
      localObject = this.b;
      if (((aur)localObject).b == null) {}
    }
    catch (IOException localIOException)
    {
      try
      {
        byte[] arrayOfByte = new byte[((aur)localObject).b.d()];
        ((aur)localObject).b.a(dep.a(arrayOfByte, 0, arrayOfByte.length));
        paramBundle.putString("user_setting_metadata", Base64.encodeToString(arrayOfByte, 0));
        return;
        localIOException = localIOException;
        ((auq)localObject).a.a("Could not serialize settings data for savedInstanceState: %s", new Object[] { localIOException });
      }
      catch (IOException paramBundle)
      {
        for (;;)
        {
          ((aur)localObject).a.a("Could not serialize backdrop meta data for savedInstanceState: %s", new Object[] { paramBundle });
        }
      }
    }
  }
  
  public final void a(atf paramatf, auo paramauo)
  {
    paramatf.a(new aue(this.j, this.i, this.c, this.d, this.e, new aua(this, paramauo), new aub(this, paramauo)));
  }
  
  public final void b(Bundle paramBundle)
  {
    Object localObject1 = this.a;
    Object localObject2 = paramBundle.getString("user_topic_settings");
    if (localObject2 != null) {}
    try
    {
      byte[] arrayOfByte = Base64.decode((String)localObject2, 0);
      localObject2 = new dck;
      ((dck)localObject2).<init>();
      ((auq)localObject1).a((dck)dew.a((dew)localObject2, arrayOfByte));
      localObject1 = this.b;
      paramBundle = paramBundle.getString("user_setting_metadata");
      if (paramBundle == null) {}
    }
    catch (dev localdev)
    {
      try
      {
        ((aur)localObject1).b = dcj.a(Base64.decode(paramBundle, 0));
        return;
        localdev = localdev;
        ((auq)localObject1).a.a("Could not load user topic settings from savedInstanceState: %s", new Object[] { localdev });
      }
      catch (dev paramBundle)
      {
        for (;;)
        {
          ((aur)localObject1).a.a("Could not load backdrop meta data from savedInstanceState: %s", new Object[] { paramBundle });
        }
      }
    }
  }
  
  public final void b(atf paramatf, auo paramauo)
  {
    if (!b()) {
      if (paramauo != null) {
        paramauo.a(false);
      }
    }
    for (;;)
    {
      return;
      try
      {
        long l = a();
        aum localaum = new aum;
        String str1 = this.j;
        String str2 = this.i;
        dck localdck = this.a.a();
        auc localauc = new auc;
        localauc.<init>(this, l, paramauo);
        aud localaud = new aud;
        localaud.<init>(this, paramauo);
        localaum.<init>(str1, str2, localdck, localauc, localaud);
        paramatf.a(localaum);
      }
      catch (IOException paramatf)
      {
        this.h.a("Could not serialize DeviceBackdropSettings data: %s", new Object[] { paramatf });
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\atz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */