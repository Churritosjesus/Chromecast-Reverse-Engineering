import android.net.Uri;
import android.text.util.Rfc822Token;
import android.text.util.Rfc822Tokenizer;

public final class acx
{
  final int a;
  boolean b;
  public final String c;
  public final String d;
  final int e;
  final String f;
  public final long g;
  public final Long h;
  public final long i;
  final Uri j;
  boolean k;
  public final String l;
  private byte[] m;
  private int n;
  private String o;
  private final String[] p;
  
  private acx(int paramInt1, String paramString1, String paramString2, int paramInt2, String paramString3, long paramLong1, Long paramLong, long paramLong2, Uri paramUri, boolean paramBoolean1, boolean paramBoolean2, String paramString4, String[] paramArrayOfString)
  {
    this.a = paramInt1;
    this.b = paramBoolean1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramInt2;
    this.f = paramString3;
    this.g = paramLong1;
    this.h = paramLong;
    this.i = paramLong2;
    this.j = paramUri;
    this.m = null;
    this.k = paramBoolean2;
    this.l = paramString4;
    this.n = 0;
    this.o = null;
    this.p = paramArrayOfString;
  }
  
  public static acx a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, long paramLong1, Long paramLong, long paramLong2, String paramString4, boolean paramBoolean, String paramString5)
  {
    String str = a(paramInt1, paramString1, paramString2);
    if (paramString4 != null) {}
    for (paramString1 = Uri.parse(paramString4);; paramString1 = null) {
      return new acx(0, str, paramString2, paramInt2, paramString3, paramLong1, paramLong, paramLong2, paramString1, true, true, paramString5, null);
    }
  }
  
  public static acx a(String paramString1, String paramString2, boolean paramBoolean)
  {
    return new acx(0, paramString1, paramString2, -1, null, -2L, null, -2L, null, true, paramBoolean, null, null);
  }
  
  public static acx a(String paramString, boolean paramBoolean)
  {
    Rfc822Token[] arrayOfRfc822Token = Rfc822Tokenizer.tokenize(paramString);
    if (arrayOfRfc822Token.length > 0) {
      paramString = arrayOfRfc822Token[0].getAddress();
    }
    for (;;)
    {
      return new acx(0, paramString, paramString, -1, null, -1L, null, -1L, null, true, paramBoolean, null, null);
    }
  }
  
  private static String a(int paramInt, String paramString1, String paramString2)
  {
    if (paramInt > 20) {}
    for (;;)
    {
      return paramString1;
      paramString1 = paramString2;
    }
  }
  
  public static boolean a(long paramLong)
  {
    if ((paramLong == -1L) || (paramLong == -2L)) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static acx b(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, long paramLong1, Long paramLong, long paramLong2, String paramString4, boolean paramBoolean, String paramString5)
  {
    String str = a(paramInt1, paramString1, paramString2);
    if (paramString4 != null) {}
    for (paramString1 = Uri.parse(paramString4);; paramString1 = null) {
      return new acx(0, str, paramString2, paramInt2, paramString3, paramLong1, paramLong, paramLong2, paramString1, false, true, paramString5, null);
    }
  }
  
  public static acx b(String paramString, boolean paramBoolean)
  {
    return new acx(0, paramString, paramString, -1, null, -1L, null, -1L, null, true, true, null, null);
  }
  
  public final void a(byte[] paramArrayOfByte)
  {
    try
    {
      this.m = paramArrayOfByte;
      return;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
  
  public final byte[] a()
  {
    try
    {
      byte[] arrayOfByte = this.m;
      return arrayOfByte;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final String toString()
  {
    String str2 = this.c;
    String str1 = this.d;
    boolean bool = this.k;
    return String.valueOf(str2).length() + 18 + String.valueOf(str1).length() + str2 + " <" + str1 + ">, isValid=" + bool;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\acx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */