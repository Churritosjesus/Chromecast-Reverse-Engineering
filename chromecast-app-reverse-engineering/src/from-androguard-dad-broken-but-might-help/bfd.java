	public static final  c
	private final blp a
	 bfq d
	final java.lang.Object e
	public  f
	
	    static bfd()
	    {
	        bfd.c = ((int) java.util.concurrent.TimeUnit.SECONDS.toMillis(10));
	        return;
	    }
	
	
	    public bfd()
	    {
	        this.e = new Object();
	        this.a = new blp("NetworkRequest", 0);
	        return;
	    }
	
	
	    private static bfq a(int p2)
	    {
	        return new bfr(com.google.android.apps.chromecast.app.SetupApplication.a().i, p2, p2);
	    }
	
	
	    public final bfq a(android.net.Uri p2, int p3)
	    {
	        return this.a(p2, 0, p3);
	    }
	
	
	    protected final bfq a(android.net.Uri p4, bfc p5, int p6)
	    {
	        Throwable v0_1 = new Object[1];
	        v0_1[0] = p4;
	        Throwable v0_2 = bfd.a(p6);
	        v0_2.a("Origin", "https://www.google.com");
	        try {
	        } catch (Throwable v0_6) {
	            this.d = 0;
	            throw v0_6;
	        } catch (Throwable v0_4) {
	            Object v1_3 = new Object[1];
	            v1_3[0] = v0_4;
	            throw v0_4;
	        } catch (Throwable v0_5) {
	            Object v1_5 = new Object[1];
	            v1_5[0] = v0_5;
	            throw v0_5;
	        }
	        this.d = v0_2;
	        v0_2.a(p4, p5);
	        this.d = 0;
	        return v0_2;
	    }
	
	
	    protected final bfq a(android.net.Uri p5, java.util.Map p6, int p7)
	    {
	        Throwable v0_1 = new Object[1];
	        v0_1[0] = p5;
	        int v2_0 = bfd.a(p7);
	        v2_0.a("Origin", "https://www.google.com");
	        if (p6 != null) {
	            java.util.Iterator v3 = p6.keySet().iterator();
	            while (v3.hasNext()) {
	                Throwable v0_13 = ((String) v3.next());
	                v2_0.a(v0_13, ((String) p6.get(v0_13)));
	            }
	        }
	        try {
	        } catch (Throwable v0_7) {
	            Object v1_3 = new Object[1];
	            v1_3[0] = v0_7;
	            throw v0_7;
	        } catch (Throwable v0_9) {
	            this.d = 0;
	            throw v0_9;
	        } catch (Throwable v0_8) {
	            Object v1_5 = new Object[1];
	            v1_5[0] = v0_8;
	            throw v0_8;
	        }
	        this.d = v2_0;
	        v2_0.a(p5);
	        this.d = 0;
	        return v2_0;
	    }
	
