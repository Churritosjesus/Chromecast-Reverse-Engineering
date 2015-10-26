import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class aka
  extends aky
{
  public static final Parcelable.Creator CREATOR = new akd();
  private ajz c;
  
  aka(akh paramakh)
  {
    super(paramakh);
  }
  
  aka(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  final String a()
  {
    return "get_token";
  }
  
  final void a(akl paramakl, Bundle paramBundle)
  {
    if (this.c != null) {
      this.c.b = null;
    }
    this.c = null;
    Object localObject1 = this.b;
    if (((akh)localObject1).e != null) {
      ((akh)localObject1).e.b();
    }
    Object localObject2;
    if (paramBundle != null)
    {
      localObject1 = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
      localObject2 = paramakl.b;
      if ((localObject1 != null) && ((localObject2 == null) || (((ArrayList)localObject1).containsAll((Collection)localObject2))))
      {
        localObject1 = paramBundle.getString("com.facebook.platform.extra.USER_ID");
        if ((localObject1 == null) || (((String)localObject1).isEmpty()))
        {
          this.b.f();
          aji.a(paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN"), new akc(this, paramBundle, paramakl));
        }
      }
    }
    for (;;)
    {
      return;
      b(paramakl, paramBundle);
      continue;
      paramBundle = new HashSet();
      Iterator localIterator = ((Set)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = (String)localIterator.next();
        if (!((ArrayList)localObject1).contains(localObject2)) {
          paramBundle.add(localObject2);
        }
      }
      if (!paramBundle.isEmpty()) {
        a("new_permissions", TextUtils.join(",", paramBundle));
      }
      ajp.a(paramBundle, "permissions");
      paramakl.b = paramBundle;
      this.b.e();
    }
  }
  
  final boolean a(akl paramakl)
  {
    boolean bool = false;
    this.c = new ajz(this.b.c.y, paramakl.d);
    ajz localajz = this.c;
    int i;
    if (localajz.c)
    {
      i = 0;
      if (i != 0) {
        break label108;
      }
    }
    for (;;)
    {
      return bool;
      if (aix.a(localajz.e) == -1)
      {
        i = 0;
        break;
      }
      Intent localIntent = aix.a(localajz.a);
      if (localIntent == null)
      {
        i = 0;
        break;
      }
      localajz.c = true;
      localajz.a.bindService(localIntent, localajz, 1);
      i = 1;
      break;
      label108:
      this.b.f();
      paramakl = new akb(this, paramakl);
      this.c.b = paramakl;
      bool = true;
    }
  }
  
  final void b()
  {
    if (this.c != null)
    {
      this.c.c = false;
      this.c.b = null;
      this.c = null;
    }
  }
  
  final void b(akl paramakl, Bundle paramBundle)
  {
    Object localObject = null;
    afl localafl = afl.b;
    String str2 = paramakl.d;
    paramakl = aji.a(paramBundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
    ArrayList localArrayList = paramBundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
    String str1 = paramBundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
    if (aji.a(str1)) {}
    for (paramakl = (akl)localObject;; paramakl = new afb(str1, str2, paramBundle.getString("com.facebook.platform.extra.USER_ID"), localArrayList, null, localafl, paramakl, new Date()))
    {
      paramakl = akn.a(this.b.f, paramakl);
      this.b.a(paramakl);
      return;
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


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */