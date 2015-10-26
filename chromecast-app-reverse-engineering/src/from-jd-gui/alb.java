import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import java.util.Locale;

final class alb
  extends aky
{
  public static final Parcelable.Creator CREATOR = new ald();
  private ajq c;
  private String d;
  
  alb(akh paramakh)
  {
    super(paramakh);
  }
  
  alb(Parcel paramParcel)
  {
    super(paramParcel);
    this.d = paramParcel.readString();
  }
  
  final String a()
  {
    return "web_view";
  }
  
  final void a(akl paramakl, Bundle paramBundle, afq paramafq)
  {
    if (paramBundle != null) {
      if (paramBundle.containsKey("e2e")) {
        this.d = paramBundle.getString("e2e");
      }
    }
    for (;;)
    {
      try
      {
        paramBundle = a(paramakl.b, paramBundle, afl.c, paramakl.d);
        paramakl = akn.a(this.b.f, paramBundle);
        CookieSyncManager.createInstance(this.b.a()).sync();
        paramBundle = paramBundle.d;
        this.b.a().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", paramBundle).apply();
        if (!aji.a(this.d)) {
          a(this.d);
        }
        this.b.a(paramakl);
        return;
      }
      catch (afq paramakl)
      {
        paramakl = akn.a(this.b.f, null, paramakl.getMessage());
        continue;
      }
      if (!(paramafq instanceof afr)) {
        break;
      }
      paramakl = akn.a(this.b.f, "User canceled log in.");
    }
    this.d = null;
    paramBundle = paramafq.getMessage();
    if ((paramafq instanceof afz))
    {
      paramBundle = ((afz)paramafq).a;
      paramakl = String.format(Locale.ROOT, "%d", new Object[] { Integer.valueOf(paramBundle.b) });
      paramBundle = paramBundle.toString();
    }
    for (;;)
    {
      paramakl = akn.a(this.b.f, null, paramBundle, paramakl);
      break;
      paramakl = null;
    }
  }
  
  final boolean a(akl paramakl)
  {
    Object localObject2 = new Bundle();
    if (!aji.a(paramakl.b))
    {
      localObject1 = TextUtils.join(",", paramakl.b);
      ((Bundle)localObject2).putString("scope", (String)localObject1);
      a("scope", localObject1);
    }
    ((Bundle)localObject2).putString("default_audience", paramakl.c.b);
    Object localObject1 = afb.a();
    if (localObject1 != null)
    {
      localObject1 = ((afb)localObject1).d;
      if ((localObject1 == null) || (!((String)localObject1).equals(this.b.a().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "")))) {
        break label242;
      }
      ((Bundle)localObject2).putString("access_token", (String)localObject1);
      a("access_token", "1");
    }
    for (;;)
    {
      alc localalc = new alc(this, paramakl);
      this.d = akh.g();
      a("e2e", this.d);
      localObject1 = this.b.a();
      localObject2 = new ale((Context)localObject1, paramakl.d, (Bundle)localObject2);
      ((ale)localObject2).f = this.d;
      ((ale)localObject2).g = paramakl.f;
      ((ajv)localObject2).d = localalc;
      ((ajv)localObject2).c = afv.j();
      this.c = ((ajv)localObject2).a();
      paramakl = new ain();
      paramakl.c(true);
      paramakl.Z = this.c;
      paramakl.a(((m)localObject1).b, "FacebookDialogFragment");
      return true;
      localObject1 = null;
      break;
      label242:
      aji.b(this.b.a());
      a("access_token", "0");
    }
  }
  
  final void b()
  {
    if (this.c != null)
    {
      this.c.cancel();
      this.c = null;
    }
  }
  
  final boolean c()
  {
    return true;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.d);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\alb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */