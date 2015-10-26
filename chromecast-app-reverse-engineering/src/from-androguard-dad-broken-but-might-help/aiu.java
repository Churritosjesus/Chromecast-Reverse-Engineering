	private static final java.lang.String f
	private  g
	
	    static aiu()
	    {
	        aiu.f = aiu.getName();
	        return;
	    }
	
	
	    public aiu(android.content.Context p1, String p2, String p3)
	    {
	        this(p1, p2);
	        this.a = p3;
	        return;
	    }
	
	
	    static synthetic void a(aiu p0)
	    {
	        super.cancel();
	        return;
	    }
	
	
	    protected final android.os.Bundle a(String p5)
	    {
	        android.os.Bundle v1 = aji.b(android.net.Uri.parse(p5).getQuery());
	        org.json.JSONException v0_3 = v1.getString("bridge_args");
	        v1.remove("bridge_args");
	        if (!aji.a(v0_3)) {
	            try {
	                v1.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", aib.a(new org.json.JSONObject(v0_3)));
	            } catch (org.json.JSONException v0_5) {
	                aji.a(aiu.f, "Unable to parse bridge_args JSON", v0_5);
	            }
	        }
	        org.json.JSONException v0_7 = v1.getString("method_results");
	        v1.remove("method_results");
	        if (!aji.a(v0_7)) {
	            if (aji.a(v0_7)) {
	                v0_7 = "{}";
	            }
	            try {
	                v1.putBundle("com.facebook.platform.protocol.RESULT_ARGS", aib.a(new org.json.JSONObject(v0_7)));
	            } catch (org.json.JSONException v0_9) {
	                aji.a(aiu.f, "Unable to parse bridge_args JSON", v0_9);
	            }
	        }
	        v1.remove("version");
	        v1.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", aix.a());
	        return v1;
	    }
	
	
	    public void cancel()
	    {
	        aiv v1_0 = this.c;
	        if ((this.e) && ((!this.d) && ((v1_0 != null) && (v1_0.isShown())))) {
	            if (!this.g) {
	                android.os.Handler v0_8;
	                this.g = 1;
	                android.os.Handler v0_6 = String.valueOf("(function() {  var event = document.createEvent(\'Event\');  event.initEvent(\'fbPlatformDialogMustClose\',true,true);  document.dispatchEvent(event);})();");
	                if (v0_6.length() == 0) {
	                    v0_8 = new String("javascript:");
	                } else {
	                    v0_8 = "javascript:".concat(v0_6);
	                }
	                v1_0.loadUrl(v0_8);
	                new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new aiv(this), 1500);
	            }
	        } else {
	            super.cancel();
	        }
	        return;
	    }
	
