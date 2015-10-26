import android.os.IBinder;
import android.os.Parcel;

final class cjy
  implements cjw
{
  private IBinder a;
  
  cjy(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      this.a.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void a(cjt paramcjt)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      if (paramcjt != null) {
        localIBinder = paramcjt.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      this.a.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  /* Error */
  public final void a(cjt paramcjt, cjz paramcjz, String paramString, android.app.PendingIntent paramPendingIntent)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 6
    //   8: aload 6
    //   10: ldc 24
    //   12: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +82 -> 98
    //   19: aload_1
    //   20: invokeinterface 44 1 0
    //   25: astore_1
    //   26: aload 6
    //   28: aload_1
    //   29: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   32: aload 5
    //   34: astore_1
    //   35: aload_2
    //   36: ifnull +10 -> 46
    //   39: aload_2
    //   40: invokeinterface 51 1 0
    //   45: astore_1
    //   46: aload 6
    //   48: aload_1
    //   49: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   52: aload 6
    //   54: aload_3
    //   55: invokevirtual 54	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   58: aload 4
    //   60: ifnull +43 -> 103
    //   63: aload 6
    //   65: iconst_1
    //   66: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   69: aload 4
    //   71: aload 6
    //   73: iconst_0
    //   74: invokevirtual 64	android/app/PendingIntent:writeToParcel	(Landroid/os/Parcel;I)V
    //   77: aload_0
    //   78: getfield 15	cjy:a	Landroid/os/IBinder;
    //   81: iconst_4
    //   82: aload 6
    //   84: aconst_null
    //   85: iconst_1
    //   86: invokeinterface 34 5 0
    //   91: pop
    //   92: aload 6
    //   94: invokevirtual 37	android/os/Parcel:recycle	()V
    //   97: return
    //   98: aconst_null
    //   99: astore_1
    //   100: goto -74 -> 26
    //   103: aload 6
    //   105: iconst_0
    //   106: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   109: goto -32 -> 77
    //   112: astore_1
    //   113: aload 6
    //   115: invokevirtual 37	android/os/Parcel:recycle	()V
    //   118: aload_1
    //   119: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	cjy
    //   0	120	1	paramcjt	cjt
    //   0	120	2	paramcjz	cjz
    //   0	120	3	paramString	String
    //   0	120	4	paramPendingIntent	android.app.PendingIntent
    //   1	32	5	localObject	Object
    //   6	108	6	localParcel	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	15	112	finally
    //   19	26	112	finally
    //   26	32	112	finally
    //   39	46	112	finally
    //   46	58	112	finally
    //   63	77	112	finally
    //   77	92	112	finally
    //   103	109	112	finally
  }
  
  /* Error */
  public final void a(cjt paramcjt, boolean paramBoolean, String paramString, android.view.Surface paramSurface, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 6
    //   3: iconst_1
    //   4: istore 8
    //   6: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   9: astore 7
    //   11: aload 7
    //   13: ldc 24
    //   15: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   18: aload_1
    //   19: ifnull +11 -> 30
    //   22: aload_1
    //   23: invokeinterface 44 1 0
    //   28: astore 6
    //   30: aload 7
    //   32: aload 6
    //   34: invokevirtual 47	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: iload_2
    //   38: ifeq +63 -> 101
    //   41: aload 7
    //   43: iload 8
    //   45: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   48: aload 7
    //   50: aload_3
    //   51: invokevirtual 54	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   54: aload 4
    //   56: ifnull +51 -> 107
    //   59: aload 7
    //   61: iconst_1
    //   62: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   65: aload 4
    //   67: aload 7
    //   69: iconst_0
    //   70: invokevirtual 68	android/view/Surface:writeToParcel	(Landroid/os/Parcel;I)V
    //   73: aload 7
    //   75: iload 5
    //   77: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   80: aload_0
    //   81: getfield 15	cjy:a	Landroid/os/IBinder;
    //   84: iconst_1
    //   85: aload 7
    //   87: aconst_null
    //   88: iconst_1
    //   89: invokeinterface 34 5 0
    //   94: pop
    //   95: aload 7
    //   97: invokevirtual 37	android/os/Parcel:recycle	()V
    //   100: return
    //   101: iconst_0
    //   102: istore 8
    //   104: goto -63 -> 41
    //   107: aload 7
    //   109: iconst_0
    //   110: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   113: goto -40 -> 73
    //   116: astore_1
    //   117: aload 7
    //   119: invokevirtual 37	android/os/Parcel:recycle	()V
    //   122: aload_1
    //   123: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	124	0	this	cjy
    //   0	124	1	paramcjt	cjt
    //   0	124	2	paramBoolean	boolean
    //   0	124	3	paramString	String
    //   0	124	4	paramSurface	android.view.Surface
    //   0	124	5	paramInt	int
    //   1	32	6	localIBinder	IBinder
    //   9	109	7	localParcel	Parcel
    //   4	99	8	i	int
    // Exception table:
    //   from	to	target	type
    //   11	18	116	finally
    //   22	30	116	finally
    //   30	37	116	finally
    //   41	54	116	finally
    //   59	73	116	finally
    //   73	95	116	finally
    //   107	113	116	finally
  }
  
  /* Error */
  public final void a(boolean paramBoolean, String paramString)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore 4
    //   3: invokestatic 22	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore_3
    //   7: aload_3
    //   8: ldc 24
    //   10: invokevirtual 28	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   13: iload_1
    //   14: ifeq +34 -> 48
    //   17: aload_3
    //   18: iload 4
    //   20: invokevirtual 58	android/os/Parcel:writeInt	(I)V
    //   23: aload_3
    //   24: aload_2
    //   25: invokevirtual 54	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   28: aload_0
    //   29: getfield 15	cjy:a	Landroid/os/IBinder;
    //   32: bipush 7
    //   34: aload_3
    //   35: aconst_null
    //   36: iconst_1
    //   37: invokeinterface 34 5 0
    //   42: pop
    //   43: aload_3
    //   44: invokevirtual 37	android/os/Parcel:recycle	()V
    //   47: return
    //   48: iconst_0
    //   49: istore 4
    //   51: goto -34 -> 17
    //   54: astore_2
    //   55: aload_3
    //   56: invokevirtual 37	android/os/Parcel:recycle	()V
    //   59: aload_2
    //   60: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	61	0	this	cjy
    //   0	61	1	paramBoolean	boolean
    //   0	61	2	paramString	String
    //   6	50	3	localParcel	Parcel
    //   1	49	4	i	int
    // Exception table:
    //   from	to	target	type
    //   7	13	54	finally
    //   17	43	54	finally
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  public final void b()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      this.a.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public final void b(cjt paramcjt)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.google.android.gms.cast_mirroring.internal.ICastMirroringService");
      if (paramcjt != null) {
        localIBinder = paramcjt.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      this.a.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cjy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */