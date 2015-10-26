.class final Lue;
.super Landroid/os/Handler;
.source "PG"


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private synthetic b:Luc;


# direct methods
.method constructor <init>(Luc;)V
    .locals 1

    .prologue
    .line 2376
    iput-object p1, p0, Lue;->b:Luc;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2377
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lue;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 1

    .prologue
    .line 2397
    invoke-virtual {p0, p1, p2}, Lue;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 2398
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 11

    .prologue
    const/4 v5, 0x0

    .line 2402
    iget v6, p1, Landroid/os/Message;->what:I

    .line 2403
    iget-object v2, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 3431
    packed-switch v6, :pswitch_data_0

    .line 2412
    :goto_0
    :pswitch_0
    :try_start_0
    iget-object v1, p0, Lue;->b:Luc;

    .line 7601
    iget-object v1, v1, Luc;->b:Ljava/util/ArrayList;

    .line 2412
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_1
    add-int/lit8 v3, v1, -0x1

    if-ltz v3, :cond_1

    .line 2413
    iget-object v1, p0, Lue;->b:Luc;

    .line 8601
    iget-object v1, v1, Luc;->b:Ljava/util/ArrayList;

    .line 2413
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltz;

    .line 2414
    if-nez v1, :cond_0

    .line 2415
    iget-object v1, p0, Lue;->b:Luc;

    .line 9601
    iget-object v1, v1, Luc;->b:Ljava/util/ArrayList;

    .line 2415
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v1, v3

    goto :goto_1

    .line 3433
    :pswitch_1
    iget-object v1, p0, Lue;->b:Luc;

    .line 3601
    iget-object v3, v1, Luc;->e:Lve;

    move-object v1, v2

    .line 3433
    check-cast v1, Luh;

    invoke-virtual {v3, v1}, Lve;->a(Luh;)V

    goto :goto_0

    .line 3436
    :pswitch_2
    iget-object v1, p0, Lue;->b:Luc;

    .line 4601
    iget-object v3, v1, Luc;->e:Lve;

    move-object v1, v2

    .line 3436
    check-cast v1, Luh;

    invoke-virtual {v3, v1}, Lve;->b(Luh;)V

    goto :goto_0

    .line 3439
    :pswitch_3
    iget-object v1, p0, Lue;->b:Luc;

    .line 5601
    iget-object v3, v1, Luc;->e:Lve;

    move-object v1, v2

    .line 3439
    check-cast v1, Luh;

    invoke-virtual {v3, v1}, Lve;->c(Luh;)V

    goto :goto_0

    .line 3442
    :pswitch_4
    iget-object v1, p0, Lue;->b:Luc;

    .line 6601
    iget-object v3, v1, Luc;->e:Lve;

    move-object v1, v2

    .line 3442
    check-cast v1, Luh;

    invoke-virtual {v3, v1}, Lve;->d(Luh;)V

    goto :goto_0

    .line 2417
    :cond_0
    :try_start_1
    iget-object v4, p0, Lue;->a:Ljava/util/ArrayList;

    iget-object v1, v1, Ltz;->c:Ljava/util/ArrayList;

    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move v1, v3

    .line 2419
    goto :goto_1

    .line 2421
    :cond_1
    iget-object v1, p0, Lue;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v7

    move v4, v5

    .line 2422
    :goto_2
    if-ge v4, v7, :cond_5

    .line 2423
    iget-object v1, p0, Lue;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Lub;

    move-object v3, v0

    .line 10448
    iget-object v8, v3, Lub;->a:Ltz;

    .line 10449
    iget-object v9, v3, Lub;->b:Lua;

    .line 10450
    const v1, 0xff00

    and-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_0

    .line 2422
    :cond_2
    :goto_3
    :pswitch_5
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_2

    .line 10452
    :sswitch_0
    move-object v0, v2

    check-cast v0, Luh;

    move-object v1, v0

    .line 10589
    iget v10, v3, Lub;->d:I

    and-int/lit8 v10, v10, 0x2

    if-nez v10, :cond_3

    iget-object v3, v3, Lub;->c:Ltx;

    invoke-virtual {v1, v3}, Luh;->a(Ltx;)Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    const/4 v3, 0x1

    .line 10453
    :goto_4
    if-eqz v3, :cond_2

    .line 10456
    packed-switch v6, :pswitch_data_1

    goto :goto_3

    .line 10458
    :pswitch_6
    invoke-virtual {v9, v8, v1}, Lua;->a(Ltz;Luh;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    .line 2426
    :catchall_0
    move-exception v1

    iget-object v2, p0, Lue;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    throw v1

    :cond_4
    move v3, v5

    .line 10589
    goto :goto_4

    .line 10461
    :pswitch_7
    :try_start_2
    invoke-virtual {v9, v8, v1}, Lua;->b(Ltz;Luh;)V

    goto :goto_3

    .line 10464
    :pswitch_8
    invoke-virtual {v9, v8, v1}, Lua;->c(Ltz;Luh;)V

    goto :goto_3

    .line 10467
    :pswitch_9
    invoke-virtual {v9, v1}, Lua;->b(Luh;)V

    goto :goto_3

    .line 10473
    :pswitch_a
    invoke-virtual {v9, v1}, Lua;->a(Luh;)V

    goto :goto_3

    .line 10476
    :pswitch_b
    invoke-virtual {v9}, Lua;->a()V

    goto :goto_3

    .line 10483
    :sswitch_1
    packed-switch v6, :pswitch_data_2

    goto :goto_3

    .line 10485
    :pswitch_c
    invoke-virtual {v9, v8}, Lua;->a(Ltz;)V

    goto :goto_3

    .line 10488
    :pswitch_d
    invoke-virtual {v9, v8}, Lua;->b(Ltz;)V

    goto :goto_3

    .line 10491
    :pswitch_e
    invoke-virtual {v9, v8}, Lua;->c(Ltz;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    .line 2426
    :cond_5
    iget-object v1, p0, Lue;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 2427
    return-void

    .line 3431
    :pswitch_data_0
    .packed-switch 0x101
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
    .end packed-switch

    .line 10450
    :sswitch_data_0
    .sparse-switch
        0x100 -> :sswitch_0
        0x200 -> :sswitch_1
    .end sparse-switch

    .line 10456
    :pswitch_data_1
    .packed-switch 0x101
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_5
        :pswitch_a
        :pswitch_b
    .end packed-switch

    .line 10483
    :pswitch_data_2
    .packed-switch 0x201
        :pswitch_c
        :pswitch_d
        :pswitch_e
    .end packed-switch
.end method
