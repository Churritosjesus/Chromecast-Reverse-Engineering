final class cwm
  implements cxx
{
  cwm(cwl paramcwl) {}
  
  public final void a(cvk paramcvk)
  {
    cwl.a(this.a, paramcvk.a);
  }
  
  public final void b(cvk paramcvk)
  {
    cwl.a(this.a, paramcvk.a);
    cuh.e("Permanent failure dispatching hitId: " + paramcvk.a);
  }
  
  public final void c(cvk paramcvk)
  {
    long l = paramcvk.b;
    if (l == 0L) {
      cwl.a(this.a, paramcvk.a, cwl.a(this.a).a());
    }
    for (;;)
    {
      return;
      if (l + 14400000L < cwl.a(this.a).a())
      {
        cwl.a(this.a, paramcvk.a);
        cuh.e("Giving up on failed hitId: " + paramcvk.a);
      }
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cwm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */