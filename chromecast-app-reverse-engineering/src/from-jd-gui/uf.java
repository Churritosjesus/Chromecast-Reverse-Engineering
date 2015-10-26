import java.util.ArrayList;

final class uf
  extends tr
{
  uf(uc paramuc) {}
  
  public final void a(tq paramtq, tv paramtv)
  {
    uc localuc = this.a;
    int i = localuc.c(paramtq);
    if (i >= 0) {
      localuc.a((ug)localuc.d.get(i), paramtv);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\uf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */