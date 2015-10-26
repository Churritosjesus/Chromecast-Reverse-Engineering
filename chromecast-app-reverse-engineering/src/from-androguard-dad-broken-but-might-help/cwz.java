	final java.lang.String a
	 cwb b
	bridge java.lang.String c
	bridge java.lang.String d
	private final android.content.Context e
	private final cmi f
	private final java.lang.String g
	private bridge czb h
	
	    private cwz(android.content.Context p3, String p4, cmi p5, czb p6)
	    {
	        this.e = p3;
	        this.f = p5;
	        this.g = p4;
	        this.h = p6;
	        this.a = new StringBuilder("/r?id=").append(p4).toString();
	        this.c = this.a;
	        this.d = 0;
	        return;
	    }
	
	
	    public cwz(android.content.Context p2, String p3, czb p4)
	    {
	        this(p2, p3, new cmi(), p4);
	        return;
	    }
	
	
	    public final void run()
	    {
	        if (this.b != null) {
	            cwb v0_6;
	            cwb v0_4 = ((android.net.ConnectivityManager) this.e.getSystemService("connectivity")).getActiveNetworkInfo();
	            if ((v0_4 != null) && (v0_4.isConnected())) {
	                v0_6 = 1;
	            } else {
	                cuh.e("...no network connectivity");
	                v0_6 = 0;
	            }
	            if (v0_6 != null) {
	                cuh.e("Start loading resource from network ...");
	                cwb v0_14 = new StringBuilder().append(this.h.a).append(this.c).append("&v=a65833898").toString();
	                if ((this.d != null) && (!this.d.trim().equals(""))) {
	                    v0_14 = new StringBuilder().append(v0_14).append("&pv=").append(this.d).toString();
	                }
	                int v1_16;
	                if (!cuk.a().a.equals(cul.c)) {
	                    v1_16 = v0_14;
	                } else {
	                    v1_16 = new StringBuilder().append(v0_14).append("&gtm_debug=x").toString();
	                }
	                cmg v2_3;
	                if (android.os.Build$VERSION.SDK_INT >= 8) {
	                    v2_3 = new cmg();
	                } else {
	                    v2_3 = new cmf();
	                }
	                try {
	                    cwb v0_26 = v2_3.a(v1_16);
	                    try {
	                        String v3_6 = new java.io.ByteArrayOutputStream();
	                        a.a(v0_26, v3_6);
	                        cwb v0_39 = ((cjd) cms.a(new cjd(), v3_6.toByteArray()));
	                        cuh.e(new StringBuilder("Successfully loaded supplemented resource: ").append(v0_39).toString());
	                    } catch (cwb v0_40) {
	                        cuh.b(new StringBuilder("Error when parsing downloaded resources from url: ").append(v1_16).append(" ").append(v0_40.getMessage()).toString(), v0_40);
	                        this.b.a();
	                        v2_3.a();
	                    }
	                    if ((v0_39.b == null) && (v0_39.a.length == 0)) {
	                        cuh.e(new StringBuilder("No change for container: ").append(this.g).toString());
	                    }
	                    this.b.a(v0_39);
	                    v2_3.a();
	                    cuh.e("Load resource from network finished.");
	                } catch (cwb v0_42) {
	                    v2_3.a();
	                    throw v0_42;
	                } catch (cwb v0) {
	                    cuh.b(new StringBuilder("No data is retrieved from the given url: ").append(v1_16).append(". Make sure container_id: ").append(this.g).append(" is correct.").toString());
	                    this.b.a();
	                    v2_3.a();
	                } catch (cwb v0_27) {
	                    cuh.b(new StringBuilder("Error when loading resources from url: ").append(v1_16).append(" ").append(v0_27.getMessage()).toString(), v0_27);
	                    this.b.a();
	                    v2_3.a();
	                }
	            } else {
	                this.b.a();
	            }
	            return;
	        } else {
	            throw new IllegalStateException("callback must be set before execute");
	        }
	    }
	
