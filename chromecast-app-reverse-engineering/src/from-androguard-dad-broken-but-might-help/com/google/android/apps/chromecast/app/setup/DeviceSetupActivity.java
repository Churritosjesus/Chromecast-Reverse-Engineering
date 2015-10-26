	private  A
	private android.bluetooth.BluetoothDevice B
	private android.bluetooth.BluetoothAdapter C
	private  D
	private bje E
	private  F
	private  G
	private  H
	private  I
	private  J
	private java.lang.Long K
	private  L
	private android.os.Handler M
	private java.lang.Runnable N
	public bdm e
	public aph f
	private bha g
	private azj v
	private  w
	private  x
	private java.lang.String y
	private java.lang.Boolean z
	
	    public DeviceSetupActivity()
	    {
	        this("DeviceSetupActivity", 1);
	        this.w = 0;
	        this.x = 0;
	        this.D = 0;
	        this.H = -1;
	        this.I = biv.a;
	        this.J = biv.a;
	        this.K = 0;
	        this.L = 0;
	        this.M = 0;
	        this.N = new bim(this);
	        return;
	    }
	
	
	    private void G()
	    {
	        this.runOnUiThread(new biu(this));
	        return;
	    }
	
	
	    private void H()
	    {
	        int v0_0 = this.b;
	        android.media.MediaPlayer v1_1 = v0_0.a("loadingFragment");
	        if (v1_1 != null) {
	            v0_0.a().a(v1_1).b();
	        }
	        int v0_1 = v0_0.a("otaWaitFragment");
	        if (!(v0_1 instanceof biy)) {
	            Integer v2_1 = new Object[0];
	            this.t.b("Expected the video to be visible but wasn\'t", v2_1);
	        } else {
	            int v0_3 = ((biy) v0_1);
	            if ((v0_3.b) && (!v0_3.a.isPlaying())) {
	                android.media.MediaPlayer v1_10 = new Object[1];
	                v1_10[0] = Integer.valueOf(v0_3.a.getCurrentPosition());
	                v0_3.a.start();
	                v0_3.q();
	            }
	            this.J = biv.c;
	        }
	        return;
	    }
	
	
	    private boolean I()
	    {
	        int v2_1;
	        int v0 = 1;
	        int v3_0 = this.i;
	        if (v3_0.a < 7) {
	            v2_1 = 0;
	        } else {
	            v2_1 = 1;
	        }
	        if ((v2_1 == 0) || (v3_0.b() == bdi.c)) {
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    private void J()
	    {
	        this.a(this.b.a());
	        return;
	    }
	
	
	    private void K()
	    {
	        if ((this.K != null) && ((this.M == null) && ((this.J != biv.b) && (this.J != biv.c)))) {
	            Long v0_6 = (this.K.longValue() - android.os.SystemClock.elapsedRealtime());
	            if (v0_6 > 0) {
	                this.M = new android.os.Handler();
	                this.M.postAtTime(this.N, (android.os.SystemClock.uptimeMillis() + v0_6));
	                Object[] v2_7 = new Object[1];
	                v2_7[0] = Long.valueOf(v0_6);
	            }
	        }
	        return;
	    }
	
	
	    private void L()
	    {
	        if (this.M != null) {
	            this.M.removeCallbacks(this.N);
	            this.M = 0;
	        }
	        return;
	    }
	
	
	    private boolean M()
	    {
	        int v0_5;
	        if (this.K != null) {
	            if ((this.J != biv.b) && (this.J != biv.c)) {
	                if (this.K.longValue() >= android.os.SystemClock.elapsedRealtime()) {
	                    v0_5 = 0;
	                } else {
	                    this.K = 0;
	                    bjs v3_2 = this.b;
	                    int v0_8 = ((bjq) v3_2.a("otaWaitFragment"));
	                    int v4_1 = blf.n(this);
	                    if ((v0_8 != 0) && (v0_8.c < v4_1)) {
	                        int v4_2 = new Object[1];
	                        v4_2[0] = Integer.valueOf(v0_8.c);
	                        int v0_11 = v3_2.a();
	                        int v1_2 = v3_2.a("pollOtaFragment");
	                        if (v1_2 != 0) {
	                            v0_11.a(v1_2);
	                            this.I = biv.d;
	                        }
	                        v3_2.b(0, 1);
	                        v0_11.a(f.ai, bjs.a(b.ct, b.cs, 1));
	                        v0_11.b();
	                        v0_5 = 1;
	                    } else {
	                        v0_5 = 0;
	                    }
	                }
	            } else {
	                v0_5 = 0;
	            }
	        } else {
	            v0_5 = 0;
	        }
	        return v0_5;
	    }
	
	
	    private void N()
	    {
	        this.startActivity(com.google.android.apps.chromecast.app.setup.ota.OtaErrorActivity.a(this, this.i.h, this.f));
	        this.finish();
	        return;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p3, String p4, String p5, bdf p6, int p7, long p8, String p10, android.bluetooth.BluetoothDevice p11)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p3, com.google.android.apps.chromecast.app.setup.DeviceSetupActivity);
	        v0_1.putExtra("device", p4);
	        v0_1.putExtra("deviceIpAddress", p5);
	        v0_1.putExtra("deviceConfiguration", p6);
	        v0_1.putExtra("devicePosition", p7);
	        v0_1.putExtra("scanStart", p8);
	        v0_1.putExtra("hotspotSsid", p10);
	        v0_1.putExtra("bleDevice", p11);
	        return v0_1;
	    }
	
	
	    public static synthetic aph a(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.f;
	    }
	
	
	    private void a(af p4)
	    {
	        this.K();
	        p4.b(f.ai, bix.a(this.I()), "otaWaitFragment").b();
	        return;
	    }
	
	
	    public static synthetic boolean a(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1, boolean p2)
	    {
	        p1.F = 0;
	        return 0;
	    }
	
	
	    private void b(bfs p4)
	    {
	        if ((p4 == null) || (this.a(p4))) {
	            bdm v1_1 = new java.util.HashMap();
	            if ((this.y != null) && (!this.y.equals(this.D()))) {
	                v1_1.put("friendly_name", this.y);
	            }
	            java.util.HashMap v0_5 = this.B();
	            if (v0_5 != null) {
	                v1_1.put("timezone", v0_5);
	            }
	            java.util.HashMap v0_7;
	            if (!android.text.format.DateFormat.is24HourFormat(this)) {
	                v0_7 = bdk.a;
	            } else {
	                v0_7 = bdk.b;
	            }
	            v1_1.put("time_format", v0_7);
	            java.util.HashMap v0_8 = this.C();
	            if (v0_8 != null) {
	                v1_1.put("locale", v0_8);
	            }
	            if (this.z != null) {
	                v1_1.put("opt_in_opencast", this.z);
	            }
	            java.util.HashMap v0_13;
	            v1_1.put("opt_in_stats", Boolean.valueOf(this.A));
	            if (!v1_1.isEmpty()) {
	                v0_13 = v1_1;
	            } else {
	                v0_13 = 0;
	            }
	            this.w = 0;
	            this.n();
	            this.a(this.e, v0_13, p4, new bit(this, p4));
	        }
	        return;
	    }
	
	
	    public static synthetic void b(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p3)
	    {
	        if (!p3.i.w) {
	            String v0_2 = 0;
	            if (com.google.android.apps.chromecast.app.SetupApplication.g()) {
	                int v1_3;
	                int v1_2 = p3.i.a();
	                if ((v1_2 != -1) && (v1_2 < 14864)) {
	                    v1_3 = 0;
	                } else {
	                    v1_3 = 1;
	                }
	                if (v1_3 != 0) {
	                    v0_2 = com.google.android.apps.chromecast.app.SetupApplication.a().c;
	                }
	            }
	            p3.a(p3.e, v0_2, new bio(p3));
	        } else {
	            p3.s();
	        }
	        return;
	    }
	
	
	    public static synthetic boolean b(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1, boolean p2)
	    {
	        p1.w = 1;
	        return 1;
	    }
	
	
	    public static synthetic boolean c(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.u;
	    }
	
	
	    public static synthetic void d(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p0)
	    {
	        p0.s();
	        return;
	    }
	
	
	    public static synthetic boolean e(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.u;
	    }
	
	
	    public static synthetic boolean f(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.u;
	    }
	
	
	    public static synthetic boolean g(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.G;
	    }
	
	
	    public static synthetic boolean h(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.u;
	    }
	
	
	    public static synthetic bha i(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.g;
	    }
	
	
	    public static synthetic void j(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p0)
	    {
	        p0.n();
	        return;
	    }
	
	
	    public static synthetic void k(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p0)
	    {
	        p0.r();
	        return;
	    }
	
	
	    public static synthetic void l(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        p1.x();
	        blj.a(p1, new bir(p1));
	        return;
	    }
	
	
	    public static synthetic boolean m(com.google.android.apps.chromecast.app.setup.DeviceSetupActivity p1)
	    {
	        return p1.M();
	    }
	
	
	    private void n()
	    {
	        if (!this.w) {
	            if (this.v != null) {
	                this.v.a();
	            }
	        } else {
	            if (this.v == null) {
	                this.v = new azj(this, this.e);
	            }
	            long v4_0 = this.v;
	            if (v4_0.a == null) {
	                v4_0.a = new java.util.Timer();
	                v4_0.a.schedule(new azl(v4_0), v4_0.d, v4_0.d);
	            }
	        }
	        return;
	    }
	
	
	    private void o()
	    {
	        if (this.E != null) {
	            this.E.a();
	        }
	        return;
	    }
	
	
	    private bdm p()
	    {
	        bdu v0_1 = new bdu("192.168.255.249", this.i.a, this.o, bew.d, this.f);
	        v0_1.g = 1;
	        if (!android.text.TextUtils.isEmpty(v0_1.f)) {
	            v0_1.h.j = v0_1.f;
	        }
	        return v0_1;
	    }
	
	
	    private bdm q()
	    {
	        return new ava(new auv(this.B, this), this.i, this);
	    }
	
	
	    private void r()
	    {
	        this.x();
	        this.a(this.e, new bil(this), 1, this.e.c());
	        return;
	    }
	
	
	    private void s()
	    {
	        this.a(new bip(this));
	        return;
	    }
	
	
	    public final aph A()
	    {
	        return this.f;
	    }
	
	
	    public final void a()
	    {
	        this.finish();
	        return;
	    }
	
	
	    public final void a(int p13)
	    {
	        af v0_0 = 2;
	        android.bluetooth.BluetoothAdapter v3_0 = 0;
	        int v2_0 = this.b;
	        af v5 = v2_0.a();
	        long v6_1 = new apd(139);
	        switch (bin.a[(p13 - 1)]) {
	            case 1:
	                if (!this.D) {
	                    Object[] v7_4 = new Object[1];
	                    v7_4[0] = this.D();
	                    this.a(this.getString(b.aR, v7_4), new biq(this));
	                    Object[] v7_7 = new Object[1];
	                    v7_7[0] = this.D();
	                    v3_0 = this.getString(b.aD, v7_7);
	                    v5.a(v2_0.a(f.ai));
	                    if (this.H == 1) {
	                        int v2_19 = ape.a();
	                        if ((this.C != null) && (this.C.isEnabled())) {
	                            v0_0 = 1;
	                        }
	                        v2_19.a(v6_1.a(v0_0));
	                        if ((this.C == null) || (!this.C.isEnabled())) {
	                            this.e = this.p();
	                        } else {
	                            blx.a();
	                        }
	                    }
	                    if (this.e == null) {
	                        if (v3_0 != null) {
	                            this.d().a().a(v3_0);
	                        }
	                        v5.b();
	                    } else {
	                        this.G();
	                    }
	                } else {
	                    this.startActivityForResult(new android.content.Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
	                }
	                break;
	            case 2:
	                this.w();
	                if (this.i.h) {
	                    if (!this.l) {
	                        this.x = 0;
	                        this.o();
	                        v5.b(f.ai, bgo.a(this.e.b()), "configureDeviceFragment");
	                    } else {
	                        this.w = 1;
	                        this.n();
	                        v5.a(f.ai, bhd.a(this.q));
	                    }
	                } else {
	                    this.x = 1;
	                    this.a(0);
	                    v5.a(f.ai, new bgt());
	                }
	                break;
	            case 4:
	                int v2_12;
	                this.x = 0;
	                this.o();
	                af v0_32 = ((bgo) v2_0.a("configureDeviceFragment"));
	                this.y = v0_32.p();
	                if (v0_32.a != null) {
	                    v2_12 = Boolean.valueOf(v0_32.a.isChecked());
	                } else {
	                    v2_12 = 0;
	                }
	                this.z = v2_12;
	                this.A = v0_32.b.isChecked();
	                bok v1_12 = new Object[1];
	                v1_12[0] = this.y;
	                af v0_36 = this.getString(b.aD, v1_12);
	                if (!this.i.w) {
	                    v5.b(f.ai, bgr.a(this.n, this.e.b()), "configureWifiFragment").a(0);
	                    v3_0 = v0_36;
	                } else {
	                    this.b(0);
	                    v3_0 = v0_36;
	                }
	                break;
	            case 5:
	                this.b(((bgr) v2_0.a("configureWifiFragment")).a.a());
	                break;
	            case 6:
	                af v0_10;
	                this.d().a().a(0);
	                this.d().a().d();
	                blx.h(this);
	                if (this.m != bdj.p) {
	                    v0_10 = 0;
	                } else {
	                    v0_10 = 1;
	                }
	                v2_0.b(0, 1);
	                if (v0_10 != null) {
	                    if (this.I()) {
	                        long v6_7 = blf.o(this);
	                        if (v6_7 > 0) {
	                            this.K = Long.valueOf((v6_7 + android.os.SystemClock.elapsedRealtime()));
	                        }
	                        v5.a(bjh.a(blf.i(this), blf.j(this), blf.k(this)), "pollOtaFragment");
	                        if (!this.i.h) {
	                            if (com.google.android.apps.chromecast.app.SetupApplication.g()) {
	                                af v0_21 = blf.a(this, com.google.android.apps.chromecast.app.SetupApplication.a().c, blj.b());
	                                bok v1_7 = new Object[1];
	                                v1_7[0] = v0_21;
	                                v5.b(f.ai, biy.a(v0_21), "otaWaitFragment").a(f.ai, bok.b(a.gz), "loadingFragment");
	                            } else {
	                                this.a(v5);
	                            }
	                        } else {
	                            this.a(v5);
	                        }
	                    } else {
	                        this.a(v5);
	                    }
	                } else {
	                    v5.a(f.ai, bjp.a(this.i.m));
	                }
	                break;
	            case 7:
	                int v2_1 = v2_0.a("pollOtaFragment");
	                if (v2_1 != 0) {
	                    v5.a(v2_1);
	                }
	                int v2_2 = this.i;
	                bok v1_3 = bkh.a().h.a(0, 1, v2_2.b());
	                if (v1_3 == null) {
	                    v5.a(f.ai, bjp.a(this.i.m));
	                } else {
	                    this.startActivityForResult(com.google.android.apps.chromecast.app.tutorial.TutorialOtaActivity.a(this, v1_3, v2_2, this.I(), this.f), 2);
	                }
	                break;
	            case 8:
	                v5.a(f.ai, bjp.a(this.i.m));
	                break;
	            case 9:
	                this.startActivity(com.google.android.apps.chromecast.app.SetupApplication.a(this, com.google.android.apps.chromecast.app.SetupApplication.h()));
	                break;
	            default:
	                throw new UnsupportedOperationException("Unrecognized setup flow state");
	        }
	        return;
	    }
	
	
	    public final void a(int p6, int p7)
	    {
	        boolean v0_0 = this.t;
	        Object[] v2_1 = new Object[2];
	        v2_1[0] = Integer.valueOf(p6);
	        v2_1[1] = Integer.valueOf(p7);
	        v0_0.a("Couldn\'t play video. Showing static update screen instead. MediaPlayer error: %d, %d", v2_1);
	        this.J = biv.d;
	        if (!this.M()) {
	            this.J();
	        }
	        return;
	    }
	
	
	    public final void a(long p4)
	    {
	        if (this.E == null) {
	            this.E = new bje(this.e);
	        }
	        Runnable v0_3 = this.E;
	        v0_3.a();
	        v0_3.e = 1;
	        v0_3.a.postDelayed(v0_3.b, p4);
	        return;
	    }
	
	
	    public final void a_(String p2)
	    {
	        com.google.android.apps.chromecast.app.SetupApplication.a().c = p2;
	        if (!this.isFinishing()) {
	            this.r();
	        }
	        return;
	    }
	
	
	    public final void a_(boolean p5)
	    {
	        int v0_0 = 1;
	        this.o();
	        if (!this.F) {
	            this.F = 1;
	            this.e.a(new aoc(this, new bis(this)), 1);
	            ape v1_2 = ape.a();
	            aph v2_3 = new apd(155);
	            if (!p5) {
	                v0_0 = 0;
	            }
	            int v0_1 = v2_3.a(v0_0);
	            v0_1.h = this.f;
	            v1_2.a(v0_1);
	        }
	        return;
	    }
	
	
	    public final void b(int p4)
	    {
	        boolean v0_1 = new Object[1];
	        v0_1[0] = Integer.valueOf(p4);
	        this.I = biv.b;
	        if (this.J == biv.b) {
	            this.H();
	        }
	        boolean v0_6 = ((bjq) this.b.a("otaWaitFragment"));
	        if (v0_6) {
	            v0_6.b(p4);
	        }
	        if (this.L) {
	            this.L = 0;
	            if (!this.M()) {
	                this.K();
	            }
	        }
	        return;
	    }
	
	
	    public final void g()
	    {
	        this.J = biv.b;
	        if (this.I == biv.b) {
	            this.H();
	        }
	        return;
	    }
	
	
	    public final void h()
	    {
	        this.J = biv.d;
	        if (this.I != biv.d) {
	            if (!this.M()) {
	                this.J();
	            }
	        } else {
	            this.a(bjo.g);
	        }
	        return;
	    }
	
	
	    public final void i()
	    {
	        this.I = biv.d;
	        if (this.J != biv.c) {
	            this.K = 0;
	            this.L();
	            this.a(bjo.g);
	        }
	        return;
	    }
	
	
	    public final void j()
	    {
	        this.i();
	        return;
	    }
	
	
	    public final void k()
	    {
	        this.K = 0;
	        this.L();
	        this.N();
	        return;
	    }
	
	
	    public final void l()
	    {
	        this.finish();
	        return;
	    }
	
	
	    public final void m()
	    {
	        android.content.Intent v0_2;
	        if (!this.i.h) {
	            v0_2 = blf.q(this);
	        } else {
	            v0_2 = blf.p(this);
	        }
	        this.startActivity(com.google.android.apps.chromecast.app.HelpActivity.a(this, v0_2));
	        this.finish();
	        return;
	    }
	
	
	    protected void onActivityResult(int p5, int p6, android.content.Intent p7)
	    {
	        if (p5 != 1) {
	            if (p5 == 2) {
	                if (p6 != 0) {
	                    if (p6 == -1) {
	                        this.H = p5;
	                    }
	                } else {
	                    if ((p7 == null) || (!p7.getBooleanExtra("hadError", 0))) {
	                        this.finish();
	                    } else {
	                        this.N();
	                    }
	                }
	            }
	        } else {
	            this.D = 0;
	            boolean v0_4 = new Object[2];
	            v0_4[0] = Integer.valueOf(p5);
	            v0_4[1] = Integer.valueOf(p6);
	            this.H = p5;
	        }
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p7)
	    {
	        super.onCreate(p7);
	        this.setContentView(a.fV);
	        blx.g(this);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        this.a(p7);
	        if (!this.isFinishing()) {
	            if (p7 != null) {
	                this.B = ((android.bluetooth.BluetoothDevice) p7.getParcelable("bleDevice"));
	            }
	            blx.a();
	            if (this.B == null) {
	                this.B = ((android.bluetooth.BluetoothDevice) this.getIntent().getParcelableExtra("bleDevice"));
	            }
	            if (!this.i.w) {
	                if ((this.B == null) || ((this.C == null) || (!this.C.isEnabled()))) {
	                    blx.a();
	                    this.e = this.p();
	                } else {
	                    this.e = this.q();
	                }
	            } else {
	                this.e = this.p;
	            }
	            Long v0_21 = this.b;
	            if (p7 != null) {
	                this.w = p7.getBoolean("setupStarted");
	                this.x = p7.getBoolean("playSound");
	                Long v0_27 = p7.getCharSequence("actionBarTitle");
	                this.d().a().a(v0_27);
	                if (v0_27 == null) {
	                    this.d().a().d();
	                    blx.h(this);
	                }
	                this.q = p7.getString("setupPinCode");
	                this.y = p7.getString("friendlyName");
	                this.H = p7.getInt("lastActivityResultRequestCode");
	                if (p7.containsKey("enableOpencast")) {
	                    this.z = Boolean.valueOf(p7.getBoolean("enableOpencast"));
	                }
	                this.A = p7.getBoolean("statsOptIn");
	                this.f = ((aph) p7.getParcelable("deviceSetupSession"));
	                this.I = biv.a()[p7.getInt("pollingState")];
	                this.J = biv.a()[p7.getInt("videoState")];
	                if (p7.containsKey("checkOtaSlowTimestamp")) {
	                    this.K = Long.valueOf(p7.getLong("checkOtaSlowTimestamp"));
	                }
	            } else {
	                bdf v1_8 = this.d().a();
	                String v3_1 = new Object[1];
	                v3_1[0] = this.D();
	                v1_8.a(this.getString(b.by, v3_1));
	                bdf v1_11 = bjl.a(this.getIntent().getIntExtra("devicePosition", -1), this.getIntent().getLongExtra("scanStart", 0));
	                Long v0_55 = v0_21.a();
	                if ((this.l) && (this.n != null)) {
	                    this.g = bha.a(this.o, this.n.a);
	                    v0_55.a(this.g, "hotspotManagerTag");
	                }
	                v0_55.a(f.ai, v1_11).b();
	            }
	            if (this.f == null) {
	                this.f = new aph();
	            }
	            this.f.a(this.i, (this.e instanceof ava));
	        }
	        return;
	    }
	
	
	    public boolean onCreateOptionsMenu(android.view.Menu p3)
	    {
	        super.onCreateOptionsMenu(p3);
	        this.getMenuInflater().inflate(a.hd, p3);
	        return 1;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p3)
	    {
	        if (p3.getItemId() != 16908332) {
	            this.a(p3, this.e, 0);
	        } else {
	            int v0_2 = at.a(this);
	            v0_2.setFlags(67108864);
	            at.b(this, v0_2);
	        }
	        return 1;
	    }
	
	
	    public void onPause()
	    {
	        if (this.v != null) {
	            this.v.a();
	        }
	        if (this.E != null) {
	            this.E.a();
	        }
	        this.L();
	        super.onPause();
	        return;
	    }
	
	
	    protected void onPostResume()
	    {
	        super.onPostResume();
	        switch (this.H) {
	            case 1:
	                this.a(bjo.a);
	                this.H = -1;
	                break;
	            case 2:
	                this.a(bjo.h);
	                this.H = -1;
	                break;
	        }
	        return;
	    }
	
	
	    protected void onResume()
	    {
	        super.onResume();
	        this.G = 0;
	        this.n();
	        if (this.x) {
	            this.a(0);
	        }
	        if ((this.K != null) && (this.M == null)) {
	            this.L = 1;
	        }
	        return;
	    }
	
	
	    public void onSaveInstanceState(android.os.Bundle p5)
	    {
	        super.onSaveInstanceState(p5);
	        p5.putBoolean("setupStarted", this.w);
	        p5.putBoolean("playSound", this.x);
	        p5.putCharSequence("actionBarTitle", this.d().a().a());
	        p5.putString("setupPinCode", this.q);
	        p5.putString("friendlyName", this.y);
	        p5.putInt("lastActivityResultRequestCode", this.H);
	        if (this.z != null) {
	            p5.putBoolean("enableOpencast", this.z.booleanValue());
	        }
	        p5.putBoolean("statsOptIn", this.A);
	        p5.putParcelable("deviceSetupSession", this.f);
	        p5.putParcelable("bleDevice", this.B);
	        p5.putInt("pollingState", (this.I - 1));
	        p5.putInt("videoState", (this.J - 1));
	        if (this.K != null) {
	            p5.putLong("checkOtaSlowTimestamp", this.K.longValue());
	        }
	        this.G = 1;
	        return;
	    }
	
	
	    public final void v()
	    {
	        super.v();
	        if ((!this.i.w) && (this.e != null)) {
	            this.e.a();
	        }
	        return;
	    }
	
