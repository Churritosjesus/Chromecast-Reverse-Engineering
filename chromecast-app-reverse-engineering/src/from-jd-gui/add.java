import android.text.TextUtils;

final class add
  implements acz
{
  final CharSequence a;
  final long b;
  final Long c;
  final String d;
  final long e;
  final acx f;
  private final CharSequence g;
  private boolean h = false;
  private CharSequence i;
  
  public add(acx paramacx)
  {
    this.g = paramacx.c;
    this.a = paramacx.d.trim();
    this.b = paramacx.g;
    this.c = paramacx.h;
    this.d = paramacx.l;
    this.e = paramacx.i;
    this.f = paramacx;
  }
  
  public final void a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (this.i = paramString;; this.i = paramString.trim()) {
      return;
    }
  }
  
  public final boolean a()
  {
    return false;
  }
  
  public final CharSequence b()
  {
    return this.a;
  }
  
  public final long c()
  {
    return this.b;
  }
  
  public final Long d()
  {
    return this.c;
  }
  
  public final String e()
  {
    return this.d;
  }
  
  public final long f()
  {
    return this.e;
  }
  
  public final acx g()
  {
    return this.f;
  }
  
  public final CharSequence h()
  {
    if (!TextUtils.isEmpty(this.i)) {}
    for (Object localObject = this.i;; localObject = this.f.d) {
      return (CharSequence)localObject;
    }
  }
  
  public final String toString()
  {
    String str2 = String.valueOf(this.g);
    String str1 = String.valueOf(this.a);
    return String.valueOf(str2).length() + 3 + String.valueOf(str1).length() + str2 + " <" + str1 + ">";
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\add.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */