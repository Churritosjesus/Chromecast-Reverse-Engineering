import android.os.IBinder;
import android.os.Parcel;

final class cis
  implements ciq
{
  private IBinder a;
  
  cis(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final String a()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      this.a.transact(1, localParcel2, localParcel1, 0);
      localParcel1.readException();
      String str = localParcel1.readString();
      return str;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final String a(String paramString)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      localParcel1.writeString(paramString);
      this.a.transact(3, localParcel1, localParcel2, 0);
      localParcel2.readException();
      paramString = localParcel2.readString();
      return paramString;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    int i = 0;
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
      localParcel2.writeString(paramString);
      if (paramBoolean) {
        i = 1;
      }
      localParcel2.writeInt(i);
      this.a.transact(4, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  /* Error */
  public final boolean a(boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 6
    //   3: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore_2
    //   7: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   10: astore 4
    //   12: aload_2
    //   13: ldc 25
    //   15: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: iload_1
    //   19: ifeq +58 -> 77
    //   22: iconst_1
    //   23: istore 5
    //   25: aload_2
    //   26: iload 5
    //   28: invokevirtual 53	android/os/Parcel:writeInt	(I)V
    //   31: aload_0
    //   32: getfield 15	cis:a	Landroid/os/IBinder;
    //   35: iconst_2
    //   36: aload_2
    //   37: aload 4
    //   39: iconst_0
    //   40: invokeinterface 35 5 0
    //   45: pop
    //   46: aload 4
    //   48: invokevirtual 38	android/os/Parcel:readException	()V
    //   51: aload 4
    //   53: invokevirtual 58	android/os/Parcel:readInt	()I
    //   56: istore 5
    //   58: iload 5
    //   60: ifeq +23 -> 83
    //   63: iload 6
    //   65: istore_1
    //   66: aload 4
    //   68: invokevirtual 44	android/os/Parcel:recycle	()V
    //   71: aload_2
    //   72: invokevirtual 44	android/os/Parcel:recycle	()V
    //   75: iload_1
    //   76: ireturn
    //   77: iconst_0
    //   78: istore 5
    //   80: goto -55 -> 25
    //   83: iconst_0
    //   84: istore_1
    //   85: goto -19 -> 66
    //   88: astore_3
    //   89: aload 4
    //   91: invokevirtual 44	android/os/Parcel:recycle	()V
    //   94: aload_2
    //   95: invokevirtual 44	android/os/Parcel:recycle	()V
    //   98: aload_3
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	cis
    //   0	100	1	paramBoolean	boolean
    //   6	89	2	localParcel1	Parcel
    //   88	11	3	localObject	Object
    //   10	80	4	localParcel2	Parcel
    //   23	56	5	i	int
    //   1	63	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   12	18	88	finally
    //   25	58	88	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */