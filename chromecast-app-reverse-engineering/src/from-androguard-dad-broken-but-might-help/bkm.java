	static final  b
	public final android.util.LruCache a
	private final bkl c
	
	    static bkm()
	    {
	        bkm.b = java.util.concurrent.TimeUnit.DAYS.toMillis(1);
	        return;
	    }
	
	
	    public bkm()
	    {
	        this(bkl.a());
	        return;
	    }
	
	
	    private bkm(bkl p3)
	    {
	        this.a = new android.util.LruCache(100);
	        this.c = p3;
	        return;
	    }
	
	
	    static synthetic bkl a(bkm p1)
	    {
	        return p1.c;
	    }
	
	
	    public final dbi a(String p9)
	    {
	        try {
	            dbi v0_4;
	            dbi v0_2 = ((bkn) this.a.get(p9));
	        } catch (dbi v0_6) {
	            throw v0_6;
	        }
	        if (v0_2 != null) {
	            int v2_2;
	            if ((v0_2.a - bkl.b()) > 0) {
	                v2_2 = 0;
	            } else {
	                v2_2 = 1;
	            }
	            if (v2_2 == 0) {
	                v0_4 = ((dbi) v0_2.b);
	            } else {
	                this.a.remove(p9);
	                v0_4 = 0;
	            }
	        } else {
	            v0_4 = 0;
	        }
	        return v0_4;
	    }
	
