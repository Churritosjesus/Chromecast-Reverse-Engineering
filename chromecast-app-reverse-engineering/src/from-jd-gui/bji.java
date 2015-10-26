final class bji
  implements Runnable
{
  bji(bjh parambjh) {}
  
  public final void run()
  {
    if (bjh.a(this.a) != null)
    {
      bdu localbdu = bjh.b(this.a).z();
      bjh localbjh = this.a;
      long l = localbdu.d();
      bdq localbdq = new bdq(localbdu.d, 144, localbdu.c);
      localbdq.h = 1;
      localbdu.a("pollOtaStatus", l, localbdq, bew.c, new bet(localbdu, localbjh, localbdq));
    }
    for (;;)
    {
      return;
      bjh.c(this.a);
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */