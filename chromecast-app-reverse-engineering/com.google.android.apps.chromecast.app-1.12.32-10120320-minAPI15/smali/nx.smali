.class final Lnx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqq;


# instance fields
.field private synthetic a:Lno;


# direct methods
.method constructor <init>(Lno;)V
    .locals 0

    .prologue
    .line 1534
    iput-object p1, p0, Lnx;->a:Lno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqa;Z)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 1537
    invoke-virtual {p1}, Lqa;->k()Lqa;

    move-result-object v2

    .line 1538
    if-eq v2, p1, :cond_2

    move v0, v1

    .line 1539
    :goto_0
    iget-object v3, p0, Lnx;->a:Lno;

    if-eqz v0, :cond_0

    move-object p1, v2

    .line 2089
    :cond_0
    invoke-virtual {v3, p1}, Lno;->a(Landroid/view/Menu;)Lnw;

    move-result-object v3

    .line 1540
    if-eqz v3, :cond_1

    .line 1541
    if-eqz v0, :cond_3

    .line 1542
    iget-object v0, p0, Lnx;->a:Lno;

    iget v4, v3, Lnw;->a:I

    .line 3089
    invoke-virtual {v0, v4, v3, v2}, Lno;->a(ILnw;Landroid/view/Menu;)V

    .line 1543
    iget-object v0, p0, Lnx;->a:Lno;

    .line 4089
    invoke-virtual {v0, v3, v1}, Lno;->a(Lnw;Z)V

    .line 1550
    :cond_1
    :goto_1
    return-void

    .line 1538
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 1547
    :cond_3
    iget-object v0, p0, Lnx;->a:Lno;

    .line 5089
    invoke-virtual {v0, v3, p2}, Lno;->a(Lnw;Z)V

    goto :goto_1
.end method

.method public final a_(Lqa;)Z
    .locals 2

    .prologue
    .line 1554
    if-nez p1, :cond_0

    iget-object v0, p0, Lnx;->a:Lno;

    iget-boolean v0, v0, Lno;->g:Z

    if-eqz v0, :cond_0

    .line 1555
    iget-object v0, p0, Lnx;->a:Lno;

    .line 5233
    iget-object v0, v0, Lni;->b:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    .line 1556
    if-eqz v0, :cond_0

    iget-object v1, p0, Lnx;->a:Lno;

    .line 6229
    iget-boolean v1, v1, Lni;->m:Z

    .line 1556
    if-nez v1, :cond_0

    .line 1557
    const/16 v1, 0x8

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    .line 1560
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
