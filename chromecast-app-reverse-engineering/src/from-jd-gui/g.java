import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;

final class g
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new h();
  private int[] a;
  private int b;
  private int c;
  private String d;
  private int e;
  private int f;
  private CharSequence g;
  private int h;
  private CharSequence i;
  private ArrayList j;
  private ArrayList k;
  
  public g(Parcel paramParcel)
  {
    this.a = paramParcel.createIntArray();
    this.b = paramParcel.readInt();
    this.c = paramParcel.readInt();
    this.d = paramParcel.readString();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.h = paramParcel.readInt();
    this.i = ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(paramParcel));
    this.j = paramParcel.createStringArrayList();
    this.k = paramParcel.createStringArrayList();
  }
  
  public g(c paramc)
  {
    b localb = paramc.a;
    for (int n = 0; localb != null; n = m)
    {
      m = n;
      if (localb.i != null) {
        m = n + localb.i.size();
      }
      localb = localb.a;
    }
    this.a = new int[n + paramc.b * 7];
    if (!paramc.e) {
      throw new IllegalStateException("Not on back stack");
    }
    localb = paramc.a;
    int m = 0;
    if (localb != null)
    {
      int[] arrayOfInt = this.a;
      n = m + 1;
      arrayOfInt[m] = localb.c;
      arrayOfInt = this.a;
      int i1 = n + 1;
      if (localb.d != null) {}
      for (m = localb.d.k;; m = -1)
      {
        arrayOfInt[n] = m;
        arrayOfInt = this.a;
        m = i1 + 1;
        arrayOfInt[i1] = localb.e;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localb.f;
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = localb.g;
        arrayOfInt = this.a;
        n = m + 1;
        arrayOfInt[m] = localb.h;
        if (localb.i == null) {
          break label312;
        }
        i1 = localb.i.size();
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = i1;
        n = 0;
        while (n < i1)
        {
          this.a[m] = ((j)localb.i.get(n)).k;
          n++;
          m++;
        }
      }
      for (;;)
      {
        localb = localb.a;
        break;
        label312:
        arrayOfInt = this.a;
        m = n + 1;
        arrayOfInt[n] = 0;
      }
    }
    this.b = paramc.c;
    this.c = paramc.d;
    this.d = paramc.f;
    this.e = paramc.g;
    this.f = paramc.h;
    this.g = paramc.i;
    this.h = paramc.j;
    this.i = paramc.k;
    this.j = paramc.l;
    this.k = paramc.m;
  }
  
  public final c a(t paramt)
  {
    c localc = new c(paramt);
    int m = 0;
    while (m < this.a.length)
    {
      b localb = new b();
      Object localObject = this.a;
      int n = m + 1;
      localb.c = localObject[m];
      boolean bool = t.a;
      localObject = this.a;
      m = n + 1;
      n = localObject[n];
      if (n >= 0) {}
      for (localb.d = ((j)paramt.b.get(n));; localb.d = null)
      {
        localObject = this.a;
        n = m + 1;
        localb.e = localObject[m];
        localObject = this.a;
        m = n + 1;
        localb.f = localObject[n];
        localObject = this.a;
        n = m + 1;
        localb.g = localObject[m];
        localObject = this.a;
        m = n + 1;
        localb.h = localObject[n];
        localObject = this.a;
        n = m + 1;
        int i2 = localObject[m];
        m = n;
        if (i2 <= 0) {
          break;
        }
        localb.i = new ArrayList(i2);
        int i1 = 0;
        for (;;)
        {
          m = n;
          if (i1 >= i2) {
            break;
          }
          bool = t.a;
          localObject = (j)paramt.b.get(this.a[n]);
          localb.i.add(localObject);
          i1++;
          n++;
        }
      }
      localc.a(localb);
    }
    localc.c = this.b;
    localc.d = this.c;
    localc.f = this.d;
    localc.g = this.e;
    localc.e = true;
    localc.h = this.f;
    localc.i = this.g;
    localc.j = this.h;
    localc.k = this.i;
    localc.l = this.j;
    localc.m = this.k;
    localc.b(1);
    return localc;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(this.a);
    paramParcel.writeInt(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    TextUtils.writeToParcel(this.g, paramParcel, 0);
    paramParcel.writeInt(this.h);
    TextUtils.writeToParcel(this.i, paramParcel, 0);
    paramParcel.writeStringList(this.j);
    paramParcel.writeStringList(this.k);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */