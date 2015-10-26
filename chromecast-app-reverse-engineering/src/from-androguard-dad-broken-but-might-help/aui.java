	private final aea n
	private final java.lang.String o
	
	    public aui(String p7, String p8, String p9, aea p10)
	    {
	        auj v3_1 = new Object[1];
	        v3_1[0] = blj.c();
	        this("LoadCardDataRequest", asr.a(p7, String.format(java.util.Locale.US, "/gsse?rt=b&hl=%s", v3_1)), ((dcs) dcs.b().b(p9).a("E8C28D3C").c()).e(), new auj());
	        this.n = p10;
	        this.o = p8;
	        return;
	    }
	
	
	    protected final synthetic void a(Object p5)
	    {
	        try {
	            this.n.a(dcu.a(((byte[]) p5)));
	        } catch (String v0_1) {
	            String v0_3 = String.valueOf(v0_1.getMessage());
	            if (v0_3.length() == 0) {
	                String v0_5 = new String("Failed to parse sse response proto: ");
	            } else {
	                v0_5 = "Failed to parse sse response proto: ".concat(v0_3);
	            }
	            android.util.Log.w("LoadCardDataRequest", v0_5);
	        }
	        return;
	    }
	
	
	    public final String g()
	    {
	        return 0;
	    }
	
	
	    public final String h()
	    {
	        return this.o;
	    }
	
