import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;

final class ctf
  implements ctd
{
  private IBinder a;
  
  ctf(IBinder paramIBinder)
  {
    this.a = paramIBinder;
  }
  
  public final void a(int paramInt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
      localParcel1.writeInt(paramInt);
      this.a.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      return;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public final void a(int paramInt, Account paramAccount, cta paramcta)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        localParcel2.writeInt(paramInt);
        if (paramAccount != null)
        {
          localParcel2.writeInt(1);
          paramAccount.writeToParcel(localParcel2, 0);
          if (paramcta != null)
          {
            paramAccount = paramcta.asBinder();
            localParcel2.writeStrongBinder(paramAccount);
            this.a.transact(8, localParcel2, localParcel1, 0);
            localParcel1.readException();
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        paramAccount = null;
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
  
  /* Error */
  public final void a(bzf parambzf, int paramInt, boolean paramBoolean)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   6: astore 4
    //   8: invokestatic 23	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   11: astore 5
    //   13: aload 4
    //   15: ldc 25
    //   17: invokevirtual 29	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   20: aload_1
    //   21: ifnull +70 -> 91
    //   24: aload_1
    //   25: invokeinterface 64 1 0
    //   30: astore_1
    //   31: aload 4
    //   33: aload_1
    //   34: invokevirtual 60	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   37: aload 4
    //   39: iload_2
    //   40: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   43: iload 6
    //   45: istore_2
    //   46: iload_3
    //   47: ifeq +5 -> 52
    //   50: iconst_1
    //   51: istore_2
    //   52: aload 4
    //   54: iload_2
    //   55: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   58: aload_0
    //   59: getfield 15	ctf:a	Landroid/os/IBinder;
    //   62: bipush 9
    //   64: aload 4
    //   66: aload 5
    //   68: iconst_0
    //   69: invokeinterface 38 5 0
    //   74: pop
    //   75: aload 5
    //   77: invokevirtual 41	android/os/Parcel:readException	()V
    //   80: aload 5
    //   82: invokevirtual 44	android/os/Parcel:recycle	()V
    //   85: aload 4
    //   87: invokevirtual 44	android/os/Parcel:recycle	()V
    //   90: return
    //   91: aconst_null
    //   92: astore_1
    //   93: goto -62 -> 31
    //   96: astore_1
    //   97: aload 5
    //   99: invokevirtual 44	android/os/Parcel:recycle	()V
    //   102: aload 4
    //   104: invokevirtual 44	android/os/Parcel:recycle	()V
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	ctf
    //   0	109	1	parambzf	bzf
    //   0	109	2	paramInt	int
    //   0	109	3	paramBoolean	boolean
    //   6	97	4	localParcel1	Parcel
    //   11	87	5	localParcel2	Parcel
    //   1	43	6	i	int
    // Exception table:
    //   from	to	target	type
    //   13	20	96	finally
    //   24	31	96	finally
    //   31	43	96	finally
    //   52	80	96	finally
  }
  
  public final void a(AuthAccountRequest paramAuthAccountRequest, cta paramcta)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (paramAuthAccountRequest != null)
        {
          localParcel1.writeInt(1);
          paramAuthAccountRequest.writeToParcel(localParcel1, 0);
          if (paramcta != null)
          {
            paramAuthAccountRequest = paramcta.asBinder();
            localParcel1.writeStrongBinder(paramAuthAccountRequest);
            this.a.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramAuthAccountRequest = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  public final void a(ResolveAccountRequest paramResolveAccountRequest, bzo parambzo)
  {
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel2.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
        if (paramResolveAccountRequest != null)
        {
          localParcel2.writeInt(1);
          paramResolveAccountRequest.writeToParcel(localParcel2, 0);
          if (parambzo != null)
          {
            paramResolveAccountRequest = parambzo.asBinder();
            localParcel2.writeStrongBinder(paramResolveAccountRequest);
            this.a.transact(5, localParcel2, localParcel1, 0);
            localParcel1.readException();
          }
        }
        else
        {
          localParcel2.writeInt(0);
          continue;
        }
        paramResolveAccountRequest = null;
      }
      finally
      {
        localParcel1.recycle();
        localParcel2.recycle();
      }
    }
  }
  
  /* Error */
  public final void a(com.google.android.gms.signin.internal.CheckServerAuthResult paramCheckServerAuthResult)
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
    //   15: ifnull +41 -> 56
    //   18: aload_3
    //   19: iconst_1
    //   20: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   23: aload_1
    //   24: aload_3
    //   25: iconst_0
    //   26: invokevirtual 79	com/google/android/gms/signin/internal/CheckServerAuthResult:writeToParcel	(Landroid/os/Parcel;I)V
    //   29: aload_0
    //   30: getfield 15	ctf:a	Landroid/os/IBinder;
    //   33: iconst_3
    //   34: aload_3
    //   35: aload_2
    //   36: iconst_0
    //   37: invokeinterface 38 5 0
    //   42: pop
    //   43: aload_2
    //   44: invokevirtual 41	android/os/Parcel:readException	()V
    //   47: aload_2
    //   48: invokevirtual 44	android/os/Parcel:recycle	()V
    //   51: aload_3
    //   52: invokevirtual 44	android/os/Parcel:recycle	()V
    //   55: return
    //   56: aload_3
    //   57: iconst_0
    //   58: invokevirtual 32	android/os/Parcel:writeInt	(I)V
    //   61: goto -32 -> 29
    //   64: astore_1
    //   65: aload_2
    //   66: invokevirtual 44	android/os/Parcel:recycle	()V
    //   69: aload_3
    //   70: invokevirtual 44	android/os/Parcel:recycle	()V
    //   73: aload_1
    //   74: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	75	0	this	ctf
    //   0	75	1	paramCheckServerAuthResult	com.google.android.gms.signin.internal.CheckServerAuthResult
    //   7	59	2	localParcel1	Parcel
    //   3	67	3	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   8	14	64	finally
    //   18	29	64	finally
    //   29	47	64	finally
    //   56	61	64	finally
  }
  
  public final void a(boolean paramBoolean)
  {
    int i = 0;
    Parcel localParcel2 = Parcel.obtain();
    Parcel localParcel1 = Parcel.obtain();
    try
    {
      localParcel2.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
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
  
  public final IBinder asBinder()
  {
    return this.a;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\ctf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */