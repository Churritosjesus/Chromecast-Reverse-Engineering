	private final java.lang.Object a
	
	    public cz(android.content.Context p3, dm p4)
	    {
	        this.a = new android.media.session.MediaController(p3, ((android.media.session.MediaSession$Token) p4.a));
	        if (this.a != null) {
	            return;
	        } else {
	            throw new android.os.RemoteException();
	        }
	    }
	
	
	    public final dc a()
	    {
	        int v0_2;
	        android.media.session.MediaController$TransportControls v1 = ((android.media.session.MediaController) this.a).getTransportControls();
	        if (v1 == null) {
	            v0_2 = 0;
	        } else {
	            v0_2 = new dd(v1);
	        }
	        return v0_2;
	    }
	
	
	    public final void a(cu p3)
	    {
	        ((android.media.session.MediaController) this.a).unregisterCallback(((android.media.session.MediaController$Callback) cu.c(p3)));
	        return;
	    }
	
	
	    public final void a(cu p3, android.os.Handler p4)
	    {
	        ((android.media.session.MediaController) this.a).registerCallback(((android.media.session.MediaController$Callback) cu.c(p3)), p4);
	        return;
	    }
	
	
	    public final dq b()
	    {
	        int v0_3;
	        int v0_2 = ((android.media.session.MediaController) this.a).getPlaybackState();
	        if (v0_2 == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = dq.a(v0_2);
	        }
	        return v0_3;
	    }
	
	
	    public final ci c()
	    {
	        int v0_3;
	        int v0_2 = ((android.media.session.MediaController) this.a).getMetadata();
	        if (v0_2 == 0) {
	            v0_3 = 0;
	        } else {
	            v0_3 = ci.a(v0_2);
	        }
	        return v0_3;
	    }
	
