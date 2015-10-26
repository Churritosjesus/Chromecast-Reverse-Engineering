	private synthetic android.graphics.Bitmap a
	private synthetic android.os.Bundle g
	
	    cid(com.google.android.gms.common.api.GoogleApiClient p1, android.graphics.Bitmap p2, android.os.Bundle p3)
	    {
	        this.a = p2;
	        this.g = p3;
	        this(p1);
	        return;
	    }
	
	
	    protected final synthetic void a(bwc p5)
	    {
	        com.google.android.gms.common.api.Status v0_1 = new cif();
	        v0_1.a = this.a;
	        com.google.android.gms.feedback.ErrorReport v1_1 = this.g;
	        if (v1_1 != null) {
	            v0_1.b.putAll(v1_1);
	        }
	        ((ckz) ((cky) p5).o()).a(cky.a(com.google.android.gms.feedback.FeedbackOptions.a(com.google.android.gms.feedback.FeedbackOptions.a(com.google.android.gms.feedback.FeedbackOptions.a(com.google.android.gms.feedback.FeedbackOptions.a(com.google.android.gms.feedback.FeedbackOptions.c(com.google.android.gms.feedback.FeedbackOptions.a(com.google.android.gms.feedback.FeedbackOptions.b(com.google.android.gms.feedback.FeedbackOptions.a(com.google.android.gms.feedback.FeedbackOptions.a(new com.google.android.gms.feedback.FeedbackOptions(), v0_1.a), 0), 0), v0_1.b), 0), v0_1.c), 0), 0), 0), ((cky) p5).a.getCacheDir()));
	        this.a(com.google.android.gms.common.api.Status.a);
	        return;
	    }
	
