.class final Lov;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lou;


# direct methods
.method constructor <init>(Lou;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lov;->a:Lou;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 64
    iget-object v3, p0, Lov;->a:Lou;

    .line 1438
    invoke-virtual {v3}, Lou;->h()Landroid/view/Menu;

    move-result-object v1

    .line 1439
    instance-of v2, v1, Lqa;

    if-eqz v2, :cond_4

    move-object v0, v1

    check-cast v0, Lqa;

    move-object v2, v0

    .line 1440
    :goto_0
    if-eqz v2, :cond_0

    .line 1441
    invoke-virtual {v2}, Lqa;->d()V

    .line 1444
    :cond_0
    :try_start_0
    invoke-interface {v1}, Landroid/view/Menu;->clear()V

    .line 1445
    iget-object v0, v3, Lou;->c:Landroid/view/Window$Callback;

    const/4 v4, 0x0

    invoke-interface {v0, v4, v1}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v3, Lou;->c:Landroid/view/Window$Callback;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1447
    :cond_1
    invoke-interface {v1}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1450
    :cond_2
    if-eqz v2, :cond_3

    .line 1451
    invoke-virtual {v2}, Lqa;->e()V

    :cond_3
    return-void

    :cond_4
    move-object v2, v0

    .line 1439
    goto :goto_0

    .line 1450
    :catchall_0
    move-exception v0

    if-eqz v2, :cond_5

    .line 1451
    invoke-virtual {v2}, Lqa;->e()V

    :cond_5
    throw v0
.end method
