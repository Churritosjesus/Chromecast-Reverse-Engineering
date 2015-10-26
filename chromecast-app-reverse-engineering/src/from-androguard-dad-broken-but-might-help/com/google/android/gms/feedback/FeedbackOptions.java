	public static final android.os.Parcelable$Creator CREATOR
	public final  a
	public java.lang.String b
	public android.os.Bundle c
	public java.lang.String d
	public android.app.ApplicationErrorReport e
	public java.lang.String f
	public com.google.android.gms.common.data.BitmapTeleporter g
	public java.lang.String h
	public java.util.ArrayList i
	public  j
	public com.google.android.gms.feedback.ThemeSettings k
	public com.google.android.gms.feedback.LogOptions l
	
	    static FeedbackOptions()
	    {
	        com.google.android.gms.feedback.FeedbackOptions.CREATOR = new cih();
	        return;
	    }
	
	
	    public FeedbackOptions()
	    {
	        this(3, 0, 0, 0, new android.app.ApplicationErrorReport(), 0, 0, 0, 0, 1, 0, 0);
	        return;
	    }
	
	
	    public FeedbackOptions(int p1, String p2, android.os.Bundle p3, String p4, android.app.ApplicationErrorReport p5, String p6, com.google.android.gms.common.data.BitmapTeleporter p7, String p8, java.util.ArrayList p9, boolean p10, com.google.android.gms.feedback.ThemeSettings p11, com.google.android.gms.feedback.LogOptions p12)
	    {
	        this.a = p1;
	        this.b = p2;
	        this.c = p3;
	        this.d = p4;
	        this.e = p5;
	        this.f = p6;
	        this.g = p7;
	        this.h = p8;
	        this.i = p9;
	        this.j = p10;
	        this.k = p11;
	        this.l = p12;
	        return;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions a(com.google.android.gms.feedback.FeedbackOptions p1, android.graphics.Bitmap p2)
	    {
	        if (p2 != null) {
	            p1.g = new com.google.android.gms.common.data.BitmapTeleporter(p2);
	        }
	        return p1;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions a(com.google.android.gms.feedback.FeedbackOptions p0, android.os.Bundle p1)
	    {
	        p0.c = p1;
	        return p0;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions a(com.google.android.gms.feedback.FeedbackOptions p0, com.google.android.gms.feedback.LogOptions p1)
	    {
	        p0.l = p1;
	        return p0;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions a(com.google.android.gms.feedback.FeedbackOptions p0, com.google.android.gms.feedback.ThemeSettings p1)
	    {
	        p0.k = p1;
	        return p0;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions a(com.google.android.gms.feedback.FeedbackOptions p0, String p1)
	    {
	        p0.b = p1;
	        return p0;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions a(com.google.android.gms.feedback.FeedbackOptions p0, java.util.ArrayList p1)
	    {
	        p0.i = p1;
	        return p0;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions a(com.google.android.gms.feedback.FeedbackOptions p0, boolean p1)
	    {
	        p0.j = p1;
	        return p0;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions b(com.google.android.gms.feedback.FeedbackOptions p0, String p1)
	    {
	        p0.d = p1;
	        return p0;
	    }
	
	
	    public static synthetic com.google.android.gms.feedback.FeedbackOptions c(com.google.android.gms.feedback.FeedbackOptions p0, String p1)
	    {
	        p0.f = p1;
	        return p0;
	    }
	
	
	    public final android.app.ApplicationErrorReport$CrashInfo a()
	    {
	        android.app.ApplicationErrorReport$CrashInfo v0_2;
	        if (this.e != null) {
	            v0_2 = this.e.crashInfo;
	        } else {
	            v0_2 = 0;
	        }
	        return v0_2;
	    }
	
	
	    public int describeContents()
	    {
	        return 0;
	    }
	
	
	    public void writeToParcel(android.os.Parcel p1, int p2)
	    {
	        cih.a(this, p1, p2);
	        return;
	    }
	
