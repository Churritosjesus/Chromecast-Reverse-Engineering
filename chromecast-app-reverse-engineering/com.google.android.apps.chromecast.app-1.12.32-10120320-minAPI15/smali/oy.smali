.class final Loy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lqb;


# instance fields
.field private synthetic a:Lou;


# direct methods
.method constructor <init>(Lou;)V
    .locals 0

    .prologue
    .line 618
    iput-object p1, p0, Loy;->a:Lou;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lqa;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 627
    iget-object v0, p0, Loy;->a:Lou;

    .line 1050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 627
    if-eqz v0, :cond_0

    .line 628
    iget-object v0, p0, Loy;->a:Lou;

    .line 2050
    iget-object v0, v0, Lou;->a:Lse;

    .line 628
    invoke-interface {v0}, Lse;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 629
    iget-object v0, p0, Loy;->a:Lou;

    .line 3050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 629
    invoke-interface {v0, v3, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    .line 635
    :cond_0
    :goto_0
    return-void

    .line 630
    :cond_1
    iget-object v0, p0, Loy;->a:Lou;

    .line 4050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 630
    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 632
    iget-object v0, p0, Loy;->a:Lou;

    .line 5050
    iget-object v0, v0, Lou;->c:Landroid/view/Window$Callback;

    .line 632
    invoke-interface {v0, v3, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    goto :goto_0
.end method

.method public final a(Lqa;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 622
    const/4 v0, 0x0

    return v0
.end method
