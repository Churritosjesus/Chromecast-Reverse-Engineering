import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

final class ake
  extends aky
{
  public static final Parcelable.Creator CREATOR = new akf();
  
  ake(akh paramakh)
  {
    super(paramakh);
  }
  
  ake(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  private akn a(akl paramakl, Intent paramIntent)
  {
    Object localObject = null;
    paramIntent = paramIntent.getExtras();
    String str2 = a(paramIntent);
    String str3 = paramIntent.getString("error_code");
    String str1 = b(paramIntent);
    String str4 = paramIntent.getString("e2e");
    if (!aji.a(str4)) {
      a(str4);
    }
    if ((str2 == null) && (str3 == null) && (str1 == null)) {}
    for (;;)
    {
      try
      {
        paramIntent = akn.a(paramakl, a(paramakl.b, paramIntent, afl.a, paramakl.d));
        return paramIntent;
      }
      catch (afq paramIntent)
      {
        paramIntent = akn.a(paramakl, null, paramIntent.getMessage());
        continue;
      }
      paramIntent = (Intent)localObject;
      if (!ajh.a.contains(str2)) {
        if (ajh.b.contains(str2)) {
          paramIntent = akn.a(paramakl, null);
        } else {
          paramIntent = akn.a(paramakl, str2, str1, str3);
        }
      }
    }
  }
  
  private static String a(Bundle paramBundle)
  {
    String str2 = paramBundle.getString("error");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramBundle.getString("error_type");
    }
    return str1;
  }
  
  private boolean a(Intent paramIntent, int paramInt)
  {
    boolean bool = false;
    if (paramIntent == null) {}
    for (;;)
    {
      return bool;
      try
      {
        this.b.c.a(paramIntent, paramInt);
        bool = true;
      }
      catch (ActivityNotFoundException paramIntent) {}
    }
  }
  
  private static String b(Bundle paramBundle)
  {
    String str2 = paramBundle.getString("error_message");
    String str1 = str2;
    if (str2 == null) {
      str1 = paramBundle.getString("error_description");
    }
    return str1;
  }
  
  final String a()
  {
    return "katana_proxy_auth";
  }
  
  final boolean a(int paramInt, Intent paramIntent)
  {
    akl localakl = this.b.f;
    if (paramIntent == null)
    {
      paramIntent = akn.a(localakl, "Operation canceled");
      if (paramIntent == null) {
        break label118;
      }
      this.b.a(paramIntent);
    }
    for (;;)
    {
      return true;
      if (paramInt == 0)
      {
        paramIntent = paramIntent.getExtras();
        String str1 = a(paramIntent);
        String str2 = paramIntent.getString("error_code");
        if ("CONNECTION_FAILURE".equals(str2))
        {
          paramIntent = akn.a(localakl, str1, b(paramIntent), str2);
          break;
        }
        paramIntent = akn.a(localakl, str1);
        break;
      }
      if (paramInt != -1)
      {
        paramIntent = akn.a(localakl, "Unexpected resultCode from authorization.", null);
        break;
      }
      paramIntent = a(localakl, paramIntent);
      break;
      label118:
      this.b.e();
    }
  }
  
  final boolean a(akl paramakl)
  {
    String str1 = akh.g();
    m localm = this.b.c.y;
    String str2 = paramakl.d;
    Set localSet = paramakl.b;
    boolean bool2 = paramakl.f;
    Iterator localIterator = paramakl.b.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (!aku.a((String)localIterator.next()));
    for (boolean bool1 = true;; bool1 = false)
    {
      paramakl = aix.a(localm, str2, localSet, str1, bool2, bool1, paramakl.c);
      a("e2e", str1);
      return a(paramakl, akh.b());
    }
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */