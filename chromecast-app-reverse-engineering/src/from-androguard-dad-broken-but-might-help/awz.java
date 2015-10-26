	private synthetic dbb a
	private synthetic awr b
	
	    awz(awr p1, dbb p2)
	    {
	        this.b = p1;
	        this.a = p2;
	        return;
	    }
	
	
	    public final void onClick(android.view.View p9)
	    {
	        String v0_0 = 1;
	        int v2_1 = apg.a(122);
	        v2_1.c = awr.e(this.b);
	        v2_1.b();
	        int v2_3 = this.b.y;
	        android.content.Intent v4_1 = this.a.b;
	        if (v4_1 != null) {
	            android.content.Intent v4_2 = new android.content.Intent("com.google.android.youtube.api.StandalonePlayerActivity.START").putExtra("video_id", v4_1);
	            v4_2.putExtra("app_package", v2_3.getPackageName()).putExtra("app_version", daj.a(v2_3)).putExtra("client_library_version", daj.a());
	            android.content.Intent v3_6 = v4_2.putExtra("developer_key", "AIzaSyBdEFvybu3pLLqPgu8m3MvsdScdKFfD6vE").putExtra("autoplay", 1).putExtra("lightbox_mode", 0).putExtra("start_time_millis", 0);
	            if ((v2_3.getWindow().getAttributes().flags & 1024) != 0) {
	                v0_0 = 0;
	            }
	            v3_6.putExtra("window_has_status_bar", v0_0);
	            this.b.a(v4_2);
	            return;
	        } else {
	            throw new NullPointerException("The videoId cannot be null");
	        }
	    }
	
