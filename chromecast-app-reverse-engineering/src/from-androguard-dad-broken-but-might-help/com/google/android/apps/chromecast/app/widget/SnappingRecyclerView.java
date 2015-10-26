	public  s
	private  t
	
	    public SnappingRecyclerView(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    public SnappingRecyclerView(android.content.Context p2, android.util.AttributeSet p3)
	    {
	        this(p2, p3, 0);
	        return;
	    }
	
	
	    public SnappingRecyclerView(android.content.Context p2, android.util.AttributeSet p3, int p4)
	    {
	        this(p2, p3, p4);
	        this.t = 0;
	        this.o = new boj(this);
	        return;
	    }
	
	
	    public static synthetic int a(com.google.android.apps.chromecast.app.widget.SnappingRecyclerView p1)
	    {
	        return p1.t;
	    }
	
	
	    public static synthetic int a(com.google.android.apps.chromecast.app.widget.SnappingRecyclerView p0, int p1)
	    {
	        p0.t = p1;
	        return p1;
	    }
	
	
	    public final boolean b(int p8, int p9)
	    {
	        int v0_8 = ((int) (Math.exp((Math.log(((Math.abs(((double) p8)) * 0.3499999940395355) / (((double) android.view.ViewConfiguration.getScrollFriction()) * 1000000.0))) * 1.7352941743642858)) * (((double) android.view.ViewConfiguration.getScrollFriction()) * 1000000.0)));
	        if (p8 <= 0) {
	            v0_8 = (- v0_8);
	        }
	        int v0_12;
	        int v0_9 = (v0_8 + this.t);
	        if ((v0_9 % this.s) >= (this.s / 2)) {
	            v0_12 = Math.max(((v0_9 / this.s) + 1), 0);
	        } else {
	            v0_12 = Math.max((v0_9 / this.s), 0);
	        }
	        this.a(((v0_12 * this.s) - this.t), 0);
	        return 1;
	    }
	
