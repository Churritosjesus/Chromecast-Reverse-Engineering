import java.util.TimeZone;

public final class bvj
{
  public int a = bvh.a(this.h);
  public String b = bvh.b(this.h);
  public String c = bvh.c(this.h);
  public String d = bvh.d(this.h);
  public final bvk e;
  public final cmy f = new cmy();
  public boolean g = false;
  
  public bvj(bvh parambvh, bvk parambvk)
  {
    this(parambvh, null, parambvk);
  }
  
  private bvj(bvh parambvh, byte[] paramArrayOfByte, bvk parambvk)
  {
    this.c = bvh.c(parambvh);
    this.d = bvh.d(parambvh);
    this.f.a = bvh.e(parambvh).a();
    paramArrayOfByte = this.f;
    bvh.f(parambvh);
    long l = this.f.a;
    paramArrayOfByte.c = (TimeZone.getDefault().getOffset(l) / 1000);
    this.e = parambvk;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bvj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */