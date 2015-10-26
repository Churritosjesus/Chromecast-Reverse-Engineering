	  a
	 android.bluetooth.BluetoothGatt b
	public  c
	public android.bluetooth.BluetoothGattService d
	final android.os.Handler e
	public final java.util.LinkedList f
	public final java.util.LinkedList g
	private final android.bluetooth.BluetoothDevice h
	private final blp i
	private android.content.Context j
	private  k
	private final android.bluetooth.BluetoothGattCallback l
	
	    public auv(android.bluetooth.BluetoothDevice p4, android.content.Context p5)
	    {
	        this.a = 0;
	        this.k = 0;
	        this.c = 0;
	        this.f = new java.util.LinkedList();
	        this.g = new java.util.LinkedList();
	        this.l = new aux(this);
	        this.h = p4;
	        this.j = p5;
	        this.i = new blp("BleConnectionManager");
	        this.k = 0;
	        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
	        return;
	    }
	
	
	    static synthetic void a(auv p0)
	    {
	        p0.c();
	        return;
	    }
	
	
	    private void c()
	    {
	        this.c = 0;
	        this.e.removeCallbacksAndMessages(0);
	        if (this.a != 0) {
	            while (!this.f.isEmpty()) {
	                android.bluetooth.BluetoothGatt v0_7 = ((avr) this.f.poll());
	                int v1 = v0_7.a;
	                if ((v1 == 1) || (v1 == 0)) {
	                    this.d = 0;
	                    this.c(v0_7);
	                    this.f.clear();
	                    this.b.disconnect();
	                    break;
	                }
	            }
	        } else {
	            this.a();
	        }
	        return;
	    }
	
	
	    private void c(avr p5)
	    {
	        this.k = 1;
	        switch (p5.a) {
	            case 0:
	                if (this.d == null) {
	                    ((awb) p5).a();
	                } else {
	                    Object[] v0_10 = this.d.getCharacteristic(((awb) p5).c);
	                    if (v0_10 == null) {
	                        Object[] v0_11 = new Object[1];
	                        v0_11[0] = ((awb) p5).c;
	                        ((awb) p5).a();
	                    } else {
	                        if (this.b.readCharacteristic(v0_10)) {
	                        } else {
	                            Object[] v0_13 = new Object[1];
	                            v0_13[0] = ((awb) p5).c;
	                            ((awb) p5).a();
	                        }
	                    }
	                }
	                break;
	            case 1:
	                if (this.d == null) {
	                    ((awi) p5).a();
	                } else {
	                    Object[] v0_6 = this.d.getCharacteristic(((awi) p5).d);
	                    if (v0_6 == null) {
	                        ((awi) p5).a();
	                    } else {
	                        v0_6.setValue(((awi) p5).b);
	                        if (this.b.writeCharacteristic(v0_6)) {
	                        } else {
	                            ((awi) p5).a();
	                        }
	                    }
	                }
	                break;
	            case 2:
	                this.b.requestMtu(((avw) p5).c);
	                break;
	            case 3:
	                if (this.b.discoverServices()) {
	                } else {
	                    ((avu) p5).a();
	                }
	                break;
	        }
	        return;
	    }
	
	
	    public final void a(avr p2)
	    {
	        this.f.add(p2);
	        if (!this.k) {
	            this.b();
	        }
	        return;
	    }
	
	
	    public final boolean a()
	    {
	        int v0 = 1;
	        this.e.removeCallbacksAndMessages(0);
	        this.e.postDelayed(new auw(this), 5000);
	        this.k = 1;
	        this.b = this.h.connectGatt(this.j, 0, this.l);
	        if (this.b == null) {
	            this.c();
	            v0 = 0;
	        }
	        return v0;
	    }
	
	
	    protected final void b()
	    {
	        int v3_0 = new Object[1];
	        avr v0_0 = this.f;
	        int v4_1 = new java.util.ArrayList();
	        java.util.Iterator v5 = v0_0.iterator();
	        while (v5.hasNext()) {
	            avr v0_28 = ((avr) v5.next());
	            switch (v0_28.a) {
	                case 0:
	                    avr v0_45;
	                    avr v0_43 = String.valueOf(((awb) v0_28).c.toString());
	                    if (v0_43.length() == 0) {
	                        v0_45 = new String("Read on ");
	                    } else {
	                        v0_45 = "Read on ".concat(v0_43);
	                    }
	                    v4_1.add(v0_45);
	                    break;
	                case 1:
	                    avr v0_39;
	                    avr v0_37 = String.valueOf(((awi) v0_28).d.toString());
	                    if (v0_37.length() == 0) {
	                        v0_39 = new String("Write on ");
	                    } else {
	                        v0_39 = "Write on ".concat(v0_37);
	                    }
	                    v4_1.add(v0_39);
	                    break;
	                case 2:
	                    v4_1.add(new StringBuilder(25).append("Change MTU to ").append(((avw) v0_28).c).toString());
	                    break;
	                case 3:
	                    v4_1.add("DiscoverServices");
	                    break;
	                default:
	            }
	        }
	        avr v0_9;
	        v3_0[0] = android.text.TextUtils.join(", ", v4_1);
	        if ((((android.bluetooth.BluetoothManager) this.j.getSystemService("bluetooth")).getConnectionState(this.h, 7) != 2) || (this.b == null)) {
	            v0_9 = 0;
	        } else {
	            v0_9 = 1;
	        }
	        if (v0_9 != null) {
	            if (this.g.isEmpty()) {
	                if (this.c) {
	                    if (this.f.isEmpty()) {
	                        this.k = 0;
	                    } else {
	                        this.c(((avr) this.f.peek()));
	                    }
	                } else {
	                    if (android.os.Build$VERSION.SDK_INT >= 21) {
	                        new avy(this, 512, new auy(this)).a();
	                    }
	                    this.b(new avu(new auz(this)));
	                }
	            } else {
	                this.c(((avr) this.g.peek()));
	            }
	        } else {
	            if (!this.a()) {
	                this.c();
	            }
	        }
	        return;
	    }
	
	
	    public final void b(avr p2)
	    {
	        this.g.add(p2);
	        if (!this.k) {
	            this.b();
	        }
	        return;
	    }
	
