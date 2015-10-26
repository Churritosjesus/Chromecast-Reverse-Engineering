.class public final Lbha;
.super Lj;
.source "PG"


# instance fields
.field private Z:Lazv;

.field a:Ljava/lang/String;

.field private aa:Ljava/lang/String;

.field private b:Lblp;

.field private c:Landroid/os/Handler;

.field private d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 45
    invoke-direct {p0}, Lj;-><init>()V

    .line 46
    new-instance v0, Lblp;

    const-string v1, "DeviceHotspotManager"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lbha;->b:Lblp;

    .line 47
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lbha;->c:Landroid/os/Handler;

    .line 48
    return-void
.end method

.method static synthetic a(Lbha;Lazv;)Lazv;
    .locals 0

    .prologue
    .line 23
    iput-object p1, p0, Lbha;->Z:Lazv;

    return-object p1
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Lbha;
    .locals 3

    .prologue
    .line 37
    new-instance v0, Lbha;

    invoke-direct {v0}, Lbha;-><init>()V

    .line 38
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 39
    const-string v2, "deviceHotspotSsid"

    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    const-string v2, "androidWifiSsid"

    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    invoke-virtual {v0, v1}, Lbha;->f(Landroid/os/Bundle;)V

    .line 42
    return-object v0
.end method

.method static synthetic a(Lbha;)Lblp;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lbha;->b:Lblp;

    return-object v0
.end method

.method static synthetic b(Lbha;)Lazv;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lbha;->Z:Lazv;

    return-object v0
.end method

.method static synthetic c(Lbha;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lbha;->aa:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 2

    .prologue
    .line 56
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 60
    iget-object v0, p0, Lbha;->d:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lbha;->c:Landroid/os/Handler;

    iget-object v1, p0, Lbha;->d:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 63
    :cond_0
    iget-object v0, p0, Lbha;->Z:Lazv;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lbha;->Z:Lazv;

    invoke-virtual {v0}, Lazv;->a()V

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lbha;->Z:Lazv;

    .line 67
    :cond_1
    return-void
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 71
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 72
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lbha;->c(Z)V

    .line 1559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 73
    const-string v1, "deviceHotspotSsid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbha;->aa:Ljava/lang/String;

    .line 74
    if-eqz p1, :cond_0

    .line 75
    const-string v0, "androidWifiSsid"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbha;->a:Ljava/lang/String;

    .line 79
    :goto_0
    return-void

    .line 2559
    :cond_0
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 77
    const-string v1, "androidWifiSsid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbha;->a:Ljava/lang/String;

    goto :goto_0
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 83
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 84
    const-string v0, "androidWifiSsid"

    iget-object v1, p0, Lbha;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    return-void
.end method

.method public final h_()V
    .locals 4

    .prologue
    .line 89
    invoke-super {p0}, Lj;->h_()V

    .line 95
    iget-object v0, p0, Lbha;->a:Ljava/lang/String;

    .line 96
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 137
    :goto_0
    return-void

    .line 2612
    :cond_0
    iget-object v1, p0, Lj;->y:Lm;

    .line 99
    invoke-virtual {v1}, Lm;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 100
    new-instance v2, Lbhb;

    invoke-direct {v2, p0, v0, v1}, Lbhb;-><init>(Lbha;Ljava/lang/String;Landroid/content/Context;)V

    iput-object v2, p0, Lbha;->d:Ljava/lang/Runnable;

    .line 135
    iget-object v0, p0, Lbha;->c:Landroid/os/Handler;

    iget-object v1, p0, Lbha;->d:Ljava/lang/Runnable;

    .line 136
    invoke-virtual {p0}, Lbha;->e()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->fl:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    int-to-long v2, v2

    .line 135
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
