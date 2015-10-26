	private synthetic ajq a
	
	    ajw(ajq p1)
	    {
	        this.a = p1;
	        return;
	    }
	
	
	    public final void onPageFinished(android.webkit.WebView p3, String p4)
	    {
	        super.onPageFinished(p3, p4);
	        if (!ajq.b(this.a)) {
	            ajq.c(this.a).dismiss();
	        }
	        ajq.d(this.a).setBackgroundColor(0);
	        ajq.e(this.a).setVisibility(0);
	        ajq.f(this.a).setVisibility(0);
	        ajq.a(this.a, 1);
	        return;
	    }
	
	
	    public final void onPageStarted(android.webkit.WebView p5, String p6, android.graphics.Bitmap p7)
	    {
	        android.app.ProgressDialog v0_2;
	        android.app.ProgressDialog v0_0 = String.valueOf(p6);
	        if (v0_0.length() == 0) {
	            v0_2 = new String("Webview loading URL: ");
	        } else {
	            v0_2 = "Webview loading URL: ".concat(v0_0);
	        }
	        aji.a("FacebookSDK.WebDialog", v0_2);
	        super.onPageStarted(p5, p6, p7);
	        if (!ajq.b(this.a)) {
	            ajq.c(this.a).show();
	        }
	        return;
	    }
	
	
	    public final void onReceivedError(android.webkit.WebView p3, int p4, String p5, String p6)
	    {
	        super.onReceivedError(p3, p4, p5, p6);
	        this.a.a(new afp(p5, p4, p6));
	        return;
	    }
	
	
	    public final void onReceivedSslError(android.webkit.WebView p5, android.webkit.SslErrorHandler p6, android.net.http.SslError p7)
	    {
	        super.onReceivedSslError(p5, p6, p7);
	        p6.cancel();
	        this.a.a(new afp(0, -11, 0));
	        return;
	    }
	
	
	    public final boolean shouldOverrideUrlLoading(android.webkit.WebView p8, String p9)
	    {
	        int v0_2;
	        int v0_0 = String.valueOf(p9);
	        if (v0_0.length() == 0) {
	            v0_2 = new String("Redirect URL: ");
	        } else {
	            v0_2 = "Redirect URL: ".concat(v0_0);
	        }
	        int v0_12;
	        aji.a("FacebookSDK.WebDialog", v0_2);
	        if (!p9.startsWith(ajq.a(this.a))) {
	            if (!p9.startsWith("fbconnect://cancel")) {
	                if (!p9.contains("touch")) {
	                    this.a.getContext().startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(p9)));
	                    v0_12 = 1;
	                } else {
	                    v0_12 = 0;
	                }
	            } else {
	                this.a.cancel();
	                v0_12 = 1;
	            }
	        } else {
	            android.os.Bundle v5_1 = this.a.a(p9);
	            int v0_16 = v5_1.getString("error");
	            if (v0_16 == 0) {
	                v0_16 = v5_1.getString("error_type");
	            }
	            ajx v1_4 = v5_1.getString("error_msg");
	            if (v1_4 == null) {
	                v1_4 = v5_1.getString("error_message");
	            }
	            if (v1_4 == null) {
	                v1_4 = v5_1.getString("error_description");
	            }
	            int v2_4;
	            int v2_3 = v5_1.getString("error_code");
	            if (aji.a(v2_3)) {
	                v2_4 = -1;
	            } else {
	                try {
	                    v2_4 = Integer.parseInt(v2_3);
	                } catch (int v2) {
	                    v2_4 = -1;
	                }
	            }
	            if ((!aji.a(v0_16)) || ((!aji.a(v1_4)) || (v2_4 != -1))) {
	                if ((v0_16 == 0) || ((!v0_16.equals("access_denied")) && (!v0_16.equals("OAuthAccessDeniedException")))) {
	                    if (v2_4 != 4201) {
	                        this.a.a(new afz(new afs(v2_4, v0_16, v1_4), v1_4));
	                    } else {
	                        this.a.cancel();
	                    }
	                } else {
	                    this.a.cancel();
	                }
	            } else {
	                int v0_21 = this.a;
	                if ((v0_21.b != null) && (!v0_21.d)) {
	                    v0_21.d = 1;
	                    v0_21.b.a(v5_1, 0);
	                    v0_21.dismiss();
	                }
	            }
	            v0_12 = 1;
	        }
	        return v0_12;
	    }
	
