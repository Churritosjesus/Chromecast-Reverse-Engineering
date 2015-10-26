package com.google.android.gms.common.data;

import a;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import bxw;
import byb;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class DataHolder
  implements SafeParcelable
{
  public static final byb CREATOR = new byb();
  public final int a;
  public final String[] b;
  public Bundle c;
  public final CursorWindow[] d;
  public final int e;
  public final Bundle f;
  int[] g;
  public int h;
  public Object i;
  private boolean j = false;
  private boolean k = true;
  
  static
  {
    new bxw(new String[0], null);
  }
  
  public DataHolder(int paramInt1, String[] paramArrayOfString, CursorWindow[] paramArrayOfCursorWindow, int paramInt2, Bundle paramBundle)
  {
    this.a = paramInt1;
    this.b = paramArrayOfString;
    this.d = paramArrayOfCursorWindow;
    this.e = paramInt2;
    this.f = paramBundle;
  }
  
  public final int a(int paramInt)
  {
    int n = 0;
    boolean bool;
    if ((paramInt >= 0) && (paramInt < this.h))
    {
      bool = true;
      a.a(bool);
    }
    for (;;)
    {
      int m = n;
      if (n < this.g.length)
      {
        if (paramInt < this.g[n]) {
          m = n - 1;
        }
      }
      else
      {
        paramInt = m;
        if (m == this.g.length) {
          paramInt = m - 1;
        }
        return paramInt;
        bool = false;
        break;
      }
      n++;
    }
  }
  
  public final void a()
  {
    int n = 0;
    this.c = new Bundle();
    for (int m = 0; m < this.b.length; m++) {
      this.c.putInt(this.b[m], m);
    }
    this.g = new int[this.d.length];
    int i1 = 0;
    m = n;
    n = i1;
    while (m < this.d.length)
    {
      this.g[m] = n;
      i1 = this.d[m].getStartPosition();
      n += this.d[m].getNumRows() - (n - i1);
      m++;
    }
    this.h = n;
  }
  
  public final boolean b()
  {
    try
    {
      boolean bool = this.j;
      return bool;
    }
    finally {}
  }
  
  public final void c()
  {
    try
    {
      if (!this.j)
      {
        this.j = true;
        for (int m = 0; m < this.d.length; m++) {
          this.d[m].close();
        }
      }
      return;
    }
    finally {}
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  /* Error */
  protected final void finalize()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 49	com/google/android/gms/common/data/DataHolder:k	Z
    //   4: ifeq +80 -> 84
    //   7: aload_0
    //   8: getfield 55	com/google/android/gms/common/data/DataHolder:d	[Landroid/database/CursorWindow;
    //   11: arraylength
    //   12: ifle +72 -> 84
    //   15: aload_0
    //   16: invokevirtual 94	com/google/android/gms/common/data/DataHolder:b	()Z
    //   19: ifne +65 -> 84
    //   22: aload_0
    //   23: getfield 96	com/google/android/gms/common/data/DataHolder:i	Ljava/lang/Object;
    //   26: ifnonnull +63 -> 89
    //   29: new 98	java/lang/StringBuilder
    //   32: astore_1
    //   33: aload_1
    //   34: ldc 100
    //   36: invokespecial 103	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   39: aload_1
    //   40: aload_0
    //   41: invokevirtual 107	java/lang/Object:toString	()Ljava/lang/String;
    //   44: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   47: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: astore_1
    //   51: new 98	java/lang/StringBuilder
    //   54: astore_2
    //   55: aload_2
    //   56: ldc 114
    //   58: invokespecial 103	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   61: ldc 116
    //   63: aload_2
    //   64: aload_1
    //   65: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: ldc 118
    //   70: invokevirtual 111	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokestatic 123	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   79: pop
    //   80: aload_0
    //   81: invokevirtual 125	com/google/android/gms/common/data/DataHolder:c	()V
    //   84: aload_0
    //   85: invokespecial 127	java/lang/Object:finalize	()V
    //   88: return
    //   89: aload_0
    //   90: getfield 96	com/google/android/gms/common/data/DataHolder:i	Ljava/lang/Object;
    //   93: invokevirtual 107	java/lang/Object:toString	()Ljava/lang/String;
    //   96: astore_1
    //   97: goto -46 -> 51
    //   100: astore_1
    //   101: aload_0
    //   102: invokespecial 127	java/lang/Object:finalize	()V
    //   105: aload_1
    //   106: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	107	0	this	DataHolder
    //   32	65	1	localObject1	Object
    //   100	6	1	localObject2	Object
    //   54	10	2	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   0	51	100	finally
    //   51	84	100	finally
    //   89	97	100	finally
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    byb.a(this, paramParcel, paramInt);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\data\DataHolder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */