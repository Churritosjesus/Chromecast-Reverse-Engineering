.class Lvj;
.super Lvf;
.source "PG"

# interfaces
.implements Lup;


# instance fields
.field private o:Luo;

.field private p:Lur;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lvo;)V
    .locals 0

    .prologue
    .line 716
    invoke-direct {p0, p1, p2}, Lvf;-><init>(Landroid/content/Context;Lvo;)V

    .line 717
    return-void
.end method


# virtual methods
.method protected a(Lvh;Lto;)V
    .locals 3

    .prologue
    .line 742
    invoke-super {p0, p1, p2}, Lvf;->a(Lvh;Lto;)V

    .line 744
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 2039
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->isEnabled()Z

    move-result v0

    .line 744
    if-nez v0, :cond_0

    .line 2336
    iget-object v0, p2, Lto;->a:Landroid/os/Bundle;

    const-string v1, "enabled"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 748
    :cond_0
    invoke-virtual {p0, p1}, Lvj;->a(Lvh;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2345
    iget-object v0, p2, Lto;->a:Landroid/os/Bundle;

    const-string v1, "connecting"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 752
    :cond_1
    iget-object v0, p1, Lvh;->a:Ljava/lang/Object;

    .line 3043
    check-cast v0, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {v0}, Landroid/media/MediaRouter$RouteInfo;->getPresentationDisplay()Landroid/view/Display;

    move-result-object v0

    .line 754
    if-eqz v0, :cond_2

    .line 755
    invoke-virtual {v0}, Landroid/view/Display;->getDisplayId()I

    move-result v0

    invoke-virtual {p2, v0}, Lto;->f(I)Lto;

    .line 757
    :cond_2
    return-void
.end method

.method protected a(Lvh;)Z
    .locals 2

    .prologue
    .line 776
    iget-object v0, p0, Lvj;->p:Lur;

    if-nez v0, :cond_0

    .line 777
    new-instance v0, Lur;

    invoke-direct {v0}, Lur;-><init>()V

    iput-object v0, p0, Lvj;->p:Lur;

    .line 779
    :cond_0
    iget-object v0, p0, Lvj;->p:Lur;

    iget-object v1, p1, Lvh;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lur;->a(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected b()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 761
    invoke-super {p0}, Lvf;->b()V

    .line 763
    iget-object v0, p0, Lvj;->o:Luo;

    if-nez v0, :cond_0

    .line 764
    new-instance v0, Luo;

    .line 3099
    iget-object v2, p0, Ltq;->a:Landroid/content/Context;

    .line 3106
    iget-object v3, p0, Ltq;->c:Lts;

    .line 764
    invoke-direct {v0, v2, v3}, Luo;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lvj;->o:Luo;

    .line 767
    :cond_0
    iget-object v2, p0, Lvj;->o:Luo;

    iget-boolean v0, p0, Lvj;->l:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lvj;->k:I

    .line 4087
    :goto_0
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_4

    .line 4088
    iget-boolean v0, v2, Luo;->c:Z

    if-nez v0, :cond_1

    .line 4089
    iget-object v0, v2, Luo;->b:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_3

    .line 4090
    const/4 v0, 0x1

    iput-boolean v0, v2, Luo;->c:Z

    .line 4091
    iget-object v0, v2, Luo;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 4093
    :cond_1
    :goto_1
    return-void

    :cond_2
    move v0, v1

    .line 767
    goto :goto_0

    .line 4093
    :cond_3
    const-string v0, "MediaRouterJellybeanMr1"

    const-string v1, "Cannot scan for wifi displays because the DisplayManager.scanWifiDisplays() method is not available on this device."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 4099
    :cond_4
    iget-boolean v0, v2, Luo;->c:Z

    if-eqz v0, :cond_1

    .line 4100
    iput-boolean v1, v2, Luo;->c:Z

    .line 4101
    iget-object v0, v2, Luo;->a:Landroid/os/Handler;

    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    goto :goto_1
.end method

.method protected final c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 772
    .line 5034
    new-instance v0, Luq;

    invoke-direct {v0, p0}, Luq;-><init>(Lup;)V

    .line 772
    return-object v0
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 721
    invoke-virtual {p0, p1}, Lvj;->g(Ljava/lang/Object;)I

    move-result v0

    .line 722
    if-ltz v0, :cond_0

    .line 723
    iget-object v1, p0, Lvj;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvh;

    .line 1043
    check-cast p1, Landroid/media/MediaRouter$RouteInfo;

    invoke-virtual {p1}, Landroid/media/MediaRouter$RouteInfo;->getPresentationDisplay()Landroid/view/Display;

    move-result-object v1

    .line 726
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/Display;->getDisplayId()I

    move-result v1

    .line 728
    :goto_0
    iget-object v2, v0, Lvh;->c:Ltn;

    invoke-virtual {v2}, Ltn;->o()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 730
    new-instance v2, Lto;

    iget-object v3, v0, Lvh;->c:Ltn;

    invoke-direct {v2, v3}, Lto;-><init>(Ltn;)V

    invoke-virtual {v2, v1}, Lto;->f(I)Lto;

    move-result-object v1

    invoke-virtual {v1}, Lto;->a()Ltn;

    move-result-object v1

    iput-object v1, v0, Lvh;->c:Ltn;

    .line 734
    invoke-virtual {p0}, Lvj;->a()V

    .line 737
    :cond_0
    return-void

    .line 726
    :cond_1
    const/4 v1, -0x1

    goto :goto_0
.end method
