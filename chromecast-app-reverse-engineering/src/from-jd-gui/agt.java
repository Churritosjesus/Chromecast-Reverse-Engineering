import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

public final class agt
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new agv();
  private final String a;
  private final String b;
  private final String c;
  private final String d;
  private final String e;
  private final Uri f;
  
  agt(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readString();
    this.c = paramParcel.readString();
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
    paramParcel = paramParcel.readString();
    if (paramParcel == null) {}
    for (paramParcel = null;; paramParcel = Uri.parse(paramParcel))
    {
      this.f = paramParcel;
      return;
    }
  }
  
  public agt(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, Uri paramUri)
  {
    ajp.a(paramString1, "id");
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString3;
    this.d = paramString4;
    this.e = paramString5;
    this.f = paramUri;
  }
  
  agt(JSONObject paramJSONObject)
  {
    this.a = paramJSONObject.optString("id", null);
    this.b = paramJSONObject.optString("first_name", null);
    this.c = paramJSONObject.optString("middle_name", null);
    this.d = paramJSONObject.optString("last_name", null);
    this.e = paramJSONObject.optString("name", null);
    paramJSONObject = paramJSONObject.optString("link_uri", null);
    if (paramJSONObject == null) {}
    for (paramJSONObject = (JSONObject)localObject;; paramJSONObject = Uri.parse(paramJSONObject))
    {
      this.f = paramJSONObject;
      return;
    }
  }
  
  public static agt a()
  {
    return agx.a().b;
  }
  
  public static void a(agt paramagt)
  {
    agx.a().a(paramagt, true);
  }
  
  public static void b()
  {
    afb localafb = afb.a();
    if (localafb == null) {
      a(null);
    }
    for (;;)
    {
      return;
      aji.a(localafb.d, new agu());
    }
  }
  
  final JSONObject c()
  {
    JSONObject localJSONObject2 = new JSONObject();
    try
    {
      localJSONObject2.put("id", this.a);
      localJSONObject2.put("first_name", this.b);
      localJSONObject2.put("middle_name", this.c);
      localJSONObject2.put("last_name", this.d);
      localJSONObject2.put("name", this.e);
      localJSONObject1 = localJSONObject2;
      if (this.f != null)
      {
        localJSONObject2.put("link_uri", this.f.toString());
        localJSONObject1 = localJSONObject2;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        JSONObject localJSONObject1;
        Object localObject = null;
      }
    }
    return localJSONObject1;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (!(paramObject instanceof agt))
      {
        bool = false;
      }
      else
      {
        paramObject = (agt)paramObject;
        if ((this.a.equals(((agt)paramObject).a)) && (this.b == null))
        {
          if (((agt)paramObject).b != null) {
            bool = false;
          }
        }
        else if ((this.b.equals(((agt)paramObject).b)) && (this.c == null))
        {
          if (((agt)paramObject).c != null) {
            bool = false;
          }
        }
        else if ((this.c.equals(((agt)paramObject).c)) && (this.d == null))
        {
          if (((agt)paramObject).d != null) {
            bool = false;
          }
        }
        else if ((this.d.equals(((agt)paramObject).d)) && (this.e == null))
        {
          if (((agt)paramObject).e != null) {
            bool = false;
          }
        }
        else if ((this.e.equals(((agt)paramObject).e)) && (this.f == null))
        {
          if (((agt)paramObject).f != null) {
            bool = false;
          }
        }
        else {
          bool = this.f.equals(((agt)paramObject).f);
        }
      }
    }
  }
  
  public final int hashCode()
  {
    int i = this.a.hashCode() + 527;
    int j = i;
    if (this.b != null) {
      j = i * 31 + this.b.hashCode();
    }
    i = j;
    if (this.c != null) {
      i = j * 31 + this.c.hashCode();
    }
    j = i;
    if (this.d != null) {
      j = i * 31 + this.d.hashCode();
    }
    i = j;
    if (this.e != null) {
      i = j * 31 + this.e.hashCode();
    }
    j = i;
    if (this.f != null) {
      j = i * 31 + this.f.hashCode();
    }
    return j;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
    if (this.f == null) {}
    for (String str = null;; str = this.f.toString())
    {
      paramParcel.writeString(str);
      return;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\agt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */