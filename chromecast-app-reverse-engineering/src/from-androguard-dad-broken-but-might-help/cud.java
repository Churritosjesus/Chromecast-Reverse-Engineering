	private static cud a
	private static final java.lang.Object b
	private cwq c
	private cvl d
	
	    static cud()
	    {
	        cud.b = new Object();
	        return;
	    }
	
	
	    private cud(android.content.Context p3)
	    {
	        this(cvm.a(p3), new cxs());
	        return;
	    }
	
	
	    private cud(cvl p1, cwq p2)
	    {
	        this.d = p1;
	        this.c = p2;
	        return;
	    }
	
	
	    public static cuf a(android.content.Context p2)
	    {
	        try {
	            if (cud.a == null) {
	                cud.a = new cud(p2);
	            }
	        } catch (cud v0_4) {
	            throw v0_4;
	        }
	        return cud.a;
	    }
	
	
	    public final boolean a(String p2)
	    {
	        int v0_3;
	        if (this.c.a()) {
	            this.d.a(p2);
	            v0_3 = 1;
	        } else {
	            cuh.b("Too many urls sent too quickly with the TagManagerSender, rate limiting invoked.");
	            v0_3 = 0;
	        }
	        return v0_3;
	    }
	
