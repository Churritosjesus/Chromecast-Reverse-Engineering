	private android.widget.ListAdapter Z
	 android.widget.ListView a
	private android.view.View aa
	private android.widget.TextView ab
	private android.view.View ac
	private android.view.View ad
	private  ae
	private final android.os.Handler b
	private final java.lang.Runnable c
	private final android.widget.AdapterView$OnItemClickListener d
	
	    public am()
	    {
	        this.b = new android.os.Handler();
	        this.c = new an(this);
	        this.d = new ao(this);
	        return;
	    }
	
	
	    private void a(boolean p7, boolean p8)
	    {
	        this.p();
	        if (this.ac != null) {
	            if (this.ae != p7) {
	                this.ae = p7;
	                if (!p7) {
	                    if (!p8) {
	                        this.ac.clearAnimation();
	                        this.ad.clearAnimation();
	                    } else {
	                        this.ac.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.y, 17432576));
	                        this.ad.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.y, 17432577));
	                    }
	                    this.ac.setVisibility(0);
	                    this.ad.setVisibility(8);
	                } else {
	                    if (!p8) {
	                        this.ac.clearAnimation();
	                        this.ad.clearAnimation();
	                    } else {
	                        this.ac.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.y, 17432577));
	                        this.ad.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.y, 17432576));
	                    }
	                    this.ac.setVisibility(8);
	                    this.ad.setVisibility(0);
	                }
	            }
	            return;
	        } else {
	            throw new IllegalStateException("Can\'t be used with a custom content view");
	        }
	    }
	
	
	    private void p()
	    {
	        int v3 = 0;
	        if (this.a == null) {
	            android.os.IBinder v0_1 = this.N;
	            if (v0_1 != null) {
	                if (!(v0_1 instanceof android.widget.ListView)) {
	                    this.ab = ((android.widget.TextView) v0_1.findViewById(16711681));
	                    if (this.ab != null) {
	                        this.ab.setVisibility(8);
	                    } else {
	                        this.aa = v0_1.findViewById(16908292);
	                    }
	                    this.ac = v0_1.findViewById(16711682);
	                    this.ad = v0_1.findViewById(16711683);
	                    android.os.IBinder v0_2 = v0_1.findViewById(16908298);
	                    if ((v0_2 instanceof android.widget.ListView)) {
	                        this.a = ((android.widget.ListView) v0_2);
	                        if (this.aa != null) {
	                            this.a.setEmptyView(this.aa);
	                        }
	                    } else {
	                        if (v0_2 != null) {
	                            throw new RuntimeException("Content has view with id attribute \'android.R.id.list\' that is not a ListView class");
	                        } else {
	                            throw new RuntimeException("Your content must have a ListView whose id attribute is \'android.R.id.list\'");
	                        }
	                    }
	                } else {
	                    this.a = ((android.widget.ListView) v0_1);
	                }
	                this.ae = 1;
	                this.a.setOnItemClickListener(this.d);
	                if (this.Z == null) {
	                    if (this.ac != null) {
	                        this.a(0, 0);
	                    }
	                } else {
	                    android.os.IBinder v0_16;
	                    boolean v1_18 = this.Z;
	                    this.Z = 0;
	                    if (this.Z == null) {
	                        v0_16 = 0;
	                    } else {
	                        v0_16 = 1;
	                    }
	                    this.Z = v1_18;
	                    if (this.a != null) {
	                        this.a.setAdapter(v1_18);
	                        if ((!this.ae) && (v0_16 == null)) {
	                            if (this.N.getWindowToken() != null) {
	                                v3 = 1;
	                            }
	                            this.a(1, v3);
	                        }
	                    }
	                }
	                this.b.post(this.c);
	            } else {
	                throw new IllegalStateException("Content view not yet created");
	            }
	        }
	        return;
	    }
	
	
	    public android.view.View a(android.view.LayoutInflater p10, android.view.ViewGroup p11, android.os.Bundle p12)
	    {
	        android.widget.FrameLayout$LayoutParams v0_0 = this.y;
	        android.widget.FrameLayout v1_1 = new android.widget.FrameLayout(v0_0);
	        android.widget.FrameLayout v2_1 = new android.widget.LinearLayout(v0_0);
	        v2_1.setId(16711682);
	        v2_1.setOrientation(1);
	        v2_1.setVisibility(8);
	        v2_1.setGravity(17);
	        v2_1.addView(new android.widget.ProgressBar(v0_0, 0, 16842874), new android.widget.FrameLayout$LayoutParams(-2, -2));
	        v1_1.addView(v2_1, new android.widget.FrameLayout$LayoutParams(-1, -1));
	        android.widget.FrameLayout v2_3 = new android.widget.FrameLayout(v0_0);
	        v2_3.setId(16711683);
	        android.widget.FrameLayout$LayoutParams v0_3 = new android.widget.TextView(this.y);
	        v0_3.setId(16711681);
	        v0_3.setGravity(17);
	        v2_3.addView(v0_3, new android.widget.FrameLayout$LayoutParams(-1, -1));
	        android.widget.FrameLayout$LayoutParams v0_5 = new android.widget.ListView(this.y);
	        v0_5.setId(16908298);
	        v0_5.setDrawSelectorOnTop(0);
	        v2_3.addView(v0_5, new android.widget.FrameLayout$LayoutParams(-1, -1));
	        v1_1.addView(v2_3, new android.widget.FrameLayout$LayoutParams(-1, -1));
	        v1_1.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-1, -1));
	        return v1_1;
	    }
	
	
	    public void a(android.view.View p1, int p2)
	    {
	        return;
	    }
	
	
	    public final void a(android.view.View p1, android.os.Bundle p2)
	    {
	        super.a(p1, p2);
	        this.p();
	        return;
	    }
	
	
	    public final void d()
	    {
	        this.b.removeCallbacks(this.c);
	        this.a = 0;
	        this.ae = 0;
	        this.ad = 0;
	        this.ac = 0;
	        this.aa = 0;
	        this.ab = 0;
	        super.d();
	        return;
	    }
	
