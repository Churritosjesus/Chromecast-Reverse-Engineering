	private static atf n
	public final android.content.Context a
	final android.content.SharedPreferences b
	public j c
	public blq d
	 bkm e
	public dax f
	public daz g
	  h
	 java.util.List i
	 java.util.List j
	public final java.util.ArrayList k
	public adv l
	public aer m
	private final java.lang.String o
	private final blp p
	
	    private atf(android.content.Context p5)
	    {
	        this.i = new java.util.ArrayList();
	        this.j = new java.util.ArrayList();
	        this.k = new java.util.ArrayList();
	        this.p = new blp("BackdropServer", 0);
	        this.a = p5.getApplicationContext();
	        this.o = blf.z(this.a);
	        this.b = android.preference.PreferenceManager.getDefaultSharedPreferences(this.a);
	        this.l = new adv(new aem(new java.io.File(this.a.getCacheDir(), "volley")), new aej(new bgl()));
	        this.l.a();
	        this.d = new blq(this.a);
	        this.m = new aer(this.l, this.d);
	        this.e = new bkm();
	        return;
	    }
	
	
	    private aex a(String p2, aey p3)
	    {
	        return this.m.a(p2, p3);
	    }
	
	
	    public static atf a(android.content.Context p1)
	    {
	        if (atf.n == null) {
	            atf.n = new atf(p1);
	        }
	        return atf.n;
	    }
	
	
	    public final aex a(String p3, android.widget.ImageView p4, boolean p5)
	    {
	        aex v0_1 = new Object[1];
	        v0_1[0] = p3;
	        return this.a(p3, new ati(this, p3, p5, p4));
	    }
	
	
	    public final aui a(String p5, aow p6)
	    {
	        return new aui(this.o, p6.j, p5, new atm(this, p6));
	    }
	
	
	    String a(android.content.Context p6, String p7, String p8)
	    {
	        try {
	            String v1 = bsn.a(p6, p7, p8);
	        } catch (int v2_1) {
	            android.content.Intent v0_1 = new Object[1];
	            v0_1[0] = v2_1;
	            if (this.c == null) {
	            } else {
	                atp v3_1 = this.c;
	                if (v2_1.b != null) {
	                    android.content.Intent v0_5 = new android.content.Intent(v2_1.b);
	                } else {
	                    v0_5 = v1;
	                }
	                v3_1.a(v0_5, 1000);
	            }
	        } catch (int v2_4) {
	            android.content.Intent v0_6 = new Object[1];
	            v0_6[0] = v2_4;
	            if (this.c != null) {
	                android.content.Intent v0_9 = this.c.y;
	            } else {
	                v0_9 = v1;
	            }
	            if (v0_9 == null) {
	            } else {
	                v0_9.runOnUiThread(new atp(this, v0_9, v2_4.a));
	            }
	        } catch (android.content.Intent v0_0) {
	            int v2_0 = new Object[1];
	            v2_0[0] = v0_0;
	        }
	        return v1;
	    }
	
	
	    public void a()
	    {
	        if (!this.k.isEmpty()) {
	            atn v0_3 = new atn(this);
	            Void[] v1_1 = new Void[1];
	            v1_1[0] = 0;
	            v0_3.execute(v1_1);
	        } else {
	        }
	        return;
	    }
	
	
	    public final void a(ads p4)
	    {
	        if (((p4 instanceof atb)) && (((atb) p4).g() != null)) {
	            try {
	                this.k.add(((atb) p4));
	            } catch (Throwable v0_7) {
	                throw v0_7;
	            }
	            if (this.k.size() <= 1) {
	                this.a();
	            } else {
	            }
	        } else {
	            this.l.a(p4);
	        }
	        return;
	    }
	
	
	    public final void a(atb p5)
	    {
	        Object v2 = p5.k;
	        int v0_0 = this.l;
	        if (v2 != null) {
	            v0_0.a(new adw(v0_0, v2));
	            int v1_2 = (this.k.size() - 1);
	            while (v1_2 > 0) {
	                if (v2.equals(((atb) this.k.get(v1_2)).k)) {
	                    this.k.remove(v1_2);
	                }
	                v1_2--;
	            }
	            this.a(p5);
	            return;
	        } else {
	            throw new IllegalArgumentException("Cannot cancelAll with a null tag");
	        }
	    }
	
	
	    public final void a(atr p6, adz p7)
	    {
	        if (this.f == null) {
	            this.i.add(p6);
	            if (p7 != null) {
	                this.j.add(p7);
	            }
	            if (!this.h) {
	                day v0_5 = new day();
	                v0_5.a = blx.a(0);
	                awl v1_2 = new Object[1];
	                v1_2[0] = v0_5;
	                awl v1_4 = new awl(v0_5, new atq(this), new ath(this));
	                this.h = 1;
	                this.a(v1_4);
	            }
	        } else {
	            p6.a(this.f);
	        }
	        return;
	    }
	
	
	    public void a(String p3, aea p4, boolean p5)
	    {
	        this.a(new atk(this, p3, p4, p5), 0);
	        return;
	    }
	
	
	    public final void a(String p2, ats p3)
	    {
	        this.a(p2, new atj(this, p2, p3));
	        return;
	    }
	
	
	    public void b()
	    {
	        String v0_1 = android.text.TextUtils.join(",", this.f.b);
	        apg v1_3 = new Object[1];
	        v1_3[0] = v0_1;
	        apg v1_5 = apg.a(156);
	        v1_5.b = v0_1;
	        v1_5.b();
	        return;
	    }
	
