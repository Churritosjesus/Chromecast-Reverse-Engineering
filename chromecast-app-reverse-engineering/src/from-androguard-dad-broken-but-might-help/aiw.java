	private static final java.util.HashMap a
	private final ags b
	private final java.lang.String c
	private java.lang.StringBuilder d
	private  e
	
	    static aiw()
	    {
	        aiw.a = new java.util.HashMap();
	        return;
	    }
	
	
	    public aiw(ags p4, String p5)
	    {
	        StringBuilder v0_5;
	        this.e = 3;
	        ajp.a(p5, "tag");
	        this.b = p4;
	        String v1 = String.valueOf("FacebookSDK.");
	        StringBuilder v0_3 = String.valueOf(p5);
	        if (v0_3.length() == 0) {
	            v0_5 = new String(v1);
	        } else {
	            v0_5 = v1.concat(v0_3);
	        }
	        this.c = v0_5;
	        this.d = new StringBuilder();
	        return;
	    }
	
	
	    public static void a(ags p4, int p5, String p6, String p7)
	    {
	        if (afv.a(p4)) {
	            Exception v0_3;
	            String v1 = aiw.c(p7);
	            if (p6.startsWith("FacebookSDK.")) {
	                v0_3 = p6;
	            } else {
	                String v2 = String.valueOf("FacebookSDK.");
	                Exception v0_5 = String.valueOf(p6);
	                if (v0_5.length() == 0) {
	                    v0_3 = new String(v2);
	                } else {
	                    v0_3 = v2.concat(v0_5);
	                }
	            }
	            android.util.Log.println(p5, v0_3, v1);
	            if (p4 == ags.f) {
	                new Exception().printStackTrace();
	            }
	        }
	        return;
	    }
	
	
	    public static void a(ags p1, String p2, String p3)
	    {
	        aiw.a(p1, 3, p2, p3);
	        return;
	    }
	
	
	    public static varargs void a(ags p2, String p3, String p4, Object[] p5)
	    {
	        if (afv.a(p2)) {
	            aiw.a(p2, 3, p3, String.format(p4, p5));
	        }
	        return;
	    }
	
	
	    public static declared_synchronized void a(String p2)
	    {
	        try {
	            if (!afv.a(ags.b)) {
	                aiw.a(p2, "ACCESS_TOKEN_REMOVED");
	            }
	        } catch (String v0_3) {
	            throw v0_3;
	        }
	        return;
	    }
	
	
	    private static declared_synchronized void a(String p2, String p3)
	    {
	        try {
	            aiw.a.put(p2, p3);
	            return;
	        } catch (Throwable v0_1) {
	            throw v0_1;
	        }
	    }
	
	
	    private static declared_synchronized String c(String p4)
	    {
	        try {
	            java.util.Iterator v3 = aiw.a.entrySet().iterator();
	        } catch (CharSequence v0_3) {
	            throw v0_3;
	        }
	        while (v3.hasNext()) {
	            CharSequence v0_5 = ((java.util.Map$Entry) v3.next());
	            p4 = p4.replace(((CharSequence) v0_5.getKey()), ((CharSequence) v0_5.getValue()));
	        }
	        return p4;
	    }
	
	
	    public final void a()
	    {
	        aiw.a(this.b, this.e, this.c, this.d.toString());
	        this.d = new StringBuilder();
	        return;
	    }
	
	
	    public final void a(String p4, Object p5)
	    {
	        Object[] v1_1 = new Object[2];
	        v1_1[0] = p4;
	        v1_1[1] = p5;
	        if (afv.a(this.b)) {
	            this.d.append(String.format("  %s:\t%s\n", v1_1));
	        }
	        return;
	    }
	
	
	    public final void b(String p2)
	    {
	        if (afv.a(this.b)) {
	            this.d.append(p2);
	        }
	        return;
	    }
	
