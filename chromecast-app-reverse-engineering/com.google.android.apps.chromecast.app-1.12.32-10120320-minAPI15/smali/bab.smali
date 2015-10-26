.class final Lbab;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Lbaa;

.field final b:Ljava/lang/Runnable;

.field c:Z

.field d:Landroid/net/NetworkInfo$DetailedState;

.field e:Z

.field f:Z

.field final synthetic g:Lazv;

.field private final h:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Lazv;Ljava/lang/String;ZLbaa;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 430
    iput-object p1, p0, Lbab;->g:Lazv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 418
    iput-boolean v1, p0, Lbab;->e:Z

    .line 422
    iput-boolean v1, p0, Lbab;->f:Z

    .line 431
    iput-object p4, p0, Lbab;->a:Lbaa;

    .line 1481
    new-instance v0, Lbad;

    invoke-direct {v0, p0, p2, p3}, Lbad;-><init>(Lbab;Ljava/lang/String;Z)V

    .line 432
    iput-object v0, p0, Lbab;->h:Landroid/content/BroadcastReceiver;

    .line 433
    new-instance v0, Lbac;

    invoke-direct {v0, p0, p1}, Lbac;-><init>(Lbab;Lazv;)V

    iput-object v0, p0, Lbab;->b:Ljava/lang/Runnable;

    .line 443
    iput-boolean v1, p0, Lbab;->c:Z

    .line 2036
    iget-object v0, p1, Lazv;->a:Landroid/content/Context;

    .line 444
    iget-object v1, p0, Lbab;->h:Landroid/content/BroadcastReceiver;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "android.net.wifi.STATE_CHANGE"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 3036
    iget-object v0, p1, Lazv;->b:Landroid/os/Handler;

    .line 446
    iget-object v1, p0, Lbab;->b:Ljava/lang/Runnable;

    .line 4036
    iget-wide v2, p1, Lazv;->e:J

    .line 446
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 447
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 450
    iget-boolean v0, p0, Lbab;->c:Z

    if-nez v0, :cond_1

    .line 465
    :cond_0
    return-void

    .line 453
    :cond_1
    iget-object v0, p0, Lbab;->h:Landroid/content/BroadcastReceiver;

    if-eqz v0, :cond_2

    .line 455
    :try_start_0
    iget-object v0, p0, Lbab;->g:Lazv;

    .line 5036
    iget-object v0, v0, Lazv;->a:Landroid/content/Context;

    .line 455
    iget-object v1, p0, Lbab;->h:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 460
    :cond_2
    :goto_0
    iget-object v0, p0, Lbab;->b:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    .line 461
    iget-object v0, p0, Lbab;->g:Lazv;

    .line 6036
    iget-object v0, v0, Lazv;->b:Landroid/os/Handler;

    .line 461
    iget-object v1, p0, Lbab;->b:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 463
    :cond_3
    iput-boolean v4, p0, Lbab;->c:Z

    .line 464
    iget-object v1, p0, Lbab;->g:Lazv;

    .line 7403
    iget-object v0, v1, Lazv;->c:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConfiguredNetworks()Ljava/util/List;

    move-result-object v0

    .line 7404
    if-eqz v0, :cond_0

    .line 7405
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiConfiguration;

    .line 7406
    iget-object v3, v1, Lazv;->c:Landroid/net/wifi/WifiManager;

    iget v0, v0, Landroid/net/wifi/WifiConfiguration;->networkId:I

    invoke-virtual {v3, v0, v4}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0
.end method
