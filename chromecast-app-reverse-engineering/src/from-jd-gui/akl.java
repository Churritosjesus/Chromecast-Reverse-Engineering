import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class akl
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new akm();
  final akg a;
  Set b;
  final ajy c;
  public final String d;
  final String e;
  public boolean f = false;
  
  public akl(akg paramakg, Set paramSet, ajy paramajy, String paramString1, String paramString2)
  {
    this.a = paramakg;
    if (paramSet != null) {}
    for (;;)
    {
      this.b = paramSet;
      this.c = paramajy;
      this.d = paramString1;
      this.e = paramString2;
      return;
      paramSet = new HashSet();
    }
  }
  
  akl(Parcel paramParcel)
  {
    Object localObject1 = paramParcel.readString();
    if (localObject1 != null)
    {
      localObject1 = akg.valueOf((String)localObject1);
      this.a = ((akg)localObject1);
      localObject1 = new ArrayList();
      paramParcel.readStringList((List)localObject1);
      this.b = new HashSet((Collection)localObject1);
      String str = paramParcel.readString();
      localObject1 = localObject2;
      if (str != null) {
        localObject1 = ajy.valueOf(str);
      }
      this.c = ((ajy)localObject1);
      this.d = paramParcel.readString();
      this.e = paramParcel.readString();
      if (paramParcel.readByte() == 0) {
        break label117;
      }
    }
    label117:
    for (boolean bool = true;; bool = false)
    {
      this.f = bool;
      return;
      localObject1 = null;
      break;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject2 = null;
    Object localObject1;
    if (this.a != null)
    {
      localObject1 = this.a.name();
      paramParcel.writeString((String)localObject1);
      paramParcel.writeStringList(new ArrayList(this.b));
      localObject1 = localObject2;
      if (this.c != null) {
        localObject1 = this.c.name();
      }
      paramParcel.writeString((String)localObject1);
      paramParcel.writeString(this.d);
      paramParcel.writeString(this.e);
      if (!this.f) {
        break label98;
      }
    }
    label98:
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      return;
      localObject1 = null;
      break;
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\akl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */