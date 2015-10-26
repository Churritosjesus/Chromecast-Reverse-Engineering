final class boi
  implements bof
{
  int[] a;
  int[] b;
  
  public final int a(int paramInt)
  {
    return this.a[(paramInt % this.a.length)];
  }
  
  public final int b(int paramInt)
  {
    return this.b[(paramInt % this.b.length)];
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\boi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */