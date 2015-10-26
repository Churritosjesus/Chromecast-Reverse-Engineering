	final android.content.Context k
	final com.google.android.apps.chromecast.app.widget.ReusableImageView l
	final android.widget.TextView m
	final android.widget.TextView n
	final android.widget.TextView o
	final android.widget.TextView p
	final android.widget.TextView q
	final  r
	private final blp s
	
	    public axo(android.content.Context p3, android.view.View p4, int p5, int p6)
	    {
	        this(p4);
	        this.s = new blp("ContentThumbnailViewHolder");
	        this.k = p3;
	        this.m = ((android.widget.TextView) p4.findViewById(f.em));
	        this.n = ((android.widget.TextView) p4.findViewById(f.ed));
	        this.o = ((android.widget.TextView) p4.findViewById(f.ee));
	        this.p = ((android.widget.TextView) p4.findViewById(f.v));
	        this.l = ((com.google.android.apps.chromecast.app.widget.ReusableImageView) p4.findViewById(f.al));
	        this.q = ((android.widget.TextView) p4.findViewById(f.aZ));
	        android.view.ViewGroup$LayoutParams v0_20 = p4.getLayoutParams();
	        v0_20.height = p6;
	        p4.setLayoutParams(v0_20);
	        this.r = p5;
	        return;
	    }
	
