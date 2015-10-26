	private java.lang.String a
	private akh b
	private akl c
	
	    public akq()
	    {
	        return;
	    }
	
	
	    static android.os.Bundle a(akl p2)
	    {
	        android.os.Bundle v0_1 = new android.os.Bundle();
	        v0_1.putParcelable("request", p2);
	        return v0_1;
	    }
	
	
	    static synthetic void a(akq p3, akn p4)
	    {
	        m v0_2;
	        p3.c = 0;
	        if (p4.a != akp.b) {
	            v0_2 = -1;
	        } else {
	            v0_2 = 0;
	        }
	        m v1_2 = new android.os.Bundle();
	        v1_2.putParcelable("com.facebook.LoginFragment:Result", p4);
	        android.content.Intent v2_2 = new android.content.Intent();
	        v2_2.putExtras(v1_2);
	        if (p3.f()) {
	            p3.y.setResult(v0_2, v2_2);
	            p3.y.finish();
	        }
	        return;
	    }
	
	
	    public final android.view.View a(android.view.LayoutInflater p4, android.view.ViewGroup p5, android.os.Bundle p6)
	    {
	        android.view.View v0_1 = p4.inflate(a.cZ, p5, 0);
	        this.b.e = new aks(this, v0_1);
	        return v0_1;
	    }
	
	
	    public final void a(int p3, int p4, android.content.Intent p5)
	    {
	        super.a(p3, p4, p5);
	        aky v0_0 = this.b;
	        if (v0_0.f != null) {
	            v0_0.c().a(p4, p5);
	        }
	        return;
	    }
	
	
	    public final void a(android.os.Bundle p3)
	    {
	        super.a(p3);
	        if (p3 == null) {
	            this.b = new akh(this);
	        } else {
	            this.b = ((akh) p3.getParcelable("loginClient"));
	            akl v0_5 = this.b;
	            if (v0_5.c == null) {
	                v0_5.c = this;
	            } else {
	                throw new afq("Can\'t set fragment once it is already set.");
	            }
	        }
	        this.b.d = new akr(this);
	        akl v0_7 = this.y;
	        if (v0_7 != null) {
	            String v1_3 = v0_7.getCallingActivity();
	            if (v1_3 != null) {
	                this.a = v1_3.getPackageName();
	            }
	            if (v0_7.getIntent() != null) {
	                this.c = ((akl) v0_7.getIntent().getParcelableExtra("request"));
	            }
	        }
	        return;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        super.e(p3);
	        p3.putParcelable("loginClient", this.b);
	        return;
	    }
	
	
	    public final void j()
	    {
	        super.j();
	        if (this.a != null) {
	            java.util.ArrayList v0_3;
	            String v1_0 = this.b;
	            aky[] v2_0 = this.c;
	            if ((v1_0.f == null) || (v1_0.b < 0)) {
	                v0_3 = 0;
	            } else {
	                v0_3 = 1;
	            }
	            if ((v0_3 == null) && (v2_0 != null)) {
	                if (v1_0.f == null) {
	                    if ((afb.a() == null) || (v1_0.d())) {
	                        v1_0.f = v2_0;
	                        java.util.ArrayList v0_8 = new java.util.ArrayList();
	                        aky[] v2_1 = v2_0.a;
	                        if (v2_1.b) {
	                            v0_8.add(new aka(v1_0));
	                            v0_8.add(new ake(v1_0));
	                        }
	                        if (v2_1.c) {
	                            v0_8.add(new alb(v1_0));
	                        }
	                        aky[] v2_6 = new aky[v0_8.size()];
	                        v0_8.toArray(v2_6);
	                        v1_0.a = v2_6;
	                        v1_0.e();
	                    }
	                } else {
	                    throw new afq("Attempted to authorize while a request is pending.");
	                }
	            }
	        } else {
	            android.util.Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
	            this.y.finish();
	        }
	        return;
	    }
	
	
	    public final void k()
	    {
	        super.k();
	        this.y.findViewById(a.cX).setVisibility(8);
	        return;
	    }
	
	
	    public final void l()
	    {
	        aky v0_0 = this.b;
	        if (v0_0.b >= 0) {
	            v0_0.c().b();
	        }
	        super.l();
	        return;
	    }
	
