import android.bluetooth.BluetoothGatt;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class ava
  extends bdm
{
  auv a;
  bdf b;
  private final blp d = new blp("BleDeviceConnector");
  private Context e;
  
  public ava(auv paramauv, bdf parambdf, Context paramContext)
  {
    super(parambdf.a);
    this.a = paramauv;
    this.b = parambdf;
    this.e = paramContext;
  }
  
  public final void a()
  {
    auv localauv = this.a;
    localauv.f.clear();
    if (localauv.b != null)
    {
      localauv.b.disconnect();
      localauv.b.close();
    }
  }
  
  public final void a(int paramInt, bdn parambdn)
  {
    avs localavs = new avs(paramInt, new ave(this, Looper.getMainLooper(), parambdn));
    parambdn = this.a;
    JSONObject localJSONObject = bfi.a(localavs.a);
    if (localJSONObject.toString() == null) {
      localavs.b.obtainMessage(1).sendToTarget();
    }
    parambdn.a(new awi(avp.u, new avt(localavs), localJSONObject.toString().getBytes(blj.a)));
  }
  
  public final void a(int paramInt, Locale paramLocale, boolean paramBoolean, bdn parambdn)
  {
    if (paramLocale != null)
    {
      new awj(new avb(this, Looper.getMainLooper(), parambdn), avp.a, blj.c(paramLocale).getBytes(blj.a), 0L).a(this.a);
      paramLocale.getLanguage();
    }
    new aus(paramInt, new avf(this, Looper.getMainLooper(), parambdn)).a(this.a);
  }
  
  public final void a(Context paramContext, String paramString, bdn parambdn)
  {
    if (!TextUtils.isEmpty(paramString)) {
      new awj(new avi(this, Looper.getMainLooper(), parambdn), avp.n, paramString.getBytes(blj.a), blf.V(this.e)).a(this.a);
    }
    for (;;)
    {
      return;
      c(parambdn);
    }
  }
  
  public final void a(bdn parambdn)
  {
    new aus(160, new avg(this, Looper.getMainLooper(), parambdn)).a(this.a);
  }
  
  public final void a(bdn parambdn, int paramInt)
  {
    localawe = new awe(new avc(this, Looper.getMainLooper(), parambdn), paramInt);
    localauv = this.a;
    String str = null;
    parambdn = str;
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      parambdn = str;
      localJSONObject.<init>();
      parambdn = str;
      localJSONObject.put("sound_id", localawe.b);
      parambdn = str;
      str = localJSONObject.toString();
      parambdn = str;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localawe.a.obtainMessage(1).sendToTarget();
        continue;
        localauv.a(new awi(avp.b, new awf(localawe), parambdn.getBytes(blj.a)));
      }
    }
    if (parambdn == null)
    {
      localawe.a.obtainMessage(1).sendToTarget();
      return;
    }
  }
  
  public final void a(bfs parambfs, bdn parambdn)
  {
    awg localawg = new awg(new avd(this, Looper.getMainLooper(), parambdn), parambfs);
    parambfs = this.a;
    parambdn = bdd.a(localawg.b);
    parambfs.a(new awi(avp.m, new awh(localawg), parambdn.toString().getBytes(blj.a)));
  }
  
  public final void b(bdn parambdn)
  {
    new aus(1, new avh(this, Looper.getMainLooper(), parambdn)).a(this.a);
  }
  
  public final boolean b()
  {
    return false;
  }
  
  void c(bdn parambdn)
  {
    Object localObject = new avm(avp.k, avp.j, new avj(this, Looper.getMainLooper(), parambdn));
    localObject = new avk(this, Looper.getMainLooper(), (avm)localObject, parambdn);
    UUID localUUID = avp.l;
    long l = blf.U(this.e);
    localObject = new awj((Handler)localObject, localUUID, new byte[] { 1 }, l);
    parambdn = new avl(this, Looper.getMainLooper(), (awj)localObject, parambdn);
    localObject = avp.l;
    l = blf.U(this.e);
    new awj(parambdn, (UUID)localObject, new byte[] { 1 }, l).a(this.a);
  }
  
  public final boolean c()
  {
    return false;
  }
  
  public final void d(bdn parambdn)
  {
    parambdn.b_(-7);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ava.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */