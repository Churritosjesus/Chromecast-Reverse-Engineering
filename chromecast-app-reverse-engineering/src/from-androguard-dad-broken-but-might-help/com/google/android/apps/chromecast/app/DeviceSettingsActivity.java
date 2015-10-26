	private static java.lang.String v
	public bhf e
	public java.lang.String f
	public ash g
	private apu w
	private r x
	private  y
	private  z
	
	    public DeviceSettingsActivity()
	    {
	        this("DeviceSettingsActivity", 0);
	        return;
	    }
	
	
	    private void G()
	    {
	        if ((this.z != aqx.a) || (!this.g.r())) {
	            if ((this.z == aqx.b) && (!this.g.r())) {
	                this.k();
	            }
	        } else {
	            this.i();
	        }
	        return;
	    }
	
	
	    private boolean H()
	    {
	        r v0_0 = 0;
	        if (this.z != 0) {
	            this.z = 0;
	            if (this.x.a("spinnerFragment") != null) {
	                v0_0 = 1;
	            }
	            if ((v0_0 != null) && (this.x.e() > 0)) {
	                this.x.c();
	            }
	            v0_0 = 1;
	        }
	        return v0_0;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p3, String p4, String p5, bdf p6, int p7, long p8, String p10, String p11)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p3, com.google.android.apps.chromecast.app.DeviceSettingsActivity);
	        v0_1.putExtra("device", p4);
	        v0_1.putExtra("deviceIpAddress", p5);
	        v0_1.putExtra("deviceConfiguration", p6);
	        v0_1.putExtra("devicePosition", p7);
	        v0_1.putExtra("scanStart", p8);
	        v0_1.putExtra("backdropAppDeviceIdKey", p10);
	        v0_1.putExtra("backdropCertKey", p11);
	        return v0_1;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p3, String p4, String p5, bdf p6, boolean p7, String p8, String p9)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p3, com.google.android.apps.chromecast.app.DeviceSettingsActivity);
	        v0_1.putExtra("device", p4);
	        v0_1.putExtra("deviceIpAddress", p5);
	        v0_1.putExtra("deviceConfiguration", p6);
	        v0_1.putExtra("launchBackdrop", 1);
	        v0_1.putExtra("backdropPersonalized", p7);
	        v0_1.putExtra("backdropAppDeviceIdKey", p8);
	        v0_1.putExtra("backdropCertKey", p9);
	        return v0_1;
	    }
	
	
	    private void a(j p3, String p4, String p5)
	    {
	        af v0_2 = this.x.a().b(f.bk, p3, p4);
	        if (!android.text.TextUtils.isEmpty(p5)) {
	            v0_2.a(p5);
	            v0_2.a(4097);
	        }
	        v0_2.b();
	        return;
	    }
	
	
	    private static void a(Integer p3)
	    {
	        ape.a().a(new apd(75).a(p3.intValue()));
	        return;
	    }
	
	
	    private void a(String p4, int p5, boolean p6)
	    {
	        if (this.x.a("spinnerFragment") == null) {
	            int v0_2;
	            j v1_1 = ata.a(p4);
	            if (!p6) {
	                v0_2 = 0;
	            } else {
	                v0_2 = com.google.android.apps.chromecast.app.DeviceSettingsActivity.v;
	            }
	            this.a(v1_1, "spinnerFragment", v0_2);
	        }
	        this.z = p5;
	        return;
	    }
	
	
	    public static synthetic boolean a(com.google.android.apps.chromecast.app.DeviceSettingsActivity p1)
	    {
	        return p1.g();
	    }
	
	
	    public static synthetic bhf b(com.google.android.apps.chromecast.app.DeviceSettingsActivity p1)
	    {
	        return p1.e;
	    }
	
	
	    public static boolean n()
	    {
	        int v0_2;
	        if (com.google.android.apps.chromecast.app.SetupApplication.a().e == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        return v0_2;
	    }
	
	
	    public final void a(dbv p8)
	    {
	        if (this.g != null) {
	            asg v0_2 = this.g.d;
	            aur v1_0 = v0_2.a;
	            Object[] v3_0 = new Object[1];
	            v3_0[0] = p8.b;
	            v1_0.b("Updated setting based on DeviceSettingsResponse: %s", v3_0);
	            v0_2.b.a.a(p8.b);
	            aur v1_3 = v0_2.a;
	            Object[] v3_1 = new Object[1];
	            v3_1[0] = p8.a;
	            v1_3.b("Updated metadata based on DeviceSettingsResponse: %s", v3_1);
	            v0_2.b.b.b = p8.a;
	            v0_2.c.d_();
	        }
	        return;
	    }
	
	
	    public final void a(dcj p4)
	    {
	        Integer v0_1 = this.x.a("photosFragment");
	        if (v0_1 == null) {
	            v0_1 = asx.a(p4);
	        }
	        this.a(v0_1, "photosFragment", "photosFragment");
	        com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(Integer.valueOf(1));
	        return;
	    }
	
	
	    public final void a(dcj p5, String p6)
	    {
	        if ((!android.text.TextUtils.isEmpty(p5.j)) && (this.g != null)) {
	            atz v1 = this.g.d.b;
	            try {
	                alx v2_0 = p5.o;
	                v1.d = p5.j;
	                v1.e = v2_0;
	                v1.c = 0;
	                v1.a(atf.a(this.getApplicationContext()), new alx(this, p5, p6));
	            } catch (Throwable v0_8) {
	                throw v0_8;
	            }
	        }
	        return;
	    }
	
	
	    public final boolean a(android.app.AlertDialog p5, bfs p6)
	    {
	        int v0 = 1;
	        if ((p6 != null) && ((!p6.a.equals(this.i.y)) || (!android.text.TextUtils.isEmpty(p6.e)))) {
	            if (this.a(p6)) {
	                this.a(this.p, 0, p6, new alw(this, p6, p5));
	            } else {
	                v0 = 0;
	            }
	        }
	        return v0;
	    }
	
	
	    public final void a_(int p2)
	    {
	        if (p2 == 1) {
	            this.G();
	        }
	        return;
	    }
	
	
	    public final void b(dcj p4)
	    {
	        Integer v0_1 = this.x.a("peoplePickerFragment");
	        if (v0_1 == null) {
	            v0_1 = asu.a(p4);
	        }
	        this.a(v0_1, "peoplePickerFragment", "peoplePickerFragment");
	        com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(Integer.valueOf(20));
	        return;
	    }
	
	
	    public final void b(dcj p3, String p4)
	    {
	        Integer v0_3;
	        this.a(arp.a(p3), "backdropSettingsFragment", p4);
	        if ((p3 != null) && (p3.b != null)) {
	            v0_3 = p3.b.intValue();
	        } else {
	            v0_3 = 0;
	        }
	        com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(Integer.valueOf(v0_3));
	        return;
	    }
	
	
	    public final void b(String p3)
	    {
	        if (this.w != null) {
	            this.b.a().a(this.w).b();
	            this.w = 0;
	        }
	        this.y();
	        if (android.text.TextUtils.isEmpty(p3)) {
	            this.w();
	        } else {
	            this.e(p3);
	        }
	        return;
	    }
	
	
	    public final void c(dcj p12)
	    {
	        arp v6_1 = ((arp) this.x.a("backdropSettingsFragment"));
	        if (v6_1 != null) {
	            akp v1_1 = aku.a();
	            afq v0_2 = v6_1.a;
	            java.util.HashMap v2_1 = new arq(v6_1, p12);
	            if ((v0_2 instanceof aik)) {
	                afq v0_3 = ((aik) v0_2);
	                akl v3_2 = aim.a.a();
	                String v4_1 = new akv(v1_1, v2_1);
	                ajp.a(v4_1, "callback");
	                v0_3.a.put(Integer.valueOf(v3_2), v4_1);
	                aku v10 = aku.a();
	                akl v3_3 = arp.b(p12);
	                if (v3_3 != null) {
	                    akp v1_4 = v3_3.iterator();
	                    while (v1_4.hasNext()) {
	                        afq v0_12 = ((String) v1_4.next());
	                        if (aku.a(v0_12)) {
	                            akl v3_10 = new Object[1];
	                            v3_10[0] = v0_12;
	                            throw new afq(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", v3_10));
	                        }
	                    }
	                }
	                java.util.HashMap v2_3;
	                akp v1_5 = v10.a;
	                if (v3_3 == null) {
	                    v2_3 = new java.util.HashSet();
	                } else {
	                    v2_3 = new java.util.HashSet(v3_3);
	                }
	                akp v1_7;
	                afq v0_7 = new akl(v1_5, java.util.Collections.unmodifiableSet(v2_3), v10.b, afv.h(), java.util.UUID.randomUUID().toString());
	                if (afb.a() == null) {
	                    v1_7 = 0;
	                } else {
	                    v1_7 = 1;
	                }
	                akp v1_11;
	                v0_7.f = v1_7;
	                java.util.HashMap v2_7 = new ala(v6_1);
	                v10.c = v0_7;
	                v10.d = new java.util.HashMap();
	                akl v3_5 = v2_7.a();
	                if ((v3_5 != null) && (v10.c != null)) {
	                    v1_11 = v10.e;
	                    if ((v1_11 == null) || (!v1_11.b.equals(v10.c.d))) {
	                        v1_11 = new akt(v3_5, v10.c.d);
	                    }
	                } else {
	                    v1_11 = 0;
	                }
	                v10.e = v1_11;
	                if ((v10.e != null) && (v10.c != null)) {
	                    v10.e.a(v10.c);
	                }
	                afq v0_8;
	                aik.a(aim.a.a(), new akx(v10));
	                akp v1_18 = v10.a(v2_7, v0_7);
	                if (v1_18 == null) {
	                    v0_8 = "0";
	                } else {
	                    v0_8 = "1";
	                }
	                v10.d.put("try_login_activity", v0_8);
	                if (v1_18 == null) {
	                    afq v0_10 = new afq("Log in attempt failed: FacebookActivity could not be started. Please make sure you added FacebookActivity to the AndroidManifest.");
	                    v10.a(akp.c, 0, v0_10);
	                    v10.c = 0;
	                    throw v0_10;
	                }
	            } else {
	                throw new afq("Unexpected CallbackManager, please use the provided Factory.");
	            }
	        }
	        return;
	    }
	
	
	    public final void c(String p2)
	    {
	        this.d().a().a(p2);
	        return;
	    }
	
	
	    public final void d(dcj p7)
	    {
	        String v1_0 = p7.l;
	        if (!android.text.TextUtils.isEmpty(v1_0)) {
	            Object[] v0_2 = this.x.a("oAuthFragment");
	            if (v0_2 == null) {
	                v0_2 = bbx.a(this.f, v1_0, p7.j, "https://clients3.google.com");
	            }
	            this.a(v0_2, "oAuthFragment", "oAuthFragment");
	            Object[] v0_5 = new Object[2];
	            v0_5[0] = this.i.b;
	            v0_5[1] = v1_0;
	        } else {
	            Object[] v0_6 = new Object[1];
	            v0_6[0] = this.i.b;
	        }
	        return;
	    }
	
	
	    public final void d(String p7)
	    {
	        atf.a(this).a(new aup(blf.z(this), this.f, p7, new aly(this, p7), new alz(this)));
	        return;
	    }
	
	
	    public final android.content.Intent e()
	    {
	        android.content.Intent v0_2;
	        if (this.x.a("backdropSettingsFragment") == null) {
	            v0_2 = super.e();
	        } else {
	            v0_2 = com.google.android.apps.chromecast.app.HelpActivity.a(this, blf.P(this));
	        }
	        return v0_2;
	    }
	
	
	    public boolean g()
	    {
	        if ((this.e == null) || (!this.e.s)) {
	            int v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        return v0_3;
	    }
	
	
	    public final ash h()
	    {
	        return this.g;
	    }
	
	
	    public final void i()
	    {
	        this.H();
	        if (this.x.a("backdropSettingsFragment") == null) {
	            String v0_5;
	            if (!this.y) {
	                v0_5 = com.google.android.apps.chromecast.app.DeviceSettingsActivity.v;
	            } else {
	                v0_5 = 0;
	            }
	            this.b(this.g.t().b, v0_5);
	        }
	        return;
	    }
	
	
	    public final void j()
	    {
	        if (!this.y) {
	            this.H();
	        } else {
	            this.finish();
	        }
	        return;
	    }
	
	
	    public final void k()
	    {
	        android.widget.Toast.makeText(this, b.T, 0).show();
	        if (!this.y) {
	            this.z = 0;
	            this.x.b("backdropSettingsFragment", 1);
	        } else {
	            this.finish();
	        }
	        return;
	    }
	
	
	    public final void l()
	    {
	        this.H();
	        return;
	    }
	
	
	    public final void m()
	    {
	        if (com.google.android.apps.chromecast.app.DeviceSettingsActivity.n()) {
	            aqy v0_1 = aqy.p();
	            v0_1.Z = this;
	            v0_1.a(this.b, "backdropOptInFragment");
	        } else {
	            aqy v0_2 = new String[1];
	            v0_2[0] = "com.google";
	            t v1_3 = new android.content.Intent();
	            v1_3.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
	            v1_3.setPackage("com.google.android.gms");
	            v1_3.putExtra("allowableAccounts", 0);
	            v1_3.putExtra("allowableAccountTypes", v0_2);
	            v1_3.putExtra("addAccountOptions", 0);
	            v1_3.putExtra("selectedAccount", 0);
	            v1_3.putExtra("alwaysPromptForAccount", 0);
	            v1_3.putExtra("descriptionTextOverride", 0);
	            v1_3.putExtra("authTokenType", 0);
	            v1_3.putExtra("addAccountRequiredFeatures", 0);
	            v1_3.putExtra("setGmsCoreAccount", 0);
	            v1_3.putExtra("overrideTheme", 0);
	            v1_3.putExtra("overrideCustomTheme", 0);
	            this.startActivityForResult(v1_3, 1);
	        }
	        return;
	    }
	
	
	    public final void o()
	    {
	        ash v0_2;
	        dbt v2_0 = this.getString(b.R);
	        if (this.y) {
	            v0_2 = 0;
	        } else {
	            v0_2 = 1;
	        }
	        this.a(v2_0, aqx.a, v0_2);
	        ash v0_3 = this.g;
	        v0_3.a(1, v0_3.Z, this);
	        return;
	    }
	
	
	    public void onActivityResult(int p4, int p5, android.content.Intent p6)
	    {
	        if (p4 != 1) {
	            super.onActivityResult(p4, p5, p6);
	        } else {
	            if (p5 == -1) {
	                String v0_4 = android.accounts.AccountManager.get(this.getApplicationContext()).getAccounts();
	                if (v0_4.length > 0) {
	                    com.google.android.apps.chromecast.app.SetupApplication.a().a(v0_4[0].name);
	                    this.m();
	                }
	            }
	        }
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        bhf v0_0 = 1;
	        if (!this.g()) {
	            super.onBackPressed();
	        } else {
	            if (this.e.b.getDisplayedChild() != 1) {
	                v0_0 = 0;
	            }
	            if (v0_0 == null) {
	            } else {
	                this.e.b(0);
	            }
	        }
	        return;
	    }
	
	
	    public void onCreate(android.os.Bundle p7)
	    {
	        Integer v0_9;
	        super.onCreate(p7);
	        this.setContentView(a.fT);
	        blx.g(this);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        this.a(p7);
	        this.f = this.getIntent().getStringExtra("backdropAppDeviceIdKey");
	        if ((this.getIntent() == null) || (!this.getIntent().getBooleanExtra("launchBackdrop", 0))) {
	            v0_9 = 0;
	        } else {
	            v0_9 = 1;
	        }
	        this.y = v0_9;
	        if (!this.isFinishing()) {
	            this.x = this.b;
	            this.w = ((apu) this.b.a("offersChecker"));
	            this.e = ((bhf) this.x.a("deviceSettingsFragment"));
	            Integer v0_20 = ((aqy) this.x.a("backdropOptInFragment"));
	            if (v0_20 != null) {
	                v0_20.Z = this;
	            }
	            this.g = ((ash) this.x.a("backdropStorage"));
	            if ((this.g == null) && (this.s())) {
	                this.g = ash.a(this.f, this.i.b, this.i.g, this.getIntent().getStringExtra("backdropCertKey"));
	                this.x.a().a(this.g, "backdropStorage").b();
	            }
	            if (p7 == null) {
	                if (!this.y) {
	                    if (this.e == null) {
	                        this.e = new bhf();
	                    }
	                    this.x.a().a(f.bk, this.e, "deviceSettingsFragment").b();
	                    ape.a().a(35, Integer.valueOf(this.getIntent().getIntExtra("devicePosition", -1)), Long.valueOf(this.getIntent().getLongExtra("scanStart", 0)));
	                } else {
	                    if (!this.getIntent().getBooleanExtra("backdropPersonalized", 0)) {
	                        this.m();
	                    } else {
	                        this.b(0, 0);
	                    }
	                }
	            }
	        }
	        return;
	    }
	
	
	    public boolean onCreateOptionsMenu(android.view.Menu p3)
	    {
	        this.getMenuInflater().inflate(a.gY, p3);
	        return 1;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p4)
	    {
	        boolean v0_3;
	        if (p4.getItemId() != f.bK) {
	            if (p4.getItemId() != 16908332) {
	                v0_3 = this.a(p4, this.p, this.f);
	            } else {
	                this.onBackPressed();
	                v0_3 = 1;
	            }
	        } else {
	            if (this.w != null) {
	            } else {
	                this.x();
	                this.w = apu.a(this.j, this.i.Q);
	                this.b.a().a(this.w, "offersChecker").b();
	            }
	        }
	        return v0_3;
	    }
	
	
	    public boolean onPrepareOptionsMenu(android.view.Menu p4)
	    {
	        int v0_3;
	        super.onPrepareOptionsMenu(p4);
	        if ((!blf.b(this)) || (this.s.getDisplayedChild() == 1)) {
	            v0_3 = 0;
	        } else {
	            v0_3 = 1;
	        }
	        com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(p4, f.bK, v0_3);
	        return 1;
	    }
	
	
	    public void onResume()
	    {
	        super.onResume();
	        this.G();
	        return;
	    }
	
	
	    public void onStart()
	    {
	        super.onStart();
	        if (this.g != null) {
	            this.g.a(this);
	        }
	        return;
	    }
	
	
	    public void onStop()
	    {
	        super.onStop();
	        if (this.g != null) {
	            this.g.b(this);
	        }
	        return;
	    }
	
	
	    public final void p()
	    {
	        if (this.y) {
	            this.finish();
	        }
	        return;
	    }
	
	
	    public final void q()
	    {
	        this.a(this.getString(b.U), aqx.b, 1);
	        ash v0_2 = this.g;
	        v0_2.a(2, v0_2.Z, this);
	        return;
	    }
	
	
	    public final String r()
	    {
	        return this.f;
	    }
	
	
	    public final boolean s()
	    {
	        if ((android.text.TextUtils.isEmpty(this.f)) || (!this.i.h)) {
	            int v0_4 = 0;
	        } else {
	            v0_4 = 1;
	        }
	        return v0_4;
	    }
	
