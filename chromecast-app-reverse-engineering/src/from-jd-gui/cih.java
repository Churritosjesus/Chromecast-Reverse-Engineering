import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.FeedbackOptions;

public final class cih
  implements Parcelable.Creator
{
  public static void a(FeedbackOptions paramFeedbackOptions, Parcel paramParcel, int paramInt)
  {
    int i = a.m(paramParcel, 20293);
    a.c(paramParcel, 1, paramFeedbackOptions.a);
    a.a(paramParcel, 2, paramFeedbackOptions.b, false);
    a.a(paramParcel, 3, paramFeedbackOptions.c, false);
    a.a(paramParcel, 5, paramFeedbackOptions.d, false);
    a.a(paramParcel, 6, paramFeedbackOptions.e, paramInt, false);
    a.a(paramParcel, 7, paramFeedbackOptions.f, false);
    a.a(paramParcel, 8, paramFeedbackOptions.g, paramInt, false);
    a.a(paramParcel, 9, paramFeedbackOptions.h, false);
    a.a(paramParcel, 10, paramFeedbackOptions.i, false);
    a.a(paramParcel, 11, paramFeedbackOptions.j);
    a.a(paramParcel, 12, paramFeedbackOptions.k, paramInt, false);
    a.a(paramParcel, 13, paramFeedbackOptions.l, paramInt, false);
    a.n(paramParcel, i);
  }
}


/* Location:              C:\DEV\android\dex2jar-2.1-SNAPSHOT\classes-dex2jar.jar!\cih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */