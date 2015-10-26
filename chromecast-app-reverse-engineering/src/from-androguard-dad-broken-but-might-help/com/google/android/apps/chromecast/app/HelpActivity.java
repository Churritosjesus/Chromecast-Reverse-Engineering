	
	    public HelpActivity()
	    {
	        return;
	    }
	
	
	    public static android.content.Intent a(android.content.Context p2, String p3)
	    {
	        android.content.Intent v0_1 = new android.content.Intent(p2, com.google.android.apps.chromecast.app.HelpActivity);
	        v0_1.putExtra("url", p3);
	        return v0_1;
	    }
	
	
	    public final void c_()
	    {
	        this.d().a().d();
	        this.findViewById(f.bh).setVisibility(8);
	        return;
	    }
	
	
	    public final void f()
	    {
	        int v0 = 0;
	        this.d().a().c();
	        android.view.View v1_3 = this.findViewById(f.bh);
	        if (!this.getIntent().getBooleanExtra("feedbackSupported", 0)) {
	            v0 = 8;
	        }
	        v1_3.setVisibility(v0);
	        return;
	    }
	
	
	    public void onBackPressed()
	    {
	        apa v0_2 = ((apa) this.b.a("webViewFragment"));
	        if ((v0_2 == null) || (!v0_2.p())) {
	            super.onBackPressed();
	        } else {
	            v0_2.q();
	        }
	        return;
	    }
	
	
	    protected void onCreate(android.os.Bundle p7)
	    {
	        super.onCreate(p7);
	        this.setContentView(a.ga);
	        blx.g(this);
	        this.a(((android.support.v7.widget.Toolbar) this.findViewById(f.eo)));
	        this.d().a().b(1);
	        this.d().a().a(b.bK);
	        af v0_9 = this.d().a();
	        af v3_1 = new Object[2];
	        v3_1[0] = this.getString(b.M);
	        v3_1[1] = com.google.android.apps.chromecast.app.SetupApplication.a().e();
	        v0_9.b(this.getString(b.N, v3_1));
	        if (p7 == null) {
	            amn v1_5;
	            af v0_14;
	            af v0_11 = this.getIntent().getStringExtra("url");
	            if (v0_11 == null) {
	                v1_5 = new amn();
	                v1_5.f(this.getIntent().getExtras());
	                v0_14 = "textViewFragment";
	            } else {
	                v1_5 = apa.a(v0_11);
	                v0_14 = "webViewFragment";
	            }
	            this.b.a().b(f.br, v1_5, v0_14).b();
	        }
	        af v0_19;
	        amn v1_6 = this.findViewById(f.bh);
	        if (!this.getIntent().getBooleanExtra("feedbackSupported", 0)) {
	            v0_19 = 8;
	        } else {
	            v0_19 = 0;
	        }
	        v1_6.setVisibility(v0_19);
	        return;
	    }
	
	
	    public boolean onCreateOptionsMenu(android.view.Menu p3)
	    {
	        this.getMenuInflater().inflate(a.ha, p3);
	        return super.onCreateOptionsMenu(p3);
	    }
	
	
	    public boolean onKeyDown(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2)) {
	            v0_1 = super.onKeyDown(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onKeyUp(int p2, android.view.KeyEvent p3)
	    {
	        boolean v0_1;
	        if (!blx.a(p2, this)) {
	            v0_1 = super.onKeyUp(p2, p3);
	        } else {
	            v0_1 = 1;
	        }
	        return v0_1;
	    }
	
	
	    public boolean onOptionsItemSelected(android.view.MenuItem p5)
	    {
	        int v0 = 1;
	        j v1_0 = p5.getItemId();
	        if (v1_0 != 16908332) {
	            if (v1_0 != f.bO) {
	                if (v1_0 != f.bX) {
	                    if (v1_0 != f.bQ) {
	                        if (v1_0 != f.bL) {
	                            if (v1_0 != f.bP) {
	                                v0 = super.onOptionsItemSelected(p5);
	                            } else {
	                                if (this.b.a("textViewFragment") == null) {
	                                    v0 = 0;
	                                }
	                            }
	                        } else {
	                            this.startActivity(new android.content.Intent(this, com.google.android.apps.chromecast.app.settings.OpenSourceLicenseActivity));
	                        }
	                    } else {
	                        j v1_6 = new android.content.Intent(this, com.google.android.apps.chromecast.app.WebViewActivity);
	                        v1_6.putExtra("url", this.getString(b.cS));
	                        v1_6.putExtra("topLevelActivity", 1);
	                        v1_6.putExtra("title", this.getString(b.cN));
	                        this.startActivity(v1_6);
	                    }
	                } else {
	                    j v1_8 = new android.content.Intent(this, com.google.android.apps.chromecast.app.WebViewActivity);
	                    v1_8.putExtra("url", blx.b(this));
	                    v1_8.putExtra("topLevelActivity", 1);
	                    v1_8.putExtra("title", this.getString(b.cO));
	                    this.startActivity(v1_8);
	                }
	            } else {
	                j v1_10 = new android.content.Intent("android.intent.action.VIEW");
	                v1_10.setData(android.net.Uri.parse(this.getString(b.ay)));
	                this.startActivity(v1_10);
	            }
	        } else {
	            this.finish();
	        }
	        return v0;
	    }
	
	
	    public boolean onPrepareOptionsMenu(android.view.Menu p3)
	    {
	        if ((android.os.Build$VERSION.SDK_INT < 19) || (this.b.a("webViewFragment") == null)) {
	            p3.findItem(f.bP).setVisible(0);
	        }
	        return 1;
	    }
	
	
	    public void sendFeedback(android.view.View p3)
	    {
	        bkq.a(this, this.getIntent().getParcelableArrayListExtra("feedbackDevices"));
	        return;
	    }
	
