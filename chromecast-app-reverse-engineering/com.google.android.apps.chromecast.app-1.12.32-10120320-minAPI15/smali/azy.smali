.class final Lazy;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "PG"


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Lazv;


# direct methods
.method constructor <init>(Lazv;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 707
    iput-object p1, p0, Lazy;->b:Lazv;

    iput-object p2, p0, Lazy;->a:Ljava/lang/String;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAvailable(Landroid/net/Network;)V
    .locals 4

    .prologue
    .line 710
    iget-object v0, p0, Lazy;->b:Lazv;

    .line 1036
    iget-object v0, v0, Lazv;->d:Landroid/net/ConnectivityManager;

    .line 710
    invoke-virtual {v0, p1}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 711
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v1

    .line 712
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    iget-object v3, p0, Lazy;->a:Ljava/lang/String;

    aput-object v3, v2, v0

    .line 713
    iget-object v0, p0, Lazy;->b:Lazv;

    .line 2036
    iget-object v0, v0, Lazv;->g:Ljava/lang/String;

    .line 713
    if-nez v0, :cond_0

    iget-object v0, p0, Lazy;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lblr;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 714
    iget-object v0, p0, Lazy;->b:Lazv;

    iget-object v1, p0, Lazy;->a:Ljava/lang/String;

    invoke-static {v0, p1, v1}, Lazv;->a(Lazv;Landroid/net/Network;Ljava/lang/String;)V

    .line 716
    :cond_0
    return-void
.end method

.method public final onLost(Landroid/net/Network;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 720
    iget-object v0, p0, Lazy;->b:Lazv;

    .line 3036
    iget-object v0, v0, Lazv;->d:Landroid/net/ConnectivityManager;

    .line 720
    invoke-virtual {v0, p1}, Landroid/net/ConnectivityManager;->getNetworkInfo(Landroid/net/Network;)Landroid/net/NetworkInfo;

    move-result-object v0

    .line 721
    if-eqz v0, :cond_2

    .line 722
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lazy;->a:Ljava/lang/String;

    invoke-static {v1, v2}, Lblr;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 723
    new-array v0, v4, [Ljava/lang/Object;

    iget-object v1, p0, Lazy;->a:Ljava/lang/String;

    aput-object v1, v0, v3

    .line 730
    :goto_0
    iget-object v0, p0, Lazy;->b:Lazv;

    .line 4036
    iget-object v0, v0, Lazv;->g:Ljava/lang/String;

    .line 730
    if-eqz v0, :cond_0

    .line 731
    iget-object v0, p0, Lazy;->b:Lazv;

    .line 5036
    invoke-virtual {v0}, Lazv;->d()V

    .line 733
    :cond_0
    return-void

    .line 725
    :cond_1
    new-array v1, v4, [Ljava/lang/Object;

    aput-object v0, v1, v3

    goto :goto_0

    .line 728
    :cond_2
    new-array v0, v4, [Ljava/lang/Object;

    aput-object p1, v0, v3

    goto :goto_0
.end method
