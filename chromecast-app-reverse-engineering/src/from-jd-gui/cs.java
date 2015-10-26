import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

final class cs
  implements cq
{
  private IBinder a;
  
  cs(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel2.writeInt(paramInt1);
      localParcel2.writeInt(paramInt2);
      localParcel2.writeString(paramString);
      this.a.transact(11, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final void a(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeLong(paramLong);
      this.a.transact(16, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final void a(cl paramcl)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_2
    //   19: iconst_1
    //   20: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_2
    //   25: iconst_0
    //   26: invokevirtual 59	cl:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	cs:a	Landroid/os/IBinder;
    //   33: bipush 24
    //   35: aload_2
    //   36: aload_3
    //   37: iconst_0
    //   38: invokeinterface 42 5 0
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 45	android/os/Parcel:readException	()V
    //   48: aload_3
    //   49: invokevirtual 48	android/os/Parcel:recycle	()V
    //   52: aload_2
    //   53: invokevirtual 48	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aload_2
    //   58: iconst_0
    //   59: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   62: goto -33 -> 29
    //   65: astore_1
    //   66: aload_3
    //   67: invokevirtual 48	android/os/Parcel:recycle	()V
    //   70: aload_2
    //   71: invokevirtual 48	android/os/Parcel:recycle	()V
    //   74: aload_1
    //   75: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	this	cs
    //   0	76	1	paramcl	cl
    //   3	68	2	localParcel1	Parcel
    //   7	60	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	65	finally
    //   18	29	65	finally
    //   29	48	65	finally
    //   57	62	65	finally
  }
  
  /* Error */
  public final void a(cn paramcn)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_1
    //   19: invokeinterface 66 1 0
    //   24: astore_1
    //   25: aload_3
    //   26: aload_1
    //   27: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	cs:a	Landroid/os/IBinder;
    //   34: iconst_3
    //   35: aload_3
    //   36: aload_2
    //   37: iconst_0
    //   38: invokeinterface 42 5 0
    //   43: pop
    //   44: aload_2
    //   45: invokevirtual 45	android/os/Parcel:readException	()V
    //   48: aload_2
    //   49: invokevirtual 48	android/os/Parcel:recycle	()V
    //   52: aload_3
    //   53: invokevirtual 48	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aconst_null
    //   58: astore_1
    //   59: goto -34 -> 25
    //   62: astore_1
    //   63: aload_2
    //   64: invokevirtual 48	android/os/Parcel:recycle	()V
    //   67: aload_3
    //   68: invokevirtual 48	android/os/Parcel:recycle	()V
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	cs
    //   0	73	1	paramcn	cn
    //   7	57	2	localParcel1	Parcel
    //   3	65	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	62	finally
    //   18	25	62	finally
    //   25	48	62	finally
  }
  
  /* Error */
  public final void a(String paramString, Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 25
    //   12: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: aload_1
    //   17: invokevirtual 36	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 73	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	cs:a	Landroid/os/IBinder;
    //   39: bipush 14
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 42 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 45	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 48	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore_1
    //   75: aload 4
    //   77: invokevirtual 48	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 48	android/os/Parcel:recycle	()V
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	cs
    //   0	86	1	paramString	String
    //   0	86	2	paramBundle	Bundle
    //   3	78	3	localParcel1	Parcel
    //   7	69	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  public final void a(String paramString, Bundle paramBundle, dk paramdk)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        localParcel2.writeString(paramString);
        if (paramBundle != null)
        {
          localParcel2.writeInt(1);
          paramBundle.writeToParcel(localParcel2, 0);
          if (paramdk != null)
          {
            localParcel2.writeInt(1);
            paramdk.writeToParcel(localParcel2, 0);
            this.a.transact(1, localParcel2, localParcel1, 0);
            localParcel1.readException();
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        localParcel2.writeInt(0);
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
  
  public final boolean a()
  {
    boolean bool = false;
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(5, localParcel2, localParcel1, 0);
      localParcel1.readException();
      int i = localParcel1.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final boolean a(KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
        if (paramKeyEvent != null)
        {
          localParcel2.writeInt(1);
          paramKeyEvent.writeToParcel(localParcel2, 0);
          this.a.transact(2, localParcel2, localParcel1, 0);
          localParcel1.readException();
          int i = localParcel1.readInt();
          if (i != 0) {
            return bool;
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        bool = false;
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
  
  public final IBinder asBinder()
  {
    return this.a;
  }
  
  public final String b()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(6, localParcel2, localParcel1, 0);
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
  
  public final void b(int paramInt1, int paramInt2, String paramString)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel2.writeInt(paramInt1);
      localParcel2.writeInt(paramInt2);
      localParcel2.writeString(paramString);
      this.a.transact(12, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final void b(long paramLong)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      localParcel1.writeLong(paramLong);
      this.a.transact(23, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final void b(cn paramcn)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_1
    //   15: ifnull +42 -> 57
    //   18: aload_1
    //   19: invokeinterface 66 1 0
    //   24: astore_1
    //   25: aload_3
    //   26: aload_1
    //   27: invokevirtual 69	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   30: aload_0
    //   31: getfield 15	cs:a	Landroid/os/IBinder;
    //   34: iconst_4
    //   35: aload_3
    //   36: aload_2
    //   37: iconst_0
    //   38: invokeinterface 42 5 0
    //   43: pop
    //   44: aload_2
    //   45: invokevirtual 45	android/os/Parcel:readException	()V
    //   48: aload_2
    //   49: invokevirtual 48	android/os/Parcel:recycle	()V
    //   52: aload_3
    //   53: invokevirtual 48	android/os/Parcel:recycle	()V
    //   56: return
    //   57: aconst_null
    //   58: astore_1
    //   59: goto -34 -> 25
    //   62: astore_1
    //   63: aload_2
    //   64: invokevirtual 48	android/os/Parcel:recycle	()V
    //   67: aload_3
    //   68: invokevirtual 48	android/os/Parcel:recycle	()V
    //   71: aload_1
    //   72: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	73	0	this	cs
    //   0	73	1	paramcn	cn
    //   7	57	2	localParcel1	Parcel
    //   3	65	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	62	finally
    //   18	25	62	finally
    //   25	48	62	finally
  }
  
  /* Error */
  public final void b(String paramString, Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore 4
    //   5: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   8: astore_3
    //   9: aload 4
    //   11: ldc 25
    //   13: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   16: aload 4
    //   18: aload_1
    //   19: invokevirtual 36	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   22: aload_2
    //   23: ifnull +46 -> 69
    //   26: aload 4
    //   28: iconst_1
    //   29: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   32: aload_2
    //   33: aload 4
    //   35: iconst_0
    //   36: invokevirtual 73	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   39: aload_0
    //   40: getfield 15	cs:a	Landroid/os/IBinder;
    //   43: bipush 15
    //   45: aload 4
    //   47: aload_3
    //   48: iconst_0
    //   49: invokeinterface 42 5 0
    //   54: pop
    //   55: aload_3
    //   56: invokevirtual 45	android/os/Parcel:readException	()V
    //   59: aload_3
    //   60: invokevirtual 48	android/os/Parcel:recycle	()V
    //   63: aload 4
    //   65: invokevirtual 48	android/os/Parcel:recycle	()V
    //   68: return
    //   69: aload 4
    //   71: iconst_0
    //   72: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   75: goto -36 -> 39
    //   78: astore_1
    //   79: aload_3
    //   80: invokevirtual 48	android/os/Parcel:recycle	()V
    //   83: aload 4
    //   85: invokevirtual 48	android/os/Parcel:recycle	()V
    //   88: aload_1
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	cs
    //   0	90	1	paramString	String
    //   0	90	2	paramBundle	Bundle
    //   8	72	3	localParcel1	Parcel
    //   3	81	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	22	78	finally
    //   26	39	78	finally
    //   39	59	78	finally
    //   69	75	78	finally
  }
  
  public final String c()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final void c(String paramString, Bundle paramBundle)
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 25
    //   12: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_3
    //   16: aload_1
    //   17: invokevirtual 36	android/os/Parcel:writeString	(Ljava/lang/String;)V
    //   20: aload_2
    //   21: ifnull +45 -> 66
    //   24: aload_3
    //   25: iconst_1
    //   26: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   29: aload_2
    //   30: aload_3
    //   31: iconst_0
    //   32: invokevirtual 73	android/os/Bundle:writeToParcel	(Landroid/os/Parcel;I)V
    //   35: aload_0
    //   36: getfield 15	cs:a	Landroid/os/IBinder;
    //   39: bipush 25
    //   41: aload_3
    //   42: aload 4
    //   44: iconst_0
    //   45: invokeinterface 42 5 0
    //   50: pop
    //   51: aload 4
    //   53: invokevirtual 45	android/os/Parcel:readException	()V
    //   56: aload 4
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_3
    //   62: invokevirtual 48	android/os/Parcel:recycle	()V
    //   65: return
    //   66: aload_3
    //   67: iconst_0
    //   68: invokevirtual 33	android/os/Parcel:writeInt	(I)V
    //   71: goto -36 -> 35
    //   74: astore_1
    //   75: aload 4
    //   77: invokevirtual 48	android/os/Parcel:recycle	()V
    //   80: aload_3
    //   81: invokevirtual 48	android/os/Parcel:recycle	()V
    //   84: aload_1
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	cs
    //   0	86	1	paramString	String
    //   0	86	2	paramBundle	Bundle
    //   3	78	3	localParcel1	Parcel
    //   7	69	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	20	74	finally
    //   24	35	74	finally
    //   35	56	74	finally
    //   66	71	74	finally
  }
  
  /* Error */
  public final android.app.PendingIntent d()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_2
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_3
    //   8: aload_2
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	cs:a	Landroid/os/IBinder;
    //   18: bipush 8
    //   20: aload_2
    //   21: aload_3
    //   22: iconst_0
    //   23: invokeinterface 42 5 0
    //   28: pop
    //   29: aload_3
    //   30: invokevirtual 45	android/os/Parcel:readException	()V
    //   33: aload_3
    //   34: invokevirtual 82	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 100	android/app/PendingIntent:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_3
    //   44: invokeinterface 106 2 0
    //   49: checkcast 96	android/app/PendingIntent
    //   52: astore_1
    //   53: aload_3
    //   54: invokevirtual 48	android/os/Parcel:recycle	()V
    //   57: aload_2
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_3
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_2
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	cs
    //   52	13	1	localPendingIntent	android.app.PendingIntent
    //   68	10	1	localObject	Object
    //   3	71	2	localParcel1	Parcel
    //   7	63	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  public final long e()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(9, localParcel1, localParcel2, 0);
      localParcel2.readException();
      long l = localParcel2.readLong();
      return l;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final do f()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	cs:a	Landroid/os/IBinder;
    //   18: bipush 10
    //   20: aload_3
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 42 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 45	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 82	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 116	do:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 106 2 0
    //   49: checkcast 115	do
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 48	android/os/Parcel:recycle	()V
    //   57: aload_3
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_3
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	cs
    //   52	13	1	localdo	do
    //   68	10	1	localObject	Object
    //   7	63	2	localParcel1	Parcel
    //   3	71	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  public final void g()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(13, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final void h()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(17, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final void i()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(18, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void j()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(19, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void k()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(20, localParcel2, localParcel1, 0);
      localParcel1.readException();
      return;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  public final void l()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(21, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void m()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(22, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public final ci n()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	cs:a	Landroid/os/IBinder;
    //   18: bipush 26
    //   20: aload_3
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 42 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 45	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 82	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 128	ci:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 106 2 0
    //   49: checkcast 127	ci
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 48	android/os/Parcel:recycle	()V
    //   57: aload_3
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_3
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	cs
    //   52	13	1	localci	ci
    //   68	10	1	localObject	Object
    //   7	63	2	localParcel1	Parcel
    //   3	71	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  /* Error */
  public final dq o()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	cs:a	Landroid/os/IBinder;
    //   18: bipush 27
    //   20: aload_3
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 42 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 45	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 82	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 133	dq:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 106 2 0
    //   49: checkcast 132	dq
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 48	android/os/Parcel:recycle	()V
    //   57: aload_3
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_3
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	cs
    //   52	13	1	localdq	dq
    //   68	10	1	localObject	Object
    //   7	63	2	localParcel1	Parcel
    //   3	71	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  public final List p()
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(28, localParcel2, localParcel1, 0);
      localParcel1.readException();
      ArrayList localArrayList = localParcel1.createTypedArrayList(di.CREATOR);
      return localArrayList;
    }
    finally
    {
      localParcel1.recycle();
      localParcel2.recycle();
    }
  }
  
  /* Error */
  public final CharSequence q()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	cs:a	Landroid/os/IBinder;
    //   18: bipush 29
    //   20: aload_3
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 42 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 45	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 82	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 149	android/text/TextUtils:CHAR_SEQUENCE_CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 106 2 0
    //   49: checkcast 151	java/lang/CharSequence
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 48	android/os/Parcel:recycle	()V
    //   57: aload_3
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_3
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	cs
    //   52	13	1	localCharSequence	CharSequence
    //   68	10	1	localObject	Object
    //   7	63	2	localParcel1	Parcel
    //   3	71	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  /* Error */
  public final Bundle r()
  {
    // Byte code:
    //   0: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore_2
    //   8: aload_3
    //   9: ldc 25
    //   11: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   14: aload_0
    //   15: getfield 15	cs:a	Landroid/os/IBinder;
    //   18: bipush 30
    //   20: aload_3
    //   21: aload_2
    //   22: iconst_0
    //   23: invokeinterface 42 5 0
    //   28: pop
    //   29: aload_2
    //   30: invokevirtual 45	android/os/Parcel:readException	()V
    //   33: aload_2
    //   34: invokevirtual 82	android/os/Parcel:readInt	()I
    //   37: ifeq +26 -> 63
    //   40: getstatic 154	android/os/Bundle:CREATOR	Landroid/os/Parcelable$Creator;
    //   43: aload_2
    //   44: invokeinterface 106 2 0
    //   49: checkcast 72	android/os/Bundle
    //   52: astore_1
    //   53: aload_2
    //   54: invokevirtual 48	android/os/Parcel:recycle	()V
    //   57: aload_3
    //   58: invokevirtual 48	android/os/Parcel:recycle	()V
    //   61: aload_1
    //   62: areturn
    //   63: aconst_null
    //   64: astore_1
    //   65: goto -12 -> 53
    //   68: astore_1
    //   69: aload_2
    //   70: invokevirtual 48	android/os/Parcel:recycle	()V
    //   73: aload_3
    //   74: invokevirtual 48	android/os/Parcel:recycle	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	cs
    //   52	13	1	localBundle	Bundle
    //   68	10	1	localObject	Object
    //   7	63	2	localParcel1	Parcel
    //   3	71	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	53	68	finally
  }
  
  public final int s()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.a.transact(31, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      return i;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */