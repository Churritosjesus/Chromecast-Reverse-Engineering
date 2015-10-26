import android.os.IBinder;
import android.os.Parcel;

final class cjv
  implements cjt
{
  private IBinder a;
  
  cjv(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
      this.a.transact(1, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
      localParcel2.writeInt(paramInt);
      this.a.transact(2, localParcel2, localParcel1, 0);
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
  public final void a(com.google.android.gms.cast.CastDevice paramCastDevice)
  {
    // Byte code:
    //   0: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 24
    //   11: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +41 -> 56
    //   18: aload_3
    //   19: iconst_1
    //   20: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_3
    //   25: iconst_0
    //   26: invokevirtual 51	com/google/android/gms/cast/CastDevice:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	cjv:a	Landroid/os/IBinder;
    //   33: iconst_4
    //   34: aload_3
    //   35: aload_2
    //   36: iconst_0
    //   37: invokeinterface 34 5 0
    //   42: pop
    //   43: aload_2
    //   44: invokevirtual 37	android/os/Parcel:readException	()V
    //   47: aload_2
    //   48: invokevirtual 40	android/os/Parcel:recycle	()V
    //   51: aload_3
    //   52: invokevirtual 40	android/os/Parcel:recycle	()V
    //   55: return
    //   56: aload_3
    //   57: iconst_0
    //   58: invokevirtual 44	android/os/Parcel:writeInt	(I)V
    //   61: goto -32 -> 29
    //   64: astore_1
    //   65: aload_2
    //   66: invokevirtual 40	android/os/Parcel:recycle	()V
    //   69: aload_3
    //   70: invokevirtual 40	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	cjv
    //   0	75	1	paramCastDevice	com.google.android.gms.cast.CastDevice
    //   7	59	2	localParcel1	Parcel
    //   3	67	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	64	finally
    //   18	29	64	finally
    //   29	47	64	finally
    //   56	61	64	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  public final void b()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringCallbacks");
      this.a.transact(3, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */