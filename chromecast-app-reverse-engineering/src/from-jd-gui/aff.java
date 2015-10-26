import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

final class aff
{
  private static volatile aff d;
  final afd a;
  afb b;
  Date c = new Date(0L);
  private final bk e;
  private AtomicBoolean f = new AtomicBoolean(false);
  
  private aff(bk parambk, afd paramafd)
  {
    ajp.a(parambk, "localBroadcastManager");
    ajp.a(paramafd, "accessTokenCache");
    this.e = parambk;
    this.a = paramafd;
  }
  
  static aff a()
  {
    if (d == null) {}
    try
    {
      if (d == null)
      {
        bk localbk = bk.a(afv.f());
        afd localafd = new afd;
        localafd.<init>();
        aff localaff = new aff;
        localaff.<init>(localbk, localafd);
        d = localaff;
      }
      return d;
    }
    finally {}
  }
  
  void a(afb paramafb, boolean paramBoolean)
  {
    afb localafb = this.b;
    this.b = paramafb;
    this.f.set(false);
    this.c = new Date(0L);
    if (paramBoolean)
    {
      if (paramafb == null) {
        break label94;
      }
      this.a.a(paramafb);
    }
    for (;;)
    {
      if (!aji.a(localafb, paramafb))
      {
        localObject = new Intent("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        ((Intent)localObject).putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", localafb);
        ((Intent)localObject).putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", paramafb);
        this.e.a((Intent)localObject);
      }
      return;
      label94:
      Object localObject = this.a;
      ((afd)localObject).a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
      if (afv.c()) {
        ((afd)localObject).b().b();
      }
      aji.b(afv.f());
    }
  }
  
  void b()
  {
    afb localafb = this.b;
    if (localafb == null) {}
    for (;;)
    {
      return;
      if (this.f.compareAndSet(false, true))
      {
        ajp.a();
        this.c = new Date();
        Object localObject1 = new HashSet();
        HashSet localHashSet = new HashSet();
        AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
        afk localafk = new afk();
        Object localObject2 = new afh(this, localAtomicBoolean, (Set)localObject1, localHashSet);
        localObject2 = new aga(localafb, "me/permissions", new Bundle(), agq.a, (agf)localObject2);
        afi localafi = new afi(this, localafk);
        Bundle localBundle = new Bundle();
        localBundle.putString("grant_type", "fb_extend_sso_token");
        localObject2 = new agm(new aga[] { localObject2, new aga(localafb, "oauth/access_token", localBundle, agq.a, localafi) });
        localObject1 = new afj(this, localafb, localAtomicBoolean, localafk, (Set)localObject1, localHashSet);
        if (!((agm)localObject2).d.contains(localObject1)) {
          ((agm)localObject2).d.add(localObject1);
        }
        aga.b((agm)localObject2);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */