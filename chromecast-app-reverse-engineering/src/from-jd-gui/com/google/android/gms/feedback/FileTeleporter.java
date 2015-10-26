package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import cii;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;

public class FileTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new cii();
  public final int a;
  public ParcelFileDescriptor b;
  public final String c;
  public final String d;
  public File e;
  
  public FileTeleporter(int paramInt, ParcelFileDescriptor paramParcelFileDescriptor, String paramString1, String paramString2)
  {
    this.a = paramInt;
    this.b = paramParcelFileDescriptor;
    this.c = paramString1;
    this.d = paramString2;
  }
  
  /* Error */
  private java.io.FileOutputStream a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 44	com/google/android/gms/feedback/FileTeleporter:e	Ljava/io/File;
    //   4: ifnonnull +13 -> 17
    //   7: new 46	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 48
    //   13: invokespecial 51	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: ldc 53
    //   19: ldc 55
    //   21: aload_0
    //   22: getfield 44	com/google/android/gms/feedback/FileTeleporter:e	Ljava/io/File;
    //   25: invokestatic 61	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   28: astore_2
    //   29: new 63	java/io/FileOutputStream
    //   32: astore_1
    //   33: aload_1
    //   34: aload_2
    //   35: invokespecial 66	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   38: aload_0
    //   39: aload_2
    //   40: ldc 67
    //   42: invokestatic 73	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   45: putfield 33	com/google/android/gms/feedback/FileTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   48: aload_2
    //   49: invokevirtual 77	java/io/File:delete	()Z
    //   52: pop
    //   53: aload_1
    //   54: areturn
    //   55: astore_1
    //   56: new 46	java/lang/IllegalStateException
    //   59: dup
    //   60: ldc 79
    //   62: aload_1
    //   63: invokespecial 82	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore_1
    //   68: new 46	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 84
    //   74: invokespecial 51	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	FileTeleporter
    //   32	22	1	localFileOutputStream	java.io.FileOutputStream
    //   55	8	1	localIOException	IOException
    //   67	1	1	localFileNotFoundException	java.io.FileNotFoundException
    //   28	21	2	localFile	File
    // Exception table:
    //   from	to	target	type
    //   17	29	55	java/io/IOException
    //   29	48	67	java/io/FileNotFoundException
  }
  
  private static void a(Closeable paramCloseable)
  {
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException paramCloseable)
    {
      for (;;)
      {
        Log.w("FileTeleporter", "Could not close stream", paramCloseable);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    DataOutputStream localDataOutputStream;
    if (this.b == null) {
      localDataOutputStream = new DataOutputStream(a());
    }
    try
    {
      localDataOutputStream.writeInt(null.length);
      localDataOutputStream.writeUTF(this.c);
      localDataOutputStream.writeUTF(this.d);
      localDataOutputStream.write(null);
      a(localDataOutputStream);
      cii.a(this, paramParcel, paramInt);
      return;
    }
    catch (IOException paramParcel)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Could not write into unlinked file", paramParcel);
      throw localIllegalStateException;
    }
    finally
    {
      a(localDataOutputStream);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\feedback\FileTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */