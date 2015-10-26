import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

abstract class aky
  implements Parcelable
{
  Map a;
  public akh b;
  
  aky(akh paramakh)
  {
    this.b = paramakh;
  }
  
  aky(Parcel paramParcel)
  {
    this.a = aji.a(paramParcel);
  }
  
  public static afb a(Collection paramCollection, Bundle paramBundle, afl paramafl, String paramString)
  {
    Object localObject2 = null;
    Date localDate = aji.a(paramBundle, "expires_in", new Date());
    String str = paramBundle.getString("access_token");
    Object localObject1 = paramBundle.getString("granted_scopes");
    if (!aji.a((String)localObject1)) {
      paramCollection = new ArrayList(Arrays.asList(((String)localObject1).split(",")));
    }
    for (;;)
    {
      localObject1 = paramBundle.getString("denied_scopes");
      if (!aji.a((String)localObject1)) {}
      for (localObject1 = new ArrayList(Arrays.asList(((String)localObject1).split(",")));; localObject1 = null)
      {
        if (aji.a(str)) {}
        for (paramCollection = (Collection)localObject2;; paramCollection = new afb(str, paramString, b(paramBundle.getString("signed_request")), paramCollection, (Collection)localObject1, paramafl, localDate, new Date())) {
          return paramCollection;
        }
      }
    }
  }
  
  private static String b(String paramString)
  {
    if ((paramString == null) || (paramString.isEmpty())) {
      throw new afq("Authorization response does not contain the signed_request");
    }
    try
    {
      paramString = paramString.split("\\.");
      if (paramString.length == 2)
      {
        Object localObject = Base64.decode(paramString[1], 0);
        paramString = new java/lang/String;
        paramString.<init>((byte[])localObject, "UTF-8");
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(paramString);
        paramString = ((JSONObject)localObject).getString("user_id");
        return paramString;
      }
    }
    catch (JSONException paramString)
    {
      throw new afq("Failed to retrieve user_id from signed_request");
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;) {}
    }
  }
  
  abstract String a();
  
  protected final void a(String paramString)
  {
    String str = this.b.f.d;
    ahe localahe = ahe.a(this.b.a(), str);
    Bundle localBundle = new Bundle();
    localBundle.putString("fb_web_login_e2e", paramString);
    localBundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
    localBundle.putString("app_id", str);
    localahe.a("fb_dialogs_web_login_dialog_complete", null, localBundle);
  }
  
  protected final void a(String paramString, Object paramObject)
  {
    if (this.a == null) {
      this.a = new HashMap();
    }
    Map localMap = this.a;
    if (paramObject == null) {}
    for (paramObject = null;; paramObject = paramObject.toString())
    {
      localMap.put(paramString, paramObject);
      return;
    }
  }
  
  boolean a(int paramInt, Intent paramIntent)
  {
    return false;
  }
  
  abstract boolean a(akl paramakl);
  
  void b() {}
  
  boolean c()
  {
    return false;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    aji.a(paramParcel, this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */