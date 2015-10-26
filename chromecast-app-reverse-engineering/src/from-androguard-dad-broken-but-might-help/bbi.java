	private android.widget.CheckBox Z
	private  aa
	
	    public bbi()
	    {
	        this.aa = 1;
	        return;
	    }
	
	
	    public final android.app.Dialog c(android.os.Bundle p5)
	    {
	        int v1_1 = this.y.getLayoutInflater().inflate(a.fG, 0);
	        this.Z = ((android.widget.CheckBox) v1_1.findViewById(f.X));
	        return new android.app.AlertDialog$Builder(this.y).setView(v1_1).setPositiveButton(b.I, 0).create();
	    }
	
	
	    public final void e(android.os.Bundle p2)
	    {
	        super.e(p2);
	        this.aa = 0;
	        return;
	    }
	
	
	    public final void onDismiss(android.content.DialogInterface p4)
	    {
	        super.onDismiss(p4);
	        if (this.aa) {
	            if (this.Z.isChecked()) {
	                android.preference.PreferenceManager.getDefaultSharedPreferences(this.y.getApplicationContext()).edit().putBoolean("CAST_SCREEN_DO_NOT_SHOW_WARNING", 1).apply();
	            }
	            this.Z = 0;
	            com.google.android.apps.chromecast.app.mirror.CastScreenActivity.h(((com.google.android.apps.chromecast.app.mirror.CastScreenActivity) this.y));
	        }
	        return;
	    }
	
