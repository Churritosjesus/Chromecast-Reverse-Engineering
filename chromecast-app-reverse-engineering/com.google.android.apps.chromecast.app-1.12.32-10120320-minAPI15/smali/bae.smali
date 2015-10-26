.class public final Lbae;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/content/Context;

.field b:Lbag;

.field final c:Landroid/net/wifi/WifiManager;

.field final d:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lbae;->a:Landroid/content/Context;

    .line 45
    iget-object v0, p0, Lbae;->a:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lbae;->c:Landroid/net/wifi/WifiManager;

    .line 46
    iget-object v0, p0, Lbae;->a:Landroid/content/Context;

    .line 47
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->dh:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    .line 49
    new-instance v1, Lbaf;

    invoke-direct {v1, p0, v0}, Lbaf;-><init>(Lbae;[Ljava/lang/String;)V

    iput-object v1, p0, Lbae;->d:Landroid/content/BroadcastReceiver;

    .line 81
    return-void
.end method
