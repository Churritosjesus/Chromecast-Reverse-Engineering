	private synthetic bfs a
	private synthetic android.app.AlertDialog b
	private synthetic com.google.android.apps.chromecast.app.DeviceSettingsActivity c
	
	    public alw(com.google.android.apps.chromecast.app.DeviceSettingsActivity p1, bfs p2, android.app.AlertDialog p3)
	    {
	        this.c = p1;
	        this.a = p2;
	        this.b = p3;
	        return;
	    }
	
	
	    public final void a()
	    {
	        this.c.w();
	        this.c.j = this.c.k;
	        this.c.i.u = this.c.j;
	        this.c.i.y = this.a.a;
	        if (com.google.android.apps.chromecast.app.DeviceSettingsActivity.a(this.c)) {
	            com.google.android.apps.chromecast.app.DeviceSettingsActivity.b(this.c).c.setText(this.c.i.y);
	            bhf v2 = com.google.android.apps.chromecast.app.DeviceSettingsActivity.b(this.c);
	            bfs v3 = this.a;
	            int v1_9 = 0;
	            while (v1_9 < v2.a.size()) {
	                if (!((bfs) v2.a.get(v1_9)).a.equals(v3.a)) {
	                    v1_9++;
	                } else {
	                    v2.a.remove(v1_9);
	                    break;
	                }
	            }
	            v2.a.add(v3);
	        }
	        return;
	    }
	
	
	    public final void b()
	    {
	        this.c.w();
	        if (!this.c.isFinishing()) {
	            this.b.show();
	        }
	        return;
	    }
	
