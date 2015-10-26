.class final Lbad;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Z

.field private synthetic c:Lbab;


# direct methods
.method constructor <init>(Lbab;Ljava/lang/String;Z)V
    .locals 0

    .prologue
    .line 481
    iput-object p1, p0, Lbad;->c:Lbab;

    iput-object p2, p0, Lbad;->a:Ljava/lang/String;

    iput-boolean p3, p0, Lbad;->b:Z

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v8, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 485
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 1411
    iget-boolean v0, v0, Lbab;->c:Z

    .line 485
    if-nez v0, :cond_1

    .line 592
    :cond_0
    :goto_0
    return-void

    .line 488
    :cond_1
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 2411
    iget-boolean v1, v0, Lbab;->e:Z

    .line 489
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 3411
    iput-boolean v2, v0, Lbab;->e:Z

    .line 491
    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v0, v0, Lbab;->g:Lazv;

    .line 4036
    iget-object v0, v0, Lazv;->b:Landroid/os/Handler;

    .line 491
    iget-object v4, p0, Lbad;->c:Lbab;

    .line 4411
    iget-object v4, v4, Lbab;->b:Ljava/lang/Runnable;

    .line 491
    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 492
    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v0, v0, Lbab;->g:Lazv;

    .line 5036
    iget-object v0, v0, Lazv;->b:Landroid/os/Handler;

    .line 492
    iget-object v4, p0, Lbad;->c:Lbab;

    .line 5411
    iget-object v4, v4, Lbab;->b:Ljava/lang/Runnable;

    .line 492
    iget-object v5, p0, Lbad;->c:Lbab;

    iget-object v5, v5, Lbab;->g:Lazv;

    .line 6036
    iget-wide v6, v5, Lazv;->e:J

    .line 492
    invoke-virtual {v0, v4, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 494
    const-string v0, "networkInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/NetworkInfo;

    .line 496
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v4

    .line 497
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getDetailedState()Landroid/net/NetworkInfo$DetailedState;

    move-result-object v5

    .line 499
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0xe

    if-ge v0, v6, :cond_2

    .line 505
    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v0, v0, Lbab;->g:Lazv;

    .line 7036
    iget-object v0, v0, Lazv;->c:Landroid/net/wifi/WifiManager;

    .line 505
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    .line 512
    :goto_1
    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    invoke-virtual {v5}, Landroid/net/NetworkInfo$DetailedState;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v3

    .line 513
    invoke-static {v0}, Lblr;->a(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v8

    .line 514
    iget-object v6, p0, Lbad;->a:Ljava/lang/String;

    .line 8036
    invoke-static {v6, v0}, Lazv;->a(Ljava/lang/String;Landroid/net/wifi/WifiInfo;)Z

    move-result v6

    .line 515
    sget-object v7, Landroid/net/NetworkInfo$DetailedState;->FAILED:Landroid/net/NetworkInfo$DetailedState;

    if-ne v5, v7, :cond_3

    .line 517
    iget-object v0, p0, Lbad;->c:Lbab;

    invoke-virtual {v0}, Lbab;->a()V

    .line 518
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 8411
    iget-object v0, v0, Lbab;->a:Lbaa;

    .line 9036
    invoke-static {v0, v2}, Lazv;->a(Lbaa;Z)V

    goto :goto_0

    .line 509
    :cond_2
    const-string v0, "wifiInfo"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiInfo;

    move v1, v2

    .line 510
    goto :goto_1

    .line 521
    :cond_3
    sget-object v7, Lazz;->b:[I

    invoke-virtual {v4}, Landroid/net/NetworkInfo$State;->ordinal()I

    move-result v4

    aget v4, v7, v4

    packed-switch v4, :pswitch_data_0

    .line 588
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 24411
    iput-boolean v2, v0, Lbab;->f:Z

    goto/16 :goto_0

    .line 523
    :pswitch_0
    if-nez v1, :cond_0

    .line 531
    if-eqz v6, :cond_8

    .line 10036
    invoke-static {}, Lazv;->c()Z

    move-result v0

    .line 534
    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lbad;->b:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v0, v0, Lbab;->g:Lazv;

    .line 11036
    iget-object v0, v0, Lazv;->g:Ljava/lang/String;

    .line 534
    if-nez v0, :cond_4

    .line 535
    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v1, v0, Lbab;->g:Lazv;

    iget-object v3, p0, Lbad;->a:Ljava/lang/String;

    .line 12598
    iget-object v0, v1, Lazv;->d:Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getAllNetworks()[Landroid/net/Network;

    move-result-object v4

    array-length v5, v4

    :goto_2
    if-ge v2, v5, :cond_7

    aget-object v0, v4, v2

    .line 12599
    iget-object v6, v1, Lazv;->d:Landroid/net/ConnectivityManager;

    invoke-virtual {v6, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    move-result-object v6

    .line 12600
    invoke-virtual {v6}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v6

    .line 12601
    invoke-static {v3, v6}, Lblr;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 536
    :goto_3
    if-eqz v0, :cond_4

    .line 537
    iget-object v1, p0, Lbad;->c:Lbab;

    iget-object v1, v1, Lbab;->g:Lazv;

    iget-object v2, p0, Lbad;->a:Ljava/lang/String;

    invoke-static {v1, v0, v2}, Lazv;->a(Lazv;Landroid/net/Network;Ljava/lang/String;)V

    .line 540
    :cond_4
    iget-object v0, p0, Lbad;->c:Lbab;

    invoke-virtual {v0}, Lbab;->a()V

    .line 541
    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v0, v0, Lbab;->g:Lazv;

    .line 13036
    iget-object v0, v0, Lazv;->k:Lblp;

    .line 14034
    iget-boolean v0, v0, Lblp;->a:Z

    .line 541
    if-eqz v0, :cond_5

    .line 543
    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v0, v0, Lbab;->g:Lazv;

    .line 14036
    iget-object v0, v0, Lazv;->a:Landroid/content/Context;

    .line 543
    invoke-static {v0}, Lblr;->d(Landroid/content/Context;)I

    .line 545
    :cond_5
    iget-object v0, p0, Lbad;->c:Lbab;

    iget-object v0, v0, Lbab;->g:Lazv;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    .line 15036
    iput-wide v2, v0, Lazv;->i:J

    .line 546
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 15411
    iget-object v0, v0, Lbab;->a:Lbaa;

    .line 16036
    invoke-static {v0}, Lazv;->a(Lbaa;)V

    goto/16 :goto_0

    .line 12598
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 12605
    :cond_7
    const/4 v0, 0x0

    goto :goto_3

    .line 547
    :cond_8
    iget-object v1, p0, Lbad;->c:Lbab;

    .line 16411
    iget-boolean v1, v1, Lbab;->f:Z

    .line 547
    if-nez v1, :cond_0

    .line 551
    iget-object v1, p0, Lbad;->c:Lbab;

    invoke-virtual {v1}, Lbab;->a()V

    .line 552
    new-array v1, v8, [Ljava/lang/Object;

    .line 553
    invoke-static {v0}, Lblr;->a(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    iget-object v0, p0, Lbad;->a:Ljava/lang/String;

    aput-object v0, v1, v3

    .line 554
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 17411
    iget-object v0, v0, Lbab;->a:Lbaa;

    .line 18036
    invoke-static {v0, v2}, Lazv;->a(Lbaa;Z)V

    goto/16 :goto_0

    .line 560
    :pswitch_1
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 18411
    iput-boolean v2, v0, Lbab;->f:Z

    .line 561
    if-eqz v6, :cond_0

    .line 563
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 19411
    iput-object v5, v0, Lbab;->d:Landroid/net/NetworkInfo$DetailedState;

    goto/16 :goto_0

    .line 567
    :pswitch_2
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 20411
    iput-boolean v2, v0, Lbab;->f:Z

    .line 568
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 21411
    iget-object v0, v0, Lbab;->d:Landroid/net/NetworkInfo$DetailedState;

    .line 568
    if-eqz v0, :cond_0

    .line 571
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_9

    .line 572
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 22411
    iget-object v0, v0, Lbab;->d:Landroid/net/NetworkInfo$DetailedState;

    .line 572
    sget-object v1, Landroid/net/NetworkInfo$DetailedState;->VERIFYING_POOR_LINK:Landroid/net/NetworkInfo$DetailedState;

    if-ne v0, v1, :cond_9

    move v2, v3

    .line 581
    :cond_9
    if-eqz v2, :cond_0

    .line 582
    iget-object v0, p0, Lbad;->c:Lbab;

    invoke-virtual {v0}, Lbab;->a()V

    .line 583
    iget-object v0, p0, Lbad;->c:Lbab;

    .line 23411
    iget-object v0, v0, Lbab;->a:Lbaa;

    .line 24036
    invoke-static {v0, v3}, Lazv;->a(Lbaa;Z)V

    goto/16 :goto_0

    .line 521
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
