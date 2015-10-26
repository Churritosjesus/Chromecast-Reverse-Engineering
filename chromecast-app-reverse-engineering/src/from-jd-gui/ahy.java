import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

final class ahy
  implements IInterface
{
  private IBinder a;
  
  ahy(IBinder paramIBinder)
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
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  /* Error */
  public final boolean b()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 5
    //   3: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore_1
    //   7: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   10: astore_2
    //   11: aload_1
    //   12: ldc 25
    //   14: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   17: aload_1
    //   18: iconst_1
    //   19: invokevirtual 52	android/os/Parcel:writeInt	(I)V
    //   22: aload_0
    //   23: getfield 15	ahy:a	Landroid/os/IBinder;
    //   26: iconst_2
    //   27: aload_1
    //   28: aload_2
    //   29: iconst_0
    //   30: invokeinterface 35 5 0
    //   35: pop
    //   36: aload_2
    //   37: invokevirtual 38	android/os/Parcel:readException	()V
    //   40: aload_2
    //   41: invokevirtual 56	android/os/Parcel:readInt	()I
    //   44: istore 4
    //   46: iload 4
    //   48: ifeq +14 -> 62
    //   51: aload_2
    //   52: invokevirtual 44	android/os/Parcel:recycle	()V
    //   55: aload_1
    //   56: invokevirtual 44	android/os/Parcel:recycle	()V
    //   59: iload 5
    //   61: ireturn
    //   62: iconst_0
    //   63: istore 5
    //   65: goto -14 -> 51
    //   68: astore_3
    //   69: aload_2
    //   70: invokevirtual 44	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: invokevirtual 44	android/os/Parcel:recycle	()V
    //   77: aload_3
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	ahy
    //   6	68	1	localParcel1	Parcel
    //   10	60	2	localParcel2	Parcel
    //   68	10	3	localObject	Object
    //   44	3	4	i	int
    //   1	63	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   11	46	68	finally
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ahy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */