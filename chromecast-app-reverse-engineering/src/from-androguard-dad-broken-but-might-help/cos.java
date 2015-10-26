	private static final android.net.Uri a
	private final android.util.LogPrinter b
	
	    static cos()
	    {
	        android.net.Uri v0_1 = new android.net.Uri$Builder();
	        v0_1.scheme("uri");
	        v0_1.authority("local");
	        cos.a = v0_1.build();
	        return;
	    }
	
	
	    public cos()
	    {
	        this.b = new android.util.LogPrinter(4, "GA/LogCatTransport");
	        return;
	    }
	
	
	    public final android.net.Uri a()
	    {
	        return cos.a;
	    }
	
	
	    public final void a(cou p5)
	    {
	        android.util.LogPrinter v0_1 = new java.util.ArrayList(p5.h.values());
	        java.util.Collections.sort(v0_1, new cot(this));
	        String v1_5 = new StringBuilder();
	        java.util.Iterator v2 = v0_1.iterator();
	        while (v2.hasNext()) {
	            android.util.LogPrinter v0_6 = ((cov) v2.next()).toString();
	            if (!android.text.TextUtils.isEmpty(v0_6)) {
	                if (v1_5.length() != 0) {
	                    v1_5.append(", ");
	                }
	                v1_5.append(v0_6);
	            }
	        }
	        this.b.println(v1_5.toString());
	        return;
	    }
	
