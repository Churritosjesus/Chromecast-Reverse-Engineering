	private final blp Z
	private  aa
	private  ab
	private com.google.android.apps.chromecast.app.DeviceSettingsActivity ac
	private ari ad
	private dcd ae
	private java.lang.String af
	private java.lang.String ag
	private java.lang.String ah
	private dca ai
	private  aj
	private android.widget.TextView ak
	private android.widget.TextView al
	private android.widget.ImageView am
	private android.widget.ViewFlipper an
	private android.support.v7.widget.RecyclerView ao
	private xq ap
	private android.app.Dialog aq
	private java.lang.Integer ar
	private java.lang.Integer as
	
	    public ark()
	    {
	        this.Z = new blp("BackdropPreviewFragment", 0);
	        return;
	    }
	
	
	    static synthetic int a(ark p1)
	    {
	        return p1.aa;
	    }
	
	
	    public static ark a(String p5, String p6, int p7, Long p8, String p9, int p10)
	    {
	        String v0_3;
	        ark v2_1 = new ark();
	        android.os.Bundle v3_1 = new android.os.Bundle();
	        v3_1.putString("displayId", p5);
	        v3_1.putString("albumName", p6);
	        v3_1.putInt("position", p7);
	        if (p8 != null) {
	            v0_3 = p8.longValue();
	        } else {
	            v0_3 = -1;
	        }
	        v3_1.putLong("albumId", v0_3);
	        v3_1.putString("photoContainerId", p9);
	        v3_1.putInt("numPhotos", p10);
	        v2_1.f(v3_1);
	        return v2_1;
	    }
	
	
	    static synthetic dcd a(ark p0, dcd p1)
	    {
	        p0.ae = p1;
	        return p1;
	    }
	
	
	    static synthetic blp b(ark p1)
	    {
	        return p1.Z;
	    }
	
	
	    static synthetic dcd c(ark p1)
	    {
	        return p1.ae;
	    }
	
	
	    private int p()
	    {
	        return ((int) (((float) ((this.aq.getWindow().getDecorView().getWidth() / 3) - (this.aa * 2))) * 1058013184));
	    }
	
	
	    public final void a()
	    {
	        super.a();
	        this.ac = 0;
	        return;
	    }
	
	
	    public final void a(android.app.Activity p1)
	    {
	        super.a(p1);
	        this.ac = ((com.google.android.apps.chromecast.app.DeviceSettingsActivity) p1);
	        return;
	    }
	
	
	    public final void a(dcd p5)
	    {
	        android.widget.ViewFlipper v0_0 = 1;
	        if (this.e().getConfiguration().orientation != 1) {
	            this.an.getLayoutParams().height = -1;
	        } else {
	            if (this.ar == null) {
	                if (this.aj != 0) {
	                    v0_0 = (((this.aj - 1) / 3) + 1);
	                }
	                this.ab = this.e().getDimensionPixelSize(a.dX);
	                this.ar = Integer.valueOf((Math.min(v0_0, 3) * (this.p() + ((this.ab + this.aa) * 2))));
	            }
	            if (this.as == null) {
	                this.as = Integer.valueOf(this.p());
	            }
	            this.an.getLayoutParams().height = this.ar.intValue();
	        }
	        android.widget.ViewFlipper v0_16;
	        int v1_13 = this.ad;
	        if (this.as != null) {
	            v0_16 = this.as.intValue();
	        } else {
	            v0_16 = this.p();
	        }
	        v1_13.b = p5.a;
	        v1_13.c = v0_16;
	        v1_13.a.a();
	        this.an.setDisplayedChild(0);
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p14)
	    {
	        Integer v0_39;
	        this.ag = blf.z(this.ac);
	        this.ad = new ari(this.ac);
	        this.af = this.ac.f;
	        this.ah = this.m.getString("displayId");
	        String v3_1 = new android.app.AlertDialog$Builder(this.ac);
	        dca v4_0 = this.ac.getLayoutInflater().inflate(a.gw, 0);
	        this.ak = ((android.widget.TextView) v4_0.findViewById(f.cW));
	        this.al = ((android.widget.TextView) v4_0.findViewById(f.da));
	        this.an = ((android.widget.ViewFlipper) v4_0.findViewById(f.cX));
	        this.an.setDisplayedChild(1);
	        this.aa = this.e().getDimensionPixelSize(a.dW);
	        this.ao = ((android.support.v7.widget.RecyclerView) v4_0.findViewById(f.cY));
	        this.ap = new xq(this.ac, 3);
	        this.ao.a(this.ad);
	        this.ao.a(this.ap);
	        this.ao.a(new arl(this));
	        this.ao.a(new xe());
	        this.am = ((android.widget.ImageView) v4_0.findViewById(f.cV));
	        this.am.setOnClickListener(new arm(this));
	        this.ak.setText(this.m.getString("albumName"));
	        atf v1_16 = this.m.getInt("numPhotos");
	        if (v1_16 > 100) {
	            Integer v0_38 = this.ac;
	            int v8_1 = new Object[2];
	            v8_1[0] = Integer.valueOf(100);
	            v8_1[1] = Integer.valueOf(v1_16);
	            v0_39 = v0_38.getString(b.cP, v8_1);
	        } else {
	            Integer v0_41 = this.ac.getResources();
	            int v8_2 = new Object[1];
	            v8_2[0] = Integer.valueOf(v1_16);
	            v0_39 = v0_41.getQuantityString(a.he, v1_16, v8_2);
	        }
	        Integer v0_50;
	        this.al.setText(v0_39);
	        this.aq = v3_1.setView(v4_0).create();
	        this.aq.setCanceledOnTouchOutside(1);
	        this.aq.show();
	        this.ai = new dca();
	        Integer v0_49 = Long.valueOf(this.m.getLong("albumId"));
	        String v3_3 = this.ai;
	        if (v0_49.longValue() != -1) {
	            v0_50 = String.valueOf(v0_49);
	        } else {
	            v0_50 = 0;
	        }
	        Integer v0_52;
	        v3_3.a = v0_50;
	        this.ai.b = this.m.getString("photoContainerId");
	        if (v1_16 >= 100) {
	            v0_52 = 100;
	        } else {
	            v0_52 = v1_16;
	        }
	        this.aj = v0_52;
	        if (p14 != null) {
	            try {
	                if (p14.containsKey("previewHeight")) {
	                    this.ar = Integer.valueOf(p14.getInt("previewHeight"));
	                }
	            } catch (Integer v0_68) {
	                atf v1_17 = this.Z;
	                String v3_6 = new Object[1];
	                v3_6[0] = v0_68;
	                v1_17.a("Error parsing preview bundle: %s", v3_6);
	            }
	            if (p14.containsKey("previewResponse")) {
	                this.ae = dcd.a(p14.getByteArray("previewResponse"));
	            }
	            if (p14.containsKey("imageHeight")) {
	                this.as = Integer.valueOf(p14.getInt("imageHeight"));
	            }
	        }
	        if ((this.ar == null) || (this.ae == null)) {
	            atf.a(this.ac).a(new aul(this.ag, this.af, this.ah, this.ai, 0, this.aj, 0, 0, new arn(this), new aro(this)));
	        } else {
	            this.a(this.ae);
	        }
	        return this.aq;
	    }
	
	
	    public final void e(android.os.Bundle p3)
	    {
	        if (this.ae != null) {
	            p3.putByteArray("previewResponse", dcd.a(this.ae));
	        }
	        if (this.ar != null) {
	            p3.putInt("previewHeight", this.ar.intValue());
	        }
	        if (this.as != null) {
	            p3.putInt("imageHeight", this.as.intValue());
	        }
	        return;
	    }
	
