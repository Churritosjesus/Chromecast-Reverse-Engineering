package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import bxy;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BitmapTeleporter
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new bxy();
  public final int a;
  public ParcelFileDescriptor b;
  public final int c;
  public File d;
  private Bitmap e;
  
  public BitmapTeleporter(int paramInt1, ParcelFileDescriptor paramParcelFileDescriptor, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramParcelFileDescriptor;
    this.c = paramInt2;
    this.e = null;
  }
  
  public BitmapTeleporter(Bitmap paramBitmap)
  {
    this.a = 1;
    this.b = null;
    this.c = 0;
    this.e = paramBitmap;
  }
  
  /* Error */
  private java.io.FileOutputStream a()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	com/google/android/gms/common/data/BitmapTeleporter:d	Ljava/io/File;
    //   4: ifnonnull +13 -> 17
    //   7: new 47	java/lang/IllegalStateException
    //   10: dup
    //   11: ldc 49
    //   13: invokespecial 52	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: ldc 54
    //   19: ldc 56
    //   21: aload_0
    //   22: getfield 45	com/google/android/gms/common/data/BitmapTeleporter:d	Ljava/io/File;
    //   25: invokestatic 62	java/io/File:createTempFile	(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    //   28: astore_2
    //   29: new 64	java/io/FileOutputStream
    //   32: astore_1
    //   33: aload_1
    //   34: aload_2
    //   35: invokespecial 67	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   38: aload_0
    //   39: aload_2
    //   40: ldc 68
    //   42: invokestatic 74	android/os/ParcelFileDescriptor:open	(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;
    //   45: putfield 33	com/google/android/gms/common/data/BitmapTeleporter:b	Landroid/os/ParcelFileDescriptor;
    //   48: aload_2
    //   49: invokevirtual 78	java/io/File:delete	()Z
    //   52: pop
    //   53: aload_1
    //   54: areturn
    //   55: astore_1
    //   56: new 47	java/lang/IllegalStateException
    //   59: dup
    //   60: ldc 80
    //   62: aload_1
    //   63: invokespecial 83	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore_1
    //   68: new 47	java/lang/IllegalStateException
    //   71: dup
    //   72: ldc 85
    //   74: invokespecial 52	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	BitmapTeleporter
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
        Log.w("BitmapTeleporter", "Could not close stream", paramCloseable);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Object localObject2;
    Object localObject1;
    byte[] arrayOfByte;
    if (this.b == null)
    {
      localObject2 = this.e;
      localObject1 = ByteBuffer.allocate(((Bitmap)localObject2).getRowBytes() * ((Bitmap)localObject2).getHeight());
      ((Bitmap)localObject2).copyPixelsToBuffer((Buffer)localObject1);
      arrayOfByte = ((ByteBuffer)localObject1).array();
      localObject1 = new DataOutputStream(a());
    }
    try
    {
      ((DataOutputStream)localObject1).writeInt(arrayOfByte.length);
      ((DataOutputStream)localObject1).writeInt(((Bitmap)localObject2).getWidth());
      ((DataOutputStream)localObject1).writeInt(((Bitmap)localObject2).getHeight());
      ((DataOutputStream)localObject1).writeUTF(((Bitmap)localObject2).getConfig().toString());
      ((DataOutputStream)localObject1).write(arrayOfByte);
      a((Closeable)localObject1);
      bxy.a(this, paramParcel, paramInt | 0x1);
      this.b = null;
      return;
    }
    catch (IOException paramParcel)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Could not write into unlinked file", paramParcel);
      throw ((Throwable)localObject2);
    }
    finally
    {
      a((Closeable)localObject1);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\com\google\android\gms\common\data\BitmapTeleporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */