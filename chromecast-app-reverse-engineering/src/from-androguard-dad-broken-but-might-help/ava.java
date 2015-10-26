	 auv a
	 bdf b
	private final blp d
	private android.content.Context e
	
	    public ava(auv p3, bdf p4, android.content.Context p5)
	    {
	        this(p4.a);
	        this.d = new blp("BleDeviceConnector");
	        this.a = p3;
	        this.b = p4;
	        this.e = p5;
	        return;
	    }
	
	
	    public final void a()
	    {
	        android.bluetooth.BluetoothGatt v0_0 = this.a;
	        v0_0.f.clear();
	        if (v0_0.b != null) {
	            v0_0.b.disconnect();
	            v0_0.b.close();
	        }
	        return;
	    }
	
	
	    public final void a(int p7, bdn p8)
	    {
	        byte[] v0_1 = new avs(p7, new ave(this, android.os.Looper.getMainLooper(), p8));
	        auv v1_2 = this.a;
	        java.nio.charset.Charset v2_2 = bfi.a(v0_1.a);
	        if (v2_2.toString() == null) {
	            v0_1.b.obtainMessage(1).sendToTarget();
	        }
	        v1_2.a(new awi(avp.u, new avt(v0_1), v2_2.toString().getBytes(blj.a)));
	        return;
	    }
	
	
	    public final void a(int p7, java.util.Locale p8, boolean p9, bdn p10)
	    {
	        if (p8 != null) {
	            new awj(new avb(this, android.os.Looper.getMainLooper(), p10), avp.a, blj.c(p8).getBytes(blj.a), 0).a(this.a);
	            aus v0_3 = new Object[1];
	            v0_3[0] = p8.getLanguage();
	        }
	        new aus(p7, new avf(this, android.os.Looper.getMainLooper(), p10)).a(this.a);
	        return;
	    }
	
	
	    public final void a(android.content.Context p7, String p8, bdn p9)
	    {
	        if (android.text.TextUtils.isEmpty(p8)) {
	            this.c(p9);
	        } else {
	            new awj(new avi(this, android.os.Looper.getMainLooper(), p9), avp.n, p8.getBytes(blj.a), blf.V(this.e)).a(this.a);
	        }
	        return;
	    }
	
	
	    public final void a(bdn p5)
	    {
	        new aus(160, new avg(this, android.os.Looper.getMainLooper(), p5)).a(this.a);
	        return;
	    }
	
	
	    public final void a(bdn p9, int p10)
	    {
	        java.nio.charset.Charset v2_1 = new awe(new avc(this, android.os.Looper.getMainLooper(), p9), p10);
	        auv v3 = this.a;
	        try {
	            awi v0_3 = new org.json.JSONObject();
	            v0_3.put("sound_id", v2_1.b);
	            byte[] v1_1 = v0_3.toString();
	            awi v0_5 = new Object[1];
	            v0_5[0] = v1_1;
	        } catch (awi v0_6) {
	            java.util.UUID v4_2 = new Object[1];
	            v4_2[0] = v0_6;
	            v2_1.a.obtainMessage(1).sendToTarget();
	        }
	        if (v1_1 != null) {
	            v3.a(new awi(avp.b, new awf(v2_1), v1_1.getBytes(blj.a)));
	        } else {
	            v2_1.a.obtainMessage(1).sendToTarget();
	        }
	        return;
	    }
	
	
	    public final void a(bfs p7, bdn p8)
	    {
	        byte[] v0_1 = new awg(new avd(this, android.os.Looper.getMainLooper(), p8), p7);
	        this.a.a(new awi(avp.m, new awh(v0_1), bdd.a(v0_1.b).toString().getBytes(blj.a)));
	        return;
	    }
	
	
	    public final void b(bdn p5)
	    {
	        new aus(1, new avh(this, android.os.Looper.getMainLooper(), p5)).a(this.a);
	        return;
	    }
	
	
	    public final boolean b()
	    {
	        return 0;
	    }
	
	
	    void c(bdn p10)
	    {
	        avl v1_2 = new avk(this, android.os.Looper.getMainLooper(), new avm(avp.k, avp.j, new avj(this, android.os.Looper.getMainLooper(), p10)), p10);
	        byte[] v3_3 = new byte[1];
	        v3_3[0] = 1;
	        awj v6 = new awj;
	        avl v1_4 = new avl(this, android.os.Looper.getMainLooper(), new awj(v1_2, avp.l, v3_3, blf.U(this.e)), p10);
	        byte[] v3_4 = new byte[1];
	        v3_4[0] = 1;
	        v6(v1_4, avp.l, v3_4, blf.U(this.e));
	        v6.a(this.a);
	        return;
	    }
	
	
	    public final boolean c()
	    {
	        return 0;
	    }
	
	
	    public final void d(bdn p2)
	    {
	        p2.b_(-7);
	        return;
	    }
	
