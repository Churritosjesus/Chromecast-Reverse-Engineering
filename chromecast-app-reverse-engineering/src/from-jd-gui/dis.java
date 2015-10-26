import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class dis
{
  int a;
  final dkd b = dkk.a(this.c);
  private final dkj c = new dkj(new dit(this, paramdkd), new diu(this));
  
  public dis(dkd paramdkd) {}
  
  private dke a()
  {
    int i = this.b.i();
    return this.b.c(i);
  }
  
  public final List a(int paramInt)
  {
    this.a += paramInt;
    int i = this.b.i();
    if (i < 0) {
      throw new IOException("numberOfPairs < 0: " + i);
    }
    if (i > 1024) {
      throw new IOException("numberOfPairs > 1024: " + i);
    }
    ArrayList localArrayList = new ArrayList(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      dke localdke2 = a().c();
      dke localdke1 = a();
      if (localdke2.b.length == 0) {
        throw new IOException("name.size == 0");
      }
      localArrayList.add(new die(localdke2, localdke1));
    }
    if (this.a > 0)
    {
      this.c.b();
      if (this.a != 0) {
        throw new IOException("compressedLimit > 0: " + this.a);
      }
    }
    return localArrayList;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dis.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */