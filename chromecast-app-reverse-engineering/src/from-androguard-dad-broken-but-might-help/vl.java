	private static final java.util.ArrayList i
	private final android.media.AudioManager j
	private final vn k
	private  l
	
	    static vl()
	    {
	        android.content.IntentFilter v0_1 = new android.content.IntentFilter();
	        v0_1.addCategory("android.media.intent.category.LIVE_AUDIO");
	        v0_1.addCategory("android.media.intent.category.LIVE_VIDEO");
	        java.util.ArrayList v1_3 = new java.util.ArrayList();
	        vl.i = v1_3;
	        v1_3.add(v0_1);
	        return;
	    }
	
	
	    public vl(android.content.Context p4)
	    {
	        this(p4);
	        this.l = -1;
	        this.j = ((android.media.AudioManager) p4.getSystemService("audio"));
	        this.k = new vn(this);
	        p4.registerReceiver(this.k, new android.content.IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
	        this.a();
	        return;
	    }
	
	
	    static synthetic android.media.AudioManager a(vl p1)
	    {
	        return p1.j;
	    }
	
	
	    private void a()
	    {
	        tv v0_1 = this.a.getResources();
	        tw v1_1 = this.j.getStreamMaxVolume(3);
	        this.l = this.j.getStreamVolume(3);
	        this.a(new tw().a(new to("DEFAULT_ROUTE", v0_1.getString(a.cq)).a(vl.i).b(3).a(0).e(1).d(v1_1).c(this.l).a()).a());
	        return;
	    }
	
	
	    static synthetic void b(vl p0)
	    {
	        p0.a();
	        return;
	    }
	
	
	    static synthetic int c(vl p1)
	    {
	        return p1.l;
	    }
	
	
	    public final tu a(String p2)
	    {
	        int v0_2;
	        if (!p2.equals("DEFAULT_ROUTE")) {
	            v0_2 = 0;
	        } else {
	            v0_2 = new vm(this);
	        }
	        return v0_2;
	    }
	
