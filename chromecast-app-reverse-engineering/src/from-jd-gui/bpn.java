final class bpn
  implements Runnable
{
  bpn(bpk parambpk, int paramInt, bql parambql) {}
  
  public final void run()
  {
    boolean bool = this.c.stopSelfResult(this.a);
    if (bool) {
      this.b.a("Install campaign broadcast processed", Boolean.valueOf(bool));
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */