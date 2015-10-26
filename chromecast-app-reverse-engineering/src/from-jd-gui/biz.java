import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

final class biz
  implements MediaPlayer.OnPreparedListener
{
  biz(biy parambiy, int paramInt) {}
  
  public final void onPrepared(MediaPlayer paramMediaPlayer)
  {
    if (biy.a(this.b) != null)
    {
      biy.a(this.b, true);
      biy.b(this.b).seekTo(this.a);
      biy.c(this.b);
      biy.a(this.b).g();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\biz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */