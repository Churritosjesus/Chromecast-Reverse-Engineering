import java.util.List;
import java.util.Map;

final class dii
{
  private final djz a;
  
  dii(djz paramdjz)
  {
    this.a = paramdjz;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2) {
      this.a.b(paramInt1 | 0x0);
    }
    for (;;)
    {
      return;
      this.a.b(paramInt2 | 0x0);
      paramInt1 -= paramInt2;
      while (paramInt1 >= 128)
      {
        this.a.b(paramInt1 & 0x7F | 0x80);
        paramInt1 >>>= 7;
      }
      this.a.b(paramInt1);
    }
  }
  
  private void a(dke paramdke)
  {
    a(paramdke.b.length, 127, 0);
    this.a.a(paramdke);
  }
  
  final void a(List paramList)
  {
    int j = paramList.size();
    int i = 0;
    if (i < j)
    {
      dke localdke = ((die)paramList.get(i)).h.c();
      Integer localInteger = (Integer)dig.b().get(localdke);
      if (localInteger != null)
      {
        a(localInteger.intValue() + 1, 15, 0);
        a(((die)paramList.get(i)).i);
      }
      for (;;)
      {
        i++;
        break;
        this.a.b(0);
        a(localdke);
        a(((die)paramList.get(i)).i);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dii.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */