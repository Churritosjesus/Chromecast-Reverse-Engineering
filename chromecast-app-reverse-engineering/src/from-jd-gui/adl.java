final class adl
  implements Runnable
{
  private final ads a;
  private final ady b;
  private final Runnable c;
  
  public adl(aeb paramaeb, ads paramads, ady paramady, Runnable paramRunnable)
  {
    this.a = paramads;
    this.b = paramady;
    this.c = paramRunnable;
  }
  
  public final void run()
  {
    if (this.a.g) {
      this.a.b("canceled-at-delivery");
    }
    label32:
    label50:
    label93:
    label110:
    label120:
    for (;;)
    {
      return;
      int i;
      if (this.b.c == null)
      {
        i = 1;
        if (i == 0) {
          break label93;
        }
        this.a.a(this.b.a);
        if (!this.b.d) {
          break label110;
        }
        this.a.a("intermediate-response");
      }
      for (;;)
      {
        if (this.c == null) {
          break label120;
        }
        this.c.run();
        break;
        i = 0;
        break label32;
        this.a.b(this.b.c);
        break label50;
        this.a.b("done");
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\adl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */