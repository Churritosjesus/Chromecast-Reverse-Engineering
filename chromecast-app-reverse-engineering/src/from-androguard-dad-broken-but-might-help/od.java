	private final tz a
	private final oe b
	private tx c
	private java.util.ArrayList d
	private of e
	private android.widget.ListView f
	private  g
	
	    public od(android.content.Context p2)
	    {
	        this(p2, 0);
	        return;
	    }
	
	
	    private od(android.content.Context p3, int p4)
	    {
	        this(a.a(p3), 0);
	        this.c = tx.c;
	        this.a = tz.a(this.getContext());
	        this.b = new oe(this);
	        return;
	    }
	
	
	    public final void a()
	    {
	        if (this.g) {
	            this.d.clear();
	            this.d.addAll(tz.a());
	            java.util.ArrayList v2 = this.d;
	            og v0_3 = v2.size();
	            while(true) {
	                og v1_1 = (v0_3 - 1);
	                if (v0_3 <= null) {
	                    break;
	                }
	                og v0_9;
	                og v0_7 = ((uh) v2.get(v1_1));
	                if ((v0_7.b()) || ((!v0_7.e) || (!v0_7.a(this.c)))) {
	                    v0_9 = 0;
	                } else {
	                    v0_9 = 1;
	                }
	                if (v0_9 != null) {
	                    v0_3 = v1_1;
	                } else {
	                    v2.remove(v1_1);
	                    v0_3 = v1_1;
	                }
	            }
	            java.util.Collections.sort(this.d, og.a);
	            this.e.notifyDataSetChanged();
	        }
	        return;
	    }
	
	
	    public final void a(tx p4)
	    {
	        if (p4 != null) {
	            if (!this.c.equals(p4)) {
	                this.c = p4;
	                if (this.g) {
	                    this.a.a(this.b);
	                    this.a.a(p4, this.b, 1);
	                }
	                this.a();
	            }
	            return;
	        } else {
	            throw new IllegalArgumentException("selector must not be null");
	        }
	    }
	
	
	    public final void onAttachedToWindow()
	    {
	        super.onAttachedToWindow();
	        this.g = 1;
	        this.a.a(this.c, this.b, 1);
	        this.a();
	        return;
	    }
	
	
	    protected final void onCreate(android.os.Bundle p5)
	    {
	        super.onCreate(p5);
	        this.getWindow().requestFeature(3);
	        this.setContentView(a.ck);
	        this.setTitle(a.cn);
	        this.getWindow().setFeatureDrawableResource(3, a.a(this.getContext(), a.ch));
	        this.d = new java.util.ArrayList();
	        this.e = new of(this, this.getContext(), this.d);
	        this.f = ((android.widget.ListView) this.findViewById(b.p));
	        this.f.setAdapter(this.e);
	        this.f.setOnItemClickListener(this.e);
	        this.f.setEmptyView(this.findViewById(16908292));
	        return;
	    }
	
	
	    public final void onDetachedFromWindow()
	    {
	        this.g = 0;
	        this.a.a(this.b);
	        super.onDetachedFromWindow();
	        return;
	    }
	
