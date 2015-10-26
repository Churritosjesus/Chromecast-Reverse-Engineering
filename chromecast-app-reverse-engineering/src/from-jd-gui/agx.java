import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class agx
{
  private static volatile agx c;
  final agw a;
  agt b;
  private final bk d;
  
  private agx(bk parambk, agw paramagw)
  {
    ajp.a(parambk, "localBroadcastManager");
    ajp.a(paramagw, "profileCache");
    this.d = parambk;
    this.a = paramagw;
  }
  
  static agx a()
  {
    if (c == null) {}
    try
    {
      if (c == null)
      {
        bk localbk = bk.a(afv.f());
        agx localagx = new agx;
        agw localagw = new agw;
        localagw.<init>();
        localagx.<init>(localbk, localagw);
        c = localagx;
      }
      return c;
    }
    finally {}
  }
  
  void a(agt paramagt, boolean paramBoolean)
  {
    agt localagt = this.b;
    this.b = paramagt;
    Object localObject;
    if (paramBoolean)
    {
      if (paramagt == null) {
        break label116;
      }
      localObject = this.a;
      ajp.a(paramagt, "profile");
      JSONObject localJSONObject = paramagt.c();
      if (localJSONObject != null) {
        ((agw)localObject).a.edit().putString("com.facebook.ProfileManager.CachedProfile", localJSONObject.toString()).apply();
      }
    }
    for (;;)
    {
      if (!aji.a(localagt, paramagt))
      {
        localObject = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        ((Intent)localObject).putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", localagt);
        ((Intent)localObject).putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", paramagt);
        this.d.a((Intent)localObject);
      }
      return;
      label116:
      this.a.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */