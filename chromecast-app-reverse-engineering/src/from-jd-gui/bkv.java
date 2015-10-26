final class bkv
{
  final boolean a;
  final blc b;
  
  private bkv(blc paramblc)
  {
    this(paramblc, false);
  }
  
  private bkv(blc paramblc, boolean paramBoolean)
  {
    this.b = paramblc;
    this.a = paramBoolean;
  }
  
  public static bkv a(String paramString)
  {
    if (paramString.length() == 0) {
      throw new IllegalArgumentException("separator may not be empty or null");
    }
    return new bkv(new bkw(paramString));
  }
  
  public final bkv a()
  {
    return new bkv(this.b, true);
  }
  
  public final Iterable a(CharSequence paramCharSequence)
  {
    return new bky(this, paramCharSequence);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bkv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */