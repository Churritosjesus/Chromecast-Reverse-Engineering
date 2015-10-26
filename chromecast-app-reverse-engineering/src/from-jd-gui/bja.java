import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

final class bja
  implements MediaPlayer.OnCompletionListener
{
  bja(biy parambiy) {}
  
  public final void onCompletion(MediaPlayer paramMediaPlayer)
  {
    if (biy.a(this.a) != null)
    {
      biy.c(this.a);
      biy.a(this.a).h();
    }
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\bja.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */