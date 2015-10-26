.class final Lazq;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# instance fields
.field private synthetic a:Lazm;


# direct methods
.method constructor <init>(Lazm;)V
    .locals 0

    .prologue
    .line 595
    iput-object p1, p0, Lazq;->a:Lazm;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 598
    iget-object v0, p0, Lazq;->a:Lazm;

    invoke-static {v0}, Lazm;->f(Lazm;)Landroid/net/ConnectivityManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 599
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 600
    :goto_0
    iget-object v3, p0, Lazq;->a:Lazm;

    invoke-static {v3}, Lazm;->b(Lazm;)Lblp;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v3, v2

    iget-object v2, p0, Lazq;->a:Lazm;

    .line 601
    invoke-static {v2}, Lazm;->g(Lazm;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v3, v1

    .line 603
    if-nez v0, :cond_0

    .line 604
    iget-object v1, p0, Lazq;->a:Lazm;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lazm;->a(Lazm;Ljava/lang/String;)Ljava/lang/String;

    .line 608
    :cond_0
    iget-object v1, p0, Lazq;->a:Lazm;

    invoke-static {v1}, Lazm;->h(Lazm;)V

    .line 609
    if-eqz v0, :cond_3

    .line 611
    iget-object v0, p0, Lazq;->a:Lazm;

    invoke-static {v0}, Lazm;->b(Lazm;)Lblp;

    .line 612
    iget-object v0, p0, Lazq;->a:Lazm;

    invoke-virtual {v0}, Lazm;->a()V

    .line 620
    :cond_1
    :goto_1
    return-void

    :cond_2
    move v0, v2

    .line 599
    goto :goto_0

    .line 613
    :cond_3
    iget-object v0, p0, Lazq;->a:Lazm;

    invoke-static {v0}, Lazm;->g(Lazm;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 614
    iget-object v0, p0, Lazq;->a:Lazm;

    invoke-static {v0}, Lazm;->b(Lazm;)Lblp;

    .line 616
    iget-object v0, p0, Lazq;->a:Lazm;

    invoke-static {v0}, Lazm;->i(Lazm;)V

    goto :goto_1
.end method
