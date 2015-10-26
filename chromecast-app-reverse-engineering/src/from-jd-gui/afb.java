import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class afb
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new afc();
  private static final Date i;
  private static final Date j;
  private static final Date k;
  private static final afl l;
  public final Date a;
  public final Set b;
  final Set c;
  public final String d;
  final afl e;
  final Date f;
  public final String g;
  public final String h;
  
  static
  {
    Date localDate = new Date(Long.MAX_VALUE);
    i = localDate;
    j = localDate;
    k = new Date();
    l = afl.a;
  }
  
  afb(Parcel paramParcel)
  {
    this.a = new Date(paramParcel.readLong());
    ArrayList localArrayList = new ArrayList();
    paramParcel.readStringList(localArrayList);
    this.b = Collections.unmodifiableSet(new HashSet(localArrayList));
    localArrayList.clear();
    paramParcel.readStringList(localArrayList);
    this.c = Collections.unmodifiableSet(new HashSet(localArrayList));
    this.d = paramParcel.readString();
    this.e = afl.valueOf(paramParcel.readString());
    this.f = new Date(paramParcel.readLong());
    this.g = paramParcel.readString();
    this.h = paramParcel.readString();
  }
  
  public afb(String paramString1, String paramString2, String paramString3, Collection paramCollection1, Collection paramCollection2, afl paramafl, Date paramDate1, Date paramDate2)
  {
    ajp.a(paramString1, "accessToken");
    ajp.a(paramString2, "applicationId");
    ajp.a(paramString3, "userId");
    if (paramDate1 != null)
    {
      this.a = paramDate1;
      if (paramCollection1 == null) {
        break label129;
      }
      paramCollection1 = new HashSet(paramCollection1);
      label49:
      this.b = Collections.unmodifiableSet(paramCollection1);
      if (paramCollection2 == null) {
        break label141;
      }
      paramCollection1 = new HashSet(paramCollection2);
      label74:
      this.c = Collections.unmodifiableSet(paramCollection1);
      this.d = paramString1;
      if (paramafl == null) {
        break label153;
      }
      label93:
      this.e = paramafl;
      if (paramDate2 == null) {
        break label161;
      }
    }
    for (;;)
    {
      this.f = paramDate2;
      this.g = paramString2;
      this.h = paramString3;
      return;
      paramDate1 = j;
      break;
      label129:
      paramCollection1 = new HashSet();
      break label49;
      label141:
      paramCollection1 = new HashSet();
      break label74;
      label153:
      paramafl = l;
      break label93;
      label161:
      paramDate2 = k;
    }
  }
  
  public static afb a()
  {
    return aff.a().b;
  }
  
  static afb a(Bundle paramBundle)
  {
    List localList2 = a(paramBundle, "com.facebook.TokenCachingStrategy.Permissions");
    List localList1 = a(paramBundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
    String str2 = agr.d(paramBundle);
    String str1 = str2;
    if (aji.a(str2)) {
      str1 = afv.h();
    }
    str2 = agr.b(paramBundle);
    Object localObject = aji.d(str2);
    try
    {
      localObject = ((JSONObject)localObject).getString("id");
      paramBundle = new afb(str2, str1, (String)localObject, localList2, localList1, agr.c(paramBundle), agr.a(paramBundle, "com.facebook.TokenCachingStrategy.ExpirationDate"), agr.a(paramBundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"));
    }
    catch (JSONException paramBundle)
    {
      for (;;)
      {
        paramBundle = null;
      }
    }
    return paramBundle;
  }
  
  static afb a(JSONObject paramJSONObject)
  {
    if (paramJSONObject.getInt("version") > 1) {
      throw new afq("Unknown AccessToken serialization format.");
    }
    String str = paramJSONObject.getString("token");
    Date localDate2 = new Date(paramJSONObject.getLong("expires_at"));
    JSONArray localJSONArray1 = paramJSONObject.getJSONArray("permissions");
    JSONArray localJSONArray2 = paramJSONObject.getJSONArray("declined_permissions");
    Date localDate1 = new Date(paramJSONObject.getLong("last_refresh"));
    afl localafl = afl.valueOf(paramJSONObject.getString("source"));
    return new afb(str, paramJSONObject.getString("application_id"), paramJSONObject.getString("user_id"), aji.a(localJSONArray1), aji.a(localJSONArray2), localafl, localDate2, localDate1);
  }
  
  private static List a(Bundle paramBundle, String paramString)
  {
    paramBundle = paramBundle.getStringArrayList(paramString);
    if (paramBundle == null) {}
    for (paramBundle = Collections.emptyList();; paramBundle = Collections.unmodifiableList(new ArrayList(paramBundle))) {
      return paramBundle;
    }
  }
  
  public static void a(afb paramafb)
  {
    aff.a().a(paramafb, true);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    label144:
    label159:
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof afb))
      {
        bool = false;
      }
      else
      {
        paramObject = (afb)paramObject;
        if ((this.a.equals(((afb)paramObject).a)) && (this.b.equals(((afb)paramObject).b)) && (this.c.equals(((afb)paramObject).c)) && (this.d.equals(((afb)paramObject).d)) && (this.e == ((afb)paramObject).e) && (this.f.equals(((afb)paramObject).f)))
        {
          if (this.g != null) {
            break label144;
          }
          if (((afb)paramObject).g != null) {}
        }
        for (;;)
        {
          if (this.h.equals(((afb)paramObject).h)) {
            break label159;
          }
          do
          {
            bool = false;
            break;
          } while (!this.g.equals(((afb)paramObject).g));
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i2 = this.a.hashCode();
    int i4 = this.b.hashCode();
    int i1 = this.c.hashCode();
    int i5 = this.d.hashCode();
    int i3 = this.e.hashCode();
    int n = this.f.hashCode();
    if (this.g == null) {}
    for (int m = 0;; m = this.g.hashCode()) {
      return (m + ((((((i2 + 527) * 31 + i4) * 31 + i1) * 31 + i5) * 31 + i3) * 31 + n) * 31) * 31 + this.h.hashCode();
    }
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append("{AccessToken");
    StringBuilder localStringBuilder2 = localStringBuilder1.append(" token:");
    String str;
    if (this.d == null)
    {
      str = "null";
      localStringBuilder2.append(str);
      localStringBuilder1.append(" permissions:");
      if (this.b != null) {
        break label101;
      }
      localStringBuilder1.append("null");
    }
    for (;;)
    {
      localStringBuilder1.append("}");
      return localStringBuilder1.toString();
      if (afv.a(ags.b))
      {
        str = this.d;
        break;
      }
      str = "ACCESS_TOKEN_REMOVED";
      break;
      label101:
      localStringBuilder1.append("[");
      localStringBuilder1.append(TextUtils.join(", ", this.b));
      localStringBuilder1.append("]");
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(this.a.getTime());
    paramParcel.writeStringList(new ArrayList(this.b));
    paramParcel.writeStringList(new ArrayList(this.c));
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e.name());
    paramParcel.writeLong(this.f.getTime());
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\afb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */