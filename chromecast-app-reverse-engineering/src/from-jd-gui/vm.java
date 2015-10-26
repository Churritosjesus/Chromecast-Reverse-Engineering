import android.media.AudioManager;

final class vm
  extends tu
{
  vm(vl paramvl) {}
  
  public final void b(int paramInt)
  {
    vl.a(this.a).setStreamVolume(3, paramInt, 0);
    vl.b(this.a);
  }
  
  public final void c(int paramInt)
  {
    int i = vl.a(this.a).getStreamVolume(3);
    if (Math.min(vl.a(this.a).getStreamMaxVolume(3), Math.max(0, i + paramInt)) != i) {
      vl.a(this.a).setStreamVolume(3, i, 0);
    }
    vl.b(this.a);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\vm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */