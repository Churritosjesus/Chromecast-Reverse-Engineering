import android.text.TextUtils;

public class bpd
  extends cow
{
  public final brb a;
  public boolean b;
  
  public bpd(brb parambrb)
  {
    super(parambrb.b(), parambrb.c);
    this.a = parambrb;
  }
  
  public final cou a()
  {
    cou localcou = this.h.a();
    localcou.a(this.a.h().b());
    localcou.a(this.a.h.b());
    b(localcou);
    return localcou;
  }
  
  protected final void a(cou paramcou)
  {
    bpy localbpy = (bpy)paramcou.b(bpy.class);
    if (TextUtils.isEmpty(localbpy.b)) {
      localbpy.b = this.a.g().b();
    }
    if ((this.b) && (TextUtils.isEmpty(localbpy.d)))
    {
      paramcou = this.a.f();
      localbpy.d = paramcou.c();
      localbpy.e = paramcou.b();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */