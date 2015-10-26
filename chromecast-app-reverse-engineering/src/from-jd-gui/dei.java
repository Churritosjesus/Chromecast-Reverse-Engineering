final class dei
  implements ddm
{
  private final deh a;
  private ddm b;
  private int c;
  
  dei(deg paramdeg)
  {
    this.a = new deh(paramdeg);
    this.b = this.a.a().a();
    this.c = 0;
  }
  
  public final byte a()
  {
    if (!this.b.hasNext()) {
      this.b = this.a.a().a();
    }
    this.c -= 1;
    return this.b.a();
  }
  
  public final boolean hasNext()
  {
    if (this.c > 0) {}
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\dei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */