	public android.content.Context a
	
	    public cky(android.content.Context p8, android.os.Looper p9, bwg p10, bwh p11, byl p12)
	    {
	        this(p8, p9, 29, p10, p11, p12);
	        this.a = p8;
	        return;
	    }
	
	
	    public static com.google.android.gms.feedback.ErrorReport a(com.google.android.gms.feedback.FeedbackOptions p3, java.io.File p4)
	    {
	        String v1_1 = new com.google.android.gms.feedback.ErrorReport();
	        if (p3 != null) {
	            if ((p3.c != null) && (p3.c.size() > 0)) {
	                v1_1.E = p3.c;
	            }
	            if (!android.text.TextUtils.isEmpty(p3.b)) {
	                v1_1.C = p3.b;
	            }
	            if (!android.text.TextUtils.isEmpty(p3.d)) {
	                v1_1.c = p3.d;
	            }
	            if (p3.a() != null) {
	                v1_1.N = p3.a().throwMethodName;
	                v1_1.L = p3.a().throwLineNumber;
	                v1_1.M = p3.a().throwClassName;
	                v1_1.O = p3.a().stackTrace;
	                v1_1.J = p3.a().exceptionClassName;
	                v1_1.P = p3.a().exceptionMessage;
	                v1_1.K = p3.a().throwFileName;
	            }
	            if (p3.k != null) {
	                v1_1.Z = p3.k;
	            }
	            if (!android.text.TextUtils.isEmpty(p3.f)) {
	                v1_1.Q = p3.f;
	            }
	            if (!android.text.TextUtils.isEmpty(p3.h)) {
	                v1_1.b.packageName = p3.h;
	            }
	            if ((p3.g != null) && (p4 != null)) {
	                v1_1.T = p3.g;
	                if (p4 != null) {
	                    v1_1.T.d = p4;
	                } else {
	                    throw new NullPointerException("Cannot set null temp directory");
	                }
	            }
	            if ((p3.i != null) && ((p3.i.size() != 0) && (p4 != null))) {
	                com.google.android.gms.feedback.FileTeleporter[] v2_1 = p3.i.iterator();
	                while (v2_1.hasNext()) {
	                    if (p4 != null) {
	                        ((com.google.android.gms.feedback.FileTeleporter) v2_1.next()).e = p4;
	                    } else {
	                        throw new NullPointerException("Cannot set null temp directory");
	                    }
	                    return v1_1;
	                }
	                com.google.android.gms.feedback.FileTeleporter[] v2_4 = new com.google.android.gms.feedback.FileTeleporter[p3.i.size()];
	                v1_1.V = ((com.google.android.gms.feedback.FileTeleporter[]) p3.i.toArray(v2_4));
	            }
	            if (p3.l != null) {
	                v1_1.aa = p3.l;
	            }
	            v1_1.X = p3.j;
	        }
	        return v1_1;
	    }
	
	
	    protected final synthetic android.os.IInterface a(android.os.IBinder p2)
	    {
	        return cla.a(p2);
	    }
	
	
	    protected final String c()
	    {
	        return "com.google.android.gms.feedback.internal.IFeedbackService";
	    }
	
	
	    protected final String d()
	    {
	        return "com.google.android.gms.feedback.internal.IFeedbackService";
	    }
	
