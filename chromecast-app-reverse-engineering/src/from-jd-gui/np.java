final class np
  implements Runnable
{
  np(no paramno) {}
  
  public final void run()
  {
    if ((this.a.u & 0x1) != 0) {
      no.a(this.a, 0);
    }
    if ((this.a.u & 0x100) != 0) {
      no.a(this.a, 8);
    }
    this.a.t = false;
    this.a.u = 0;
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\np.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */