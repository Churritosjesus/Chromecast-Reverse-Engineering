final class aqo
  implements btr
{
  aqo(aqm paramaqm) {}
  
  public final void a()
  {
    btj localbtj = aqj.c(this.a.a).a();
    aow localaow;
    atu localatu;
    if (localbtj != null)
    {
      localaow = aqj.b(this.a.a);
      localatu = localaow.o();
      if (localatu.d != null) {
        break label180;
      }
      localatu.d = new atv();
    }
    label160:
    label174:
    label180:
    for (int i = 1;; i = 0)
    {
      int j;
      if ((localbtj.d & 1L) != 0L)
      {
        j = 1;
        if (j == 0) {
          break label174;
        }
        if (localbtj.c != 3) {
          break label160;
        }
        j = 2;
      }
      for (;;)
      {
        if (localatu.d.a != j)
        {
          localatu.d.a = j;
          i = 1;
        }
        if (i != 0) {
          localaow.p();
        }
        aqj.h();
        aqj.b(this.a.a).g();
        aqj.b(this.a.a).o().a();
        return;
        j = 0;
        break;
        if (localbtj.c == 2) {
          j = 1;
        } else {
          j = 0;
        }
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\aqo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */