import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

final class akh
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new aki();
  aky[] a;
  int b = -1;
  j c;
  akk d;
  akj e;
  akl f;
  private boolean g;
  private Map h;
  private akt i;
  
  public akh(Parcel paramParcel)
  {
    Parcelable[] arrayOfParcelable = paramParcel.readParcelableArray(aky.class.getClassLoader());
    this.a = new aky[arrayOfParcelable.length];
    for (int j = 0; j < arrayOfParcelable.length; j++)
    {
      this.a[j] = ((aky)arrayOfParcelable[j]);
      aky localaky = this.a[j];
      if (localaky.b != null) {
        throw new afq("Can't set LoginClient if it is already set.");
      }
      localaky.b = this;
    }
    this.b = paramParcel.readInt();
    this.f = ((akl)paramParcel.readParcelable(akl.class.getClassLoader()));
    this.h = aji.a(paramParcel);
  }
  
  public akh(j paramj)
  {
    this.c = paramj;
  }
  
  private void a(String paramString1, String paramString2, String paramString3, String paramString4, Map paramMap)
  {
    if (this.f == null) {
      h().a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", paramString1);
    }
    for (;;)
    {
      return;
      akt localakt = h();
      Bundle localBundle = akt.a(this.f.e);
      if (paramString2 != null) {
        localBundle.putString("2_result", paramString2);
      }
      if (paramString3 != null) {
        localBundle.putString("5_error_message", paramString3);
      }
      if (paramString4 != null) {
        localBundle.putString("4_error_code", paramString4);
      }
      if ((paramMap != null) && (!paramMap.isEmpty())) {
        localBundle.putString("6_extras", new JSONObject(paramMap).toString());
      }
      localBundle.putString("3_method", paramString1);
      localakt.a.a("fb_mobile_login_method_complete", null, localBundle);
    }
  }
  
  private void a(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (this.h == null) {
      this.h = new HashMap();
    }
    String str = paramString2;
    if (this.h.containsKey(paramString1))
    {
      str = paramString2;
      if (paramBoolean)
      {
        str = (String)this.h.get(paramString1);
        str = String.valueOf(str).length() + 1 + String.valueOf(paramString2).length() + str + "," + paramString2;
      }
    }
    this.h.put(paramString1, str);
  }
  
  public static int b()
  {
    return aim.a.a();
  }
  
  static String g()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("init", System.currentTimeMillis());
      return localJSONObject.toString();
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  private akt h()
  {
    if ((this.i == null) || (!this.i.b.equals(this.f.d))) {
      this.i = new akt(a(), this.f.d);
    }
    return this.i;
  }
  
  final m a()
  {
    return this.c.y;
  }
  
  final void a(akn paramakn)
  {
    afb localafb2;
    afb localafb1;
    if ((paramakn.b != null) && (afb.a() != null))
    {
      if (paramakn.b == null) {
        throw new afq("Can't validate without a token");
      }
      localafb2 = afb.a();
      localafb1 = paramakn.b;
      if ((localafb2 == null) || (localafb1 == null)) {}
    }
    for (;;)
    {
      try
      {
        if (localafb2.h.equals(localafb1.h))
        {
          paramakn = akn.a(this.f, paramakn.b);
          b(paramakn);
          return;
        }
      }
      catch (Exception paramakn)
      {
        b(akn.a(this.f, "Caught exception", paramakn.getMessage()));
        continue;
      }
      paramakn = akn.a(this.f, "User logged in as different Facebook user.", null);
      continue;
      b(paramakn);
    }
  }
  
  final void b(akn paramakn)
  {
    Object localObject = c();
    if (localObject != null)
    {
      String str = ((aky)localObject).a();
      localObject = ((aky)localObject).a;
      a(str, paramakn.a.d, paramakn.c, paramakn.d, (Map)localObject);
    }
    if (this.h != null) {
      paramakn.e = this.h;
    }
    this.a = null;
    this.b = -1;
    this.f = null;
    this.h = null;
    if (this.d != null) {
      this.d.a(paramakn);
    }
  }
  
  aky c()
  {
    if (this.b >= 0) {}
    for (aky localaky = this.a[this.b];; localaky = null) {
      return localaky;
    }
  }
  
  final boolean d()
  {
    boolean bool = true;
    if (this.g) {}
    for (;;)
    {
      return bool;
      if (a().checkCallingOrSelfPermission("android.permission.INTERNET") != 0)
      {
        Object localObject = a();
        String str = ((Activity)localObject).getString(a.db);
        localObject = ((Activity)localObject).getString(a.da);
        b(akn.a(this.f, str, (String)localObject));
        bool = false;
      }
      else
      {
        this.g = true;
      }
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  final void e()
  {
    if (this.b >= 0) {
      a(c().a(), "skipped", null, null, c().a);
    }
    Object localObject1;
    boolean bool;
    if ((this.a != null) && (this.b < this.a.length - 1))
    {
      this.b += 1;
      localObject1 = c();
      if ((((aky)localObject1).c()) && (!d()))
      {
        a("no_internet_permission", "1", false);
        bool = false;
        label94:
        if (!bool) {
          break label173;
        }
      }
    }
    for (;;)
    {
      return;
      bool = ((aky)localObject1).a(this.f);
      if (bool)
      {
        akt localakt = h();
        Object localObject2 = this.f.e;
        localObject1 = ((aky)localObject1).a();
        localObject2 = akt.a((String)localObject2);
        ((Bundle)localObject2).putString("3_method", (String)localObject1);
        localakt.a.a("fb_mobile_login_method_start", null, (Bundle)localObject2);
        break label94;
      }
      a("not_tried", ((aky)localObject1).a(), true);
      break label94;
      label173:
      break;
      if (this.f != null) {
        b(akn.a(this.f, "Login attempt failed.", null));
      }
    }
  }
  
  final void f()
  {
    if (this.e != null) {
      this.e.a();
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelableArray(this.a, paramInt);
    paramParcel.writeInt(this.b);
    paramParcel.writeParcelable(this.f, paramInt);
    aji.a(paramParcel, this.h);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\akh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */