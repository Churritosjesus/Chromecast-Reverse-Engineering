	private final java.util.ArrayList a
	private synthetic uc b
	
	    ue(uc p2)
	    {
	        this.b = p2;
	        this.a = new java.util.ArrayList();
	        return;
	    }
	
	
	    public final void a(int p2, Object p3)
	    {
	        this.obtainMessage(p2, p3).sendToTarget();
	        return;
	    }
	
	
	    public final void handleMessage(android.os.Message p12)
	    {
	        int v6 = p12.what;
	        java.util.ArrayList v2_0 = p12.obj;
	        switch (v6) {
	            case 257:
	                this.b.e.a(((uh) v2_0));
	                break;
	            case 258:
	                this.b.e.b(((uh) v2_0));
	                break;
	            case 259:
	                this.b.e.c(((uh) v2_0));
	            case 260:
	            case 261:
	                break;
	            case 260:
	            case 261:
	                break;
	            case 262:
	                this.b.e.d(((uh) v2_0));
	                break;
	            default:
	                uh v1_14 = this.b.b.size();
	                while(true) {
	                    int v3_4 = (v1_14 - 1);
	                    if (v3_4 < 0) {
	                        break;
	                    }
	                    uh v1_28 = ((tz) ((ref.WeakReference) this.b.b.get(v3_4)).get());
	                    if (v1_28 != null) {
	                        this.a.addAll(v1_28.c);
	                        v1_14 = v3_4;
	                    } else {
	                        this.b.b.remove(v3_4);
	                        v1_14 = v3_4;
	                    }
	                }
	                int v7 = this.a.size();
	                int v4_0 = 0;
	                while (v4_0 < v7) {
	                    int v3_5 = ((ub) this.a.get(v4_0));
	                    tz v8 = v3_5.a;
	                    ua v9 = v3_5.b;
	                    switch ((65280 & v6)) {
	                        case 256:
	                            int v3_8;
	                            uh v1_21 = ((uh) v2_0);
	                            if (((v3_5.d & 2) == 0) && (!v1_21.a(v3_5.c))) {
	                                v3_8 = 0;
	                            } else {
	                                v3_8 = 1;
	                            }
	                            if (v3_8 == 0) {
	                            } else {
	                                switch (v6) {
	                                    case 257:
	                                        v9.a(v8, v1_21);
	                                        break;
	                                    case 258:
	                                        v9.b(v8, v1_21);
	                                        break;
	                                    case 259:
	                                        v9.c(v8, v1_21);
	                                        break;
	                                    case 260:
	                                        v9.b(v1_21);
	                                    case 261:
	                                        break;
	                                    case 262:
	                                        v9.a(v1_21);
	                                        break;
	                                    case 263:
	                                        v9.a();
	                                        break;
	                                    default:
	                                }
	                            }
	                            break;
	                        case 512:
	                            switch (v6) {
	                                case 513:
	                                    v9.a(v8);
	                                    break;
	                                case 514:
	                                    v9.b(v8);
	                                    break;
	                                case 515:
	                                    v9.c(v8);
	                                    break;
	                                default:
	                            }
	                            break;
	                    }
	                    v4_0++;
	                }
	                this.a.clear();
	                return;
	        }
	        try {
	        } catch (uh v1_30) {
	            this.a.clear();
	            throw v1_30;
	        }
	    }
	
