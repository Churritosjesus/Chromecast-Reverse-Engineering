.class final Lbaf;
.super Landroid/content/BroadcastReceiver;
.source "PG"


# instance fields
.field private synthetic a:[Ljava/lang/String;

.field private synthetic b:Lbae;


# direct methods
.method constructor <init>(Lbae;[Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lbaf;->b:Lbae;

    iput-object p2, p0, Lbaf;->a:[Ljava/lang/String;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 7

    .prologue
    .line 52
    iget-object v0, p0, Lbaf;->b:Lbae;

    .line 1020
    iget-object v0, v0, Lbae;->b:Lbag;

    .line 52
    if-eqz v0, :cond_2

    .line 53
    iget-object v0, p0, Lbaf;->b:Lbae;

    .line 2020
    iget-object v0, v0, Lbae;->c:Landroid/net/wifi/WifiManager;

    .line 53
    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getScanResults()Ljava/util/List;

    move-result-object v0

    .line 54
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/ScanResult;

    .line 55
    if-eqz v0, :cond_0

    .line 58
    iget-object v1, v0, Landroid/net/wifi/ScanResult;->BSSID:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v3

    .line 60
    iget-object v4, p0, Lbaf;->a:[Ljava/lang/String;

    array-length v5, v4

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v5, :cond_0

    aget-object v6, v4, v1

    .line 61
    invoke-virtual {v3, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 65
    iget-object v1, v0, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 66
    iget-object v1, p0, Lbaf;->b:Lbae;

    .line 3020
    iget-object v1, v1, Lbae;->b:Lbag;

    .line 66
    iget-object v0, v0, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-interface {v1, v0, v3}, Lbag;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 75
    :cond_2
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    :goto_2
    return-void

    :catch_0
    move-exception v0

    goto :goto_2
.end method
